
package Controlador;

import Modelo.ConexionBD;
import Modelo.ModeloFactura;
import Modelo.ModeloProveedor;
import Vistas.AdminVista;
import Vistas.VistaProveedor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CtrlProveedores implements ActionListener{
    
    ModeloProveedor modeloProveedor;
    VistaProveedor vistaProveedor;
    CtrlBD ctrlBD;

    public CtrlProveedores(ModeloProveedor modeloProveedor, VistaProveedor vistaProveedor, CtrlBD ctrlBD) {
        
        this.modeloProveedor = modeloProveedor;
        this.vistaProveedor = vistaProveedor;
        this.ctrlBD = ctrlBD;
        this.vistaProveedor.btnAgregar.addActionListener(this);
        this.vistaProveedor.btnActualizar.addActionListener(this);
        this.vistaProveedor.btnEliminar.addActionListener(this);
        this.vistaProveedor.btnEditar.addActionListener(this);
        this.vistaProveedor.btnBuscar.addActionListener(this);
        this.vistaProveedor.btnLimpiar.addActionListener(this);
        
        this.vistaProveedor.btnVolver.addActionListener(this);

    }
    
    public void IniciarVistaProveedor(){
        vistaProveedor.setTitle("Nose");
        vistaProveedor.setLocationRelativeTo(null);
        mostrarTodo();
        vistaProveedor.btnEditar.setEnabled(false);
        vistaProveedor.btnEliminar.setEnabled(false);
    }
    
    public void mostrarTodo() {

        DefaultTableModel modelo = new DefaultTableModel();
          ConexionBD cn = new ConexionBD();
          Connection c = cn.conectar();

        vistaProveedor.tablaProveedores.setModel(modelo);
        modelo.addColumn("Nombre");
        modelo.addColumn("Celular");
        modelo.addColumn("Correo");
        modelo.addColumn("Direccion");
        modelo.addColumn("idProveedor");    

        
        String sql = "SELECT * FROM proovedores";
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
            
            
            vistaProveedor.tablaProveedores.setModel(modelo);

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "No se encontraron coincidefdsfsncias");
        }
    }

    public void limpiar(){
        vistaProveedor.txtNombre.setText("");
        vistaProveedor.txtCelular.setText("");
        vistaProveedor.txtCorreo.setText("");
        vistaProveedor.txtDireccion.setText("");
        vistaProveedor.txtBuscar.setText("");
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vistaProveedor.btnAgregar) {
            int numero = (int)(Math.random()*1000+2000);
            modeloProveedor.setNombre(vistaProveedor.txtNombre.getText());
            modeloProveedor.setCorreo(vistaProveedor.txtCorreo.getText());
            modeloProveedor.setDireccion(vistaProveedor.txtDireccion.getText());
            modeloProveedor.setCelular(vistaProveedor.txtCelular.getText());
            modeloProveedor.setIdProveedor(numero);
            //modeloProveedor.setidProveedor(Integer.parseInt(vistaProveedor.txtIdProveedor)); autogenerar
            
             if(ctrlBD.registrarProveedor(modeloProveedor)){
                JOptionPane.showMessageDialog(null,"Proveedor registrado papu");
                mostrarTodo();
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null,"Hubo un error");
            }
        }
        
        
        if(e.getSource() == vistaProveedor.btnBuscar){
            modeloProveedor.setIdProveedor(Integer.parseInt(vistaProveedor.txtBuscar.getText()));
                
            if (ctrlBD.buscarProveedor(modeloProveedor)) {
                vistaProveedor.txtNombre.setText(modeloProveedor.getNombre());
                vistaProveedor.txtCelular.setText(modeloProveedor.getCelular());
                vistaProveedor.txtDireccion.setText(modeloProveedor.getDireccion());
                vistaProveedor.txtCorreo.setText(modeloProveedor.getCorreo());     
                vistaProveedor.btnEliminar.setEnabled(true);
                vistaProveedor.btnEditar.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(null, "No se encontraron proveedores");
            }
            
        }
        
        if(e.getSource() == vistaProveedor.btnEditar){
            modeloProveedor.setNombre(vistaProveedor.txtNombre.getText());
            modeloProveedor.setCorreo(vistaProveedor.txtCorreo.getText());
            modeloProveedor.setCelular(vistaProveedor.txtCelular.getText());
            modeloProveedor.setDireccion(vistaProveedor.txtDireccion.getText());
            modeloProveedor.setIdProveedor(Integer.parseInt(vistaProveedor.txtBuscar.getText()));
            
            if (ctrlBD.modificarProveedor(modeloProveedor)) {
                JOptionPane.showMessageDialog(null, "Proovedor modificado");
                vistaProveedor.btnEliminar.setEnabled(false);
                vistaProveedor.btnEditar.setEnabled(false);
                limpiar();
                mostrarTodo();
            }else{
                JOptionPane.showMessageDialog(null, "Proovedor no modificado");
            }
            
        }
        
        if(e.getSource() == vistaProveedor.btnEliminar){
            modeloProveedor.setIdProveedor(Integer.parseInt(vistaProveedor.txtBuscar.getText()));
                
            if (ctrlBD.eliminarProveedor(modeloProveedor)) {
                JOptionPane.showMessageDialog(null, "Proveedor eliminado papu");
                mostrarTodo();
                limpiar();
                vistaProveedor.btnEliminar.setEnabled(false);
                vistaProveedor.btnEditar.setEnabled(false);
            }else{
                JOptionPane.showMessageDialog(null, "No se encontraron proveedores");
            }
            
        }
        
        if(e.getSource() == vistaProveedor.btnActualizar){
            mostrarTodo();
        }
        
        if (e.getSource() == vistaProveedor.btnVolver) {
            AdminVista adminVista = new AdminVista();
            adminVista.setVisible(true);
            ModeloFactura modeloFactura = new ModeloFactura();
            CtrlBD ctrlBD = new CtrlBD();
            ctrlVistaAdmin ctrlVistaAdmin = new ctrlVistaAdmin(adminVista, modeloFactura, ctrlBD);
            ctrlVistaAdmin.IniciarAdminVista();
            vistaProveedor.dispose();

        }
        if (e.getSource() == vistaProveedor.btnLimpiar) {
            limpiar();
        }
        
    }
    

    

    
    
}
