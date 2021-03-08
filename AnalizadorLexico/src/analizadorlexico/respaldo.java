/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorlexico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.LinkedList;

/**
 *
 * @author Jahir
 */
public class respaldo {
    
     
     /*public void probarLexerFile() throws IOException{
        jTextPane1.setText(jTextArea1.getText());
        int contIDs=0;   
        int contRes=0;
        int contOpe=0;
        Tokenslist = new LinkedList<Tokens>();        
        File fichero = new File ("fichero.txt");
        PrintWriter writer;
        try {
            writer = new PrintWriter(fichero);
            writer.print(jTextArea1.getText());
            writer.close();
            } 
        catch(Exception e){
                System.out.println(e);
                }
        
        Reader reader = new BufferedReader(new FileReader("fichero.txt"));
        Lexer lexer = new Lexer (reader);        
        String resultado = "";
        while (true) {
            Tokens tokemitem = new Tokens();    
            Token token = lexer.yylex();            
            if (token == null){
                for(int i=0;i<Tokenslist.size();i++){
                    System.out.println(Tokenslist.get(i).nombre + "=" + Tokenslist.get(i).ID);
                }
                System.out.println(resultado);
                //jTextField2.setText(resultado);
                return;
                }
            switch (token){
                case RESERVADA:{
                    contRes++;
                   
                    tokemitem.nombre = lexer.lexeme;
                    tokemitem.ID = contRes;
                    tokemitem.tipo = "Reservada";                    
                    resultado=resultado+"<Reservada"+ contRes+ ">";
                    jTextField3.setText(String.valueOf(contRes));
                    break;
                    }
                case OPERADORES:{
                    contOpe++;                    
                    tokemitem.nombre = lexer.lexeme;
                    tokemitem.ID = contOpe;
                    tokemitem.tipo = "Operador";                    
                    resultado = resultado + "<Operador>" + contOpe + ">";
                    jTextField2.setText(String.valueOf(contOpe));
                    break;
                }
                
                case ERROR:{
                    resultado=resultado+"Error,simbolo no reconocido";
                    break;
                }
		case ID: {
                    contIDs++;
                    tokemitem.nombre=lexer.lexeme;
                    tokemitem.ID=contIDs;
                    tokemitem.tipo = "ID";		
                    resultado=resultado+"<ID"+ contIDs+ ">";
                    jTextField1.setText(String.valueOf(contIDs));
                    break;
		}
		case INT:
                    resultado=resultado+"<"+ lexer.lexeme+">";
                    break;
		default:
                    resultado=resultado+"<"+ lexer.lexeme +">";
                    break;
		}
            Tokenslist.add(tokemitem);
        }
       
    }*/
}
