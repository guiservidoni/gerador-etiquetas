# Generated from Eti.g4 by ANTLR 4.9.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26")
        buf.write("?\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2")
        buf.write("\3\2\7\2\21\n\2\f\2\16\2\24\13\2\3\2\7\2\27\n\2\f\2\16")
        buf.write("\2\32\13\2\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\3\4\3\4")
        buf.write("\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3")
        buf.write("\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\2\2")
        buf.write("\b\2\4\6\b\n\f\2\3\4\2\20\20\22\24\2;\2\16\3\2\2\2\4\35")
        buf.write("\3\2\2\2\6\37\3\2\2\2\b\62\3\2\2\2\n8\3\2\2\2\f:\3\2\2")
        buf.write("\2\16\22\5\6\4\2\17\21\5\6\4\2\20\17\3\2\2\2\21\24\3\2")
        buf.write("\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\30\3\2\2\2\24\22\3")
        buf.write("\2\2\2\25\27\5\4\3\2\26\25\3\2\2\2\27\32\3\2\2\2\30\26")
        buf.write("\3\2\2\2\30\31\3\2\2\2\31\3\3\2\2\2\32\30\3\2\2\2\33\36")
        buf.write("\5\6\4\2\34\36\5\b\5\2\35\33\3\2\2\2\35\34\3\2\2\2\36")
        buf.write("\5\3\2\2\2\37 \7\f\2\2 !\7\25\2\2!\"\7\r\2\2\"#\7\6\2")
        buf.write("\2#$\7\16\2\2$%\5\n\6\2%&\7\3\2\2&\'\7\7\2\2\'(\7\16\2")
        buf.write("\2()\5\n\6\2)*\7\3\2\2*+\7\b\2\2+,\7\16\2\2,-\5\n\6\2")
        buf.write("-.\7\3\2\2./\7\t\2\2/\60\7\16\2\2\60\61\5\n\6\2\61\7\3")
        buf.write("\2\2\2\62\63\7\13\2\2\63\64\7\4\2\2\64\65\7\f\2\2\65\66")
        buf.write("\7\25\2\2\66\67\7\r\2\2\67\t\3\2\2\289\t\2\2\29\13\3\2")
        buf.write("\2\2:;\7\25\2\2;<\7\16\2\2<=\5\n\6\2=\r\3\2\2\2\5\22\30")
        buf.write("\35")
        return buf.getvalue()


