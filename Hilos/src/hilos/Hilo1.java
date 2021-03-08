
package hilos;


public class Hilo1 extends Thread 
{
    int i;
    Recursos r;  
    public Hilo1(Recursos recursos, String name, int i)
    {
        super(name);
        this.r=recursos;
        this.i = i;
    }
    @Override
    public void run()
    {
        if(i%2!=0)
            {
                System.out.println(i);
                r.lock();
            }
        
    }   
}
