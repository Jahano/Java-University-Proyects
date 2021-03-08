
package hilosd;


public class HiloFuncion implements Runnable{
    int x=0;
    int res;
    
    public HiloFuncion(int x)
    {
        this.x=x;
    }
    @Override
    public void run() {
        System.out.println("Hilo 2________________________________________________________________________________________");
        res=x*x*x*3+x*x*2-2;
        System.out.println("EL resultado de la funcion es : \n "+ res);
        System.out.println("Hilo 2 fin_____________________________________________________________________________________");
        
    }
    
}
