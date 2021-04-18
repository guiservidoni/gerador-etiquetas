// Generated from d:\Users\User\Desktop\Compilador\trabalho etiqueta\Eti.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EtiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, COMENTARIO=3, TITULO=4, VALIDADE=5, VALOR=6, SKU=7, CREATE_LABEL=8, 
		DELETE=9, A_PARENTESES=10, F_PARENTESES=11, DELIM=12, TYPE=13, DATE=14, 
		INT=15, CURENCY=16, LABEL=17, STRING=18, IDENT=19, WS=20;
	public static final int
		RULE_script = 0, RULE_commands = 1, RULE_create_eti = 2, RULE_delete = 3, 
		RULE_value = 4, RULE_itemWhere = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "commands", "create_eti", "delete", "value", "itemWhere"
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

	@Override
	public String getGrammarFileName() { return "Eti.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EtiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ScriptContext extends ParserRuleContext {
		public List<Create_etiContext> create_eti() {
			return getRuleContexts(Create_etiContext.class);
		}
		public Create_etiContext create_eti(int i) {
			return getRuleContext(Create_etiContext.class,i);
		}
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			create_eti();
			setState(16);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(13);
					create_eti();
					}
					} 
				}
				setState(18);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELETE || _la==A_PARENTESES) {
				{
				{
				setState(19);
				commands();
				}
				}
				setState(24);
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

	public static class CommandsContext extends ParserRuleContext {
		public Create_etiContext create_eti() {
			return getRuleContext(Create_etiContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_commands);
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A_PARENTESES:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				create_eti();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				delete();
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

	public static class Create_etiContext extends ParserRuleContext {
		public TerminalNode A_PARENTESES() { return getToken(EtiParser.A_PARENTESES, 0); }
		public TerminalNode IDENT() { return getToken(EtiParser.IDENT, 0); }
		public TerminalNode F_PARENTESES() { return getToken(EtiParser.F_PARENTESES, 0); }
		public TerminalNode TITULO() { return getToken(EtiParser.TITULO, 0); }
		public List<TerminalNode> DELIM() { return getTokens(EtiParser.DELIM); }
		public TerminalNode DELIM(int i) {
			return getToken(EtiParser.DELIM, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode VALIDADE() { return getToken(EtiParser.VALIDADE, 0); }
		public TerminalNode VALOR() { return getToken(EtiParser.VALOR, 0); }
		public TerminalNode SKU() { return getToken(EtiParser.SKU, 0); }
		public Create_etiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_eti; }
	}

	public final Create_etiContext create_eti() throws RecognitionException {
		Create_etiContext _localctx = new Create_etiContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_create_eti);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(A_PARENTESES);
			setState(30);
			match(IDENT);
			setState(31);
			match(F_PARENTESES);
			setState(32);
			match(TITULO);
			setState(33);
			match(DELIM);
			setState(34);
			value();
			setState(35);
			match(T__0);
			setState(36);
			match(VALIDADE);
			setState(37);
			match(DELIM);
			setState(38);
			value();
			setState(39);
			match(T__0);
			setState(40);
			match(VALOR);
			setState(41);
			match(DELIM);
			setState(42);
			value();
			setState(43);
			match(T__0);
			setState(44);
			match(SKU);
			setState(45);
			match(DELIM);
			setState(46);
			value();
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

	public static class DeleteContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(EtiParser.DELETE, 0); }
		public TerminalNode A_PARENTESES() { return getToken(EtiParser.A_PARENTESES, 0); }
		public TerminalNode IDENT() { return getToken(EtiParser.IDENT, 0); }
		public TerminalNode F_PARENTESES() { return getToken(EtiParser.F_PARENTESES, 0); }
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(DELETE);
			setState(49);
			match(T__1);
			setState(50);
			match(A_PARENTESES);
			setState(51);
			match(IDENT);
			setState(52);
			match(F_PARENTESES);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode CURENCY() { return getToken(EtiParser.CURENCY, 0); }
		public TerminalNode STRING() { return getToken(EtiParser.STRING, 0); }
		public TerminalNode DATE() { return getToken(EtiParser.DATE, 0); }
		public TerminalNode LABEL() { return getToken(EtiParser.LABEL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DATE) | (1L << CURENCY) | (1L << LABEL) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ItemWhereContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(EtiParser.IDENT, 0); }
		public TerminalNode DELIM() { return getToken(EtiParser.DELIM, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ItemWhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemWhere; }
	}

	public final ItemWhereContext itemWhere() throws RecognitionException {
		ItemWhereContext _localctx = new ItemWhereContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_itemWhere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(IDENT);
			setState(57);
			match(DELIM);
			setState(58);
			value();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26?\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\7\2\21\n\2\f\2\16\2\24\13\2"+
		"\3\2\7\2\27\n\2\f\2\16\2\32\13\2\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\3\4\2\20"+
		"\20\22\24\2;\2\16\3\2\2\2\4\35\3\2\2\2\6\37\3\2\2\2\b\62\3\2\2\2\n8\3"+
		"\2\2\2\f:\3\2\2\2\16\22\5\6\4\2\17\21\5\6\4\2\20\17\3\2\2\2\21\24\3\2"+
		"\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\30\3\2\2\2\24\22\3\2\2\2\25\27\5\4"+
		"\3\2\26\25\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\3\3\2"+
		"\2\2\32\30\3\2\2\2\33\36\5\6\4\2\34\36\5\b\5\2\35\33\3\2\2\2\35\34\3\2"+
		"\2\2\36\5\3\2\2\2\37 \7\f\2\2 !\7\25\2\2!\"\7\r\2\2\"#\7\6\2\2#$\7\16"+
		"\2\2$%\5\n\6\2%&\7\3\2\2&\'\7\7\2\2\'(\7\16\2\2()\5\n\6\2)*\7\3\2\2*+"+
		"\7\b\2\2+,\7\16\2\2,-\5\n\6\2-.\7\3\2\2./\7\t\2\2/\60\7\16\2\2\60\61\5"+
		"\n\6\2\61\7\3\2\2\2\62\63\7\13\2\2\63\64\7\4\2\2\64\65\7\f\2\2\65\66\7"+
		"\25\2\2\66\67\7\r\2\2\67\t\3\2\2\289\t\2\2\29\13\3\2\2\2:;\7\25\2\2;<"+
		"\7\16\2\2<=\5\n\6\2=\r\3\2\2\2\5\22\30\35";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}