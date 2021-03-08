
package MDI;
import Vista.*;
public class Principal extends javax.swing.JFrame {
    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jButtonRegistro = new javax.swing.JButton();
        jButtonContrato = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jLabelCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo-minimalista-negro-minimalist-background-fondo-sitio-web-minimalista-fondo-negro-web.jpg"))); // NOI18N
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(0, 0, 860, 490);

        jPanel2.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 860, 490));

        jButtonRegistro.setBackground(new java.awt.Color(0, 0, 0));
        jButtonRegistro.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButtonRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistro.setText("Registrar Usuario");
        jButtonRegistro.setFocusable(false);
        jButtonRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRegistro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 160, 30));

        jButtonContrato.setBackground(new java.awt.Color(0, 0, 0));
        jButtonContrato.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButtonContrato.setForeground(new java.awt.Color(255, 255, 255));
        jButtonContrato.setText("Generar Contrato");
        jButtonContrato.setFocusable(false);
        jButtonContrato.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonContrato.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContratoActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, 30));

        jButtonActualizar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonActualizar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButtonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonActualizar.setText("Actualizar Usuario");
        jButtonActualizar.setFocusable(false);
        jButtonActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, 30));

        jLabelCerrar.setBackground(new java.awt.Color(51, 51, 51));
        jLabelCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Close Window_32px_2.png"))); // NOI18N
        jLabelCerrar.setOpaque(true);
        jLabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseClicked(evt);
            }
        });
        jPanel2.add(jLabelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroActionPerformed
        Parametros parametros = new Parametros();
        if(parametros.Abiertos[0].equals("false")){
            JRegistroCliente  cliente = new JRegistroCliente(parametros); 
            this.jDesktopPane1.add(cliente);
            cliente.setVisible(true);
       }
    }//GEN-LAST:event_jButtonRegistroActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        Parametros parametros = new Parametros();
        if(parametros.Abiertos[0].equals("false"))
        {
            JActualizarCliente cliente = new JActualizarCliente(parametros);
            this.jDesktopPane1.add(cliente);
            cliente.setVisible(true);
        }
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContratoActionPerformed
       Parametros parametros = new Parametros();
        if(parametros.Abiertos[0].equals("false"))
        {
            JNuevoContrato  contrato = new JNuevoContrato(parametros);
            this.jDesktopPane1.add(contrato);
            contrato.setVisible(true);
        }
    }//GEN-LAST:event_jButtonContratoActionPerformed

    private void jLabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabelCerrarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonContrato;
    private javax.swing.JButton jButtonRegistro;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
