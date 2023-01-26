
package Vistas;

import Controlador.CtrlBD;
import Controlador.CtrlCalzados;
import Controlador.CtrlClientes;
import Controlador.CtrlMateriales;
import Controlador.CtrlProveedores;
import Controlador.ctrlVistaAdmin;
import Modelo.ModeloCalzado;
import Modelo.ModeloProveedor;
import Modelo.ModeloCliente;
import Modelo.ModeloFactura;
import Modelo.ModeloMateriales;


public class AdminVista extends javax.swing.JFrame {

    public AdminVista() {
        initComponents();     
    }

    //Control de la base de datos
    CtrlBD ctrlBD = new CtrlBD();
    //Clientes
    ModeloCliente modeloCliente = new ModeloCliente();
    VistaClientes vistaClientes = new VistaClientes();
    //Proveedores
    ModeloProveedor modeloProveedor = new ModeloProveedor();
    VistaProveedor vistaProveedor = new VistaProveedor();
    //Calzados
    ModeloCalzado modeloCalzado = new ModeloCalzado();
    VistaCalzado vistaCalzado = new VistaCalzado();
    //Materiales Calzados
    ModeloMateriales modeloMateriales = new ModeloMateriales();
    VistaMaterialesCalzados vistaMaterialesCalzados = new VistaMaterialesCalzados();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInventarioCalzado = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnProveedores = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCalzados = new javax.swing.JButton();
        btnMaterialesCalzados = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ComboFiltros = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        labelClientes = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        labelCalzados = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        labelMateriales = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNombreFactura = new javax.swing.JTextField();
        txtProductoFactura = new javax.swing.JTextField();
        txtCantidadFactura = new javax.swing.JTextField();
        txtTotalFactura = new javax.swing.JTextField();
        btnFactura = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtCedulaFactura = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        labelVentas = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaInventarioCalzado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaInventarioCalzado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 350, 180));

        jPanel2.setBackground(new java.awt.Color(33, 33, 33));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProveedores.setBackground(new java.awt.Color(51, 51, 51));
        btnProveedores.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_supplier_60px_1.png"))); // NOI18N
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });
        jPanel2.add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 70));

        btnClientes.setBackground(new java.awt.Color(51, 51, 51));
        btnClientes.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_person_64px.png"))); // NOI18N
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        jPanel2.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, 70));

        btnSalir.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_shutdown_40px_1.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 60, 50));

        btnCalzados.setBackground(new java.awt.Color(51, 51, 51));
        btnCalzados.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        btnCalzados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_shoes_48px.png"))); // NOI18N
        btnCalzados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalzadosActionPerformed(evt);
            }
        });
        jPanel2.add(btnCalzados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 80, 70));

        btnMaterialesCalzados.setBackground(new java.awt.Color(51, 51, 51));
        btnMaterialesCalzados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_box_60px.png"))); // NOI18N
        btnMaterialesCalzados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaterialesCalzadosActionPerformed(evt);
            }
        });
        jPanel2.add(btnMaterialesCalzados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 80, 70));

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Proveedores");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Clientes");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel16.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Calzados");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel17.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Inventario");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 60, -1));

        jLabel18.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Salir");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 500));

        jPanel3.setBackground(new java.awt.Color(105, 240, 174));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Bienvenido,");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -1, -1, 60));

        labelUsuario.setBackground(new java.awt.Color(51, 51, 51));
        labelUsuario.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(51, 51, 51));
        labelUsuario.setText("usuario");
        jPanel3.add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, -1, -1, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 950, 60));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel1.setText("Inventario de calzados");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        ComboFiltros.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        ComboFiltros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Categoria", "Modelo", "Quitar filtros" }));
        jPanel1.add(ComboFiltros, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 110, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel3.setText("Filtrar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, -1));

        jPanel4.setBackground(new java.awt.Color(105, 240, 174));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel4.setText("N° Clientes");

        labelClientes.setFont(new java.awt.Font("Microsoft YaHei", 0, 36)); // NOI18N
        labelClientes.setText("1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(labelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 130, 170));

        jPanel5.setBackground(new java.awt.Color(105, 240, 174));

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel6.setText("N° Calzados");

        labelCalzados.setFont(new java.awt.Font("Microsoft YaHei", 0, 36)); // NOI18N
        labelCalzados.setText("1");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(labelCalzados, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(labelCalzados, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 130, 170));

        jPanel6.setBackground(new java.awt.Color(105, 240, 174));
        jPanel6.setPreferredSize(new java.awt.Dimension(126, 170));

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 1, 15)); // NOI18N
        jLabel8.setText("N° Materiales");

        labelMateriales.setFont(new java.awt.Font("Microsoft YaHei", 0, 36)); // NOI18N
        labelMateriales.setText("1");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(labelMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(labelMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Producto");

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total");

        jLabel11.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cantidad");

        jLabel12.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Facturación");

        txtNombreFactura.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N

        txtProductoFactura.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N

        txtCantidadFactura.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N

        txtTotalFactura.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N

        btnFactura.setBackground(new java.awt.Color(255, 255, 255));
        btnFactura.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        btnFactura.setText("Generar factura");

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cédula");

        txtCedulaFactura.setFont(new java.awt.Font("Microsoft YaHei", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCantidadFactura)
                            .addComponent(txtTotalFactura)
                            .addComponent(txtNombreFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCedulaFactura)
                            .addComponent(txtProductoFactura)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFactura)
                        .addGap(77, 77, 77)))
                .addGap(25, 25, 25))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtNombreFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtCedulaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtProductoFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCantidadFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTotalFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(btnFactura)
                .addGap(45, 45, 45))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 360, 420));

        jPanel8.setBackground(new java.awt.Color(105, 240, 174));
        jPanel8.setPreferredSize(new java.awt.Dimension(126, 170));

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel9.setText("N° Ventas");

        labelVentas.setFont(new java.awt.Font("Microsoft YaHei", 0, 36)); // NOI18N
        labelVentas.setText("1");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(labelVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(labelVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

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

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        CtrlClientes ctrlClientes = new CtrlClientes(modeloCliente, vistaClientes, ctrlBD);
        vistaClientes.setVisible(true);
        ctrlClientes.IniciarVistaClientes();
        dispose();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        CtrlProveedores ctrlProveedores = new CtrlProveedores(modeloProveedor, vistaProveedor, ctrlBD);
        vistaProveedor.setVisible(true);
        ctrlProveedores.IniciarVistaProveedor();
        dispose();
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCalzadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalzadosActionPerformed
        CtrlCalzados ctrlCalzados = new CtrlCalzados(modeloCalzado, vistaCalzado, ctrlBD);
        vistaCalzado.setVisible(true);
        ctrlCalzados.IniciarVistaCalzados();
        dispose();
    }//GEN-LAST:event_btnCalzadosActionPerformed

    private void btnMaterialesCalzadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaterialesCalzadosActionPerformed
        CtrlMateriales ctrlMateriales = new CtrlMateriales(modeloMateriales, vistaMaterialesCalzados, ctrlBD);
        vistaMaterialesCalzados.setVisible(true);
        ctrlMateriales.IniciarVistaMateriales();
        dispose();
    }//GEN-LAST:event_btnMaterialesCalzadosActionPerformed

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
            java.util.logging.Logger.getLogger(AdminVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //AdminVista
                AdminVista adminVista = new AdminVista();
                ModeloFactura modeloFactura = new ModeloFactura();
                CtrlBD ctrlBD = new CtrlBD();
                ctrlVistaAdmin ctrlVistaAdmin = new ctrlVistaAdmin (adminVista, modeloFactura, ctrlBD);
                adminVista.setVisible(true);
                ctrlVistaAdmin.IniciarAdminVista();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> ComboFiltros;
    public javax.swing.JButton btnCalzados;
    public javax.swing.JButton btnClientes;
    public javax.swing.JButton btnFactura;
    public javax.swing.JButton btnMaterialesCalzados;
    public javax.swing.JButton btnProveedores;
    public javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel labelCalzados;
    public javax.swing.JLabel labelClientes;
    public javax.swing.JLabel labelMateriales;
    private javax.swing.JLabel labelUsuario;
    public javax.swing.JLabel labelVentas;
    public javax.swing.JTable tablaInventarioCalzado;
    public javax.swing.JTextField txtCantidadFactura;
    public javax.swing.JTextField txtCedulaFactura;
    public javax.swing.JTextField txtNombreFactura;
    public javax.swing.JTextField txtProductoFactura;
    public javax.swing.JTextField txtTotalFactura;
    // End of variables declaration//GEN-END:variables
}
