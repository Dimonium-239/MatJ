// Generated from /home/dimonium-239/Study/6Sem/TKiK/MatJv1/MatJv1.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MatJv1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NL=1, BLOCKCOMMENT=2, COMMENT=3, WS=4, BREAK=5, CONTINUE=6, ELSE=7, ELIF=8, 
		FOR=9, WHILE=10, FUNCTION=11, IF=12, RETURN=13, EQUALS=14, GREATER_THAN_OR_EQUAL=15, 
		LESS_THAN_OR_EQUAL=16, AND=17, OR=18, NOT_EQUAL=19, ASSIGN=20, COLON=21, 
		GREATER_THAN=22, DIVIDE=23, PERCENT=24, LESS_THAN=25, MINUS=26, NOT=27, 
		PLUS=28, POWER=29, TIMES=30, TRANSPOSE=31, ROTATE=32, INCREMET=33, DECREMENT=34, 
		AT=35, COMMA=36, DOT=37, SEMI_COLON=38, LEFT_BRACE=39, LEFT_PARENTHESIS=40, 
		LEFT_SQUARE_BRACKET=41, RIGHT_BRACE=42, RIGHT_PARENTHESIS=43, RIGHT_SQUARE_BRACKET=44, 
		SHOW=45, ONES=46, ZEROS=47, EYE=48, IN=49, RANGE=50, BOOL_VAL=51, VAR_NAME=52, 
		INT_VAL=53, FLOAT_VAL=54, STRING_VAL=55;
	public static final int
		RULE_prog = 0, RULE_constructions = 1, RULE_statements = 2, RULE_numerical_exp = 3, 
		RULE_boolean_exp = 4, RULE_arithmetic_statement = 5, RULE_comparison_statement = 6, 
		RULE_logical_statement = 7, RULE_assignation = 8, RULE_def_func = 9, RULE_func_call = 10, 
		RULE_if_construction = 11, RULE_else_construction = 12, RULE_for_construction = 13, 
		RULE_while_construction = 14, RULE_function_params = 15, RULE_function_returns = 16, 
		RULE_matrix_func = 17, RULE_range_construction = 18, RULE_show_construction = 19, 
		RULE_ones_statement = 20, RULE_zeros_statement = 21, RULE_eye_statement = 22, 
		RULE_matrix = 23, RULE_matrix_index = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "constructions", "statements", "numerical_exp", "boolean_exp", 
			"arithmetic_statement", "comparison_statement", "logical_statement", 
			"assignation", "def_func", "func_call", "if_construction", "else_construction", 
			"for_construction", "while_construction", "function_params", "function_returns", 
			"matrix_func", "range_construction", "show_construction", "ones_statement", 
			"zeros_statement", "eye_statement", "matrix", "matrix_index"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'break'", "'continue'", "'else'", "'elif'", 
			"'for'", "'while'", "'func'", "'if'", "'return'", "'=='", "'>='", "'<='", 
			"'&&'", "'||'", "'~='", "'='", "':'", "'>'", "'/'", "'%'", "'<'", "'-'", 
			"'~'", "'+'", "'^'", "'*'", null, "'''", "'++'", "'--'", "'@'", "','", 
			"'.'", "';'", "'{'", "'('", "'['", "'}'", "')'", "']'", "'show'", "'ones'", 
			"'zeros'", "'eye'", "'in'", "'..'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NL", "BLOCKCOMMENT", "COMMENT", "WS", "BREAK", "CONTINUE", "ELSE", 
			"ELIF", "FOR", "WHILE", "FUNCTION", "IF", "RETURN", "EQUALS", "GREATER_THAN_OR_EQUAL", 
			"LESS_THAN_OR_EQUAL", "AND", "OR", "NOT_EQUAL", "ASSIGN", "COLON", "GREATER_THAN", 
			"DIVIDE", "PERCENT", "LESS_THAN", "MINUS", "NOT", "PLUS", "POWER", "TIMES", 
			"TRANSPOSE", "ROTATE", "INCREMET", "DECREMENT", "AT", "COMMA", "DOT", 
			"SEMI_COLON", "LEFT_BRACE", "LEFT_PARENTHESIS", "LEFT_SQUARE_BRACKET", 
			"RIGHT_BRACE", "RIGHT_PARENTHESIS", "RIGHT_SQUARE_BRACKET", "SHOW", "ONES", 
			"ZEROS", "EYE", "IN", "RANGE", "BOOL_VAL", "VAR_NAME", "INT_VAL", "FLOAT_VAL", 
			"STRING_VAL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MatJv1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MatJv1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<ConstructionsContext> constructions() {
			return getRuleContexts(ConstructionsContext.class);
		}
		public ConstructionsContext constructions(int i) {
			return getRuleContext(ConstructionsContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatJv1Visitor ) return ((MatJv1Visitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << FUNCTION) | (1L << IF) | (1L << RETURN) | (1L << MINUS) | (1L << NOT) | (1L << PLUS) | (1L << LEFT_PARENTHESIS) | (1L << LEFT_SQUARE_BRACKET) | (1L << SHOW) | (1L << ONES) | (1L << ZEROS) | (1L << EYE) | (1L << BOOL_VAL) | (1L << VAR_NAME) | (1L << INT_VAL) | (1L << FLOAT_VAL) | (1L << STRING_VAL))) != 0)) {
				{
				{
				setState(50);
				constructions();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructionsContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public For_constructionContext for_construction() {
			return getRuleContext(For_constructionContext.class,0);
		}
		public While_constructionContext while_construction() {
			return getRuleContext(While_constructionContext.class,0);
		}
		public Show_constructionContext show_construction() {
			return getRuleContext(Show_constructionContext.class,0);
		}
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public If_constructionContext if_construction() {
			return getRuleContext(If_constructionContext.class,0);
		}
		public Def_funcContext def_func() {
			return getRuleContext(Def_funcContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(MatJv1Parser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(MatJv1Parser.CONTINUE, 0); }
		public TerminalNode RETURN() { return getToken(MatJv1Parser.RETURN, 0); }
		public ConstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).enterConstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).exitConstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatJv1Visitor ) return ((MatJv1Visitor<? extends T>)visitor).visitConstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructionsContext constructions() throws RecognitionException {
		ConstructionsContext _localctx = new ConstructionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constructions);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				for_construction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				while_construction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				show_construction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				assignation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(61);
				if_construction();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(62);
				def_func();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(63);
				match(BREAK);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(64);
				match(CONTINUE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(65);
				match(RETURN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public Matrix_indexContext matrix_index() {
			return getRuleContext(Matrix_indexContext.class,0);
		}
		public Matrix_funcContext matrix_func() {
			return getRuleContext(Matrix_funcContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Comparison_statementContext comparison_statement() {
			return getRuleContext(Comparison_statementContext.class,0);
		}
		public Arithmetic_statementContext arithmetic_statement() {
			return getRuleContext(Arithmetic_statementContext.class,0);
		}
		public Logical_statementContext logical_statement() {
			return getRuleContext(Logical_statementContext.class,0);
		}
		public TerminalNode STRING_VAL() { return getToken(MatJv1Parser.STRING_VAL, 0); }
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatJv1Visitor ) return ((MatJv1Visitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				matrix();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				matrix_index();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				matrix_func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				func_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				comparison_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				arithmetic_statement(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(74);
				logical_statement(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(75);
				match(STRING_VAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numerical_expContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(MatJv1Parser.LEFT_PARENTHESIS, 0); }
		public Arithmetic_statementContext arithmetic_statement() {
			return getRuleContext(Arithmetic_statementContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(MatJv1Parser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode PLUS() { return getToken(MatJv1Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MatJv1Parser.MINUS, 0); }
		public Matrix_indexContext matrix_index() {
			return getRuleContext(Matrix_indexContext.class,0);
		}
		public TerminalNode VAR_NAME() { return getToken(MatJv1Parser.VAR_NAME, 0); }
		public TerminalNode INT_VAL() { return getToken(MatJv1Parser.INT_VAL, 0); }
		public TerminalNode FLOAT_VAL() { return getToken(MatJv1Parser.FLOAT_VAL, 0); }
		public Numerical_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numerical_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).enterNumerical_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).exitNumerical_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatJv1Visitor ) return ((MatJv1Visitor<? extends T>)visitor).visitNumerical_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numerical_expContext numerical_exp() throws RecognitionException {
		Numerical_expContext _localctx = new Numerical_expContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numerical_exp);
		int _la;
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS || _la==PLUS) {
					{
					setState(78);
					_la = _input.LA(1);
					if ( !(_la==MINUS || _la==PLUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(81);
				match(LEFT_PARENTHESIS);
				setState(82);
				arithmetic_statement(0);
				setState(83);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				matrix_index();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS || _la==PLUS) {
					{
					setState(86);
					_la = _input.LA(1);
					if ( !(_la==MINUS || _la==PLUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(89);
				match(VAR_NAME);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS || _la==PLUS) {
					{
					setState(90);
					_la = _input.LA(1);
					if ( !(_la==MINUS || _la==PLUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(93);
				match(INT_VAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS || _la==PLUS) {
					{
					setState(94);
					_la = _input.LA(1);
					if ( !(_la==MINUS || _la==PLUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(97);
				match(FLOAT_VAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_expContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(MatJv1Parser.LEFT_PARENTHESIS, 0); }
		public Logical_statementContext logical_statement() {
			return getRuleContext(Logical_statementContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(MatJv1Parser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode NOT() { return getToken(MatJv1Parser.NOT, 0); }
		public Comparison_statementContext comparison_statement() {
			return getRuleContext(Comparison_statementContext.class,0);
		}
		public TerminalNode BOOL_VAL() { return getToken(MatJv1Parser.BOOL_VAL, 0); }
		public TerminalNode VAR_NAME() { return getToken(MatJv1Parser.VAR_NAME, 0); }
		public Boolean_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).enterBoolean_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).exitBoolean_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatJv1Visitor ) return ((MatJv1Visitor<? extends T>)visitor).visitBoolean_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_expContext boolean_exp() throws RecognitionException {
		Boolean_expContext _localctx = new Boolean_expContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_boolean_exp);
		int _la;
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(100);
					match(NOT);
					}
				}

				setState(103);
				match(LEFT_PARENTHESIS);
				setState(104);
				logical_statement(0);
				setState(105);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(107);
					match(NOT);
					}
				}

				setState(113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(110);
					comparison_statement();
					}
					break;
				case 2:
					{
					setState(111);
					match(BOOL_VAL);
					}
					break;
				case 3:
					{
					setState(112);
					match(VAR_NAME);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arithmetic_statementContext extends ParserRuleContext {
		public Arithmetic_statementContext left;
		public Token op;
		public Arithmetic_statementContext right;
		public Numerical_expContext numerical_exp() {
			return getRuleContext(Numerical_expContext.class,0);
		}
		public TerminalNode INCREMET() { return getToken(MatJv1Parser.INCREMET, 0); }
		public TerminalNode DECREMENT() { return getToken(MatJv1Parser.DECREMENT, 0); }
		public List<Arithmetic_statementContext> arithmetic_statement() {
			return getRuleContexts(Arithmetic_statementContext.class);
		}
		public Arithmetic_statementContext arithmetic_statement(int i) {
			return getRuleContext(Arithmetic_statementContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(MatJv1Parser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(MatJv1Parser.DIVIDE, 0); }
		public TerminalNode PERCENT() { return getToken(MatJv1Parser.PERCENT, 0); }
		public TerminalNode POWER() { return getToken(MatJv1Parser.POWER, 0); }
		public TerminalNode PLUS() { return getToken(MatJv1Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MatJv1Parser.MINUS, 0); }
		public Arithmetic_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).enterArithmetic_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).exitArithmetic_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatJv1Visitor ) return ((MatJv1Visitor<? extends T>)visitor).visitArithmetic_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_statementContext arithmetic_statement() throws RecognitionException {
		return arithmetic_statement(0);
	}

	private Arithmetic_statementContext arithmetic_statement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arithmetic_statementContext _localctx = new Arithmetic_statementContext(_ctx, _parentState);
		Arithmetic_statementContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_arithmetic_statement, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(118);
				numerical_exp();
				setState(119);
				_la = _input.LA(1);
				if ( !(_la==INCREMET || _la==DECREMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				setState(121);
				numerical_exp();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(130);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new Arithmetic_statementContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_statement);
						setState(124);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(125);
						((Arithmetic_statementContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIVIDE) | (1L << PERCENT) | (1L << POWER) | (1L << TIMES))) != 0)) ) {
							((Arithmetic_statementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(126);
						((Arithmetic_statementContext)_localctx).right = arithmetic_statement(5);
						}
						break;
					case 2:
						{
						_localctx = new Arithmetic_statementContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_statement);
						setState(127);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(128);
						((Arithmetic_statementContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MINUS || _la==PLUS) ) {
							((Arithmetic_statementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(129);
						((Arithmetic_statementContext)_localctx).right = arithmetic_statement(4);
						}
						break;
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Comparison_statementContext extends ParserRuleContext {
		public Arithmetic_statementContext left;
		public Token op;
		public Arithmetic_statementContext right;
		public TerminalNode LEFT_PARENTHESIS() { return getToken(MatJv1Parser.LEFT_PARENTHESIS, 0); }
		public Comparison_statementContext comparison_statement() {
			return getRuleContext(Comparison_statementContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(MatJv1Parser.RIGHT_PARENTHESIS, 0); }
		public List<Arithmetic_statementContext> arithmetic_statement() {
			return getRuleContexts(Arithmetic_statementContext.class);
		}
		public Arithmetic_statementContext arithmetic_statement(int i) {
			return getRuleContext(Arithmetic_statementContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(MatJv1Parser.GREATER_THAN, 0); }
		public TerminalNode GREATER_THAN_OR_EQUAL() { return getToken(MatJv1Parser.GREATER_THAN_OR_EQUAL, 0); }
		public TerminalNode LESS_THAN() { return getToken(MatJv1Parser.LESS_THAN, 0); }
		public TerminalNode LESS_THAN_OR_EQUAL() { return getToken(MatJv1Parser.LESS_THAN_OR_EQUAL, 0); }
		public TerminalNode EQUALS() { return getToken(MatJv1Parser.EQUALS, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(MatJv1Parser.NOT_EQUAL, 0); }
		public Comparison_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).enterComparison_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).exitComparison_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatJv1Visitor ) return ((MatJv1Visitor<? extends T>)visitor).visitComparison_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_statementContext comparison_statement() throws RecognitionException {
		Comparison_statementContext _localctx = new Comparison_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comparison_statement);
		int _la;
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(LEFT_PARENTHESIS);
				setState(136);
				comparison_statement();
				setState(137);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				((Comparison_statementContext)_localctx).left = arithmetic_statement(0);
				setState(140);
				((Comparison_statementContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==GREATER_THAN_OR_EQUAL || _la==GREATER_THAN) ) {
					((Comparison_statementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(141);
				((Comparison_statementContext)_localctx).right = arithmetic_statement(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				((Comparison_statementContext)_localctx).left = arithmetic_statement(0);
				setState(144);
				((Comparison_statementContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LESS_THAN_OR_EQUAL || _la==LESS_THAN) ) {
					((Comparison_statementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(145);
				((Comparison_statementContext)_localctx).right = arithmetic_statement(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				((Comparison_statementContext)_localctx).left = arithmetic_statement(0);
				setState(148);
				((Comparison_statementContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQUALS || _la==NOT_EQUAL) ) {
					((Comparison_statementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(149);
				((Comparison_statementContext)_localctx).right = arithmetic_statement(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_statementContext extends ParserRuleContext {
		public Logical_statementContext left;
		public Token op;
		public Logical_statementContext right;
		public TerminalNode LEFT_PARENTHESIS() { return getToken(MatJv1Parser.LEFT_PARENTHESIS, 0); }
		public List<Logical_statementContext> logical_statement() {
			return getRuleContexts(Logical_statementContext.class);
		}
		public Logical_statementContext logical_statement(int i) {
			return getRuleContext(Logical_statementContext.class,i);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(MatJv1Parser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode AND() { return getToken(MatJv1Parser.AND, 0); }
		public TerminalNode OR() { return getToken(MatJv1Parser.OR, 0); }
		public TerminalNode NOT() { return getToken(MatJv1Parser.NOT, 0); }
		public Boolean_expContext boolean_exp() {
			return getRuleContext(Boolean_expContext.class,0);
		}
		public Logical_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).enterLogical_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).exitLogical_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatJv1Visitor ) return ((MatJv1Visitor<? extends T>)visitor).visitLogical_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_statementContext logical_statement() throws RecognitionException {
		return logical_statement(0);
	}

	private Logical_statementContext logical_statement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_statementContext _localctx = new Logical_statementContext(_ctx, _parentState);
		Logical_statementContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_logical_statement, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(154);
					match(NOT);
					}
				}

				setState(157);
				match(LEFT_PARENTHESIS);
				setState(158);
				logical_statement(0);
				setState(159);
				((Logical_statementContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
					((Logical_statementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(160);
				logical_statement(0);
				setState(161);
				match(RIGHT_PARENTHESIS);
				}
				break;
			case 2:
				{
				setState(163);
				boolean_exp();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_statementContext(_parentctx, _parentState);
					_localctx.left = _prevctx;
					_localctx.left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_logical_statement);
					setState(166);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(167);
					((Logical_statementContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
						((Logical_statementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(168);
					((Logical_statementContext)_localctx).right = logical_statement(4);
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignationContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(MatJv1Parser.ASSIGN, 0); }
		public List<TerminalNode> VAR_NAME() { return getTokens(MatJv1Parser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(MatJv1Parser.VAR_NAME, i);
		}
		public Matrix_indexContext matrix_index() {
			return getRuleContext(Matrix_indexContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode BOOL_VAL() { return getToken(MatJv1Parser.BOOL_VAL, 0); }
		public TerminalNode INT_VAL() { return getToken(MatJv1Parser.INT_VAL, 0); }
		public TerminalNode FLOAT_VAL() { return getToken(MatJv1Parser.FLOAT_VAL, 0); }
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).enterAssignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).exitAssignation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatJv1Visitor ) return ((MatJv1Visitor<? extends T>)visitor).visitAssignation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(174);
				match(VAR_NAME);
				}
				break;
			case 2:
				{
				setState(175);
				matrix_index();
				}
				break;
			}
			setState(178);
			match(ASSIGN);
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(179);
				statements();
				}
				break;
			case 2:
				{
				setState(180);
				match(VAR_NAME);
				}
				break;
			case 3:
				{
				setState(181);
				match(BOOL_VAL);
				}
				break;
			case 4:
				{
				setState(182);
				match(INT_VAL);
				}
				break;
			case 5:
				{
				setState(183);
				match(FLOAT_VAL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_funcContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(MatJv1Parser.FUNCTION, 0); }
		public TerminalNode VAR_NAME() { return getToken(MatJv1Parser.VAR_NAME, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(MatJv1Parser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(MatJv1Parser.RIGHT_BRACE, 0); }
		public Function_returnsContext function_returns() {
			return getRuleContext(Function_returnsContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MatJv1Parser.ASSIGN, 0); }
		public Function_paramsContext function_params() {
			return getRuleContext(Function_paramsContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<ConstructionsContext> constructions() {
			return getRuleContexts(ConstructionsContext.class);
		}
		public ConstructionsContext constructions(int i) {
			return getRuleContext(ConstructionsContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(MatJv1Parser.RETURN, 0); }
		public Def_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).enterDef_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).exitDef_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatJv1Visitor ) return ((MatJv1Visitor<? extends T>)visitor).visitDef_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_funcContext def_func() throws RecognitionException {
		Def_funcContext _localctx = new Def_funcContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_def_func);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(FUNCTION);
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(187);
				function_returns();
				setState(188);
				match(ASSIGN);
				}
				break;
			}
			setState(192);
			match(VAR_NAME);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_PARENTHESIS) {
				{
				setState(193);
				function_params();
				}
			}

			setState(196);
			match(LEFT_BRACE);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(199);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(197);
						statements();
						}
						break;
					case 2:
						{
						setState(198);
						constructions();
						}
						break;
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(204);
				match(RETURN);
				}
			}

			setState(207);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_callContext extends ParserRuleContext {
		public List<TerminalNode> VAR_NAME() { return getTokens(MatJv1Parser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(MatJv1Parser.VAR_NAME, i);
		}
		public TerminalNode LEFT_PARENTHESIS() { return getToken(MatJv1Parser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(MatJv1Parser.RIGHT_PARENTHESIS, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode BOOL_VAL() { return getToken(MatJv1Parser.BOOL_VAL, 0); }
		public TerminalNode INT_VAL() { return getToken(MatJv1Parser.INT_VAL, 0); }
		public TerminalNode FLOAT_VAL() { return getToken(MatJv1Parser.FLOAT_VAL, 0); }
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatJv1Visitor ) return ((MatJv1Visitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(VAR_NAME);
			setState(210);
			match(LEFT_PARENTHESIS);
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(211);
				statements();
				}
				break;
			case 2:
				{
				setState(212);
				match(VAR_NAME);
				}
				break;
			case 3:
				{
				setState(213);
				match(BOOL_VAL);
				}
				break;
			case 4:
				{
				setState(214);
				match(INT_VAL);
				}
				break;
			case 5:
				{
				setState(215);
				match(FLOAT_VAL);
				}
				break;
			}
			setState(218);
			match(RIGHT_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_constructionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MatJv1Parser.IF, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(MatJv1Parser.LEFT_PARENTHESIS, 0); }
		public Logical_statementContext logical_statement() {
			return getRuleContext(Logical_statementContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(MatJv1Parser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(MatJv1Parser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(MatJv1Parser.RIGHT_BRACE, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<ConstructionsContext> constructions() {
			return getRuleContexts(ConstructionsContext.class);
		}
		public ConstructionsContext constructions(int i) {
			return getRuleContext(ConstructionsContext.class,i);
		}
		public Else_constructionContext else_construction() {
			return getRuleContext(Else_constructionContext.class,0);
		}
		public If_constructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_construction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).enterIf_construction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).exitIf_construction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatJv1Visitor ) return ((MatJv1Visitor<? extends T>)visitor).visitIf_construction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_constructionContext if_construction() throws RecognitionException {
		If_constructionContext _localctx = new If_constructionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_construction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(IF);
			setState(221);
			match(LEFT_PARENTHESIS);
			setState(222);
			logical_statement(0);
			setState(223);
			match(RIGHT_PARENTHESIS);
			setState(224);
			match(LEFT_BRACE);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << FUNCTION) | (1L << IF) | (1L << RETURN) | (1L << MINUS) | (1L << NOT) | (1L << PLUS) | (1L << LEFT_PARENTHESIS) | (1L << LEFT_SQUARE_BRACKET) | (1L << SHOW) | (1L << ONES) | (1L << ZEROS) | (1L << EYE) | (1L << BOOL_VAL) | (1L << VAR_NAME) | (1L << INT_VAL) | (1L << FLOAT_VAL) | (1L << STRING_VAL))) != 0)) {
				{
				setState(227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(225);
					statements();
					}
					break;
				case 2:
					{
					setState(226);
					constructions();
					}
					break;
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(RIGHT_BRACE);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(233);
				else_construction();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_constructionContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(MatJv1Parser.ELSE, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(MatJv1Parser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(MatJv1Parser.RIGHT_BRACE, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<ConstructionsContext> constructions() {
			return getRuleContexts(ConstructionsContext.class);
		}
		public ConstructionsContext constructions(int i) {
			return getRuleContext(ConstructionsContext.class,i);
		}
		public Else_constructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_construction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).enterElse_construction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).exitElse_construction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatJv1Visitor ) return ((MatJv1Visitor<? extends T>)visitor).visitElse_construction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_constructionContext else_construction() throws RecognitionException {
		Else_constructionContext _localctx = new Else_constructionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_else_construction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(ELSE);
			setState(237);
			match(LEFT_BRACE);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << FUNCTION) | (1L << IF) | (1L << RETURN) | (1L << MINUS) | (1L << NOT) | (1L << PLUS) | (1L << LEFT_PARENTHESIS) | (1L << LEFT_SQUARE_BRACKET) | (1L << SHOW) | (1L << ONES) | (1L << ZEROS) | (1L << EYE) | (1L << BOOL_VAL) | (1L << VAR_NAME) | (1L << INT_VAL) | (1L << FLOAT_VAL) | (1L << STRING_VAL))) != 0)) {
				{
				setState(240);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(238);
					statements();
					}
					break;
				case 2:
					{
					setState(239);
					constructions();
					}
					break;
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_constructionContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MatJv1Parser.FOR, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(MatJv1Parser.LEFT_PARENTHESIS, 0); }
		public TerminalNode VAR_NAME() { return getToken(MatJv1Parser.VAR_NAME, 0); }
		public Range_constructionContext range_construction() {
			return getRuleContext(Range_constructionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(MatJv1Parser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(MatJv1Parser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(MatJv1Parser.RIGHT_BRACE, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<ConstructionsContext> constructions() {
			return getRuleContexts(ConstructionsContext.class);
		}
		public ConstructionsContext constructions(int i) {
			return getRuleContext(ConstructionsContext.class,i);
		}
		public For_constructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_construction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).enterFor_construction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).exitFor_construction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatJv1Visitor ) return ((MatJv1Visitor<? extends T>)visitor).visitFor_construction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_constructionContext for_construction() throws RecognitionException {
		For_constructionContext _localctx = new For_constructionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for_construction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(FOR);
			setState(248);
			match(LEFT_PARENTHESIS);
			setState(249);
			match(VAR_NAME);
			setState(250);
			range_construction();
			setState(251);
			match(RIGHT_PARENTHESIS);
			setState(252);
			match(LEFT_BRACE);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << FUNCTION) | (1L << IF) | (1L << RETURN) | (1L << MINUS) | (1L << NOT) | (1L << PLUS) | (1L << LEFT_PARENTHESIS) | (1L << LEFT_SQUARE_BRACKET) | (1L << SHOW) | (1L << ONES) | (1L << ZEROS) | (1L << EYE) | (1L << BOOL_VAL) | (1L << VAR_NAME) | (1L << INT_VAL) | (1L << FLOAT_VAL) | (1L << STRING_VAL))) != 0)) {
				{
				setState(255);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(253);
					statements();
					}
					break;
				case 2:
					{
					setState(254);
					constructions();
					}
					break;
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_constructionContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MatJv1Parser.WHILE, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(MatJv1Parser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(MatJv1Parser.RIGHT_PARENTHESIS, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(MatJv1Parser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(MatJv1Parser.RIGHT_BRACE, 0); }
		public Logical_statementContext logical_statement() {
			return getRuleContext(Logical_statementContext.class,0);
		}
		public Comparison_statementContext comparison_statement() {
			return getRuleContext(Comparison_statementContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<ConstructionsContext> constructions() {
			return getRuleContexts(ConstructionsContext.class);
		}
		public ConstructionsContext constructions(int i) {
			return getRuleContext(ConstructionsContext.class,i);
		}
		public While_constructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_construction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).enterWhile_construction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).exitWhile_construction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatJv1Visitor ) return ((MatJv1Visitor<? extends T>)visitor).visitWhile_construction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_constructionContext while_construction() throws RecognitionException {
		While_constructionContext _localctx = new While_constructionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_while_construction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(WHILE);
			setState(263);
			match(LEFT_PARENTHESIS);
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(264);
				logical_statement(0);
				}
				break;
			case 2:
				{
				setState(265);
				comparison_statement();
				}
				break;
			}
			setState(268);
			match(RIGHT_PARENTHESIS);
			setState(269);
			match(LEFT_BRACE);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << FUNCTION) | (1L << IF) | (1L << RETURN) | (1L << MINUS) | (1L << NOT) | (1L << PLUS) | (1L << LEFT_PARENTHESIS) | (1L << LEFT_SQUARE_BRACKET) | (1L << SHOW) | (1L << ONES) | (1L << ZEROS) | (1L << EYE) | (1L << BOOL_VAL) | (1L << VAR_NAME) | (1L << INT_VAL) | (1L << FLOAT_VAL) | (1L << STRING_VAL))) != 0)) {
				{
				setState(272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(270);
					statements();
					}
					break;
				case 2:
					{
					setState(271);
					constructions();
					}
					break;
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277);
			match(RIGHT_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_paramsContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(MatJv1Parser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(MatJv1Parser.RIGHT_PARENTHESIS, 0); }
		public List<TerminalNode> VAR_NAME() { return getTokens(MatJv1Parser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(MatJv1Parser.VAR_NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MatJv1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MatJv1Parser.COMMA, i);
		}
		public Function_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).enterFunction_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).exitFunction_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatJv1Visitor ) return ((MatJv1Visitor<? extends T>)visitor).visitFunction_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_paramsContext function_params() throws RecognitionException {
		Function_paramsContext _localctx = new Function_paramsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(LEFT_PARENTHESIS);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR_NAME) {
				{
				setState(280);
				match(VAR_NAME);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(281);
					match(COMMA);
					setState(282);
					match(VAR_NAME);
					}
					}
					setState(287);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(290);
			match(RIGHT_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_returnsContext extends ParserRuleContext {
		public List<TerminalNode> VAR_NAME() { return getTokens(MatJv1Parser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(MatJv1Parser.VAR_NAME, i);
		}
		public TerminalNode LEFT_SQUARE_BRACKET() { return getToken(MatJv1Parser.LEFT_SQUARE_BRACKET, 0); }
		public TerminalNode RIGHT_SQUARE_BRACKET() { return getToken(MatJv1Parser.RIGHT_SQUARE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MatJv1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MatJv1Parser.COMMA, i);
		}
		public Function_returnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_returns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).enterFunction_returns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).exitFunction_returns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatJv1Visitor ) return ((MatJv1Visitor<? extends T>)visitor).visitFunction_returns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_returnsContext function_returns() throws RecognitionException {
		Function_returnsContext _localctx = new Function_returnsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function_returns);
		int _la;
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(VAR_NAME);
				}
				break;
			case LEFT_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(LEFT_SQUARE_BRACKET);
				setState(294);
				match(VAR_NAME);
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(295);
					match(COMMA);
					setState(296);
					match(VAR_NAME);
					}
					}
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(302);
				match(RIGHT_SQUARE_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Matrix_funcContext extends ParserRuleContext {
		public Ones_statementContext ones_statement() {
			return getRuleContext(Ones_statementContext.class,0);
		}
		public Zeros_statementContext zeros_statement() {
			return getRuleContext(Zeros_statementContext.class,0);
		}
		public Eye_statementContext eye_statement() {
			return getRuleContext(Eye_statementContext.class,0);
		}
		public TerminalNode TRANSPOSE() { return getToken(MatJv1Parser.TRANSPOSE, 0); }
		public TerminalNode VAR_NAME() { return getToken(MatJv1Parser.VAR_NAME, 0); }
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public TerminalNode ROTATE() { return getToken(MatJv1Parser.ROTATE, 0); }
		public Matrix_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).enterMatrix_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).exitMatrix_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatJv1Visitor ) return ((MatJv1Visitor<? extends T>)visitor).visitMatrix_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Matrix_funcContext matrix_func() throws RecognitionException {
		Matrix_funcContext _localctx = new Matrix_funcContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_matrix_func);
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				ones_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				zeros_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				eye_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(310);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR_NAME:
					{
					setState(308);
					match(VAR_NAME);
					}
					break;
				case LEFT_SQUARE_BRACKET:
					{
					setState(309);
					matrix();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(312);
				match(TRANSPOSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(315);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR_NAME:
					{
					setState(313);
					match(VAR_NAME);
					}
					break;
				case LEFT_SQUARE_BRACKET:
					{
					setState(314);
					matrix();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(317);
				match(ROTATE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Range_constructionContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(MatJv1Parser.IN, 0); }
		public List<TerminalNode> INT_VAL() { return getTokens(MatJv1Parser.INT_VAL); }
		public TerminalNode INT_VAL(int i) {
			return getToken(MatJv1Parser.INT_VAL, i);
		}
		public TerminalNode RANGE() { return getToken(MatJv1Parser.RANGE, 0); }
		public Range_constructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_construction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).enterRange_construction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).exitRange_construction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatJv1Visitor ) return ((MatJv1Visitor<? extends T>)visitor).visitRange_construction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_constructionContext range_construction() throws RecognitionException {
		Range_constructionContext _localctx = new Range_constructionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_range_construction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(IN);
			setState(321);
			match(INT_VAL);
			setState(322);
			match(RANGE);
			setState(323);
			match(INT_VAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Show_constructionContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(MatJv1Parser.SHOW, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<TerminalNode> STRING_VAL() { return getTokens(MatJv1Parser.STRING_VAL); }
		public TerminalNode STRING_VAL(int i) {
			return getToken(MatJv1Parser.STRING_VAL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MatJv1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MatJv1Parser.COMMA, i);
		}
		public Show_constructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_construction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).enterShow_construction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).exitShow_construction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatJv1Visitor ) return ((MatJv1Visitor<? extends T>)visitor).visitShow_construction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_constructionContext show_construction() throws RecognitionException {
		Show_constructionContext _localctx = new Show_constructionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_show_construction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(SHOW);
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(326);
				statements();
				}
				break;
			case 2:
				{
				setState(327);
				match(STRING_VAL);
				}
				break;
			}
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(330);
				match(COMMA);
				setState(333);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(331);
					statements();
					}
					break;
				case 2:
					{
					setState(332);
					match(STRING_VAL);
					}
					break;
				}
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ones_statementContext extends ParserRuleContext {
		public TerminalNode ONES() { return getToken(MatJv1Parser.ONES, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(MatJv1Parser.LEFT_PARENTHESIS, 0); }
		public List<TerminalNode> INT_VAL() { return getTokens(MatJv1Parser.INT_VAL); }
		public TerminalNode INT_VAL(int i) {
			return getToken(MatJv1Parser.INT_VAL, i);
		}
		public TerminalNode COMMA() { return getToken(MatJv1Parser.COMMA, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(MatJv1Parser.RIGHT_PARENTHESIS, 0); }
		public Ones_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ones_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).enterOnes_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).exitOnes_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatJv1Visitor ) return ((MatJv1Visitor<? extends T>)visitor).visitOnes_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ones_statementContext ones_statement() throws RecognitionException {
		Ones_statementContext _localctx = new Ones_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ones_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(ONES);
			setState(341);
			match(LEFT_PARENTHESIS);
			setState(342);
			match(INT_VAL);
			setState(343);
			match(COMMA);
			setState(344);
			match(INT_VAL);
			setState(345);
			match(RIGHT_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Zeros_statementContext extends ParserRuleContext {
		public TerminalNode ZEROS() { return getToken(MatJv1Parser.ZEROS, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(MatJv1Parser.LEFT_PARENTHESIS, 0); }
		public List<TerminalNode> INT_VAL() { return getTokens(MatJv1Parser.INT_VAL); }
		public TerminalNode INT_VAL(int i) {
			return getToken(MatJv1Parser.INT_VAL, i);
		}
		public TerminalNode COMMA() { return getToken(MatJv1Parser.COMMA, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(MatJv1Parser.RIGHT_PARENTHESIS, 0); }
		public Zeros_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zeros_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).enterZeros_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).exitZeros_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatJv1Visitor ) return ((MatJv1Visitor<? extends T>)visitor).visitZeros_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Zeros_statementContext zeros_statement() throws RecognitionException {
		Zeros_statementContext _localctx = new Zeros_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_zeros_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(ZEROS);
			setState(348);
			match(LEFT_PARENTHESIS);
			setState(349);
			match(INT_VAL);
			setState(350);
			match(COMMA);
			setState(351);
			match(INT_VAL);
			setState(352);
			match(RIGHT_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Eye_statementContext extends ParserRuleContext {
		public TerminalNode EYE() { return getToken(MatJv1Parser.EYE, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(MatJv1Parser.LEFT_PARENTHESIS, 0); }
		public List<TerminalNode> INT_VAL() { return getTokens(MatJv1Parser.INT_VAL); }
		public TerminalNode INT_VAL(int i) {
			return getToken(MatJv1Parser.INT_VAL, i);
		}
		public TerminalNode COMMA() { return getToken(MatJv1Parser.COMMA, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(MatJv1Parser.RIGHT_PARENTHESIS, 0); }
		public Eye_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eye_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).enterEye_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).exitEye_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatJv1Visitor ) return ((MatJv1Visitor<? extends T>)visitor).visitEye_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eye_statementContext eye_statement() throws RecognitionException {
		Eye_statementContext _localctx = new Eye_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_eye_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(EYE);
			setState(355);
			match(LEFT_PARENTHESIS);
			setState(356);
			match(INT_VAL);
			setState(357);
			match(COMMA);
			setState(358);
			match(INT_VAL);
			setState(359);
			match(RIGHT_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatrixContext extends ParserRuleContext {
		public TerminalNode LEFT_SQUARE_BRACKET() { return getToken(MatJv1Parser.LEFT_SQUARE_BRACKET, 0); }
		public List<Numerical_expContext> numerical_exp() {
			return getRuleContexts(Numerical_expContext.class);
		}
		public Numerical_expContext numerical_exp(int i) {
			return getRuleContext(Numerical_expContext.class,i);
		}
		public TerminalNode RIGHT_SQUARE_BRACKET() { return getToken(MatJv1Parser.RIGHT_SQUARE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MatJv1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MatJv1Parser.COMMA, i);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(MatJv1Parser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(MatJv1Parser.SEMI_COLON, i);
		}
		public MatrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).enterMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).exitMatrix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatJv1Visitor ) return ((MatJv1Visitor<? extends T>)visitor).visitMatrix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixContext matrix() throws RecognitionException {
		MatrixContext _localctx = new MatrixContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_matrix);
		int _la;
		try {
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				match(LEFT_SQUARE_BRACKET);
				setState(362);
				numerical_exp();
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << PLUS) | (1L << COMMA) | (1L << LEFT_PARENTHESIS) | (1L << VAR_NAME) | (1L << INT_VAL) | (1L << FLOAT_VAL))) != 0)) {
					{
					{
					setState(364);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(363);
						match(COMMA);
						}
					}

					setState(366);
					numerical_exp();
					}
					}
					setState(371);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(372);
				match(RIGHT_SQUARE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				match(LEFT_SQUARE_BRACKET);
				setState(375);
				numerical_exp();
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << PLUS) | (1L << COMMA) | (1L << LEFT_PARENTHESIS) | (1L << VAR_NAME) | (1L << INT_VAL) | (1L << FLOAT_VAL))) != 0)) {
					{
					{
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(376);
						match(COMMA);
						}
					}

					setState(379);
					numerical_exp();
					}
					}
					setState(384);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI_COLON) {
					{
					{
					setState(385);
					match(SEMI_COLON);
					setState(386);
					numerical_exp();
					setState(393);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << PLUS) | (1L << COMMA) | (1L << LEFT_PARENTHESIS) | (1L << VAR_NAME) | (1L << INT_VAL) | (1L << FLOAT_VAL))) != 0)) {
						{
						{
						setState(388);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(387);
							match(COMMA);
							}
						}

						setState(390);
						numerical_exp();
						}
						}
						setState(395);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(400);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(401);
				match(RIGHT_SQUARE_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Matrix_indexContext extends ParserRuleContext {
		public List<TerminalNode> VAR_NAME() { return getTokens(MatJv1Parser.VAR_NAME); }
		public TerminalNode VAR_NAME(int i) {
			return getToken(MatJv1Parser.VAR_NAME, i);
		}
		public List<TerminalNode> LEFT_SQUARE_BRACKET() { return getTokens(MatJv1Parser.LEFT_SQUARE_BRACKET); }
		public TerminalNode LEFT_SQUARE_BRACKET(int i) {
			return getToken(MatJv1Parser.LEFT_SQUARE_BRACKET, i);
		}
		public List<TerminalNode> RIGHT_SQUARE_BRACKET() { return getTokens(MatJv1Parser.RIGHT_SQUARE_BRACKET); }
		public TerminalNode RIGHT_SQUARE_BRACKET(int i) {
			return getToken(MatJv1Parser.RIGHT_SQUARE_BRACKET, i);
		}
		public List<TerminalNode> INT_VAL() { return getTokens(MatJv1Parser.INT_VAL); }
		public TerminalNode INT_VAL(int i) {
			return getToken(MatJv1Parser.INT_VAL, i);
		}
		public Matrix_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).enterMatrix_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MatJv1Listener ) ((MatJv1Listener)listener).exitMatrix_index(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MatJv1Visitor ) return ((MatJv1Visitor<? extends T>)visitor).visitMatrix_index(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Matrix_indexContext matrix_index() throws RecognitionException {
		Matrix_indexContext _localctx = new Matrix_indexContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_matrix_index);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(VAR_NAME);
			setState(406);
			match(LEFT_SQUARE_BRACKET);
			setState(407);
			_la = _input.LA(1);
			if ( !(_la==VAR_NAME || _la==INT_VAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(408);
			match(RIGHT_SQUARE_BRACKET);
			setState(414);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(409);
					match(LEFT_SQUARE_BRACKET);
					setState(410);
					_la = _input.LA(1);
					if ( !(_la==VAR_NAME || _la==INT_VAL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(411);
					match(RIGHT_SQUARE_BRACKET);
					}
					} 
				}
				setState(416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return arithmetic_statement_sempred((Arithmetic_statementContext)_localctx, predIndex);
		case 7:
			return logical_statement_sempred((Logical_statementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmetic_statement_sempred(Arithmetic_statementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean logical_statement_sempred(Logical_statementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u01a4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\7\2\66\n\2\f\2\16\29\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3E\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4O\n\4\3\5\5\5R"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Z\n\5\3\5\3\5\5\5^\n\5\3\5\3\5\5\5b\n"+
		"\5\3\5\5\5e\n\5\3\6\5\6h\n\6\3\6\3\6\3\6\3\6\3\6\5\6o\n\6\3\6\3\6\3\6"+
		"\5\6t\n\6\5\6v\n\6\3\7\3\7\3\7\3\7\3\7\5\7}\n\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\7\7\u0085\n\7\f\7\16\7\u0088\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009a\n\b\3\t\3\t\5\t\u009e\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a7\n\t\3\t\3\t\3\t\7\t\u00ac\n\t\f\t\16"+
		"\t\u00af\13\t\3\n\3\n\5\n\u00b3\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00bb"+
		"\n\n\3\13\3\13\3\13\3\13\5\13\u00c1\n\13\3\13\3\13\5\13\u00c5\n\13\3\13"+
		"\3\13\3\13\7\13\u00ca\n\13\f\13\16\13\u00cd\13\13\3\13\5\13\u00d0\n\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00db\n\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\7\r\u00e6\n\r\f\r\16\r\u00e9\13\r\3\r\3\r\5\r\u00ed"+
		"\n\r\3\16\3\16\3\16\3\16\7\16\u00f3\n\16\f\16\16\16\u00f6\13\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0102\n\17\f\17\16\17"+
		"\u0105\13\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u010d\n\20\3\20\3\20\3"+
		"\20\3\20\7\20\u0113\n\20\f\20\16\20\u0116\13\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\7\21\u011e\n\21\f\21\16\21\u0121\13\21\5\21\u0123\n\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\7\22\u012c\n\22\f\22\16\22\u012f\13\22\3"+
		"\22\5\22\u0132\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u0139\n\23\3\23\3\23"+
		"\3\23\5\23\u013e\n\23\3\23\5\23\u0141\n\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\5\25\u014b\n\25\3\25\3\25\3\25\5\25\u0150\n\25\7\25\u0152"+
		"\n\25\f\25\16\25\u0155\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\5\31\u016f\n\31\3\31\7\31\u0172\n\31\f\31\16\31\u0175\13\31\3"+
		"\31\3\31\3\31\3\31\3\31\5\31\u017c\n\31\3\31\7\31\u017f\n\31\f\31\16\31"+
		"\u0182\13\31\3\31\3\31\3\31\5\31\u0187\n\31\3\31\7\31\u018a\n\31\f\31"+
		"\16\31\u018d\13\31\7\31\u018f\n\31\f\31\16\31\u0192\13\31\3\31\3\31\5"+
		"\31\u0196\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u019f\n\32\f\32"+
		"\16\32\u01a2\13\32\3\32\2\4\f\20\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\2\n\4\2\34\34\36\36\3\2#$\4\2\31\32\37 \4\2\21\21\30"+
		"\30\4\2\22\22\33\33\4\2\20\20\25\25\3\2\23\24\3\2\66\67\2\u01df\2\67\3"+
		"\2\2\2\4D\3\2\2\2\6N\3\2\2\2\bd\3\2\2\2\nu\3\2\2\2\f|\3\2\2\2\16\u0099"+
		"\3\2\2\2\20\u00a6\3\2\2\2\22\u00b2\3\2\2\2\24\u00bc\3\2\2\2\26\u00d3\3"+
		"\2\2\2\30\u00de\3\2\2\2\32\u00ee\3\2\2\2\34\u00f9\3\2\2\2\36\u0108\3\2"+
		"\2\2 \u0119\3\2\2\2\"\u0131\3\2\2\2$\u0140\3\2\2\2&\u0142\3\2\2\2(\u0147"+
		"\3\2\2\2*\u0156\3\2\2\2,\u015d\3\2\2\2.\u0164\3\2\2\2\60\u0195\3\2\2\2"+
		"\62\u0197\3\2\2\2\64\66\5\4\3\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2"+
		"\2\678\3\2\2\28\3\3\2\2\29\67\3\2\2\2:E\5\6\4\2;E\5\34\17\2<E\5\36\20"+
		"\2=E\5(\25\2>E\5\22\n\2?E\5\30\r\2@E\5\24\13\2AE\7\7\2\2BE\7\b\2\2CE\7"+
		"\17\2\2D:\3\2\2\2D;\3\2\2\2D<\3\2\2\2D=\3\2\2\2D>\3\2\2\2D?\3\2\2\2D@"+
		"\3\2\2\2DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2E\5\3\2\2\2FO\5\60\31\2GO\5\62\32"+
		"\2HO\5$\23\2IO\5\26\f\2JO\5\16\b\2KO\5\f\7\2LO\5\20\t\2MO\79\2\2NF\3\2"+
		"\2\2NG\3\2\2\2NH\3\2\2\2NI\3\2\2\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2"+
		"\2\2O\7\3\2\2\2PR\t\2\2\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7*\2\2TU\5\f"+
		"\7\2UV\7-\2\2Ve\3\2\2\2We\5\62\32\2XZ\t\2\2\2YX\3\2\2\2YZ\3\2\2\2Z[\3"+
		"\2\2\2[e\7\66\2\2\\^\t\2\2\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_e\7\67\2\2"+
		"`b\t\2\2\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2ce\78\2\2dQ\3\2\2\2dW\3\2\2\2"+
		"dY\3\2\2\2d]\3\2\2\2da\3\2\2\2e\t\3\2\2\2fh\7\35\2\2gf\3\2\2\2gh\3\2\2"+
		"\2hi\3\2\2\2ij\7*\2\2jk\5\20\t\2kl\7-\2\2lv\3\2\2\2mo\7\35\2\2nm\3\2\2"+
		"\2no\3\2\2\2os\3\2\2\2pt\5\16\b\2qt\7\65\2\2rt\7\66\2\2sp\3\2\2\2sq\3"+
		"\2\2\2sr\3\2\2\2tv\3\2\2\2ug\3\2\2\2un\3\2\2\2v\13\3\2\2\2wx\b\7\1\2x"+
		"y\5\b\5\2yz\t\3\2\2z}\3\2\2\2{}\5\b\5\2|w\3\2\2\2|{\3\2\2\2}\u0086\3\2"+
		"\2\2~\177\f\6\2\2\177\u0080\t\4\2\2\u0080\u0085\5\f\7\7\u0081\u0082\f"+
		"\5\2\2\u0082\u0083\t\2\2\2\u0083\u0085\5\f\7\6\u0084~\3\2\2\2\u0084\u0081"+
		"\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\r\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7*\2\2\u008a\u008b\5\16\b\2"+
		"\u008b\u008c\7-\2\2\u008c\u009a\3\2\2\2\u008d\u008e\5\f\7\2\u008e\u008f"+
		"\t\5\2\2\u008f\u0090\5\f\7\2\u0090\u009a\3\2\2\2\u0091\u0092\5\f\7\2\u0092"+
		"\u0093\t\6\2\2\u0093\u0094\5\f\7\2\u0094\u009a\3\2\2\2\u0095\u0096\5\f"+
		"\7\2\u0096\u0097\t\7\2\2\u0097\u0098\5\f\7\2\u0098\u009a\3\2\2\2\u0099"+
		"\u0089\3\2\2\2\u0099\u008d\3\2\2\2\u0099\u0091\3\2\2\2\u0099\u0095\3\2"+
		"\2\2\u009a\17\3\2\2\2\u009b\u009d\b\t\1\2\u009c\u009e\7\35\2\2\u009d\u009c"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\7*\2\2\u00a0"+
		"\u00a1\5\20\t\2\u00a1\u00a2\t\b\2\2\u00a2\u00a3\5\20\t\2\u00a3\u00a4\7"+
		"-\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a7\5\n\6\2\u00a6\u009b\3\2\2\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\u00ad\3\2\2\2\u00a8\u00a9\f\5\2\2\u00a9\u00aa\t\b"+
		"\2\2\u00aa\u00ac\5\20\t\6\u00ab\u00a8\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\21\3\2\2\2\u00af\u00ad\3\2\2"+
		"\2\u00b0\u00b3\7\66\2\2\u00b1\u00b3\5\62\32\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00ba\7\26\2\2\u00b5\u00bb\5"+
		"\6\4\2\u00b6\u00bb\7\66\2\2\u00b7\u00bb\7\65\2\2\u00b8\u00bb\7\67\2\2"+
		"\u00b9\u00bb\78\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00b6\3\2\2\2\u00ba\u00b7"+
		"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\23\3\2\2\2\u00bc"+
		"\u00c0\7\r\2\2\u00bd\u00be\5\"\22\2\u00be\u00bf\7\26\2\2\u00bf\u00c1\3"+
		"\2\2\2\u00c0\u00bd\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c4\7\66\2\2\u00c3\u00c5\5 \21\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3"+
		"\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00cb\7)\2\2\u00c7\u00ca\5\6\4\2\u00c8"+
		"\u00ca\5\4\3\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00d0\7\17\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3"+
		"\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7,\2\2\u00d2\25\3\2\2\2\u00d3\u00d4"+
		"\7\66\2\2\u00d4\u00da\7*\2\2\u00d5\u00db\5\6\4\2\u00d6\u00db\7\66\2\2"+
		"\u00d7\u00db\7\65\2\2\u00d8\u00db\7\67\2\2\u00d9\u00db\78\2\2\u00da\u00d5"+
		"\3\2\2\2\u00da\u00d6\3\2\2\2\u00da\u00d7\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\7-\2\2\u00dd\27\3\2\2\2"+
		"\u00de\u00df\7\16\2\2\u00df\u00e0\7*\2\2\u00e0\u00e1\5\20\t\2\u00e1\u00e2"+
		"\7-\2\2\u00e2\u00e7\7)\2\2\u00e3\u00e6\5\6\4\2\u00e4\u00e6\5\4\3\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea"+
		"\u00ec\7,\2\2\u00eb\u00ed\5\32\16\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3"+
		"\2\2\2\u00ed\31\3\2\2\2\u00ee\u00ef\7\t\2\2\u00ef\u00f4\7)\2\2\u00f0\u00f3"+
		"\5\6\4\2\u00f1\u00f3\5\4\3\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3"+
		"\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7,\2\2\u00f8\33\3\2\2\2\u00f9\u00fa"+
		"\7\13\2\2\u00fa\u00fb\7*\2\2\u00fb\u00fc\7\66\2\2\u00fc\u00fd\5&\24\2"+
		"\u00fd\u00fe\7-\2\2\u00fe\u0103\7)\2\2\u00ff\u0102\5\6\4\2\u0100\u0102"+
		"\5\4\3\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0106\u0107\7,\2\2\u0107\35\3\2\2\2\u0108\u0109\7\f\2\2\u0109\u010c"+
		"\7*\2\2\u010a\u010d\5\20\t\2\u010b\u010d\5\16\b\2\u010c\u010a\3\2\2\2"+
		"\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\7-\2\2\u010f\u0114"+
		"\7)\2\2\u0110\u0113\5\6\4\2\u0111\u0113\5\4\3\2\u0112\u0110\3\2\2\2\u0112"+
		"\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\7,\2\2\u0118"+
		"\37\3\2\2\2\u0119\u0122\7*\2\2\u011a\u011f\7\66\2\2\u011b\u011c\7&\2\2"+
		"\u011c\u011e\7\66\2\2\u011d\u011b\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0122"+
		"\u011a\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\7-"+
		"\2\2\u0125!\3\2\2\2\u0126\u0132\7\66\2\2\u0127\u0128\7+\2\2\u0128\u012d"+
		"\7\66\2\2\u0129\u012a\7&\2\2\u012a\u012c\7\66\2\2\u012b\u0129\3\2\2\2"+
		"\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130"+
		"\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0132\7.\2\2\u0131\u0126\3\2\2\2\u0131"+
		"\u0127\3\2\2\2\u0132#\3\2\2\2\u0133\u0141\5*\26\2\u0134\u0141\5,\27\2"+
		"\u0135\u0141\5.\30\2\u0136\u0139\7\66\2\2\u0137\u0139\5\60\31\2\u0138"+
		"\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0141\7!"+
		"\2\2\u013b\u013e\7\66\2\2\u013c\u013e\5\60\31\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\7\"\2\2\u0140\u0133\3\2"+
		"\2\2\u0140\u0134\3\2\2\2\u0140\u0135\3\2\2\2\u0140\u0138\3\2\2\2\u0140"+
		"\u013d\3\2\2\2\u0141%\3\2\2\2\u0142\u0143\7\63\2\2\u0143\u0144\7\67\2"+
		"\2\u0144\u0145\7\64\2\2\u0145\u0146\7\67\2\2\u0146\'\3\2\2\2\u0147\u014a"+
		"\7/\2\2\u0148\u014b\5\6\4\2\u0149\u014b\79\2\2\u014a\u0148\3\2\2\2\u014a"+
		"\u0149\3\2\2\2\u014b\u0153\3\2\2\2\u014c\u014f\7&\2\2\u014d\u0150\5\6"+
		"\4\2\u014e\u0150\79\2\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150"+
		"\u0152\3\2\2\2\u0151\u014c\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2"+
		"\2\2\u0153\u0154\3\2\2\2\u0154)\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157"+
		"\7\60\2\2\u0157\u0158\7*\2\2\u0158\u0159\7\67\2\2\u0159\u015a\7&\2\2\u015a"+
		"\u015b\7\67\2\2\u015b\u015c\7-\2\2\u015c+\3\2\2\2\u015d\u015e\7\61\2\2"+
		"\u015e\u015f\7*\2\2\u015f\u0160\7\67\2\2\u0160\u0161\7&\2\2\u0161\u0162"+
		"\7\67\2\2\u0162\u0163\7-\2\2\u0163-\3\2\2\2\u0164\u0165\7\62\2\2\u0165"+
		"\u0166\7*\2\2\u0166\u0167\7\67\2\2\u0167\u0168\7&\2\2\u0168\u0169\7\67"+
		"\2\2\u0169\u016a\7-\2\2\u016a/\3\2\2\2\u016b\u016c\7+\2\2\u016c\u0173"+
		"\5\b\5\2\u016d\u016f\7&\2\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u0172\5\b\5\2\u0171\u016e\3\2\2\2\u0172\u0175\3\2"+
		"\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0176\u0177\7.\2\2\u0177\u0196\3\2\2\2\u0178\u0179\7+\2"+
		"\2\u0179\u0180\5\b\5\2\u017a\u017c\7&\2\2\u017b\u017a\3\2\2\2\u017b\u017c"+
		"\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\5\b\5\2\u017e\u017b\3\2\2\2\u017f"+
		"\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0190\3\2"+
		"\2\2\u0182\u0180\3\2\2\2\u0183\u0184\7(\2\2\u0184\u018b\5\b\5\2\u0185"+
		"\u0187\7&\2\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2"+
		"\2\2\u0188\u018a\5\b\5\2\u0189\u0186\3\2\2\2\u018a\u018d\3\2\2\2\u018b"+
		"\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2"+
		"\2\2\u018e\u0183\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0194\7."+
		"\2\2\u0194\u0196\3\2\2\2\u0195\u016b\3\2\2\2\u0195\u0178\3\2\2\2\u0196"+
		"\61\3\2\2\2\u0197\u0198\7\66\2\2\u0198\u0199\7+\2\2\u0199\u019a\t\t\2"+
		"\2\u019a\u01a0\7.\2\2\u019b\u019c\7+\2\2\u019c\u019d\t\t\2\2\u019d\u019f"+
		"\7.\2\2\u019e\u019b\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1\63\3\2\2\2\u01a2\u01a0\3\2\2\2:\67DNQY]adgnsu|\u0084"+
		"\u0086\u0099\u009d\u00a6\u00ad\u00b2\u00ba\u00c0\u00c4\u00c9\u00cb\u00cf"+
		"\u00da\u00e5\u00e7\u00ec\u00f2\u00f4\u0101\u0103\u010c\u0112\u0114\u011f"+
		"\u0122\u012d\u0131\u0138\u013d\u0140\u014a\u014f\u0153\u016e\u0173\u017b"+
		"\u0180\u0186\u018b\u0190\u0195\u01a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}