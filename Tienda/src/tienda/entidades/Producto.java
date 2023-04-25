
package tienda.entidades;

public class Producto {
    private Integer codigo;
    private String nombre;
    private double precio;
    private Fabricante CodigoFabricante;

    public Producto() {
    }

    public Producto(Integer codigo, String nombre, double precio, Fabricante CodigoFabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.CodigoFabricante = CodigoFabricante;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Fabricante getCodigoFabricante() {
        return CodigoFabricante;
    }

    public void setCodigoFabricante(Fabricante CodigoFabricante) {
        this.CodigoFabricante = CodigoFabricante;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", CodigoFabricante=" + CodigoFabricante + '}';
    }
    
    
    

  
   
 
}
