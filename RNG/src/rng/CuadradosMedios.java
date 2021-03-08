
package rng;

import java.util.Scanner;

public class CuadradosMedios {

   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        String X1;
        int x1  , in , y1 = 0;      
        
        x1 = comprobacion(); 
            
        System.out.println("Ingresa el numero de interacciones");
        in = sc.nextInt();
        
	for(int i = 0 ; i<in ; i++)
	{                    
            y1 = x1 * x1 ;
            x1 = numero( y1 ) ; 
             
            if(String.valueOf(x1).length() < 4)
            {
                System.out.println("r" + i + "= 0.0" +x1);
            }else
            {
                System.out.println("r" + i + "= 0." + x1 );
            }
	}
    }
    public static int numero(int y1)
	{
            String Y1;
            Y1=String.valueOf( y1 );
            while(Y1.length() < 8)
            {
                Y1 = Y1 + '0';
            }
            Y1 = Y1.substring( 2 , 6 );
            return Integer.parseInt(Y1);
	}
    public static int comprobacion()
    {
        Scanner sc = new Scanner(System.in);
        boolean Ab = false;
        String x1;
        
        do
        {                    
            System.out.println("Ingresa el valor de X1");
            x1=sc.next();
            
            
            try 
            {
                Integer.parseInt(x1);
                Ab = true ;
            }catch (Exception e) {
                System.out.println("Valor no valido, intenta nuevamente ");            
            }
            if(x1.length() < 4)
            {
                System.out.println("El numero debe ser de almenos 4 digitos, intenta nuevamente");
                Ab = false;
            }
            
        }while(Ab == false);
        
        
        return Integer.parseInt(x1);
    }
    
    
}
