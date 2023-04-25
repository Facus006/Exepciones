package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.servicios.ServicioFabricante;

public class ProductoDAOEXT extends DAO {

    private final ServicioFabricante servicioFabricante;

    public ProductoDAOEXT() {
        this.servicioFabricante = new ServicioFabricante();
    }

    public Collection<Producto> listarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM PRODUCTO ";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                productos = (Collection<Producto>) new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                producto.setCodigo(resultado.getInt(3));
                Integer CodigoFabricante = resultado.getInt(4);
                Fabricante fabricante = servicioFabricante.buscarfabricantePorCodigo(CodigoFabricante);
                producto.setCodigoFabricante(fabricante);
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> listarProductosXnombre() throws Exception {
        try {
            String sql = "SELECT NOMBRE,PRECIO FROM PRODUCTO ";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                productos = (Collection<Producto>) new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> listarProductosporPrecio() throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE PRECIO BETWEEN 120 AND 202;";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                productos = (Collection<Producto>) new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                producto.setCodigo(resultado.getInt(3));
                Integer CodigoFabricante = resultado.getInt(4);
                Fabricante fabricante = servicioFabricante.buscarfabricantePorCodigo(CodigoFabricante);
                producto.setCodigoFabricante(fabricante);
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> listarPortatiles() throws Exception {
        try {
            String sql = "SELECT * FROM PRODUCTO WHERE NOMBRE LIKE 'Portátil%'";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                productos = (Collection<Producto>) new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                producto.setCodigo(resultado.getInt(3));
                Integer CodigoFabricante = resultado.getInt(4);
                Fabricante fabricante = servicioFabricante.buscarfabricantePorCodigo(CodigoFabricante);
                producto.setCodigoFabricante(fabricante);
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> listarProductomasbarato() throws Exception {
        try {
            String sql = "SELECT NOMBRE, PRECIO FROM PRODUCTO WHERE PRECIO = (SELECT MIN(precio) FROM PRODUCTO);";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                productos = (Collection<Producto>) new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto");
            }
            String sql = "INSERT INTO PRODUCTO (NOMBRE, PRECIO, CODIGO_FABRICANTE) "
                    + "VALUES ( '" + producto.getNombre() + "' , '" + producto.getPrecio() + "' ," + producto.getCodigoFabricante().getCodigo() + " );";

            // System.out.println(sql);
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    public void actualizarProducto(Producto producto, Producto reemplazo) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto");
            }if (reemplazo == null) {
                throw new Exception("Debe indicar el producto");
            }
            
            String sql = "UPDATE producto SET precio = " + reemplazo.getPrecio()
                    + ", NOMBRE = '" + reemplazo.getNombre()
                    + "', codigo_fabricante = " + reemplazo.getCodigoFabricante()
                    + " WHERE codigo = " + producto.getCodigo();
             insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    

    
}
