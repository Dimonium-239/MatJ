grammar MatJv1;

@lexer::members
{
	boolean maybeString = false;
}

NL : ('\r' '\n' | '\r' | '\n') -> channel(HIDDEN);

BLOCKCOMMENT	: '#*' .*?  '*#}' -> channel(HIDDEN);
COMMENT			: '#' .*? NL  -> channel(HIDDEN);

WS : [ \t] { maybeString = true; } -> skip;

// Keywords
BREAK		: 'break';
CONTINUE	: 'continue';
ELSE		: 'else';
ELIF		: 'elif';
FOR			: 'for';
WHILE		: 'while';
FUNCTION	: 'func';
IF			: 'if';
RETURN		: 'return';


EQUALS						: '==' {maybeString = true;};
GREATER_THAN_OR_EQUAL		: '>=';
LESS_THAN_OR_EQUAL			: '<=';
AND					: '&&';
OR					: '||';
NOT_EQUAL					: '~=';

ASSIGN			: '=' { maybeString = true; };
COLON			: ':';
GREATER_THAN	: '>' { maybeString = true; };
DIVIDE	     	: '/';
PERCENT         : '%';
LESS_THAN		: '<' { maybeString = true; };
MINUS			: '-';
NOT				: '~';
PLUS			: '+';
POWER			: '^';
TIMES			: '*';
TRANSPOSE		: '.T' | '.t';
ROTATE          : '\'';
INCREMET        : '++';
DECREMENT       : '--';

AT						: '@';
COMMA					: ',' {maybeString = true;};
DOT						: '.';
SEMI_COLON				: ';' {maybeString = true;};
LEFT_BRACE				: '{' {maybeString = true;};
LEFT_PARENTHESIS		: '(' {maybeString = true;};
LEFT_SQUARE_BRACKET		: '[' {maybeString = true;};
RIGHT_BRACE				: '}' {maybeString = false;};
RIGHT_PARENTHESIS		: ')' {maybeString = false;};
RIGHT_SQUARE_BRACKET	: ']' {maybeString = false;};

SHOW                    : 'show' {maybeString = true;};
ONES                    : 'ones' {maybeString = true;};
ZEROS                   : 'zeros' {maybeString = true;};
EYE                     : 'eye' {maybeString = true;};
IN                      : 'in' {maybeString = true;};
RANGE                   : '..' {maybeString = true;};

BOOL_VAL :	'true' | 'false';

VAR_NAME: [a-zA-Z] [a-zA-Z0-9_]* { maybeString = false; };

INT_VAL: [0-9]+ ;
FLOAT_VAL :	INT_VAL+ '.' INT_VAL | INT_VAL+ | '.' INT_VAL;

STRING_VAL : {maybeString}? ('\'' ( ~('\'' | '\r' | '\n') | '\'\'')* '\'') | ('"' ( ~('\'' | '\r' | '\n') | '\'\'')* '"');

prog: (constructions)*;

constructions:
    statements
    | for_construction
    | while_construction
    | show_construction
    | assignation
    | if_construction
    | def_func
    | BREAK
    | CONTINUE
    | RETURN;

statements:
    matrix
    | matrix_index
    | matrix_func
    | func_call
    | comparison_statement
    | arithmetic_statement
    | logical_statement
    | STRING_VAL;

numerical_exp:
    (PLUS | MINUS)?LEFT_PARENTHESIS arithmetic_statement RIGHT_PARENTHESIS
    | matrix_index
    | (PLUS | MINUS)?VAR_NAME
    | (PLUS | MINUS)?INT_VAL
    | (PLUS | MINUS)?FLOAT_VAL;

boolean_exp:
    NOT?LEFT_PARENTHESIS logical_statement RIGHT_PARENTHESIS
    | NOT?(comparison_statement | BOOL_VAL | VAR_NAME );

