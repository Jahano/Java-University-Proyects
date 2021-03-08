
package analizadorlexico;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import javax.swing.JFileChooser;

public class Lector {
    public PrintWriter guardar;
    public JFileChooser seleccionar;
    public String texto = "";      
    public String texto2="";
    public String ruta;
  //  public File fila;
    public void presentar()
            
    {
                
        seleccionar = new JFileChooser();
        seleccionar.showOpenDialog(seleccionar);
        
        try {
            
            ruta=seleccionar.getSelectedFile().getAbsolutePath();
            FileInputStream archivo = new FileInputStream(ruta);
            
            DataInputStream entrada = new DataInputStream(archivo);
            
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
                        
    //        fila = seleccionar.getSelectedFile();
            while(texto2 != null)
            {               
                texto2 = buffer.readLine();
                if (texto2 != null)
                {
                    texto = texto+texto2+"\n";                    
                }
                
            }
        } catch (Exception e) {
        }        
//        System.out.println(texto);
    }
    public void GuardarComo(String archivo)
    {
        String path;
        JFileChooser selec = new JFileChooser();
        selec.showOpenDialog(selec);
        path=selec.getSelectedFile().getAbsolutePath();
        try {
            System.out.println("Guardando en: " + selec.getSelectedFile().getAbsolutePath());
            guardar = new PrintWriter(selec.getSelectedFile(),"utf-8");            
            guardar.println(archivo);
            guardar.close();
        } catch (Exception e) {
        }
                
    }    
    public void Guardar(String archivo)
    {
        System.out.println(archivo);
        try {
            System.out.println("Guardando en: " + seleccionar.getSelectedFile().getAbsolutePath());
            guardar = new PrintWriter(seleccionar.getSelectedFile(),"utf-8");            
            guardar.println(archivo);
            guardar.close();
        } catch (Exception e) {
        }        
    }
    
}
