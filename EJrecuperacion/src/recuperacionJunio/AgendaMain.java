package recuperacionJunio;

import java.time.LocalDateTime;

public class AgendaMain {
    public static void main(String[] args) {
        ConexionBD conexionBD = new ConexionBD();
        try (var conn = conexionBD.obtenerConexion()) {
            CitaDAO citaDAO = new CitaDAO(conn);

            // Insertar una nueva cita
            Cita nuevaCita = new Cita("María González", "Dentista", LocalDateTime.of(2025, 6, 14, 16, 0));
            citaDAO.insertarCita(nuevaCita);

            // Consultar citas desde una fecha
            citaDAO.consultarCitasDesde(LocalDateTime.of(2025, 6, 12, 0, 0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

