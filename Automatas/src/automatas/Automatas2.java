
package automatas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Automatas2 
{
    public static void main(String[] args) 
    {
        /*String curp="SASN911214HDFNNH01";*/
        //String curp="TIVC850209HMCRLR08";
        String curp ="SASN160229HDFNHH01";  
        String ER1 = "^[A-Z]{1}[AEIOU]{1}[A-Z]{2}" ; 
        String ER2 = "[0-9]{2}(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])";
        String ER3 ="[HM]{1}";
        String ER4 = "(AS|BC|BS|CC|CS|CH|CL|CM|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|NE)" ;                     
        String ER5 = "[B-DF-HJ-NP-TV-Z]{3}";
        String ER6 ="[0-9A-Z]{1}";
        String ER7 = "[0-9]{1}$";
        
        Pattern p = Pattern.compile(ER1+ER2+ER3+ER4+ER5+ER6+ER7);
        Matcher m = p.matcher(curp);
        
        if(m.find())
        {            
            System.out.println("Curp valida \n"+curp);            
            int dia,mes,año;
            dia = Integer.parseInt(curp.substring(8, 10));
            mes = Integer.parseInt(curp.substring(6, 8));
            año = Integer.parseInt(curp.substring(4, 6));
            
            if(dia == 29 && mes == 2 && año%4 != 0)
            {
                System.out.println("El año no es valido");
            }
        }
        else
        {
            System.out.println("No coincide");
        }
        
    }
    
}
