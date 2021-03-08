package rngSimulacion;

public class RNG1 
{

	public static void main (String arg[])
	{
		int y1=0 , x1 = 5724;
		
		for(int i = 0 ; i < 4 ; i++)
		{
//			System.out.println(x1);
			y1 = x1*x1;
			
			x1=semilla(y1);	
			
		}
	}
	public static int semilla (int y1)
	{	
		String Y1 = String.valueOf(y1);
		
		while(Y1.length()<=8)
		{
			
			Y1 = Y1+ '0';
			
			
		}
		Y1=Y1.substring(2, 6);
		System.out.println(Y1);
		return y1=Integer.parseInt(Y1);
		
	}
}
