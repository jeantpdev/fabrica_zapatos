package Controlador;

import Modelo.ConexionBD;
import Modelo.ModeloCalzado;
import Modelo.ModeloCliente;
import Modelo.ModeloMateriales;
import Modelo.ModeloProveedor;
import Modelo.ModeloUsuario;
import Modelo.ModeloFactura;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CtrlBD extends ConexionBD {

    PreparedStatement ps = null;
    Connection con = conectar();
    
    public boolean registrarProveedor(ModeloProveedor modeloProveedor) {
        PreparedStatement ps = null;
        Connection con = conectar();
        String sql = "INSERT INTO proovedores (Nombre, Celular, Correo, Direccion, idProveedor) VALUES(?,?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, modeloProveedor.getNombre());
            ps.setString(2, modeloProveedor.getCelular());
            ps.setString(3, modeloProveedor.getCorreo());
            ps.setString(4, modeloProveedor.getDireccion());
            ps.setInt(5, modeloProveedor.getIdProveedor());
            ps.execute();
            System.out.println("Proveedor registrado (CTRLBD)");
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        } finally {
            try {
                con.close();
                System.out.println("BD cerrada (CTRLBD)");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }   

    public boolean buscarProveedor(ModeloProveedor modeloProveedor) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conectar();

        String sql = "SELECT * FROM proovedores WHERE idProveedor = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, modeloProveedor.getIdProveedor());
            rs = ps.executeQuery();

            if (rs.next()) {
                modeloProveedor.setNombre(rs.getString("Nombre"));
                modeloProveedor.setCelular(rs.getString("Celular"));
                modeloProveedor.setCorreo(rs.getString("Correo"));
                modeloProveedor.setDireccion(rs.getString("Direccion"));
                modeloProveedor.setIdProveedor(Integer.parseInt(rs.getString("idProveedor")));
                return true;
            }
            return false;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public boolean modificarProveedor(ModeloProveedor modeloProveedor) {

        PreparedStatement ps = null;
        Connection con = conectar();

        String sql = "UPDATE proovedores SET Nombre =?, Celular = ?, Direccion = ?, Correo = ? WHERE idProveedor = ?";

        try {
            ps = con.prepareStatement(sql);
            /* ps.setInt(0, hc.getId()); */
            ps.setString(1, modeloProveedor.getNombre());
            ps.setString(2, modeloProveedor.getCelular());
            ps.setString(3, modeloProveedor.getCorreo());
            ps.setString(4, modeloProveedor.getDireccion());
            ps.setInt(5, modeloProveedor.getIdProveedor());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean eliminarProveedor(ModeloProveedor modeloProveedor) {

        PreparedStatement ps = null;
        Connection con = conectar();

        String sql = "DELETE FROM proovedores WHERE idProveedor= ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, modeloProveedor.getIdProveedor());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    /* CLIENTEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEES*/
    public boolean registrarCliente(ModeloCliente modeloCliente) {

        String sql = "INSERT INTO clientes (Cedula, Nombre, Apellido, Correo, Direccion, Celular) VALUES(?,?,?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, modeloCliente.getCedula());
            ps.setString(2, modeloCliente.getNombre());
            ps.setString(3, modeloCliente.getApellido());
            ps.setString(4, modeloCliente.getCorreo());
            ps.setString(5, modeloCliente.getDireccion());
            ps.setString(6, modeloCliente.getCelular());
            ps.execute();

            System.out.println("Cliente registrado (CTRLBD)");
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        } finally {
            try {
                con.close();
                System.out.println("BD cerrada (CTRLBD)");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public boolean buscarCliente(ModeloCliente modeloCliente) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conectar();

        String sql = "SELECT * FROM clientes WHERE Cedula = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, modeloCliente.getCedula());
            rs = ps.executeQuery();

            if (rs.next()) {
                modeloCliente.setCedula(Integer.parseInt(rs.getString("Cedula")));
                modeloCliente.setNombre(rs.getString("Nombre"));
                modeloCliente.setApellido(rs.getString("Apellido"));
                modeloCliente.setCorreo(rs.getString("Correo"));
                modeloCliente.setDireccion(rs.getString("Direccion"));
                modeloCliente.setCelular(rs.getString("Celular"));
                return true;
            }
            return false;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public boolean modificarCliente(ModeloCliente modeloCliente) {
        
        PreparedStatement ps = null;
        Connection con = conectar();
        String sql = "UPDATE clientes SET Nombre =?, Apellido =?, Correo = ?, Direccion = ?, Celular = ? WHERE Cedula = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, modeloCliente.getNombre());
            ps.setString(2, modeloCliente.getApellido());
            ps.setString(3, modeloCliente.getCorreo());
            ps.setString(4, modeloCliente.getDireccion());
            ps.setString(5, modeloCliente.getCelular());
            ps.setInt(6, modeloCliente.getCedula());
            ps.executeUpdate();

            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean eliminarCliente(ModeloCliente modeloCliente) {
        PreparedStatement ps = null;
        Connection con = conectar();

        String sql = "DELETE FROM clientes WHERE Cedula = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, modeloCliente.getCedula());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    /* CALZADOS TRAER AL COMBOBOX*/
    public boolean AgregarMarca(String marca, String modelo, String categoria) {
        PreparedStatement ps = null;
        Connection con = conectar();
        String sql = "INSERT INTO calzadosmarca (marca, modelo, categoria) VALUES(?,?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, marca);
            ps.setString(2, modelo);
            ps.setString(3, categoria);
            ps.execute();

            System.out.println("METIDOS EN BASE DE DATOS BB");
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        } finally {
            try {
                con.close();
                System.out.println("BD cerrada (CTRLBD)");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public boolean registrarCalzado(ModeloCalzado modeloCalzado) {
        PreparedStatement ps = null;
        Connection con = conectar();
        String sql = "INSERT INTO calzados (Marca, Modelo, Categoria, Precio, idProducto) VALUES(?,?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, modeloCalzado.getMarca());
            ps.setString(2, modeloCalzado.getModelo());
            ps.setString(3, modeloCalzado.getCategoria());
            ps.setDouble(4, modeloCalzado.getPrecio());
            ps.setInt(5, modeloCalzado.getIdProducto());
            ps.execute();
            System.out.println("Calzado registrado (CTRLBD)");
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        } finally {
            try {
                con.close();
                System.out.println("BD cerrada (CTRLBD)");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public boolean buscarCalzado(ModeloCalzado modeloCalzado) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conectar();

        String sql = "SELECT * FROM calzados WHERE idProducto = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, modeloCalzado.getIdProducto());
            rs = ps.executeQuery();

            if (rs.next()) {
                modeloCalzado.setMarca(rs.getString("Marca"));
                modeloCalzado.setModelo(rs.getString("Modelo"));
                modeloCalzado.setCategoria(rs.getString("Categoria"));
                modeloCalzado.setPrecio(Double.parseDouble(rs.getString("Precio")));
                modeloCalzado.setIdProducto(Integer.parseInt(rs.getString("idProducto")));
                return true;
            }
            return false;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public boolean buscarUsuario(ModeloUsuario modeloUsuario) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conectar();

        String sql = "SELECT * FROM usuarios WHERE usuario = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, modeloUsuario.getNombreUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {
                modeloUsuario.setNombreUsuario(rs.getString("usuario"));
                modeloUsuario.setContra(rs.getString("contraseña"));
                return true;
            }
            return false;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    /* MATERIALES                */
    public boolean registrarMaterial(ModeloMateriales modeloMateriales) {
        PreparedStatement ps = null;
        Connection con = conectar();
        String sql = "INSERT INTO materiales (Material, Cantidad) VALUES(?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, modeloMateriales.getMaterial());
            ps.setString(2, modeloMateriales.getCantidad());
            ps.execute();
            System.out.println("Materiales registrados (CTRLBD)");
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        } finally {
            try {
                con.close();
                System.out.println("BD cerrada (CTRLBD)");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public boolean buscarMaterial(ModeloMateriales modeloMateriales) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conectar();

        String sql = "SELECT * FROM materiales WHERE material = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, modeloMateriales.getMaterial());
            rs = ps.executeQuery();

            if (rs.next()) {
                modeloMateriales.setMaterial(rs.getString("Material"));
                modeloMateriales.setCantidad(rs.getString("Cantidad"));
                return true;
            }
            return false;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    
    public boolean registrarFactura(ModeloFactura modeloFactura) {
        PreparedStatement ps = null;
        Connection con = conectar();
        String sql = "INSERT INTO facturacion (nombre, cedula, producto, cantidad, total, idFactura) VALUES(?,?,?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, modeloFactura.getNombre());
            ps.setString(2, modeloFactura.getCedula());
            ps.setString(3, modeloFactura.getProducto());
            ps.setString(4, modeloFactura.getCantidad());
            ps.setString(5, modeloFactura.getTotal());
            ps.setInt(6, modeloFactura.getIdFactura());
            ps.execute();
            System.out.println("Facturacion creada (CTRLBD)");
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        } finally {
            try {
                con.close();
                System.out.println("BD cerrada (CTRLBD)");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

}
