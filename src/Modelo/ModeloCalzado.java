
package Modelo;


public class ModeloCalzado {
    
    String marca, modelo, categoria;
    double precio;
    int idProducto;

    public ModeloCalzado(String marca, String modelo, String categoria, double precio, int idProducto) {
        this.marca = marca;
        this.modelo = modelo;
        this.categoria = categoria;
        this.precio = precio;
        this.idProducto = idProducto;
    }

    public ModeloCalzado() {
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
