
package analizadorlexico;
import static analizadorlexico.Token.*;
%%
%class Lexer
%type Token
L= [a-zA-Z_]
D= [0-9]
WHITE=[ \t\r\n]
%{
public String lexeme;
%}
%%
{WHITE} {/*Ignore*/}
"=" {return OPERADORES;}
"+" {return OPERADORES;}
"*" {return OPERADORES;}
"-" {return OPERADORES;}
"public" {return RESERVADA;}
"static" {return RESERVADA;}
"void" {return RESERVADA;}
"main" {return RESERVADA;}
"/" {return DIV;}
{L}({L}|{D})* {lexeme=yytext(); return ID;}
 ("(-"{D}+")")|{D}+ {lexeme=yytext(); return INT;}
. {return ERROR;}
