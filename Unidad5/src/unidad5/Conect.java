
package unidad5;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public final class Conect {

     Connection con;
     String driver = "com.mysql.jdbc.Driver";
     
     String usuario = "root";
     String password = "14121991";
     //String url="jdbc:mysql://localhost/seguros";
     String url ="jdbc:mysql://localhost:3306/seguros";
     String puerto = "3306";
    
     public Conect()
    {      
        
        con = null;
        try {
            Class.forName(driver);
            con =(Connection) DriverManager.getConnection(url,usuario,password);
            System.out.println("Conexion correcta");            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public java.sql.Connection getCon()
    {
        return con;
    }
    public static void main(String[] args) {
        Conect conect = new Conect();
        if (conect.getCon()== null)
        {
            System.out.println("COnexion fallia");
        }
    }

}
