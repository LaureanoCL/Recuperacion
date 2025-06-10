package Nivel3;

public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private double nota;

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public int compareTo(Alumno otro) {
        return Double.compare(this.nota, otro.nota);
    }

    @Override
    public String toString() {
        return nombre + " - Nota: " + nota;
    }
}

