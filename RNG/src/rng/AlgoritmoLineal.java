
package rng;

public class AlgoritmoLineal 
{
    public static void main(String[] args) 
    {
	float a,x,c,M;
	a = 19 ; x = 37 ; c = 33 ; M = 100 ;
		
	for(int i = 0 ; i < 4 ; i++)
	{
            x = (x*a+c)%100;
            x= x/(M-1);
            x = Integer.parseInt(toString(x));			
            System.out.println(x/10000);			
            x = Integer.parseInt(String.valueOf(x).substring(2, 4));
	}
    }
    public static String toString(float x)
    {
	String X;
	X= String.valueOf(x);
	X=X.substring(2 , 6);
//	System.out.println(X);
	return X;
    }        
}
