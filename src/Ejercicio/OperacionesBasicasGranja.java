package Ejercicio;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class OperacionesBasicasGranja {

    static Connection conexion;


    public static void abrirConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/farmville", "root", "Abc123.,");
        } catch (ClassNotFoundException | SQLException ex) {
            cerrarConexion();

        }

    }

    public static void cerrarConexion() {
        try {
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
    }
    //-----------------------------------------------------------------------\\MÉTODOS GRANJERO//----------------------------------------------------------------------------------//
    public static boolean crearGranjero(Granjero a){
    boolean confirmacion = false;

    try {
        abrirConexion();
        String insert = "insert into granjeros (id, nombre, descripcion, dinero, puntos, nivel) values (?,?,?,?,?,?)";

        try(PreparedStatement ps = conexion.prepareStatement(insert)) {
            ps.setInt(1,a.getId());
            ps.setString(2,a.getNombre());
            ps.setString(3,a.getDescripcion());
            ps.setInt(4,a.getDinero());
            ps.setInt(5,a.getPuntos());
            ps.setInt(6,a.getNivel());

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas>0){
                confirmacion = true;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    } finally {
        cerrarConexion();
    }
    return confirmacion;
    }

    public static boolean modificarGranjero(Granjero a){
        boolean confirmacion = false;

        try {
            abrirConexion();
            String insert = "update granjeros set nombre = ?, descripcion = ?, dinero = ?, puntos = ?, nivel = ? where id = ?";

            try(PreparedStatement ps = conexion.prepareStatement(insert)) {

                ps.setString(1,a.getNombre());
                ps.setString(2,a.getDescripcion());
                ps.setInt(3,a.getDinero());
                ps.setInt(4,a.getPuntos());
                ps.setInt(5,a.getNivel());
                ps.setInt(6,a.getId());

                int filasAfectadas = ps.executeUpdate();
                if (filasAfectadas>0){
                    confirmacion = true;
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            cerrarConexion();
        }
        return confirmacion;
    }

    public static boolean eliminarGranjero(Granjero a){
        boolean confirmacion = false;

        try {
            abrirConexion();
            String insert = "delete from granjeros where id = ?";

            try(PreparedStatement ps = conexion.prepareStatement(insert)) {

                ps.setInt(1,a.getId());
                int filasAfectadas = ps.executeUpdate();

                if (filasAfectadas>0){
                    confirmacion = true;
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            cerrarConexion();
        }
        return confirmacion;
    }

    public static Granjero datosDeUnGranjero(int id){
        Granjero consulta = null;

        try {
            abrirConexion();
            ResultSet resultado;
            String insert = "select * from granjeros where id = ?";

            try(PreparedStatement ps = conexion.prepareStatement(insert)) {

                ps.setInt(1,id);
                resultado = ps.executeQuery();
                while (resultado.next()){
                    consulta = new Granjero(
                            resultado.getInt("id"),
                            resultado.getString("nombre"),
                            resultado.getString("descripcion"),
                            resultado.getInt("dinero"),
                            resultado.getInt("puntos"),
                            resultado.getInt("nivel"));
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            cerrarConexion();
        }
        return consulta;
    }
    //-----------------------------------------------------------------------\\MÉTODOS CONSTRUCCIÓN//----------------------------------------------------------------------------------//

    public static boolean crearConstruccion(Construccion a){
        boolean confirmacion = false;

        try {
            abrirConexion();
            String insert = "insert into construcciones (id, nombre, precio, id_Granjero) values (?,?,?,?)";

            try(PreparedStatement ps = conexion.prepareStatement(insert)) {
                ps.setInt(1,a.getId());
                ps.setString(2,a.getNombre());
                ps.setInt(3,a.getPrecio());
                ps.setInt(4,a.getId_Granjero());

                int filasAfectadas = ps.executeUpdate();
                if (filasAfectadas>0){
                    confirmacion = true;
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            cerrarConexion();
        }
        return confirmacion;
    }

    public static boolean modificarConstrucion(Construccion a){
        boolean confirmacion = false;

        try {
            abrirConexion();
            String insert = "update construcciones set nombre = ?, precio = ?, id_Granjero = ?, where id = ?";

            try(PreparedStatement ps = conexion.prepareStatement(insert)) {

                ps.setString(1,a.getNombre());
                ps.setInt(2,a.getPrecio());
                ps.setInt(3,a.getId_Granjero());
                ps.setInt(6,a.getId());

                int filasAfectadas = ps.executeUpdate();
                if (filasAfectadas>0){
                    confirmacion = true;
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            cerrarConexion();
        }
        return confirmacion;
    }

    public static boolean eliminarConstruccion(Construccion a){
        boolean confirmacion = false;

        try {
            abrirConexion();
            String insert = "delete from construcciones where id = ?";

            try(PreparedStatement ps = conexion.prepareStatement(insert)) {

                ps.setInt(1,a.getId());
                int filasAfectadas = ps.executeUpdate();

                if (filasAfectadas>0){
                    confirmacion = true;
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            cerrarConexion();
        }
        return confirmacion;
    }
}