
package analizadorlexico;

import java.io.File;

public class main {
    public static void main(String[] args) 
    {        
        String path = "D:\\backup\\Jahir\\Documentos\\NetBeansProjects\\AnalizadorLexico\\src\\analizadorlexico\\Jflex.flex";
       // generateLexer(path);
        new Vista1().setVisible(true);
        
    }
    public static void generateLexer(String path)
    {
        File file = new File(path);
        JFlex.Main.generate(file);
    }
    
}
