/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAOEXT;

/**
 *
 * @author Facu
 */
public class ServicioProducto {
   private ProductoDAOEXT dao;

    public ServicioProducto() {
        this.dao = new ProductoDAOEXT();
    }
    public void crearProducto(String nombre, Integer precio, Fabricante fabricante) throws Exception {

        try {
            //Validamos
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }

            if (precio == null) {
                throw new Exception("Debe indicar la precio");
            }

            if (fabricante == null) {
                throw new Exception("Debe indicar el Fabricante");
            }

            //Creamos el mascota
            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(fabricante);

            dao.guardarProducto(producto);

        } catch (Exception e) {
            throw e;
        }
    }  
    public void editarunproducto(Integer codigo, Integer codigo2, String nombre, double precio, Fabricante fabricante ) throws Exception{
        Producto producto1 = new Producto();
        producto1.setCodigo(codigo);
        
        Producto producto2 = new Producto();
        producto2.setNombre(nombre);
        producto2.setPrecio(precio);
        producto2.setCodigoFabricante(fabricante);
        producto2.setCodigo(codigo2);
        
        dao.actualizarProducto(producto1, producto2);
        
        
    }
}
