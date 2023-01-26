
package Vistas;

import Controlador.CtrlBD;
import Controlador.CtrlMateriales;
import Modelo.ModeloMateriales;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class VistaMaterialesCalzados extends javax.swing.JFrame {

    ArrayList name = new ArrayList();
    
    public VistaMaterialesCalzados() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMateriales = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ComboMaterial = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtAgregarMaterial = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btnSumar = new javax.swing.JButton();
        labelCantidad = new javax.swing.JLabel();
        labelMaterial = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaMateriales.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        tablaMateriales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMateriales);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 400, 180));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 160, 10));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        jLabel2.setText("Material");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 30));

        txtCantidad.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        txtCantidad.setBorder(null);
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        jPanel2.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 160, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        jLabel3.setText("Cantidad");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 116, -1));

        ComboMaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "suelas de caucho", "suelas de goma", "suelas de esparto", "cuero", "tejido", "cuero", "sintético", "goma", "espuma", "plástico", "caucho", "cuero regenerado", "fieltro", "madera", "corcho", "lona fuerte", "cuerda de yute", "cáñamo", "Zueco", "Nailon", "poliéster", "Gore-Tex", "cuero sintético", "poliuretano sintético", "lona", "Poliuretano", "Eva", "TPU", "Porolivianas" }));
        jPanel2.add(ComboMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 160, 33));

        btnAgregar.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_add_40px.png"))); // NOI18N
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 60, 47));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 350, 130));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        jLabel4.setText("Agregar Material");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtAgregarMaterial.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        txtAgregarMaterial.setBorder(null);
        jPanel3.add(txtAgregarMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 65, 192, 30));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 101, 192, 10));

        jButton1.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 17, 120, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 350, 130));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        jLabel6.setText("Buscar material");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtBuscar.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        txtBuscar.setBorder(null);
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });
        jPanel4.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, 30));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 170, 10));

        btnBuscar.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_search_40px.png"))); // NOI18N
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel4.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 51, 50));

        btnEditar.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_edit_property_40px.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel4.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, 47));

        btnRestar.setText("-");
        jPanel4.add(btnRestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 50, 40));

        btnSumar.setText("+");
        jPanel4.add(btnSumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 50, 40));

        labelCantidad.setText("cantidad");
        jPanel4.add(labelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 60, 20));

        labelMaterial.setText("material");
        jPanel4.add(labelMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 60, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 400, 120));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_available_updates_40px.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 180, 50));

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_delete_40px.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 160, 50));

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_undo_40px_1.png"))); // NOI18N
        btnVolver.setText("Volver");
        jPanel5.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 130, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 1130, 70));

        jPanel6.setBackground(new java.awt.Color(105, 240, 174));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        jLabel5.setText("Registrar materiales");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(388, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(323, 323, 323))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        switch (evt.getKeyCode()){
            case KeyEvent.VK_BACK_SPACE:
                break;
            case KeyEvent.VK_ENTER:
                txtBuscar.setText(txtBuscar.getText());
                break;       
            
            default:
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        String txt = txtBuscar.getText();
                        autoCompletar(txt);
                    }
                });
        }
           
    }//GEN-LAST:event_txtBuscarKeyPressed

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
            java.util.logging.Logger.getLogger(VistaMaterialesCalzados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMaterialesCalzados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMaterialesCalzados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMaterialesCalzados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModeloMateriales modeloMateriales = new ModeloMateriales();
                VistaMaterialesCalzados vistaMaterialesCalzados = new VistaMaterialesCalzados();
                CtrlBD ctrlBD = new CtrlBD();
                CtrlMateriales ctrlMateriales = new CtrlMateriales (modeloMateriales, vistaMaterialesCalzados, ctrlBD);
                vistaMaterialesCalzados.setVisible(true);
                ctrlMateriales.IniciarVistaMateriales();   
            }
        });
    }
    
    public void autoCompletar(String txt) {
        String completar = "";
        int start = txt.length();
        int last = txt.length();

        for (int i = 0; i < name.size(); i++) {
            if (name.get(i).toString().startsWith(txt)) {
                completar = name.get(i).toString();
                last = completar.length();
                break;
            }
        }

        if (last > start) {
            txtBuscar.setText(completar);
            txtBuscar.setCaretPosition(last);
            txtBuscar.moveCaretPosition(start);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> ComboMaterial;
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnRestar;
    public javax.swing.JButton btnSumar;
    public javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JLabel labelCantidad;
    public javax.swing.JLabel labelMaterial;
    public javax.swing.JTable tablaMateriales;
    private javax.swing.JTextField txtAgregarMaterial;
    public javax.swing.JTextField txtBuscar;
    public javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
