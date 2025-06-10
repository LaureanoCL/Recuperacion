package Nivel3;

import java.util.*;

public class MainAlumno {
	public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Ana", 7.5));
        alumnos.add(new Alumno("Luis", 8.2));
        alumnos.add(new Alumno("Carlos", 6.9));
        alumnos.add(new Alumno("Bea", 9.0));
        alumnos.add(new Alumno("Diana", 7.0));

        System.out.println("Ordenado por nota:");
        Collections.sort(alumnos);
        alumnos.forEach(System.out::println);

        System.out.println("\nOrdenado por nombre:");
        alumnos.sort(Comparator.comparing(Alumno::getNombre));
        alumnos.forEach(System.out::println);
    }
}
