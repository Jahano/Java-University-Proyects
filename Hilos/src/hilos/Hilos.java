
package hilos;

import javax.annotation.Resource;


public class Hilos {

    public static void main(String[] args) {
        Recursos recursos = new Recursos();
       
        
        for (int i = 1 ; i<=10 ; i++)
        {
            if (i%2!=0)
            {
                 Hilo1 h1 = new Hilo1(recursos, "uno",i);
                h1.start();
            }
            else
            {
                Hilo2 h2 = new Hilo2(recursos,"dos",i);
                h2.start();
            }
            
        }
        
    }
    
}
