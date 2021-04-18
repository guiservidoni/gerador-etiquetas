# Generated from Eti.g4 by ANTLR 4.9.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .EtiParser import EtiParser
else:
    from EtiParser import EtiParser

# This class defines a complete listener for a parse tree produced by EtiParser.
class EtiListener(ParseTreeListener):

    # Enter a parse tree produced by EtiParser#script.
    def enterScript(self, ctx:EtiParser.ScriptContext):
        pass

    # Exit a parse tree produced by EtiParser#script.
    def exitScript(self, ctx:EtiParser.ScriptContext):
        pass


    # Enter a parse tree produced by EtiParser#commands.
    def enterCommands(self, ctx:EtiParser.CommandsContext):
        pass

    # Exit a parse tree produced by EtiParser#commands.
    def exitCommands(self, ctx:EtiParser.CommandsContext):
        pass


    # Enter a parse tree produced by EtiParser#create_eti.
    def enterCreate_eti(self, ctx:EtiParser.Create_etiContext):
        pass

    # Exit a parse tree produced by EtiParser#create_eti.
    def exitCreate_eti(self, ctx:EtiParser.Create_etiContext):
        pass


    # Enter a parse tree produced by EtiParser#delete.
    def enterDelete(self, ctx:EtiParser.DeleteContext):
        pass

    # Exit a parse tree produced by EtiParser#delete.
    def exitDelete(self, ctx:EtiParser.DeleteContext):
        pass


    # Enter a parse tree produced by EtiParser#value.
    def enterValue(self, ctx:EtiParser.ValueContext):
        pass

    # Exit a parse tree produced by EtiParser#value.
    def exitValue(self, ctx:EtiParser.ValueContext):
        pass


    # Enter a parse tree produced by EtiParser#itemWhere.
    def enterItemWhere(self, ctx:EtiParser.ItemWhereContext):
        pass

    # Exit a parse tree produced by EtiParser#itemWhere.
    def exitItemWhere(self, ctx:EtiParser.ItemWhereContext):
        pass



del EtiParser