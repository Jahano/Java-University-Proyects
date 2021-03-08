
package analizador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Vista extends javax.swing.JFrame {

    public Vista() {
        initComponents();
    }
    LinkedList<Tokens> Tokenslist;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ble1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setText("Analizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");

        jLabel1.setText("Sentencia");

        jLabel2.setText("Resultado");

        ble1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "ID", "Reservada", "Operador"
            }
        ));
        ble1.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(ble1);
        ble1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            probarLexerFile();
            
        } catch (IOException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
        tablaResultado ();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public void probarLexerFile() throws IOException{
         
        int contIDs=0;
        
        Tokenslist = new LinkedList<Tokens>();
        
        File fichero = new File ("fichero.txt");
        PrintWriter writer;
        try {
            writer = new PrintWriter(fichero);
            writer.print(jTextField1.getText());
            writer.close();
            } 
        catch(Exception e){
            
                }// fin del catch
        
        Reader reader = new BufferedReader(new FileReader("fichero.txt"));
        Lexer lexer = new Lexer (reader);
        String resultado = "";
        while (true) {
            Tokens tokemitem = new Tokens();    
            Token token = lexer.yylex();
            if (token == null){
                for(int i=0;i<Tokenslist.size();i++){
                    System.out.println(Tokenslist.get(i).nombre + "=" + Tokenslist.get(i).ID);
                }                
                jTextField2.setText(resultado);
                return;
                }
            switch (token){
                case RESERVADA:{
                    contIDs++;
                    tokemitem.nombre = lexer.lexeme;
                    tokemitem.ID = contIDs;
                    tokemitem.tipo = "Reservada";                    
                    resultado=resultado+"<Reservada"+ contIDs+ ">";
                    break;
                    }
                case OPERADORES:{
                    contIDs++;                    
                    tokemitem.nombre = lexer.lexeme;
                    tokemitem.ID = contIDs;
                    tokemitem.tipo = "Operador";                    
                    resultado = resultado + "<Operador>" + contIDs + ">";
                    break;
                }
                
                case ERROR:{
		resultado=resultado+"Error,simbolo no reconocido";
		break;
                }
		case ID: {
		contIDs++;
		tokemitem.nombre=lexer.lexeme;
		tokemitem.ID=contIDs;
                tokemitem.tipo = "ID";
		
		resultado=resultado+"<ID"+ contIDs+ ">";
		break;
		}
		case INT:
		resultado=resultado+"<"+ lexer.lexeme+">";
		break;
		default:
		resultado=resultado+"<"+ lexer.lexeme +">";
                break;
		}
            Tokenslist.add(tokemitem);
        }
       
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ble1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private void tablaResultado(){
        
	Object[][] matriz = new Object [Tokenslist.size()][4];
	for(int i =0; i<Tokenslist.size();i++)
        {
            if(Tokenslist.get(i).tipo == "Reservada")
            {
                matriz[i][2] = Tokenslist.get(i).nombre;
                matriz [i][0]= Tokenslist.get(i).ID;
            }
            else if(Tokenslist.get(i).tipo == "Operador")
            {
                matriz[i][3] = Tokenslist.get(i).nombre;
                matriz [i][0]= Tokenslist.get(i).ID;
            }
            else if(Tokenslist.get(i).tipo == "ID")
            {
                matriz[i][1] = Tokenslist.get(i).nombre;
                matriz [i][0]= Tokenslist.get(i).ID;
            }
//            matriz [i][0]= Tokenslist.get(i).nombre;
//            matriz [i][1]= Tokenslist.get(i).ID;	
        }
        ble1.setModel(new javax.swing.table.DefaultTableModel(matriz,new String[]{
		"Numero","ID","Reservada","Operador"}));
    }
}