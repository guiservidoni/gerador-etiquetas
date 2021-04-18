'''
para instalar as bibliotecas nescessarias 
     pip3 install -r .\requirements.txt
para compilar:
    > java -jar antlr-4.9.1-complete.jar -Dlanguage=Python3 Eti.g4
para executar:
    > [python | python3] main.py input.txt output.txt

    precisa interar o novo.py - verificar CGenerator.py,EtilInterpreter.py,EtiSemantico.py,EtiUtils.py
'''

from antlr4 import *
from EtiLexer import EtiLexer
from EtiParser import EtiParser
import sys
import os

class LexicoErroListener(object):
    def syntaxError(recognizer, offendingSymbol, line, column, msg, e):
        text = recognizer._input.getText(
            recognizer._tokenStartCharIndex, recognizer._input.index)
        
        text = text.replace('\n', '')

        if text[0] == '"' and len(text) > 1:
            raise Exception(f'Linha {line}: cadeia literal nao fechada')
        elif text[0] == '{' and len(text) > 1:
            raise Exception(f'Linha {line}: comentario nao fechado')
        else:
            raise Exception(f'Linha {line}: {text} - simbolo nao identificado')

class ParserErroListener(object):
    def syntaxError(recognizer, offendingSymbol, line, column, msg, e):
        if "EOF" in offendingSymbol.text:
            offendingSymbol.text = "EOF"

        msg = f'Linha {line}: erro sintatico proximo a {offendingSymbol.text}'

        raise Exception(msg)





def main(argv):

    if (len(argv) < 2):
        print("O comando deve obrigatoriamente ter dois argumentos!\n")

    # guarda argumento 1
    input_file = argv[1]

    # guarda argumento 2
    output_file = argv[2]

    # verifica se o arquivo destino output existe
    if os.path.exists(output_file):
        # se existir entao ele eh apagado
        os.remove(output_file)

    # o arquivo onde a saida sera gerada eh entao criado
    target_file = open(output_file, "a")

    # metodo da lib antlr4 que le um arquivo
    input_stream = FileStream(input_file, encoding="utf-8")

    # variavel que sera atribuida ao arquivo destino
    output = ""
    tree = False
    interpreter = False

    # objeto Lexer criado
    lexer = EtiLexer(input_stream)

    # por garantia
    lexer.removeErrorListeners()
    lexer._listeners = [LexicoErroListener]

    # fluxo de tokens
    tokens = CommonTokenStream(lexer)
    parser = EtiParser(tokens)

    # removendo os listeners de erros defaults
    parser._listeners = [ParserErroListener]


   
    try:
        parser.create_eti()
    except Exception as err:
        output += f'{str(err)}\n'

    output += f'Fim da compilacao\n'


    # a variavel output eh entao escrita no arquivo destino e fechado
    target_file.write(output)
    target_file.close()

    

# python assinatura para verificar se este arquivo e o principal
if __name__ == '__main__':
    main(sys.argv)