package Nivel4;

import java.util.*;

public class MainTreeSet {
    public static void main(String[] args) {
        Comparator<Alumno> comp = Comparator.comparingDouble(Alumno::getNota).reversed()
                .thenComparing(Alumno::getNombre);

        Set<Alumno> conjunto = new TreeSet<>(comp);

        conjunto.add(new Alumno("Ana", 8.5));
        conjunto.add(new Alumno("Bernardo", 8.5));
        conjunto.add(new Alumno("Luis", 9.2));
        conjunto.add(new Alumno("Carlos", 7.8));

        conjunto.forEach(System.out::println);
    }
}
