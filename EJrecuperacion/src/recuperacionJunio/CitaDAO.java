package recuperacionJunio;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CitaDAO {
    private final Connection conn;

    public CitaDAO(Connection conn) {
        this.conn = conn;
    }

    public void insertarCita(Cita cita) throws SQLException {
        String sql = "INSERT INTO citas (nombre, descripcion, fecha) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, cita.getNombre());
            stmt.setString(2, cita.getDescripcion());
            stmt.setTimestamp(3, Timestamp.valueOf(cita.getFecha()));
            stmt.executeUpdate();
            System.out.println("Cita insertada.");
        }
    }

    public void consultarCitasDesde(LocalDateTime desdeFecha) throws SQLException {
        String sql = "SELECT * FROM citas WHERE fecha >= ? ORDER BY fecha";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setTimestamp(1, Timestamp.valueOf(desdeFecha));
            ResultSet rs = stmt.executeQuery();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                Timestamp fecha = rs.getTimestamp("fecha");

                System.out.printf("Nombre: %s, Descripción: %s, Fecha: %s%n",
                        nombre, descripcion, fecha.toLocalDateTime().format(formatter));
            }
        }
    }
}

