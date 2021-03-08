
package rng;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AditivoCongruencial 
{

   
    public static void main(String[] args) 
    {
        DecimalFormat decimal = new DecimalFormat("0.0000");
        float lenght[];
        int x=5,y=7,modulo=100;
        
/*      Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de numeros en la serie");
        x=leer.nextInt();
        System.out.println("¿Cuantos numeros aleatorios se van a calcualr?");
        y=leer.nextInt();*/
        lenght = new float[x+y];
        lenght[0]=65;lenght[1]=89;lenght[2]=98;lenght[3]=03;lenght[4]=69;

/*        for(int i=0; i<x ; i++)
        {
            System.out.println("Ingresa el numero:" + (i+1));
            lenght[i]=leer.nextInt();
        }
        System.out.println("Ingresa el modulo");
        modulo=leer.nextInt();*/
        
        for(int i=0 ; i<(x+y) ; i++)
        {
            float r;
            try 
            {
                lenght[x+i]=(lenght[i]+lenght[i+x-1])%modulo;
//                System.out.println(lenght[x+i]);
                r=(lenght[x+i]/(modulo-1));
                System.out.println("X"+(i+x+1)+"= "+decimal.format(r));
            } catch (Exception e) {
            }            
        }
        
    }
    
}