arithmetic_statement:
    left = arithmetic_statement op=( TIMES | DIVIDE | PERCENT | POWER ) right=arithmetic_statement
    | left = arithmetic_statement op=( PLUS | MINUS ) right=arithmetic_statement
    | numerical_exp (INCREMET | DECREMENT)
    | numerical_exp;

comparison_statement:
    LEFT_PARENTHESIS comparison_statement RIGHT_PARENTHESIS
    | left= arithmetic_statement op=( GREATER_THAN | GREATER_THAN_OR_EQUAL ) right= arithmetic_statement
    | left= arithmetic_statement op=( LESS_THAN | LESS_THAN_OR_EQUAL ) right= arithmetic_statement
    | left= arithmetic_statement op=( EQUALS | NOT_EQUAL ) right= arithmetic_statement;

logical_statement:
    left = logical_statement op=(AND | OR) right = logical_statement
    | NOT?LEFT_PARENTHESIS logical_statement op=(AND | OR) logical_statement RIGHT_PARENTHESIS
    | boolean_exp;

assignation : (VAR_NAME | matrix_index) ASSIGN (statements | VAR_NAME | BOOL_VAL | INT_VAL | FLOAT_VAL );


def_func:
	FUNCTION (function_returns ASSIGN)? VAR_NAME function_params? LEFT_BRACE
	(statements | constructions)*
	(RETURN)?
	RIGHT_BRACE;

func_call:
    VAR_NAME LEFT_PARENTHESIS (statements | VAR_NAME | BOOL_VAL | INT_VAL | FLOAT_VAL ) RIGHT_PARENTHESIS;

if_construction:
	IF LEFT_PARENTHESIS logical_statement RIGHT_PARENTHESIS LEFT_BRACE
		(statements | constructions)*
    RIGHT_BRACE
    else_construction?;


else_construction:
	ELSE LEFT_BRACE
		(statements | constructions)*
	RIGHT_BRACE;


for_construction:
	FOR LEFT_PARENTHESIS VAR_NAME range_construction RIGHT_PARENTHESIS LEFT_BRACE
		(statements | constructions)*
	RIGHT_BRACE;


while_construction:
	WHILE LEFT_PARENTHESIS (logical_statement | comparison_statement) RIGHT_PARENTHESIS LEFT_BRACE
		(statements | constructions)*
	RIGHT_BRACE;

function_params :	LEFT_PARENTHESIS (VAR_NAME (COMMA VAR_NAME)*)? RIGHT_PARENTHESIS;

function_returns:
	VAR_NAME
    |	LEFT_SQUARE_BRACKET VAR_NAME (COMMA VAR_NAME)* RIGHT_SQUARE_BRACKET;

matrix_func:
     ones_statement
    | zeros_statement
    | eye_statement
    | (VAR_NAME | matrix) TRANSPOSE
    | (VAR_NAME | matrix) ROTATE;

range_construction : IN INT_VAL RANGE INT_VAL;

show_construction: SHOW (statements | STRING_VAL) (COMMA(statements | STRING_VAL))*;

ones_statement: ONES LEFT_PARENTHESIS INT_VAL COMMA INT_VAL RIGHT_PARENTHESIS;

zeros_statement: ZEROS LEFT_PARENTHESIS INT_VAL COMMA INT_VAL RIGHT_PARENTHESIS;

eye_statement: EYE LEFT_PARENTHESIS INT_VAL COMMA INT_VAL RIGHT_PARENTHESIS;

matrix:
    LEFT_SQUARE_BRACKET numerical_exp (COMMA? numerical_exp)* RIGHT_SQUARE_BRACKET
    |	LEFT_SQUARE_BRACKET numerical_exp (COMMA? numerical_exp)* (SEMI_COLON numerical_exp (COMMA? numerical_exp)*)* RIGHT_SQUARE_BRACKET;

matrix_index:
	VAR_NAME LEFT_SQUARE_BRACKET (INT_VAL | VAR_NAME) RIGHT_SQUARE_BRACKET (LEFT_SQUARE_BRACKET (INT_VAL | VAR_NAME) RIGHT_SQUARE_BRACKET)*;
