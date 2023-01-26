
package Controlador;

import Modelo.ConexionBD;
import Modelo.ModeloFactura;
import Modelo.ModeloMateriales;
import Vistas.AdminVista;
import Vistas.VistaMaterialesCalzados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CtrlMateriales implements ActionListener {
    
    VistaMaterialesCalzados vistaMaterialesCalzados;
    ModeloMateriales modeloMateriales;
    CtrlBD ctrlBD;
    
    public CtrlMateriales(ModeloMateriales modeloMateriales, VistaMaterialesCalzados vistaMaterialesCalzados,  CtrlBD ctrlBD) {
        this.vistaMaterialesCalzados = vistaMaterialesCalzados;
        this.modeloMateriales = modeloMateriales;
        this.ctrlBD = ctrlBD;

        this.vistaMaterialesCalzados.btnAgregar.addActionListener(this);
        this.vistaMaterialesCalzados.btnEditar.addActionListener(this);
        this.vistaMaterialesCalzados.btnEliminar.addActionListener(this);
        this.vistaMaterialesCalzados.btnBuscar.addActionListener(this);
        this.vistaMaterialesCalzados.btnActualizar.addActionListener(this);       
        this.vistaMaterialesCalzados.btnVolver.addActionListener(this);
        this.vistaMaterialesCalzados.ComboMaterial.addActionListener(this);
        this.vistaMaterialesCalzados.btnSumar.addActionListener(this);
        this.vistaMaterialesCalzados.btnRestar.addActionListener(this);
        this.vistaMaterialesCalzados.txtBuscar.addActionListener(this);
    }
    
   // AutoCompleter  a = new AutoCompleter(vistaMaterialesCalzados.txtBuscar);
    
    public void IniciarVistaMateriales() {
        vistaMaterialesCalzados.setTitle("Clientes");
        vistaMaterialesCalzados.setLocationRelativeTo(null);
        mostrarTodo();
        vistaMaterialesCalzados.btnSumar.setEnabled(false);
        vistaMaterialesCalzados.btnRestar.setEnabled(false);
    }
    
    public void mostrarTodo() {

        DefaultTableModel modelo = new DefaultTableModel();
        ConexionBD cn = new ConexionBD();
        Connection c = cn.conectar();

        vistaMaterialesCalzados.tablaMateriales.setModel(modelo);
        modelo.addColumn("Material");
        modelo.addColumn("Cantidad");

        String sql = "SELECT * FROM materiales";
        Statement st;
        String[] datos = new String[2];

        try {
            st = c.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);

                modelo.addRow(datos);
            }

            vistaMaterialesCalzados.tablaMateriales.setModel(modelo);

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "No se encontraron materiales");
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vistaMaterialesCalzados.btnAgregar) {
            modeloMateriales.setMaterial((String)vistaMaterialesCalzados.ComboMaterial.getSelectedItem());
            modeloMateriales.setCantidad(vistaMaterialesCalzados.txtCantidad.getText());
            
            if (ctrlBD.registrarMaterial(modeloMateriales) ) {
                System.out.println("Materiales registrados");
                mostrarTodo();
            }else{
                System.out.println("No se pudo registrar lo materiales");
            }
        }
        
        if (e.getSource() == vistaMaterialesCalzados.btnEditar) {
            vistaMaterialesCalzados.btnSumar.setEnabled(true);
            vistaMaterialesCalzados.btnRestar.setEnabled(true);

        }
        
        if (e.getSource() == vistaMaterialesCalzados.btnEliminar) {
            System.out.println("presionado");
        }
        
        if (e.getSource() == vistaMaterialesCalzados.btnBuscar) {
            modeloMateriales.setMaterial(vistaMaterialesCalzados.txtBuscar.getText());
            String txt = vistaMaterialesCalzados.txtBuscar.getText();

            
            if (ctrlBD.buscarMaterial(modeloMateriales)) {
                vistaMaterialesCalzados.labelMaterial.setText(modeloMateriales.getMaterial());
                vistaMaterialesCalzados.labelCantidad.setText(modeloMateriales.getCantidad());
                vistaMaterialesCalzados.btnEditar.setEnabled(true);
                System.out.println("Agregados");
            }
        }
        
        if (e.getSource() == vistaMaterialesCalzados.btnActualizar) {
            mostrarTodo();
        }
        
        if (e.getSource() == vistaMaterialesCalzados.btnVolver) {
            AdminVista adminVista = new AdminVista();
            adminVista.setVisible(true);
            ModeloFactura modeloFactura = new ModeloFactura();
            CtrlBD ctrlBD = new CtrlBD();
            ctrlVistaAdmin ctrlVistaAdmin = new ctrlVistaAdmin(adminVista, modeloFactura,ctrlBD);
            ctrlVistaAdmin.IniciarAdminVista();
            vistaMaterialesCalzados.dispose();

        }
        
    }
    
    
    
}
