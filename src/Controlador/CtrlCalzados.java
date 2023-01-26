
package Controlador;

import Modelo.ModeloCalzado;
import Vistas.VistaCalzado;
import Controlador.CtrlBD;
import Modelo.ConexionBD;
import Modelo.ModeloFactura;
import Vistas.AdminVista;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;


public class CtrlCalzados implements ActionListener{
    
    VistaCalzado vistaCalzado;
    ModeloCalzado modeloCalzado;
    CtrlBD ctrlBD;

    public CtrlCalzados(ModeloCalzado modeloCalzado, VistaCalzado vistaCalzado,  CtrlBD ctrlBD) {
        this.vistaCalzado = vistaCalzado;
        this.modeloCalzado = modeloCalzado;
        this.ctrlBD = ctrlBD;
        
        this.vistaCalzado.btnVolver.addActionListener(this);
        
        this.vistaCalzado.txtMarca.addActionListener(this);
        this.vistaCalzado.txtModelo.addActionListener(this);
        this.vistaCalzado.txtCategoria.addActionListener(this);
        this.vistaCalzado.btnAgregarMarca.addActionListener(this);
        
        this.vistaCalzado.comboMarca.addActionListener(this);
        this.vistaCalzado.comboModelo.addActionListener(this);
        this.vistaCalzado.comboCategoria.addActionListener(this);
        this.vistaCalzado.comboEditarCategoria.addActionListener(this);
        this.vistaCalzado.btnAgregarCalzado.addActionListener(this);
        this.vistaCalzado.btnBuscar.addActionListener(this);
        this.vistaCalzado.txtBuscarCalzado.addActionListener(this);
    }
    
    public void IniciarVistaCalzados(){
        consultarMarcas(vistaCalzado.comboMarca, vistaCalzado.comboModelo, vistaCalzado.comboCategoria);
        consultarMarcas(vistaCalzado.comboEditarMarca, vistaCalzado.comboEditarModelo, vistaCalzado.comboEditarCategoria);
        vistaCalzado.setTitle("Clientes");
        vistaCalzado.setLocationRelativeTo(null);
        mostrarTodo();
    }
    
    public void consultarMarcas(JComboBox comboMarca, JComboBox comboModelo, JComboBox comboCategoria){
        
        ConexionBD cn = new ConexionBD();
        Connection c = cn.conectar();
        
        String sql = "SELECT * FROM calzadosmarca";
        Statement st;

        try {
            st = c.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                comboMarca.addItem(rs.getString("marca"));
                comboModelo.addItem(rs.getString("modelo"));
                comboCategoria.addItem(rs.getString("categoria"));
            }

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "No se encontraron coincidefdsfsncias");
        }
        
    }
    
    public void mostrarTodo() {

        DefaultTableModel modelo = new DefaultTableModel();
          ConexionBD cn = new ConexionBD();
          Connection c = cn.conectar();

        vistaCalzado.tablaCalzados.setModel(modelo);
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("Categoria");
        modelo.addColumn("Precio");
        modelo.addColumn("idProducto");
            
        String sql = "SELECT * FROM calzados";
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
            
            vistaCalzado.tablaCalzados.setModel(modelo);

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "No hay zapatos registrados");
        }
    }
    
    public void limpiar(){
        
        vistaCalzado.txtMarca.setText("");
        vistaCalzado.txtModelo.setText("");
        vistaCalzado.txtCategoria.setText("");
        vistaCalzado.txtPrecio.setText("");
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
              
        if(e.getSource () == vistaCalzado.btnAgregarMarca){
            String marca = vistaCalzado.txtMarca.getText();
            String modelo = vistaCalzado.txtModelo.getText();
            String categoria = vistaCalzado.txtCategoria.getText();
            
            if (ctrlBD.AgregarMarca(marca, modelo, categoria)) {
                System.out.println("marcas mostradas");
                consultarMarcas(vistaCalzado.comboMarca, vistaCalzado.comboModelo, vistaCalzado.comboCategoria); 
                limpiar();
            }
        }       
        
        if (e.getSource() == vistaCalzado.btnAgregarCalzado) {
            int numero = (int) (Math.random() * 1000 + 2000);
            modeloCalzado.setMarca((String)vistaCalzado.comboMarca.getSelectedItem());
            modeloCalzado.setModelo((String)vistaCalzado.comboModelo.getSelectedItem());
            modeloCalzado.setCategoria((String)vistaCalzado.comboCategoria.getSelectedItem());
            modeloCalzado.setPrecio(Double.parseDouble(vistaCalzado.txtPrecio.getText()));
            modeloCalzado.setIdProducto(numero);
            if (ctrlBD.registrarCalzado(modeloCalzado)) {
                System.out.println("Calzado registrado");
                mostrarTodo();
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Ocurrió un error");
            }
            
            
        }
        
        if (e.getSource() == vistaCalzado.btnBuscar) {
            modeloCalzado.setIdProducto(Integer.parseInt(vistaCalzado.txtBuscarCalzado.getText()));
            
            if (ctrlBD.buscarCalzado(modeloCalzado)) {
                consultarMarcas(vistaCalzado.comboEditarMarca, vistaCalzado.comboEditarModelo, vistaCalzado.comboEditarCategoria);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron Clientes");
            }

        }
        
        if(e.getSource () == vistaCalzado.btnVolver){
            AdminVista adminVista = new AdminVista();
            adminVista.setVisible(true);
            ModeloFactura modeloFactura = new ModeloFactura();
            CtrlBD ctrlBD = new CtrlBD();
            ctrlVistaAdmin ctrlVistaAdmin = new ctrlVistaAdmin(adminVista, modeloFactura, ctrlBD);
            ctrlVistaAdmin.IniciarAdminVista();
            vistaCalzado.dispose();
        
         }
        
    } 
}
