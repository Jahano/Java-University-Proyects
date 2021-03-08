
package Mario;

public class ProductoMedioM {
    public static void main(String[] args) {
        float x,x1,d,y,x2;
        x=5015; x1=5734; 
      
        for (int i=0;i<5;i++){
            
            d=x*x1;            
                             
                   
         String a;
         a=String.valueOf(d);
         a=a.substring(3, 7);
            System.out.println(a);
            
         x1= Integer.parseInt(a);
        }
      
        
    }
    
    
    
    
    
    
}
