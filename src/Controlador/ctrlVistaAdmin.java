package Controlador;

import Modelo.ConexionBD;
import Modelo.ModeloFactura;
import Vistas.AdminVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ctrlVistaAdmin implements ActionListener {

    AdminVista adminVista;
    ModeloFactura modeloFactura;
    CtrlBD ctrlBD;

    public ctrlVistaAdmin(AdminVista adminVista, ModeloFactura modeloFactura, CtrlBD ctrlBD) {
        this.adminVista = adminVista;
        this.modeloFactura = modeloFactura;
        this.ctrlBD = ctrlBD;
        this.adminVista.ComboFiltros.addActionListener(this);
        this.adminVista.btnFactura.addActionListener(this);
    }

    public void IniciarAdminVista() {
        TablaSinFiltros();
        adminVista.setLocationRelativeTo(null);
        contarCalzados();
        contarClientes();
        contarMateriales();
        contarFacturacion();
    }
    
    public void limpiar() {
        adminVista.txtNombreFactura.setText("");
        adminVista.txtCedulaFactura.setText("");
        adminVista.txtProductoFactura.setText("");
        adminVista.txtCantidadFactura.setText("");
        adminVista.txtTotalFactura.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //TABLA
        if (e.getSource() == adminVista.ComboFiltros) {
               
            if (adminVista.ComboFiltros.getSelectedItem() == "Categoria") {
                TablaOrdenarCategoria();
            }
            
            if (adminVista.ComboFiltros.getSelectedItem() == "Modelo") {
                TablaOrdenarModelo();
            }
            
            if (adminVista.ComboFiltros.getSelectedItem() == "Quitar filtros") {
                TablaSinFiltros();
            }
           
        }
        
        if (e.getSource() == adminVista.btnFactura) {
            modeloFactura.setNombre(adminVista.txtNombreFactura.getText());
            modeloFactura.setCedula(adminVista.txtCedulaFactura.getText());
            modeloFactura.setProducto(adminVista.txtProductoFactura.getText());
            modeloFactura.setCantidad(adminVista.txtCantidadFactura.getText());
            modeloFactura.setTotal(adminVista.txtTotalFactura.getText());
            
            if (adminVista.txtNombreFactura.getText().equals("") || 
                adminVista.txtCedulaFactura.getText().equals("") || 
                adminVista.txtProductoFactura.getText().equals("") || 
                adminVista.txtCantidadFactura.getText().equals("") || 
                adminVista.txtTotalFactura.getText().equals("")){
                
                JOptionPane.showMessageDialog(null,"Algunos campos están vacios");
                
            }else{
            
                if (ctrlBD.registrarFactura(modeloFactura)) {
                    JOptionPane.showMessageDialog(null,"Factura generada");
                    limpiar();
                }else{
                    JOptionPane.showMessageDialog(null,"No se pudo generar la factura");
                }
            }
        }
    }
    
    public void contarFacturacion() {
        ConexionBD cn = new ConexionBD();
        Connection c = cn.conectar();

        try {

            Statement consulta = c.createStatement();
            ResultSet facturacion = consulta.executeQuery("SELECT COUNT(*) AS FACTURACION FROM facturacion");
            if (facturacion.next()) {

                adminVista.labelVentas.setText(facturacion.getString("FACTURACION"));

            } else {
                System.out.println("Ningun resultado encontrado");
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public void contarMateriales() {
        ConexionBD cn = new ConexionBD();
        Connection c = cn.conectar();

        try {

            Statement consulta = c.createStatement();
            ResultSet materiales = consulta.executeQuery("SELECT COUNT(*) AS MATERIALES FROM materiales");
            if (materiales.next()) {

                adminVista.labelMateriales.setText(materiales.getString("MATERIALES"));

            } else {
                System.out.println("Ningun resultado encontrado");
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }    
    
    public void contarCalzados() {
        ConexionBD cn = new ConexionBD();
        Connection c = cn.conectar();
        
        try {


            Statement consulta = c.createStatement();
            ResultSet calzados = consulta.executeQuery("SELECT COUNT(*) AS CALZADOS FROM calzados");
            if (calzados.next()) {

                adminVista.labelCalzados.setText(calzados.getString("CALZADOS"));

            } else {
                System.out.println("Ningun resultado encontrado");
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
    
    public void contarClientes() {
        ConexionBD cn = new ConexionBD();
        Connection c = cn.conectar();

        try {

            Statement consulta = c.createStatement();
            ResultSet clientes = consulta.executeQuery("SELECT COUNT(*) AS CLIENTES FROM clientes");
            if (clientes.next()) {

                adminVista.labelClientes.setText(clientes.getString("CLIENTES"));

            } else {
                System.out.println("Ningun resultado encontrado");
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
    
    
    //FUNCIONES DE LA TABLA INVENTARIO DE CALZADOS
    public void TablaSinFiltros() {

        DefaultTableModel modelo = new DefaultTableModel();
        ConexionBD cn = new ConexionBD();
        Connection c = cn.conectar();

        adminVista.tablaInventarioCalzado.setModel(modelo);   
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("Categoria");
        modelo.addColumn("Precio");
        modelo.addColumn("idProducto");

        String sql = "SELECT * FROM `calzados` ORDER BY `Categoria` ASC";
        Statement st;
        String[] datos = new String[5];

        try {
            st = c.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);

                modelo.addRow(datos);
            }

            adminVista.tablaInventarioCalzado.setModel(modelo);

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "No hay zapatos registrados");
        }
    }

    public void TablaOrdenarModelo() {

        DefaultTableModel modelo = new DefaultTableModel();
        ConexionBD cn = new ConexionBD();
        Connection c = cn.conectar();

        adminVista.tablaInventarioCalzado.setModel(modelo);       
        modelo.addColumn("Modelo");
        modelo.addColumn("Marca");
        modelo.addColumn("Categoria");
        modelo.addColumn("Precio");
        modelo.addColumn("idProducto");

        String sql = "SELECT * FROM `calzados` ORDER BY `Categoria` ASC";
        Statement st;
        String[] datos = new String[5];

        try {
            st = c.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[0] = rs.getString(2);
                datos[1] = rs.getString(1);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);

                modelo.addRow(datos);
            }

            adminVista.tablaInventarioCalzado.setModel(modelo);

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "No hay zapatos registrados");
        }
    }

    public void TablaOrdenarCategoria() {

        DefaultTableModel modelo = new DefaultTableModel();
        ConexionBD cn = new ConexionBD();
        Connection c = cn.conectar();

        adminVista.tablaInventarioCalzado.setModel(modelo);
        modelo.addColumn("Categoria");
        modelo.addColumn("Modelo");
        modelo.addColumn("Marca");
        modelo.addColumn("Precio");
        modelo.addColumn("idProducto");

        String sql = "SELECT * FROM `calzados` ORDER BY `Categoria` ASC";
        Statement st;
        String[] datos = new String[5];

        try {
            st = c.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[0] = rs.getString(3);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(1);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);

                modelo.addRow(datos);
            }

            adminVista.tablaInventarioCalzado.setModel(modelo);

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "No hay zapatos registrados");
        }
    }

}

