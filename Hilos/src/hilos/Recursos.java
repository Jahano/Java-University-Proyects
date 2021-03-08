
package hilos;

public class Recursos {
    public synchronized void lock()
    {
       
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       
    }
        
}
