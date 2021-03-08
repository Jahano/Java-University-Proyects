
package Modelo;


public class Querys {
    public Querys(){
        
    }
    
    public String[] ColumnasUsuarios(){
         String Columnas[] = {
                 " identificador",
                 " nombre",
                 " apellidop",
                 " apellidom",
                 " usuario",
                };
        
         
         return Columnas;
     }   
     
     public String QueryInsertUsuarios(){
         return "Insert into usuario ("
                 +" identificador,"
                 +" nombre,"
                 +" apaellidop,"
                 +" apellidom,"
                 +" usuario)"
                 +" (?,?,?,?,?)";
     } 
     
     public String QuerysUpdateUsuario(String id){
         return " Update Uusario set " 
                 +" identificador=?,"
                 +" nombre=?,"
                 +" apaellidop=?,"
                 +" apellidom=?,"
                 +" usuario=?"
                 +" Where Identificador=" + id;
       
     }
     
     public String QuerySelectUsuarios(){
         return "select * from usuarios";
         
     }
     public String QuerySelectUsuarios(String id){
         return "select * from usuarios Where identificador="+id;
     }
    
     
    
}
