
package hilosd;

public class HilosRdm implements Runnable{

    int z;
    
    public HilosRdm(int z)
    {
        this.z=z;
    }
    
    @Override
    public void run() 
    {
        System.out.println("Hilo 3________________________________________________________________________________________");
        System.out.println("El numero Random es:\n"+z);
        System.out.println("El resultado de la funcion calculada con el nunero Random (z) es:\n"+ (3*z*z+3));
        System.out.println("Hilo 3 Fin_____________________________________________________________________________________");
    }
    
}
