
package Concurrencia;
public class Main 
{
    public static void main(String[] args) 
    {
//        Contenedor cont = new Contenedor();
        Hilo hilo = new Hilo();
        Thread ConsumirAceite = new Thread(hilo ,"ConsumirAceite");
        Thread ConsumirAgua = new Thread(hilo ,"ConsumirAgua");
        Thread ProducirAceite = new Thread(hilo ,"ProducirAceite");
        Thread ProducirAgua = new Thread(hilo ,"ProducirAgua");
        ProducirAceite.start();
        ConsumirAceite.start();
        ProducirAgua.start();
        ConsumirAgua.start();
        
        
        
 /*       while(cont.getAgua()>1)
        {
            if()
            {
                System.out.println("No se puede producir");                
            } 
            else 
            {
                ProducirAgua.start();
            }
            ConsumirAgua.start();
        }*/
        
        
    }    
}
