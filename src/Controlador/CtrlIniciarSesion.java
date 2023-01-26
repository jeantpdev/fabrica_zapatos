package Controlador;

import Modelo.ModeloFactura;
import Modelo.ModeloUsuario;
import Vistas.AdminVista;
import Vistas.VistaIniciarSesion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CtrlIniciarSesion implements ActionListener {
    
    VistaIniciarSesion vistaIniciarSesion;
    CtrlBD ctrlBD;
    ModeloUsuario modeloUsuario;
    AdminVista adminVista = new AdminVista();

    public CtrlIniciarSesion(ModeloUsuario modeloUsuario, VistaIniciarSesion vistaIniciarSesion, CtrlBD ctrlBD) {
        this.vistaIniciarSesion = vistaIniciarSesion;
        this.ctrlBD = ctrlBD;
        this.modeloUsuario = modeloUsuario;
        
        this.vistaIniciarSesion.txtUsuario.addActionListener(this);
        this.vistaIniciarSesion.txtContra.addActionListener(this);
        this.vistaIniciarSesion.btnIniciarSesion.addActionListener(this);
    }
    
    public void IniciarVistaIniciarSesion(){
        vistaIniciarSesion.setTitle("Inicio de Sesión");
        vistaIniciarSesion.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vistaIniciarSesion.btnIniciarSesion) {
            modeloUsuario.setNombreUsuario(vistaIniciarSesion.txtUsuario.getText()); 

            if (ctrlBD.buscarUsuario(modeloUsuario)) {
                
                AdminVista adminVista = new AdminVista();
                adminVista.setVisible(true);
                ModeloFactura modeloFactura = new ModeloFactura();
                CtrlBD ctrlBD = new CtrlBD();
                ctrlVistaAdmin ctrlVistaAdmin = new ctrlVistaAdmin(adminVista, modeloFactura,ctrlBD);
                System.out.println("Bienvenido, guapo:v");
                ctrlVistaAdmin.IniciarAdminVista();
                vistaIniciarSesion.dispose();                        
                
            }else{
                JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            }
        }   
    }  
}
