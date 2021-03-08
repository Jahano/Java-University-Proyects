
package hilosd;

import java.util.Scanner;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HilosD {
    
    public static void main(String[] args) {
        int x=0;
        int rdm;
        rdm =(int)(Math.random()*100+0);               
        
        Scanner leer = new Scanner (System.in);
        
        Thread hi = new Thread(new HiloIntegrantes());
        
        Thread hr = new Thread(new HilosRdm(rdm));
        
        hi.start();
        try {
            hi.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(HilosD.class.getName()).log(Level.SEVERE, null, ex);
        }
         System.out.println("Ingresa el valor de x");
        x=leer.nextInt();
        Thread hf = new Thread(new HiloFuncion(x));
        hf.start();
      
        try {
            hf.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(HilosD.class.getName()).log(Level.SEVERE, null, ex);
        }
        hr.start();
        try {
            hr.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(HilosD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    
    }
    
}
