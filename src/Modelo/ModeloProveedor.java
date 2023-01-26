
package Modelo;


public class ModeloProveedor {
    
    private String nombre, direccion, correo, celular;
    private int idProveedor;


    public ModeloProveedor(String nombre, String direccion,  int idProveedor, String correo, String celular) {
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.idProveedor = idProveedor;
        this.celular = celular;
    }


    public ModeloProveedor() {
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}
