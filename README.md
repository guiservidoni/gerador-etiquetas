# gerador-etiquetas
<p>Um programa idealizado para que, a partir de um .txt de entrada de informações de produtos, gere etiquetas em .pdf para impressão.</p>
  <caption>Autores: Guilherme Servidoni - 727339 | Alisson Roberto Gomes - 725721</caption>

<h2>Pré-requisitos</h2>
<ol>
  <li>Python 3</li>
  <li>Antlr 4.8 ou superior para Python</li>
  <li>JDK 11.0.2 ou superior</li>
</ol>
<p>Você pode pedir ao pip3 para instalar os requisitos listados em requirements.txt usando <code>pip3 install -r .\requirements.txt</code></p>

<h2>Como compilar</h2>
<p>Execute <code>java -jar antlr-4.9.1-complete.jar -Dlanguage=Python3 Eti.g4</code> para um shell na pasta do gerador.</p>

<h2>Como executar</h2>
<p>No shell, evoque o main.py do programa com o .txt de input como o primeiro argumento, e o .txt de saída que será criado como o segundo argumento. Por exemplo:
<code>python3 main.py input.txt output.txt</code>, caso python3 seja o comando adequado do seu terminal.</p>
<p>input.txt contém os produtos a serem impressos no formato requerido pela linguagem, e output.txt conterá o resultado da compilação, seja ele sucesso ("Fim da compilação"), ou erro léxico ou sintático. A pasta "Casos" contém exemplos de input/output.</p>

<h2>Como escrever o input.txt</h2>
<p>A linguagem é bem direta, e capaz de detectar erros léxicos e sintáticos. Para cada produto, crie um bloco como o abaixo:</p>
<code>
  (pao)<br /><br />
  titulo: "pao de queijo forno de minas 400g",<br /><br />
  validade: 12-05-2021,<br /><br />
  valor: R$11,00,<br /><br />
  sku: PQFMBR<br /><br />
</code>
<ul>
  <li>(pao): Entre parênteses, identifica unicamente o produto dentro do programa.</li>
  <li>titulo: O principal destaque da etiqueta.</li>
  <li>validade: Escrita no formato DD-MM-YYYY.</li>
  <li>valor: No momento, somente R$ é suportado, devendo conter obrigatoriamente dois dígitos para centavos.</li>
  <li>sku: Um código de 6 caracteres que identifica unicamente o produto em controles de estoque.</li>
</ul>
<p>Atente-se à vírgula entre categorias do mesmo produto. Todas as categorias são obrigatórias, e o template da etiqueta final é definido em etiqueta.docx.</p>
<p>O identificador pode ser usado para excluir um produto previamente cadastrado com o comando <code>delete</code>. Você pode conferir exemplos na pasta "Casos".</p>

<h2>O que não foi implementado, porém já está "meio-caminho andado"</h2>
<h3>Análise semântica</h3>
<p>Para este compilador, foram implementadas somente as análises léxica e sintática, e esses são os erros apontáveis pelo compilador. Possíveis ideias de como implementá-la podem ser encontradas <a href="https://github.com/moons2/compiladores-t3" target="_blank">aqui</a>.</p>
<h3>Geração da etiqueta</h3>
<p>Sim, o gerador de etiquetas ainda não gera etiquetas. Sem um analisador semântico, a geração de etiquetas torna-se seriamente comprometida, porém várias dependências que seriam necessárias já estão pré-implementadas, como o template da etiqueta em etiqueta.docx. O script novo.py contém o que poderia ser um canal para geração de etiquetas, transformando a entrada de input.txt em um arquivo .docx a partir do template, e a partir do arquivo .docx gerando um .pdf.</p>

<h2>O que foi implementado</h2>
<p>Um analisador léxico e um analisador sintático.</p>
