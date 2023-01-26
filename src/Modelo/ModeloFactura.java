
package Modelo;


public class ModeloFactura {
    
    String Nombre, Cedula, Producto, Cantidad, Total;
    int IdFactura;

    public ModeloFactura(String Nombre, String Cedula, String Producto, String Cantidad, String Total, int IdFactura) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Producto = Producto;
        this.Cantidad = Cantidad;
        this.Total = Total;
        this.IdFactura = IdFactura;
    }

    public ModeloFactura() {
    }
    
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String Total) {
        this.Total = Total;
    }

    public int getIdFactura() {
        return IdFactura;
    }

    public void setIdFactura(int IdFactura) {
        this.IdFactura = IdFactura;
    }

    
    
}
