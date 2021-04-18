// Generated from d:\Users\User\Desktop\Compilador\trabalho etiqueta\Eti.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EtiLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, COMENTARIO=3, TITULO=4, VALIDADE=5, VALOR=6, SKU=7, CREATE_LABEL=8, 
		DELETE=9, A_PARENTESES=10, F_PARENTESES=11, DELIM=12, TYPE=13, DATE=14, 
		INT=15, CURENCY=16, LABEL=17, STRING=18, IDENT=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "LETRA", "DIGITO", "CHAR", "COMENTARIO", "TITULO", "VALIDADE", 
			"VALOR", "SKU", "CREATE_LABEL", "DELETE", "A_PARENTESES", "F_PARENTESES", 
			"DELIM", "ESC_SEQ", "TYPE", "DATE", "INT", "CURENCY", "LABEL", "STRING", 
			"IDENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'.'", null, "'titulo'", "'validade'", "'valor'", "'sku'", 
			"'create_label'", "'delete'", "'('", "')'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "COMENTARIO", "TITULO", "VALIDADE", "VALOR", "SKU", 
			"CREATE_LABEL", "DELETE", "A_PARENTESES", "F_PARENTESES", "DELIM", "TYPE", 
			"DATE", "INT", "CURENCY", "LABEL", "STRING", "IDENT", "WS"
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


	public EtiLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Eti.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00d7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\5\6>\n\6\3\7\3\7\7\7B\n"+
		"\7\f\7\16\7E\13\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u009c\n\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\6\24\u00aa\n\24"+
		"\r\24\16\24\u00ab\3\25\3\25\3\25\3\25\6\25\u00b2\n\25\r\25\16\25\u00b3"+
		"\3\25\3\25\6\25\u00b8\n\25\r\25\16\25\u00b9\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\7\27\u00c6\n\27\f\27\16\27\u00c9\13\27\3\27\3"+
		"\27\3\30\3\30\7\30\u00cf\n\30\f\30\16\30\u00d2\13\30\3\31\3\31\3\31\3"+
		"\31\2\2\32\3\3\5\4\7\2\t\2\13\2\r\5\17\6\21\7\23\b\25\t\27\n\31\13\33"+
		"\f\35\r\37\16!\2#\17%\20\'\21)\22+\23-\24/\25\61\26\3\2\t\4\2C\\c|\3\2"+
		"C\\\6\2\f\f\17\17}}\177\177\4\2\f\f$$\5\2C\\aac|\6\2\62;C\\aac|\5\2\13"+
		"\f\17\17\"\"\2\u00de\2\3\3\2\2\2\2\5\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2"+
		")\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5"+
		"\65\3\2\2\2\7\67\3\2\2\2\t9\3\2\2\2\13=\3\2\2\2\r?\3\2\2\2\17J\3\2\2\2"+
		"\21Q\3\2\2\2\23Z\3\2\2\2\25`\3\2\2\2\27d\3\2\2\2\31q\3\2\2\2\33x\3\2\2"+
		"\2\35z\3\2\2\2\37|\3\2\2\2!~\3\2\2\2#\u009b\3\2\2\2%\u009d\3\2\2\2\'\u00a9"+
		"\3\2\2\2)\u00ad\3\2\2\2+\u00bb\3\2\2\2-\u00c2\3\2\2\2/\u00cc\3\2\2\2\61"+
		"\u00d3\3\2\2\2\63\64\7.\2\2\64\4\3\2\2\2\65\66\7\60\2\2\66\6\3\2\2\2\67"+
		"8\t\2\2\28\b\3\2\2\29:\4\62;\2:\n\3\2\2\2;>\5\t\5\2<>\t\3\2\2=;\3\2\2"+
		"\2=<\3\2\2\2>\f\3\2\2\2?C\7}\2\2@B\n\4\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2"+
		"\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7\177\2\2GH\3\2\2\2HI\b\7\2\2I\16\3"+
		"\2\2\2JK\7v\2\2KL\7k\2\2LM\7v\2\2MN\7w\2\2NO\7n\2\2OP\7q\2\2P\20\3\2\2"+
		"\2QR\7x\2\2RS\7c\2\2ST\7n\2\2TU\7k\2\2UV\7f\2\2VW\7c\2\2WX\7f\2\2XY\7"+
		"g\2\2Y\22\3\2\2\2Z[\7x\2\2[\\\7c\2\2\\]\7n\2\2]^\7q\2\2^_\7t\2\2_\24\3"+
		"\2\2\2`a\7u\2\2ab\7m\2\2bc\7w\2\2c\26\3\2\2\2de\7e\2\2ef\7t\2\2fg\7g\2"+
		"\2gh\7c\2\2hi\7v\2\2ij\7g\2\2jk\7a\2\2kl\7n\2\2lm\7c\2\2mn\7d\2\2no\7"+
		"g\2\2op\7n\2\2p\30\3\2\2\2qr\7f\2\2rs\7g\2\2st\7n\2\2tu\7g\2\2uv\7v\2"+
		"\2vw\7g\2\2w\32\3\2\2\2xy\7*\2\2y\34\3\2\2\2z{\7+\2\2{\36\3\2\2\2|}\7"+
		"<\2\2} \3\2\2\2~\177\7^\2\2\177\u0080\7$\2\2\u0080\"\3\2\2\2\u0081\u0082"+
		"\7u\2\2\u0082\u0083\7v\2\2\u0083\u0084\7t\2\2\u0084\u0085\7k\2\2\u0085"+
		"\u0086\7p\2\2\u0086\u009c\7i\2\2\u0087\u0088\7f\2\2\u0088\u0089\7c\2\2"+
		"\u0089\u008a\7v\2\2\u008a\u009c\7g\2\2\u008b\u008c\7k\2\2\u008c\u008d"+
		"\7p\2\2\u008d\u009c\7v\2\2\u008e\u008f\7e\2\2\u008f\u0090\7w\2\2\u0090"+
		"\u0091\7t\2\2\u0091\u0092\7t\2\2\u0092\u0093\7g\2\2\u0093\u0094\7p\2\2"+
		"\u0094\u0095\7e\2\2\u0095\u009c\7{\2\2\u0096\u0097\7n\2\2\u0097\u0098"+
		"\7c\2\2\u0098\u0099\7d\2\2\u0099\u009a\7g\2\2\u009a\u009c\7n\2\2\u009b"+
		"\u0081\3\2\2\2\u009b\u0087\3\2\2\2\u009b\u008b\3\2\2\2\u009b\u008e\3\2"+
		"\2\2\u009b\u0096\3\2\2\2\u009c$\3\2\2\2\u009d\u009e\4\62\65\2\u009e\u009f"+
		"\4\62;\2\u009f\u00a0\7/\2\2\u00a0\u00a1\4\62\63\2\u00a1\u00a2\4\62;\2"+
		"\u00a2\u00a3\7/\2\2\u00a3\u00a4\4\62;\2\u00a4\u00a5\4\62;\2\u00a5\u00a6"+
		"\4\62;\2\u00a6\u00a7\4\62;\2\u00a7&\3\2\2\2\u00a8\u00aa\4\62;\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac(\3\2\2\2\u00ad\u00ae\7T\2\2\u00ae\u00af\7&\2\2\u00af\u00b1"+
		"\3\2\2\2\u00b0\u00b2\4\62;\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\7."+
		"\2\2\u00b6\u00b8\4\62;\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba*\3\2\2\2\u00bb\u00bc\5\13\6\2"+
		"\u00bc\u00bd\5\13\6\2\u00bd\u00be\5\13\6\2\u00be\u00bf\5\13\6\2\u00bf"+
		"\u00c0\5\13\6\2\u00c0\u00c1\5\13\6\2\u00c1,\3\2\2\2\u00c2\u00c7\7$\2\2"+
		"\u00c3\u00c6\5!\21\2\u00c4\u00c6\n\5\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4"+
		"\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7$\2\2\u00cb.\3\2\2\2\u00cc"+
		"\u00d0\t\6\2\2\u00cd\u00cf\t\7\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\60\3\2\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d3\u00d4\t\b\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\b\31\2\2"+
		"\u00d6\62\3\2\2\2\f\2=C\u009b\u00ab\u00b3\u00b9\u00c5\u00c7\u00d0\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}