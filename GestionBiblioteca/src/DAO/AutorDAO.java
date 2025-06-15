package DAO;

import Util.ConexionBD;
import DTO.Autor;

import java.sql.*;
import java.util.*;

public class AutorDAO {

    public void insertarAutores(Autor autor) {
        String sql = "INSERT INTO Autor (id_autor, nombre, pais) VALUES (?, ?, ?)";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, autor.getId());
            stmt.setString(2, autor.getNombre());
            stmt.setString(3, autor.getPais());

            stmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Error al insertar autor: " + e.getMessage());
        }
    }

    public List<Autor> obtenerAutores() {
        List<Autor> autores = new ArrayList<>();
        String sql = "SELECT * FROM Autor";

        try (Connection conn = ConexionBD.obtenerConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Autor autor = new Autor();
                autor.setId(rs.getInt("id_autor"));
                autor.setNombre(rs.getString("nombre"));
                autor.setPais(rs.getString("pais"));
                autores.add(autor);
            }

        } catch (SQLException e) {
            System.err.println("Error al listar autores: " + e.getMessage());
        }

        return autores;
    }
}

