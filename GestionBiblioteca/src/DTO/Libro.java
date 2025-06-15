package DTO;

public class Libro {
	    private int id;
	    private String titulo;
	    private int año;
	    private int idAutor;

	    public Libro() {}

	    public Libro(String titulo, int año, int idAutor) {
	        this.titulo = titulo;
	        this.año = año;
	        this.idAutor = idAutor;
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public int getAño() {
			return año;
		}

		public void setAño(int año) {
			this.año = año;
		}

		public int getIdAutor() {
			return idAutor;
		}

		public void setIdAutor(int idAutor) {
			this.idAutor = idAutor;
		}

	    
	}

