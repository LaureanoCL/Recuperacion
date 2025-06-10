package Nivel4;

import java.util.*;

public class MainAlumnos {
    public static void main(String[] args) {
        List<Alumno> alumnos = Arrays.asList(
            new Alumno("Ana", 8.5),
            new Alumno("Bernardo", 8.5),
            new Alumno("Luis", 9.2),
            new Alumno("Carlos", 7.8)
        );
        
        System.out.println("Ordenado por longitud de nombre:");
        alumnos.sort(Comparator.comparingInt(a -> a.getNombre().length()));

        alumnos.forEach(System.out::println);

        System.out.println("Ordenar por nota y luego alfabeticamente:");
        alumnos.sort(Comparator.comparingDouble(Alumno::getNota).reversed()
                .thenComparing(Alumno::getNombre));

        alumnos.forEach(System.out::println);
    }
}
