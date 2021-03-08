
package Modelo;

import Vista.JRegistroCliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Querys {
    Coneccion con = new Coneccion();
    Connection reg = con.getCon();
    private String nombres;
    private String apellidos;
    private String id_cliente;
    
    public Querys(String id_cliente, String nombres, String apellidos){
        this.id_cliente = id_cliente;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    public Querys(){}
    
    public String[] ColumnasUsuarios(){
         String Columnas[] = {
                 "id_cliente",
                 " nombres",
                 " apellidos"                 
                };
         return Columnas;
     }   
     
     public void QueryInsertCliente(){
         
        try {           
            PreparedStatement pps = reg.prepareStatement("INSERT INTO seguros.cliente(id_cliente,nombres,apellidos) VALUES (?,?,?)");
            pps.setString(1,id_cliente);
            pps.setString(2,nombres);
            pps.setString(3,apellidos);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos guardados");
            
        } catch (SQLException ex) {
            System.out.println(ex);            
        }
         
     } 
     
     public void QuerysUpdateCliente(){
         
        String actuSQL = "UPDATE cliente SET id_cliente='"+id_cliente+"'"
                    + ",nombres='"+nombres+"'"
                    + ",apellidos='"+apellidos+"'"                    
                    + "WHERE id_cliente='"+id_cliente+"'";
        try {
            
            PreparedStatement pps = reg.prepareStatement(actuSQL);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Actualizados");
            
        } catch (SQLException ex) {
            
        }
     }
     
     public DefaultTableModel QuerySelectUsuarios(String criterio){
        DefaultTableModel model;
        String[] titulos = { "ID_Cliente","Nombres", "Apellidos"};
        String[] registros = new String[50];
        String sql = "SELECT * FROM seguros.cliente WHERE id_cliente LIKE '%"+criterio+"%'"
        +"OR nombres LIKE '%"+ criterio + "%'"
        +"OR apellidos LIKE '%" + criterio + "%'";
        
        model = new DefaultTableModel(null , titulos);
        try {
            Statement st;
            st = (Statement) reg.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                registros[0]=String.valueOf(rs.getString("id_cliente"));
                registros[1]=rs.getString("nombres");
                registros[2]=rs.getString("apellidos");
                model.addRow(registros);
            }
          
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return model; 
     }
     public DefaultTableModel QuerySelectSeguro(String tipo)
     {
        DefaultTableModel model;
        String[] titulos = { "IDSeguro","Tipo", "Costo","Vigencia","Cobertura"};
        String[] registros = new String[50];
        String sql = "SELECT * FROM seguros.seguros WHERE tipo LIKE '%"+tipo+"%'";        
        model = new DefaultTableModel(null , titulos);
        try {
            Statement st;
            st = (Statement) reg.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                registros[0]=String.valueOf(rs.getString("id_seguro"));
                registros[1]=rs.getString("tipo");
                registros[2]=rs.getString("costo");
                registros[3]=rs.getString("vigencia");
                registros[4]=rs.getString("cobertura");
                model.addRow(registros);
            }
          
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return model; 
     }
     public void QueryRegistrarContrato(String id_contrato,String seguro,String cliente,String inicio,String fin)
     {
         java.sql.Date in=java.sql.Date.valueOf(inicio);
         java.sql.Date fi=java.sql.Date.valueOf(fin);
         
        try {            
            PreparedStatement pps = reg.prepareStatement("INSERT INTO seguros.contrato(id_contrato,fk_cliente,fk_seguro,inicio,fin) VALUES (?,?,?,?,?)");
            pps.setString(1,id_contrato);
            pps.setString(2,seguro);
            pps.setString(3,cliente);
            pps.setDate(4,in);
            pps.setDate(5, fi);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos guardados");
            
        } catch (SQLException ex) {
            System.out.println(ex);            
        }
         
     }
}
