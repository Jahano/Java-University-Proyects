
package hilos;

public class Hilo2 extends Thread
{
    Recursos r;
    int i;
    public Hilo2(Recursos recursos, String Name, int i)
    {
        super(Name);
        this.r=recursos;
        this.i = i;
    }
    @Override
    public void run()
    {
        if (i%2==0)
        {
            System.out.println(i);
            r.lock();
        }
        
        
    }
    
}
