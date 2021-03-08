
package Vista;

import MDI.Parametros;
import Modelo.Querys;
import java.util.Calendar;

public class JNuevoContrato extends javax.swing.JInternalFrame {

    Parametros parametros;
    public JNuevoContrato(Parametros parametros) {
        initComponents();
        this.parametros = parametros;
        this.parametros.Abiertos[0] = "true";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelCerrar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCliente = new javax.swing.JTextField();
        jTextFieldIDseguro = new javax.swing.JTextField();
        jTextFieldContrato = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldVencimiento = new javax.swing.JTextField();
        jButtonContrato = new javax.swing.JButton();
        jTextFieldInicio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCerrar.setBackground(new java.awt.Color(51, 51, 51));
        jLabelCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Close Window_32px_2.png"))); // NOI18N
        jLabelCerrar.setOpaque(true);
        jLabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Generar Nuevo Contrato");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medico", "Auto", "Vida", "bienes" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Seleccionar Seguro:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cliente:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID Seguro");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Numero de Contrato:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jTextFieldCliente.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldCliente.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jTextFieldCliente.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextFieldCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 250, -1));

        jTextFieldIDseguro.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldIDseguro.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jTextFieldIDseguro.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextFieldIDseguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 250, -1));

        jTextFieldContrato.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldContrato.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jTextFieldContrato.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextFieldContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 250, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fecha de Vencimiento:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jTextFieldVencimiento.setEditable(false);
        jTextFieldVencimiento.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldVencimiento.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jTextFieldVencimiento.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextFieldVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 250, -1));

        jButtonContrato.setBackground(new java.awt.Color(51, 51, 51));
        jButtonContrato.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButtonContrato.setForeground(new java.awt.Color(255, 255, 255));
        jButtonContrato.setText("Generar Contrato");
        jButtonContrato.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContratoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, 30));

        jTextFieldInicio.setEditable(false);
        jTextFieldInicio.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldInicio.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jTextFieldInicio.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextFieldInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 250, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Fecha de Inicio:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Seguro", "Tipo", "Costo", "Vigencia", "Cobertura"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 440, 150));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo-minimalista-negro-minimalist-background-fondo-sitio-web-minimalista-fondo-negro-web.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContratoActionPerformed
        String id_contrato = jTextFieldContrato.getText();        
        String id_seguro = jTextFieldIDseguro.getText();
        String inicio = jTextFieldInicio.getText();
        String fin = jTextFieldVencimiento.getText();
        String cliente = jTextFieldCliente.getText();
        
        Querys querys = new Querys();
        querys.QueryRegistrarContrato(id_contrato,cliente,id_seguro,inicio,fin);
    }//GEN-LAST:event_jButtonContratoActionPerformed

    private void jLabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseClicked
       this.dispose();
       parametros.Abiertos[0]="false";
    }//GEN-LAST:event_jLabelCerrarMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String tipo =(String) jComboBox1.getSelectedItem();
        Querys querys = new Querys();
        jTable1.setModel(querys.QuerySelectSeguro(tipo));
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        Calendar c1 = Calendar.getInstance();
        String año =String.valueOf(c1.get(Calendar.YEAR));
        String mes =String.valueOf(c1.get(Calendar.MONTH));
        String dia =String.valueOf(c1.get(Calendar.DATE));
        if(mes.length()==1){mes = "0"+mes;}
        if(dia.length()==1){dia = "0"+dia;}
        int selecc = jTable1.getSelectedRow();
        String.valueOf(dia);
        if(selecc >=0)
        {
            jTextFieldIDseguro.setText((String)jTable1.getValueAt(selecc, 0));
            String dura = (String)jTable1.getValueAt(selecc, 3);
            char chart=dura.charAt(0);
            dura = String.valueOf(chart);
            int duracion = Integer.parseInt(dura);
            jTextFieldInicio.setText(año+"-"+mes+"-"+dia);
            
            jTextFieldVencimiento.setText(String.valueOf(c1.get(Calendar.YEAR)+duracion)+"-"+mes+"-"+dia);
        }                               
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonContrato;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldContrato;
    private javax.swing.JTextField jTextFieldIDseguro;
    private javax.swing.JTextField jTextFieldInicio;
    private javax.swing.JTextField jTextFieldVencimiento;
    // End of variables declaration//GEN-END:variables
}
