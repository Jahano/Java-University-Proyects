
package mario;


import java.awt.BorderLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Jahir
 */

public class Automatas 
{

    public static void main(String[] args){
      int año, mes,dia;
       String txt="TIVC000229HMCRLR08";

    String ER1="(^[A-Z]{4})";	
    String ER2="([0-9]{6})";    
    String ER3="([A-Z]{6})";
    String ER4="([0-9]{2})";

    Pattern p = Pattern.compile(ER1+ER2+ER3+ER4);
    Matcher m = p.matcher(txt);
    if (m.find()){
        año=Integer.parseInt(txt.substring(4,6));
        mes=Integer.parseInt(txt.substring(6,8));
        dia=Integer.parseInt(txt.substring(8,10));
        if(mes == 2 && dia == 29 && año % 4 != 0){
            System.out.println("Curp NO VALIDA");
        }
        else if(dia>31 || mes>12){
            System.out.println("CURP no valida");
        }   
        else if (dia<=31 && mes <=12){
            System.out.println("CURP Valida");
        }
    }
    else
    {
    System.out.println("LA CURP NO ES VALIDA INTENTE DE NUEVO");
    }
    
  } 
    
}
