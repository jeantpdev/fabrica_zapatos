
package Controlador;

import Modelo.ConexionBD;
import Modelo.ModeloCliente;
import Modelo.ModeloFactura;
import Vistas.AdminVista;
import Vistas.VistaClientes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CtrlClientes implements ActionListener{
    
    ModeloCliente modeloCliente;
    VistaClientes vistaClientes;
    CtrlBD ctrlBD;

    public CtrlClientes(ModeloCliente modeloCliente, VistaClientes vistaClientes, CtrlBD ctrlBD) {
        this.modeloCliente = modeloCliente;
        this.vistaClientes = vistaClientes;
        this.ctrlBD = ctrlBD;
        this.vistaClientes.btnAgregar.addActionListener(this);
        this.vistaClientes.btnActualizar.addActionListener(this);
        this.vistaClientes.btnEliminar.addActionListener(this);
        this.vistaClientes.btnEditar.addActionListener(this);
        this.vistaClientes.btnBuscar.addActionListener(this);
        
        this.vistaClientes.btnVolver.addActionListener(this);
    }
    
    public void IniciarVistaClientes(){
        vistaClientes.setTitle("Clientes");
        vistaClientes.setLocationRelativeTo(null);
        mostrarTodo();
        vistaClientes.btnEditar.setEnabled(false);
        vistaClientes.btnEliminar.setEnabled(false);
    }
    
    public void mostrarTodo() {

        DefaultTableModel modelo = new DefaultTableModel();
          ConexionBD cn = new ConexionBD();
          Connection c = cn.conectar();

        vistaClientes.tablaClientes.setModel(modelo);
        modelo.addColumn("Cedula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Correo");
        modelo.addColumn("Direccion");
        modelo.addColumn("Celular");
            
        String sql = "SELECT * FROM clientes";
        Statement st;
        String[] datos = new String[6];

        try {
            st = c.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
    
                modelo.addRow(datos);
            }
            
            vistaClientes.tablaClientes.setModel(modelo);

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "No se encontraron coincidencias");
        }
    }

    public void limpiar(){
        vistaClientes.txtCedula.setText("");
        vistaClientes.txtNombre.setText("");
        vistaClientes.txtApellido.setText("");
        vistaClientes.txtCorreo.setText("");
        vistaClientes.txtDireccion.setText("");
        vistaClientes.txtCelular.setText("");        
        vistaClientes.txtBuscar.setText("");
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vistaClientes.btnAgregar) {
            modeloCliente.setNombre(vistaClientes.txtNombre.getText());
            modeloCliente.setApellido(vistaClientes.txtApellido.getText());
            modeloCliente.setCorreo(vistaClientes.txtCorreo.getText());
            modeloCliente.setDireccion(vistaClientes.txtDireccion.getText());
            modeloCliente.setCelular(vistaClientes.txtCelular.getText());
            modeloCliente.setCedula(Integer.parseInt(vistaClientes.txtCedula.getText()));
            //modeloClientes.setidClientes(Integer.parseInt(vistaClientes.txtIdClientes)); autogenerar
            
            if (ctrlBD.registrarCliente(modeloCliente)) {
                JOptionPane.showMessageDialog(null, "Cliente"+modeloCliente.getNombre()+"registrado");
                mostrarTodo();
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Hubo un error");
            }

        }
        
        if (e.getSource() == vistaClientes.btnBuscar) {
            modeloCliente.setCedula(Integer.parseInt(vistaClientes.txtBuscar.getText()));

            if (ctrlBD.buscarCliente(modeloCliente)) {
                vistaClientes.txtCedula.setText(Integer.toString(modeloCliente.getCedula()));
                vistaClientes.txtNombre.setText(modeloCliente.getNombre());
                vistaClientes.txtApellido.setText(modeloCliente.getApellido());
                vistaClientes.txtCelular.setText(modeloCliente.getCelular());
                vistaClientes.txtDireccion.setText(modeloCliente.getDireccion());
                vistaClientes.txtCorreo.setText(modeloCliente.getCorreo());
                
                //Se habilitan los botones
                vistaClientes.btnAgregar.setEnabled(false);
                vistaClientes.btnEditar.setEnabled(true);
                vistaClientes.btnEliminar.setEnabled(true);
                
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron idProducto o calzados");
            }

        }
        
        if (e.getSource() == vistaClientes.btnEditar) {
            modeloCliente.setNombre(vistaClientes.txtNombre.getText());
            modeloCliente.setApellido(vistaClientes.txtApellido.getText());
            modeloCliente.setCorreo(vistaClientes.txtCorreo.getText());
            modeloCliente.setCelular(vistaClientes.txtCelular.getText());
            modeloCliente.setDireccion(vistaClientes.txtDireccion.getText());
            modeloCliente.setCedula(Integer.parseInt(vistaClientes.txtBuscar.getText()));

            if (ctrlBD.modificarCliente(modeloCliente)) {
                JOptionPane.showMessageDialog(null, "Proovedor modificado");
                limpiar();
                mostrarTodo();  
                vistaClientes.btnAgregar.setEnabled(true);
                vistaClientes.btnEditar.setEnabled(false);
                vistaClientes.btnEliminar.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Proovedor no modificado");
            }

        }
        
        if (e.getSource() == vistaClientes.btnEliminar) {
            modeloCliente.setCedula(Integer.parseInt(vistaClientes.txtBuscar.getText()));

            if (ctrlBD.eliminarCliente(modeloCliente)) {
                JOptionPane.showMessageDialog(null, "Proveedor eliminado");
                mostrarTodo();
                limpiar();
                vistaClientes.btnAgregar.setEnabled(true);
                vistaClientes.btnEditar.setEnabled(false);
                vistaClientes.btnEliminar.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron proveedores");
            }

        }
        
        if (e.getSource() == vistaClientes.btnActualizar) {
            mostrarTodo();
        }
        
        if (e.getSource() == vistaClientes.btnVolver) {
            AdminVista adminVista = new AdminVista();
            adminVista.setVisible(true);
            ModeloFactura modeloFactura = new ModeloFactura();
            CtrlBD ctrlBD = new CtrlBD();
            ctrlVistaAdmin ctrlVistaAdmin = new ctrlVistaAdmin(adminVista, modeloFactura, ctrlBD);
            ctrlVistaAdmin.IniciarAdminVista();
            vistaClientes.dispose();

        }
        
    }
    
}
