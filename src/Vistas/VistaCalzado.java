package Vistas;

import Controlador.CtrlBD;
import Controlador.CtrlCalzados;
import Modelo.ModeloCalzado;

public class VistaCalzado extends javax.swing.JFrame {

    public VistaCalzado() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCalzados = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnEditarCalzado = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtBuscarCalzado = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        comboEditarCategoria = new javax.swing.JComboBox<>();
        comboEditarMarca = new javax.swing.JComboBox<>();
        comboEditarModelo = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        btnEditarPrecio = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        btnAgregarMarca = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        comboModelo = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnAgregarCalzado = new javax.swing.JButton();
        comboMarca = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaCalzados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaCalzados.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        tablaCalzados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaCalzados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 570, 370));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(btnEditarCalzado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, 50, 30));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Marca");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, 30));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        jLabel9.setText("ID Calzado");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 48));
        jPanel6.add(txtBuscarCalzado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 60, 30));
        jPanel6.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 50, 30));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 50));

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Precio");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, -1, 30));

        jLabel15.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Categoria");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, 30));

        comboEditarCategoria.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        comboEditarCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar..." }));
        comboEditarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEditarCategoriaActionPerformed(evt);
            }
        });
        jPanel2.add(comboEditarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 110, 30));

        comboEditarMarca.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        comboEditarMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar..." }));
        comboEditarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEditarMarcaActionPerformed(evt);
            }
        });
        jPanel2.add(comboEditarMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 100, 30));

        comboEditarModelo.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        comboEditarModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar..." }));
        comboEditarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEditarModeloActionPerformed(evt);
            }
        });
        jPanel2.add(comboEditarModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 110, 30));

        jLabel16.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Modelo");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, 30));
        jPanel2.add(btnEditarPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 80, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 1080, 70));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        jLabel6.setText("Marca");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel3.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 209, 32));

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        jLabel7.setText("Modelo");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        jPanel3.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 209, 32));

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        jLabel8.setText("Categoria");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        jPanel3.add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 209, 32));

        btnAgregarMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_add_40px.png"))); // NOI18N
        btnAgregarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMarcaActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregarMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 50, 40));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        jLabel2.setText("Agregar Marca");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 130, -1));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 490, 160));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        jLabel13.setText("Marca");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar..." }));
        jPanel5.add(comboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 210, 30));

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        jLabel12.setText("Modelo");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 30));

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei", 0, 22)); // NOI18N
        jLabel11.setText("Categoria");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 30));

        comboModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar..." }));
        jPanel5.add(comboModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 210, 30));

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        jLabel14.setText("Precio");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 30));

        txtPrecio.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        txtPrecio.setBorder(null);
        jPanel5.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 210, 20));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 210, 10));

        btnAgregarCalzado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_add_40px.png"))); // NOI18N
        jPanel5.add(btnAgregarCalzado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 50, 40));

        comboMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar..." }));
        comboMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMarcaActionPerformed(evt);
            }
        });
        jPanel5.add(comboMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 210, 30));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 490, 170));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 510, 370));

        jPanel7.setBackground(new java.awt.Color(105, 240, 174));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        jLabel1.setText("Calzados");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 38));

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_undo_40px_1.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel7.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 140, 40));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboEditarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEditarCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEditarCategoriaActionPerformed

    private void btnAgregarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarMarcaActionPerformed

    private void comboMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMarcaActionPerformed

    private void comboEditarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEditarMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEditarMarcaActionPerformed

    private void comboEditarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEditarModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEditarModeloActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaCalzado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCalzado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCalzado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCalzado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModeloCalzado modeloCalzado = new ModeloCalzado();
                VistaCalzado vistaCalzado = new VistaCalzado();
                CtrlBD ctrlBD = new CtrlBD();
                CtrlCalzados ctrlCalzados = new CtrlCalzados (modeloCalzado, vistaCalzado,  ctrlBD);
                vistaCalzado.setVisible(true);
                ctrlCalzados.IniciarVistaCalzados();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregarCalzado;
    public javax.swing.JButton btnAgregarMarca;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnEditarCalzado;
    private javax.swing.JTextField btnEditarPrecio;
    public javax.swing.JButton btnVolver;
    public javax.swing.JComboBox<String> comboCategoria;
    public javax.swing.JComboBox<String> comboEditarCategoria;
    public javax.swing.JComboBox<String> comboEditarMarca;
    public javax.swing.JComboBox<String> comboEditarModelo;
    public javax.swing.JComboBox<String> comboMarca;
    public javax.swing.JComboBox<String> comboModelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTable tablaCalzados;
    public javax.swing.JTextField txtBuscarCalzado;
    public javax.swing.JTextField txtCategoria;
    public javax.swing.JTextField txtMarca;
    public javax.swing.JTextField txtModelo;
    public javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
