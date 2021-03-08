
package Concurrencia;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo implements Runnable
{
    Contenedor cont = new Contenedor();
    @Override
    public void run() 
    {
        Dormir();
        Inicio(Thread.currentThread().getName());
        LLamarHilo(Thread.currentThread().getName());
    }

    public void LLamarHilo(String name) 
    {
        boolean noti = false;
        while(noti==false)
        {            
            Dormir();
            noti = cont.GestorHilos(name);                      
        }
    }
    private synchronized void Dormir()
    {
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Inicio(String nombre)
    {
        if(nombre.equals("ProducirAgua"))
        {
            cont.ProducirAgua();
            
        }
        else if(nombre.equals("ProducirAceite"))
        {            
            cont.ProducirAceite();
            
        }
        else if(nombre.equals("ConsumirAgua") && cont.getAgua()==0)
        {
            System.out.println("Aun no se produce agua");
            
        }
        else if(nombre.equals("ConsumirAceite") && cont.getAceite()==0)
        {
            System.out.println("Aun no se produce Aceite");
                        
        }
    }
}
