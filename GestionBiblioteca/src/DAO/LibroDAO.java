package DAO;

import Util.ConexionBD;
import DTO.Libro;

import java.sql.*;
import java.util.*;

public class LibroDAO {

    public void insertarLibro(Libro libro) {
        String sql = "INSERT INTO Libro (titulo, anio, id_autor) VALUES (?, ?, ?)";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, libro.getTitulo());
            stmt.setInt(2, libro.getAño());
            stmt.setInt(3, libro.getIdAutor());

            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error al insertar libro: " + e.getMessage());
        }
    }

    public List<Libro> obtenerLibros() {
        List<Libro> libros = new ArrayList<>();
        String sql = "SELECT * FROM Libro";

        try (Connection conn = ConexionBD.obtenerConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Libro libro = new Libro();
                libro.setId(rs.getInt("id_libro"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setAño(rs.getInt("anio"));
                libro.setIdAutor(rs.getInt("id_autor"));
                libros.add(libro);
            }

        } catch (SQLException e) {
            System.err.println("Error al listar libros: " + e.getMessage());
        }

        return libros;
    }

    public void modificarTitulo(int id, String nuevoTitulo) {
        String sql = "UPDATE Libro SET titulo = ? WHERE id_libro = ?";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nuevoTitulo);
            stmt.setInt(2, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error al modificar título: " + e.getMessage());
        }
    }

    public void eliminarLibro(int id) {
        String sql = "DELETE FROM Libro WHERE id_libro = ?";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error al eliminar libro: " + e.getMessage());
        }
    }
}


