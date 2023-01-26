
package Modelo;


public class ModeloUsuario {
    
    String NombreUsuario, Contra;

    public ModeloUsuario(String NombreUsuario, String Contra) {
        this.NombreUsuario = NombreUsuario;
        this.Contra = Contra;
    }

    public ModeloUsuario() {
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getContra() {
        return Contra;
    }

    public void setContra(String Contra) {
        this.Contra = Contra;
    }

    
    
}
