/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.servicios.ServicioProducto;

/**
 *
 * @author Facu
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Producto producto1 = new Producto();
        Fabricante f1 = new Fabricante();
        ServicioProducto s1 = new ServicioProducto();
        
        try {
            s1.crearProducto(" ", 0 , f1);
        } catch (Exception e) {
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
        
        
       
    }
    
}
