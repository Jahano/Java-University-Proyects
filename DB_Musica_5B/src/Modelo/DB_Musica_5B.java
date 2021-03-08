
package Modelo;

import Controlador.Connect;
import java.sql.Connection;

public class DB_Musica_5B {

/*    public static void main(String[] args) {
        
        Connection cont;
        Connect connect = new Connect();
        cont = connect.getConecction();
        
        if(connect.getConecction() == null)
        {
            System.out.println("Conexion Fallida");
        }
        else
        {
            System.out.println("Conexion establecida");
        }
    }    
*/
    
    public String LlamarConexion()
    {
        Connect connect = new Connect();
        if(connect.getConecction() == null)
        {
            return ("Conexion Fallida");
        }
        else
        {
            return("Conexion establecida");
        }
    }
}
