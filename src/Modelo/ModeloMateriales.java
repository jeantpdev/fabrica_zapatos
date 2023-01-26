
package Modelo;


public class ModeloMateriales {
    
    String Cantidad, Material;

    public ModeloMateriales(String Cantidad, String Material) {
        this.Cantidad = Cantidad;
        this.Material = Material;
    }

    public ModeloMateriales() {
    }
    
    

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }
    
    
    
}
