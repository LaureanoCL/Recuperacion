package Util;

import java.sql.*;

public class ConexionBD {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/Biblioteca";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Laure2200";

    public static Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
}
