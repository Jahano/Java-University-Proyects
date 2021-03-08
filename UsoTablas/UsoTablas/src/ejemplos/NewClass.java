
package ejemplos;

public class NewClass {
    public static void main(String[] args) {
        int numbers[] = new int[3];
        numbers[0] = 1;
        numbers[1] = 1;
        numbers[2] = 1;
        
        int sum = 2;
        System.out.println( findClosestPair(numbers,sum));
    }

    public static int findClosestPair(int[] numbers, int sum) {
        int x=0;
        for(int i = 0 ; i < numbers.length; i++)
        {
            
            for(int j = i ; j < numbers.length ; j++)
            {
                
               if(numbers[i]+numbers[j] == sum && i!=j)
               {
                   x=x+1;
               } 
            }        
        }
        if (x==0)
        {
            x=-1;
        }
        
        return x;
    }
    
}
