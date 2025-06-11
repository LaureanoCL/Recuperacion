package recuperacionJunio;

import java.time.LocalDateTime;

public class Cita {
	String nombre;
	String descripcion;
	LocalDateTime fecha;
	
	public Cita(String nombre, String descripcion, LocalDateTime localDateTime) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fecha = localDateTime;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
}
