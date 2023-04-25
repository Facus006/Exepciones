/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAOEXT;

/**
 *
 * @author Facu
 */
public class ServicioFabricante {
    
    private FabricanteDAOEXT dao;

    public ServicioFabricante() {
        this.dao = new FabricanteDAOEXT();
    }
    
    public Fabricante buscarfabricantePorCodigo(Integer codigo) throws Exception {

        try {

            //Validamos
            if (codigo == null) {
                throw new Exception("Debe indicar el codigo");
            }

            Fabricante fabricante = dao.buscarfabricantePorCodigo(codigo);

            return fabricante;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void crearFabricante(String nombre) throws Exception {

        try {
            
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar la nombre");
            }
            
            //Creamos el Fabricante
            Fabricante fabricante = new Fabricante();
            fabricante.setNombre(nombre);
            dao.guardarFabricante(fabricante);
        } catch (Exception e) {
            throw e;
        }
    }
}
