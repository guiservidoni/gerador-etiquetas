//Trabalho para printar a etiqueta de um produto

grammar Eti;

fragment
LETRA: 'A'..'Z' | 'a'..'z';

fragment
DIGITO: '0'..'9';

fragment
CHAR: DIGITO | [A-Z];

// definicao de erro de comentario
// ERR_COMENT: ('{' ~('}')* '\n');


COMENTARIO: '{' ~('\n'|'\r'|'{'|'}')* '}' -> skip;

// definicao de erro de cadeia
// ERR_CADEIA: '"' ~('"')* '\n';


//PALAVRA_RESERVADA:
  TITULO: 'titulo'; 
  VALIDADE: 'validade';
  VALOR:  'valor';
  SKU:  'sku';

//Funções da linguagem
  CREATE_LABEL: 'create_label';
  DELETE: 'delete';


// CARACTERES ESPECIAIS
 A_PARENTESES: '(';
 F_PARENTESES: ')';
 DELIM: ':';

fragment
    ESC_SEQ: '\\"';


//TIPOS DEFINIDOS NA LINGUAGEM
    TYPE: 'string' | 'date' | 'int' | 'currency' | 'label';

    //CONTEUDO ACEITO EM CADA TIPO
    DATE: '0'..'3' '0'..'9' '-' // DIA
            ('0' | '1') '0'..'9' '-'  // MES
            '0'..'9' '0'..'9' '0'..'9' '0'..'9'; // ANO
    INT: ('0'..'9')+;
    CURENCY:'R$' ('0'..'9')+ ',' ('0'..'9')+;
    LABEL:  CHAR CHAR CHAR CHAR CHAR CHAR;
    STRING: '"' (ESC_SEQ | ~('"' | '\n') )* '"';

    
                  

IDENT: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
    
WS: ( ' ' |'\t' | '\r' | '\n') -> skip;

// simbolo nao identificado
// ERR_SIMBOLO: . ; 


// REGRAS SINTÁTICAS
    //SCRIPT
    script:  create_eti create_eti* commands*;

    commands: create_eti | delete ;

    //funções
    create_eti: A_PARENTESES IDENT F_PARENTESES
                TITULO ':' value  ','
                VALIDADE ':' value ',' 
                VALOR ':'value ','
                SKU ':' value; 
    
    delete:  DELETE'.' A_PARENTESES IDENT F_PARENTESES; 


    value:  CURENCY | STRING | DATE | LABEL;
    itemWhere: IDENT ':' value;
  