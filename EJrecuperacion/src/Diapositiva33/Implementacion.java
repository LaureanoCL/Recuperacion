package Diapositiva33;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Implementacion {
	public static void main(String[] args) {
		ArrayList<Object> instituto = new ArrayList<>();
		
		instituto.add(new Alumno("Pep", "222A", 25));
		instituto.add(new Alumno(null, "111A", 20));
		instituto.add(new Alumno("Jon", "444A", 21));
		instituto.add(new Alumno("Tim", "333A", 19));
		instituto.add(new Alumno("Ada", "555A", 18));
		instituto.add(new Docente("Kal", 5, 2000));
		instituto.add(new Docente("Ana", 15, 3000));
		instituto.add(new Docente("Sam", 2, 1800));
		instituto.add(new Docente("Pol", 8, 2500));
		instituto.add(new Docente(null, 10, 2700));
		
		System.out.println("Alumnos y docentes ordenados por nombre");
		Collections.sort(instituto, new NombreComparator());
		System.out.println(instituto);
    }
}
