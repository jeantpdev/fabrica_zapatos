
package Modelo;


public class ModeloCalzadoMarca {
    
    String marca,modelo,categoria;

    public ModeloCalzadoMarca(String marca, String modelo, String categoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.categoria = categoria;
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
       
}
