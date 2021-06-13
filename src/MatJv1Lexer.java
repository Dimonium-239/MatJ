// Generated from /home/dimonium-239/Study/6Sem/TKiK/MatJv1/MatJv1.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MatJv1Lexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NL", "BLOCKCOMMENT", "COMMENT", "WS", "BREAK", "CONTINUE", "ELSE", "ELIF", 
			"FOR", "WHILE", "FUNCTION", "IF", "RETURN", "EQUALS", "GREATER_THAN_OR_EQUAL", 
			"LESS_THAN_OR_EQUAL", "AND", "OR", "NOT_EQUAL", "ASSIGN", "COLON", "GREATER_THAN", 
			"DIVIDE", "PERCENT", "LESS_THAN", "MINUS", "NOT", "PLUS", "POWER", "TIMES", 
			"TRANSPOSE", "ROTATE", "INCREMET", "DECREMENT", "AT", "COMMA", "DOT", 
			"SEMI_COLON", "LEFT_BRACE", "LEFT_PARENTHESIS", "LEFT_SQUARE_BRACKET", 
			"RIGHT_BRACE", "RIGHT_PARENTHESIS", "RIGHT_SQUARE_BRACKET", "SHOW", "ONES", 
			"ZEROS", "EYE", "IN", "RANGE", "BOOL_VAL", "VAR_NAME", "INT_VAL", "FLOAT_VAL", 
			"STRING_VAL"
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


		boolean maybeString = false;


	public MatJv1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MatJv1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 3:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 13:
			EQUALS_action((RuleContext)_localctx, actionIndex);
			break;
		case 19:
			ASSIGN_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			GREATER_THAN_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			LESS_THAN_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
			COMMA_action((RuleContext)_localctx, actionIndex);
			break;
		case 37:
			SEMI_COLON_action((RuleContext)_localctx, actionIndex);
			break;
		case 38:
			LEFT_BRACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 39:
			LEFT_PARENTHESIS_action((RuleContext)_localctx, actionIndex);
			break;
		case 40:
			LEFT_SQUARE_BRACKET_action((RuleContext)_localctx, actionIndex);
			break;
		case 41:
			RIGHT_BRACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 42:
			RIGHT_PARENTHESIS_action((RuleContext)_localctx, actionIndex);
			break;
		case 43:
			RIGHT_SQUARE_BRACKET_action((RuleContext)_localctx, actionIndex);
			break;
		case 44:
			SHOW_action((RuleContext)_localctx, actionIndex);
			break;
		case 45:
			ONES_action((RuleContext)_localctx, actionIndex);
			break;
		case 46:
			ZEROS_action((RuleContext)_localctx, actionIndex);
			break;
		case 47:
			EYE_action((RuleContext)_localctx, actionIndex);
			break;
		case 48:
			IN_action((RuleContext)_localctx, actionIndex);
			break;
		case 49:
			RANGE_action((RuleContext)_localctx, actionIndex);
			break;
		case 51:
			VAR_NAME_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 maybeString = true; 
			break;
		}
	}
	private void EQUALS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			maybeString = true;
			break;
		}
	}
	private void ASSIGN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 maybeString = true; 
			break;
		}
	}
	private void GREATER_THAN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 maybeString = true; 
			break;
		}
	}
	private void LESS_THAN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			 maybeString = true; 
			break;
		}
	}
	private void COMMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			maybeString = true;
			break;
		}
	}
	private void SEMI_COLON_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			maybeString = true;
			break;
		}
	}
	private void LEFT_BRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			maybeString = true;
			break;
		}
	}
	private void LEFT_PARENTHESIS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			maybeString = true;
			break;
		}
	}
	private void LEFT_SQUARE_BRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			maybeString = true;
			break;
		}
	}
	private void RIGHT_BRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			maybeString = false;
			break;
		}
	}
	private void RIGHT_PARENTHESIS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			maybeString = false;
			break;
		}
	}
	private void RIGHT_SQUARE_BRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			maybeString = false;
			break;
		}
	}
	private void SHOW_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:
			maybeString = true;
			break;
		}
	}
	private void ONES_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:
			maybeString = true;
			break;
		}
	}
	private void ZEROS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:
			maybeString = true;
			break;
		}
	}
	private void EYE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:
			maybeString = true;
			break;
		}
	}
	private void IN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17:
			maybeString = true;
			break;
		}
	}
	private void RANGE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18:
			maybeString = true;
			break;
		}
	}
	private void VAR_NAME_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19:
			 maybeString = false; 
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 54:
			return STRING_VAL_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean STRING_VAL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return maybeString;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0187\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\5\2u\n\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\7\3}\n\3\f\3\16\3\u0080\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\7\4\u008a\n\4\f\4\16\4\u008d\13\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \5 \u00fb\n \3!\3!\3\"\3\"\3\"\3"+
		"#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3"+
		"+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\5\64\u0150\n\64\3\65\3\65\7\65\u0154\n\65\f\65"+
		"\16\65\u0157\13\65\3\65\3\65\3\66\6\66\u015c\n\66\r\66\16\66\u015d\3\67"+
		"\6\67\u0161\n\67\r\67\16\67\u0162\3\67\3\67\3\67\3\67\6\67\u0169\n\67"+
		"\r\67\16\67\u016a\3\67\3\67\5\67\u016f\n\67\38\38\38\38\38\78\u0176\n"+
		"8\f8\168\u0179\138\38\38\38\38\38\78\u0180\n8\f8\168\u0183\138\38\58\u0186"+
		"\n8\4~\u008b\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9\3\2\b\4\2\f\f\17\17\4\2\13\13\"\"\4\2C\\c|\6\2\62;C\\"+
		"aac|\3\2\62;\5\2\f\f\17\17))\2\u0196\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3t\3\2\2\2\5x\3\2\2\2"+
		"\7\u0087\3\2\2\2\t\u0092\3\2\2\2\13\u0097\3\2\2\2\r\u009d\3\2\2\2\17\u00a6"+
		"\3\2\2\2\21\u00ab\3\2\2\2\23\u00b0\3\2\2\2\25\u00b4\3\2\2\2\27\u00ba\3"+
		"\2\2\2\31\u00bf\3\2\2\2\33\u00c2\3\2\2\2\35\u00c9\3\2\2\2\37\u00ce\3\2"+
		"\2\2!\u00d1\3\2\2\2#\u00d4\3\2\2\2%\u00d7\3\2\2\2\'\u00da\3\2\2\2)\u00dd"+
		"\3\2\2\2+\u00e0\3\2\2\2-\u00e2\3\2\2\2/\u00e5\3\2\2\2\61\u00e7\3\2\2\2"+
		"\63\u00e9\3\2\2\2\65\u00ec\3\2\2\2\67\u00ee\3\2\2\29\u00f0\3\2\2\2;\u00f2"+
		"\3\2\2\2=\u00f4\3\2\2\2?\u00fa\3\2\2\2A\u00fc\3\2\2\2C\u00fe\3\2\2\2E"+
		"\u0101\3\2\2\2G\u0104\3\2\2\2I\u0106\3\2\2\2K\u0109\3\2\2\2M\u010b\3\2"+
		"\2\2O\u010e\3\2\2\2Q\u0111\3\2\2\2S\u0114\3\2\2\2U\u0117\3\2\2\2W\u011a"+
		"\3\2\2\2Y\u011d\3\2\2\2[\u0120\3\2\2\2]\u0127\3\2\2\2_\u012e\3\2\2\2a"+
		"\u0136\3\2\2\2c\u013c\3\2\2\2e\u0141\3\2\2\2g\u014f\3\2\2\2i\u0151\3\2"+
		"\2\2k\u015b\3\2\2\2m\u016e\3\2\2\2o\u0185\3\2\2\2qr\7\17\2\2ru\7\f\2\2"+
		"su\t\2\2\2tq\3\2\2\2ts\3\2\2\2uv\3\2\2\2vw\b\2\2\2w\4\3\2\2\2xy\7%\2\2"+
		"yz\7,\2\2z~\3\2\2\2{}\13\2\2\2|{\3\2\2\2}\u0080\3\2\2\2~\177\3\2\2\2~"+
		"|\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7,\2\2\u0082\u0083"+
		"\7%\2\2\u0083\u0084\7\177\2\2\u0084\u0085\3\2\2\2\u0085\u0086\b\3\2\2"+
		"\u0086\6\3\2\2\2\u0087\u008b\7%\2\2\u0088\u008a\13\2\2\2\u0089\u0088\3"+
		"\2\2\2\u008a\u008d\3\2\2\2\u008b\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\5\3\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0091\b\4\2\2\u0091\b\3\2\2\2\u0092\u0093\t\3\2\2\u0093\u0094"+
		"\b\5\3\2\u0094\u0095\3\2\2\2\u0095\u0096\b\5\4\2\u0096\n\3\2\2\2\u0097"+
		"\u0098\7d\2\2\u0098\u0099\7t\2\2\u0099\u009a\7g\2\2\u009a\u009b\7c\2\2"+
		"\u009b\u009c\7m\2\2\u009c\f\3\2\2\2\u009d\u009e\7e\2\2\u009e\u009f\7q"+
		"\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3"+
		"\7p\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7g\2\2\u00a5\16\3\2\2\2\u00a6\u00a7"+
		"\7g\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7g\2\2\u00aa"+
		"\20\3\2\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7k\2\2\u00ae"+
		"\u00af\7h\2\2\u00af\22\3\2\2\2\u00b0\u00b1\7h\2\2\u00b1\u00b2\7q\2\2\u00b2"+
		"\u00b3\7t\2\2\u00b3\24\3\2\2\2\u00b4\u00b5\7y\2\2\u00b5\u00b6\7j\2\2\u00b6"+
		"\u00b7\7k\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7g\2\2\u00b9\26\3\2\2\2\u00ba"+
		"\u00bb\7h\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be\7e\2\2"+
		"\u00be\30\3\2\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7h\2\2\u00c1\32\3\2\2"+
		"\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6"+
		"\7w\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7p\2\2\u00c8\34\3\2\2\2\u00c9\u00ca"+
		"\7?\2\2\u00ca\u00cb\7?\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\b\17\5\2\u00cd"+
		"\36\3\2\2\2\u00ce\u00cf\7@\2\2\u00cf\u00d0\7?\2\2\u00d0 \3\2\2\2\u00d1"+
		"\u00d2\7>\2\2\u00d2\u00d3\7?\2\2\u00d3\"\3\2\2\2\u00d4\u00d5\7(\2\2\u00d5"+
		"\u00d6\7(\2\2\u00d6$\3\2\2\2\u00d7\u00d8\7~\2\2\u00d8\u00d9\7~\2\2\u00d9"+
		"&\3\2\2\2\u00da\u00db\7\u0080\2\2\u00db\u00dc\7?\2\2\u00dc(\3\2\2\2\u00dd"+
		"\u00de\7?\2\2\u00de\u00df\b\25\6\2\u00df*\3\2\2\2\u00e0\u00e1\7<\2\2\u00e1"+
		",\3\2\2\2\u00e2\u00e3\7@\2\2\u00e3\u00e4\b\27\7\2\u00e4.\3\2\2\2\u00e5"+
		"\u00e6\7\61\2\2\u00e6\60\3\2\2\2\u00e7\u00e8\7\'\2\2\u00e8\62\3\2\2\2"+
		"\u00e9\u00ea\7>\2\2\u00ea\u00eb\b\32\b\2\u00eb\64\3\2\2\2\u00ec\u00ed"+
		"\7/\2\2\u00ed\66\3\2\2\2\u00ee\u00ef\7\u0080\2\2\u00ef8\3\2\2\2\u00f0"+
		"\u00f1\7-\2\2\u00f1:\3\2\2\2\u00f2\u00f3\7`\2\2\u00f3<\3\2\2\2\u00f4\u00f5"+
		"\7,\2\2\u00f5>\3\2\2\2\u00f6\u00f7\7\60\2\2\u00f7\u00fb\7V\2\2\u00f8\u00f9"+
		"\7\60\2\2\u00f9\u00fb\7v\2\2\u00fa\u00f6\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"@\3\2\2\2\u00fc\u00fd\7)\2\2\u00fdB\3\2\2\2\u00fe\u00ff\7-\2\2\u00ff\u0100"+
		"\7-\2\2\u0100D\3\2\2\2\u0101\u0102\7/\2\2\u0102\u0103\7/\2\2\u0103F\3"+
		"\2\2\2\u0104\u0105\7B\2\2\u0105H\3\2\2\2\u0106\u0107\7.\2\2\u0107\u0108"+
		"\b%\t\2\u0108J\3\2\2\2\u0109\u010a\7\60\2\2\u010aL\3\2\2\2\u010b\u010c"+
		"\7=\2\2\u010c\u010d\b\'\n\2\u010dN\3\2\2\2\u010e\u010f\7}\2\2\u010f\u0110"+
		"\b(\13\2\u0110P\3\2\2\2\u0111\u0112\7*\2\2\u0112\u0113\b)\f\2\u0113R\3"+
		"\2\2\2\u0114\u0115\7]\2\2\u0115\u0116\b*\r\2\u0116T\3\2\2\2\u0117\u0118"+
		"\7\177\2\2\u0118\u0119\b+\16\2\u0119V\3\2\2\2\u011a\u011b\7+\2\2\u011b"+
		"\u011c\b,\17\2\u011cX\3\2\2\2\u011d\u011e\7_\2\2\u011e\u011f\b-\20\2\u011f"+
		"Z\3\2\2\2\u0120\u0121\7u\2\2\u0121\u0122\7j\2\2\u0122\u0123\7q\2\2\u0123"+
		"\u0124\7y\2\2\u0124\u0125\3\2\2\2\u0125\u0126\b.\21\2\u0126\\\3\2\2\2"+
		"\u0127\u0128\7q\2\2\u0128\u0129\7p\2\2\u0129\u012a\7g\2\2\u012a\u012b"+
		"\7u\2\2\u012b\u012c\3\2\2\2\u012c\u012d\b/\22\2\u012d^\3\2\2\2\u012e\u012f"+
		"\7|\2\2\u012f\u0130\7g\2\2\u0130\u0131\7t\2\2\u0131\u0132\7q\2\2\u0132"+
		"\u0133\7u\2\2\u0133\u0134\3\2\2\2\u0134\u0135\b\60\23\2\u0135`\3\2\2\2"+
		"\u0136\u0137\7g\2\2\u0137\u0138\7{\2\2\u0138\u0139\7g\2\2\u0139\u013a"+
		"\3\2\2\2\u013a\u013b\b\61\24\2\u013bb\3\2\2\2\u013c\u013d\7k\2\2\u013d"+
		"\u013e\7p\2\2\u013e\u013f\3\2\2\2\u013f\u0140\b\62\25\2\u0140d\3\2\2\2"+
		"\u0141\u0142\7\60\2\2\u0142\u0143\7\60\2\2\u0143\u0144\3\2\2\2\u0144\u0145"+
		"\b\63\26\2\u0145f\3\2\2\2\u0146\u0147\7v\2\2\u0147\u0148\7t\2\2\u0148"+
		"\u0149\7w\2\2\u0149\u0150\7g\2\2\u014a\u014b\7h\2\2\u014b\u014c\7c\2\2"+
		"\u014c\u014d\7n\2\2\u014d\u014e\7u\2\2\u014e\u0150\7g\2\2\u014f\u0146"+
		"\3\2\2\2\u014f\u014a\3\2\2\2\u0150h\3\2\2\2\u0151\u0155\t\4\2\2\u0152"+
		"\u0154\t\5\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2"+
		"\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158"+
		"\u0159\b\65\27\2\u0159j\3\2\2\2\u015a\u015c\t\6\2\2\u015b\u015a\3\2\2"+
		"\2\u015c\u015d\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015el"+
		"\3\2\2\2\u015f\u0161\5k\66\2\u0160\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\7\60"+
		"\2\2\u0165\u0166\5k\66\2\u0166\u016f\3\2\2\2\u0167\u0169\5k\66\2\u0168"+
		"\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u016f\3\2\2\2\u016c\u016d\7\60\2\2\u016d\u016f\5k\66\2\u016e"+
		"\u0160\3\2\2\2\u016e\u0168\3\2\2\2\u016e\u016c\3\2\2\2\u016fn\3\2\2\2"+
		"\u0170\u0171\68\2\2\u0171\u0177\7)\2\2\u0172\u0176\n\7\2\2\u0173\u0174"+
		"\7)\2\2\u0174\u0176\7)\2\2\u0175\u0172\3\2\2\2\u0175\u0173\3\2\2\2\u0176"+
		"\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2"+
		"\2\2\u0179\u0177\3\2\2\2\u017a\u0186\7)\2\2\u017b\u0181\7$\2\2\u017c\u0180"+
		"\n\7\2\2\u017d\u017e\7)\2\2\u017e\u0180\7)\2\2\u017f\u017c\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2"+
		"\2\2\u0182\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0186\7$\2\2\u0185"+
		"\u0170\3\2\2\2\u0185\u017b\3\2\2\2\u0186p\3\2\2\2\22\2t~\u008b\u00fa\u014f"+
		"\u0155\u015d\u0162\u016a\u016e\u0175\u0177\u017f\u0181\u0185\30\2\3\2"+
		"\3\5\2\b\2\2\3\17\3\3\25\4\3\27\5\3\32\6\3%\7\3\'\b\3(\t\3)\n\3*\13\3"+
		"+\f\3,\r\3-\16\3.\17\3/\20\3\60\21\3\61\22\3\62\23\3\63\24\3\65\25";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}