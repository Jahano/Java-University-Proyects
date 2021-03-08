
package analizador;
import java.io.File;

public class Main {

    public static void main(String[] args) 
    {        
        String path="D:\\backup\\Jahir\\Documentos\\NetBeansProjects\\Analizador\\src\\analizador\\Jflex.flex";
//        String path = "C:\\Users\\Jahir\\Documents\\NetBeansProjects\\Analizador\\src\\analizador\\Jflex.flex";
        //generateLexer(path);
        new Vista().setVisible(true);
        
    }
    public static void generateLexer(String path)
    {
        File file = new File(path);
        JFlex.Main.generate(file);
    }
    
}
