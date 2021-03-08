
package Concurrencia;

public class Contenedor 
{
    
    private int Agua=0 , Aceite=0;
    private int Capacidad;    
    public void ProducirAgua()
    {        
        int x =(int)(Math.random()*(10-1)+1);
        System.out.println("Produciendo Agua: " + x);
        setAgua(x+getAgua());
        Capacidad = getAceite()+getAgua();
        System.out.println("1-Agua Total: " + getAgua()+ " Capcidad ocupada: " + Capacidad);
//        System.out.println("\n");
    }
    public void ConsumirAgua()
    {
        int x =(int)(Math.random()*(getAgua()-1)+1);
        System.out.println("Consumiendo Agua: " + x);
        setAgua(getAgua()-x);
        Capacidad = getAceite()+getAgua();
        System.out.println("2-Agua total: " + getAgua()+ " Capcidad ocupada: " + Capacidad);
 //       System.out.println("\n");        
    }
    public void ProducirAceite()
    {
        int x =(int)(Math.random()*(10-1)+1);
        System.out.println("Produciendo Aceite: " + x);
        setAceite(x+getAceite());
        Capacidad = getAceite()+getAgua();
        System.out.println("3-Aceite Total: " + getAceite()+ " Capcidad ocupada: " + Capacidad);
 //       System.out.println("\n");
    }
    public void ConsumirAceite()
    {
        int x =(int)(Math.random()*(getAceite()-1)+1);
        System.out.println("Consumiendo Aceite: " + x);
        setAceite(getAceite()-x);
        Capacidad = getAceite()+getAgua();
        System.out.println("4-Aceite total: " + getAceite());
//        System.out.println("\n");
    }
    public boolean GestorHilos(String nombre)
    {
        boolean no = false;
        int N= getAgua()+getAceite();
        if(nombre.equals("ProducirAgua"))
        {
            if( N>=100)
            {
                System.out.println("Capacidad LLena no se puede producir Agua");
                
            }
            else if(getAgua()==0)
            {
                System.out.println("Terminando Producir Agua");
                no = true;
            }
            else
            {                
                ProducirAgua();
                
            }            
        }
        else if(nombre.equals("ConsumirAgua"))
        {
            if (getAgua()==0)
            {
                System.out.println("Terminado Consumir Agua");
                no = true;                
            }
            else
            {
                ConsumirAgua();
                
            }
            
        }
        else if(nombre.equals("ProducirAceite" ))
        {
            if( N>=100)
            {
                System.out.println("Capacidad LLena no se puede producir Aceite");                
            }
            else if(getAceite()==0)
            {
                System.out.println("Terminando Producion de Aceite");
                no=true;
            }
            else
            {
                ProducirAceite();
                
            }
        }
        else if(nombre.equals("ConsumirAceite"))
        {
            if (getAgua()!=0 ) 
            {
                System.out.println("No se puede consumir Aceite");                
            }
            else if(getAceite()==0)
            {
                System.out.println("Terminando consumir Aceite");
                no=true;
            }
            else
            {
                ConsumirAceite();                
            }
            
            
        }
        return no;
    }

    /**
     * @return the Agua
     */
    public int getAgua() {
        return Agua;
    }

    /**
     * @param Agua the Agua to set
     */
    public void setAgua(int Agua) {
        this.Agua = Agua;
    }

    /**
     * @return the Aceite
     */
    public int getAceite() {
        return Aceite;
    }

    /**
     * @param Aceite the Aceite to set
     */
    public void setAceite(int Aceite) {
        this.Aceite = Aceite;
    }
}