class EtiParser ( Parser ):

    grammarFileName = "Eti.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "','", "'.'", "<INVALID>", "'titulo'", 
                     "'validade'", "'valor'", "'sku'", "'create_label'", 
                     "'delete'", "'('", "')'", "':'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "COMENTARIO", 
                      "TITULO", "VALIDADE", "VALOR", "SKU", "CREATE_LABEL", 
                      "DELETE", "A_PARENTESES", "F_PARENTESES", "DELIM", 
                      "TYPE", "DATE", "INT", "CURENCY", "LABEL", "STRING", 
                      "IDENT", "WS" ]

    RULE_script = 0
    RULE_commands = 1
    RULE_create_eti = 2
    RULE_delete = 3
    RULE_value = 4
    RULE_itemWhere = 5

    ruleNames =  [ "script", "commands", "create_eti", "delete", "value", 
                   "itemWhere" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    COMENTARIO=3
    TITULO=4
    VALIDADE=5
    VALOR=6
    SKU=7
    CREATE_LABEL=8
    DELETE=9
    A_PARENTESES=10
    F_PARENTESES=11
    DELIM=12
    TYPE=13
    DATE=14
    INT=15
    CURENCY=16
    LABEL=17
    STRING=18
    IDENT=19
    WS=20

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ScriptContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def create_eti(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(EtiParser.Create_etiContext)
            else:
                return self.getTypedRuleContext(EtiParser.Create_etiContext,i)


        def commands(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(EtiParser.CommandsContext)
            else:
                return self.getTypedRuleContext(EtiParser.CommandsContext,i)


        def getRuleIndex(self):
            return EtiParser.RULE_script

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterScript" ):
                listener.enterScript(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitScript" ):
                listener.exitScript(self)




    def script(self):

        localctx = EtiParser.ScriptContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_script)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 12
            self.create_eti()
            self.state = 16
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,0,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 13
                    self.create_eti() 
                self.state = 18
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,0,self._ctx)

            self.state = 22
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==EtiParser.DELETE or _la==EtiParser.A_PARENTESES:
                self.state = 19
                self.commands()
                self.state = 24
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CommandsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def create_eti(self):
            return self.getTypedRuleContext(EtiParser.Create_etiContext,0)


        def delete(self):
            return self.getTypedRuleContext(EtiParser.DeleteContext,0)


        def getRuleIndex(self):
            return EtiParser.RULE_commands

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCommands" ):
                listener.enterCommands(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCommands" ):
                listener.exitCommands(self)




    def commands(self):

        localctx = EtiParser.CommandsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_commands)
        try:
            self.state = 27
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [EtiParser.A_PARENTESES]:
                self.enterOuterAlt(localctx, 1)
                self.state = 25
                self.create_eti()
                pass
            elif token in [EtiParser.DELETE]:
                self.enterOuterAlt(localctx, 2)
                self.state = 26
                self.delete()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Create_etiContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def A_PARENTESES(self):
            return self.getToken(EtiParser.A_PARENTESES, 0)

        def IDENT(self):
            return self.getToken(EtiParser.IDENT, 0)

        def F_PARENTESES(self):
            return self.getToken(EtiParser.F_PARENTESES, 0)

        def TITULO(self):
            return self.getToken(EtiParser.TITULO, 0)

        def DELIM(self, i:int=None):
            if i is None:
                return self.getTokens(EtiParser.DELIM)
            else:
                return self.getToken(EtiParser.DELIM, i)

        def value(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(EtiParser.ValueContext)
            else:
                return self.getTypedRuleContext(EtiParser.ValueContext,i)


        def VALIDADE(self):
            return self.getToken(EtiParser.VALIDADE, 0)

        def VALOR(self):
            return self.getToken(EtiParser.VALOR, 0)

        def SKU(self):
            return self.getToken(EtiParser.SKU, 0)

        def getRuleIndex(self):
            return EtiParser.RULE_create_eti

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCreate_eti" ):
                listener.enterCreate_eti(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCreate_eti" ):
                listener.exitCreate_eti(self)




    def create_eti(self):

        localctx = EtiParser.Create_etiContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_create_eti)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 29
            self.match(EtiParser.A_PARENTESES)
            self.state = 30
            self.match(EtiParser.IDENT)
            self.state = 31
            self.match(EtiParser.F_PARENTESES)
            self.state = 32
            self.match(EtiParser.TITULO)
            self.state = 33
            self.match(EtiParser.DELIM)
            self.state = 34
            self.value()
            self.state = 35
            self.match(EtiParser.T__0)
            self.state = 36
            self.match(EtiParser.VALIDADE)
            self.state = 37
            self.match(EtiParser.DELIM)
            self.state = 38
            self.value()
            self.state = 39
            self.match(EtiParser.T__0)
            self.state = 40
            self.match(EtiParser.VALOR)
            self.state = 41
            self.match(EtiParser.DELIM)
            self.state = 42
            self.value()
            self.state = 43
            self.match(EtiParser.T__0)
            self.state = 44
            self.match(EtiParser.SKU)
            self.state = 45
            self.match(EtiParser.DELIM)
            self.state = 46
            self.value()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DeleteContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DELETE(self):
            return self.getToken(EtiParser.DELETE, 0)

        def A_PARENTESES(self):
            return self.getToken(EtiParser.A_PARENTESES, 0)

        def IDENT(self):
            return self.getToken(EtiParser.IDENT, 0)

        def F_PARENTESES(self):
            return self.getToken(EtiParser.F_PARENTESES, 0)

        def getRuleIndex(self):
            return EtiParser.RULE_delete

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDelete" ):
                listener.enterDelete(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDelete" ):
                listener.exitDelete(self)




    def delete(self):

        localctx = EtiParser.DeleteContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_delete)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 48
            self.match(EtiParser.DELETE)
            self.state = 49
            self.match(EtiParser.T__1)
            self.state = 50
            self.match(EtiParser.A_PARENTESES)
            self.state = 51
            self.match(EtiParser.IDENT)
            self.state = 52
            self.match(EtiParser.F_PARENTESES)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ValueContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CURENCY(self):
            return self.getToken(EtiParser.CURENCY, 0)

        def STRING(self):
            return self.getToken(EtiParser.STRING, 0)

        def DATE(self):
            return self.getToken(EtiParser.DATE, 0)

        def LABEL(self):
            return self.getToken(EtiParser.LABEL, 0)

        def getRuleIndex(self):
            return EtiParser.RULE_value

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterValue" ):
                listener.enterValue(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitValue" ):
                listener.exitValue(self)




    def value(self):

        localctx = EtiParser.ValueContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_value)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 54
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << EtiParser.DATE) | (1 << EtiParser.CURENCY) | (1 << EtiParser.LABEL) | (1 << EtiParser.STRING))) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ItemWhereContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDENT(self):
            return self.getToken(EtiParser.IDENT, 0)

        def DELIM(self):
            return self.getToken(EtiParser.DELIM, 0)

        def value(self):
            return self.getTypedRuleContext(EtiParser.ValueContext,0)


        def getRuleIndex(self):
            return EtiParser.RULE_itemWhere

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterItemWhere" ):
                listener.enterItemWhere(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitItemWhere" ):
                listener.exitItemWhere(self)




    def itemWhere(self):

        localctx = EtiParser.ItemWhereContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_itemWhere)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 56
            self.match(EtiParser.IDENT)
            self.state = 57
            self.match(EtiParser.DELIM)
            self.state = 58
            self.value()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





