package tienda.persistencia;

import tienda.entidades.Fabricante;
import tienda.servicios.ServicioFabricante;

public final class FabricanteDAOEXT extends DAO {

    private final ServicioFabricante ServicioFabricante;

    public FabricanteDAOEXT() {
        this.ServicioFabricante = new ServicioFabricante();
    }

    public Fabricante buscarfabricantePorCodigo(Integer codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void guardarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar el fabricante");
            }

            String sql = "INSERT INTO FABRICANTE (NOMBRE)"
                    + "VALUES ( '" + fabricante.getNombre() + "' );";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }


}
