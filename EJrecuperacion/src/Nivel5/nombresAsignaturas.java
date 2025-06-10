package Nivel5;

import java.util.*;

public class nombresAsignaturas {

	   public static void main(String[] args) {
	        Map<String, List<String>> asignaturas = new HashMap<>();

	        asignaturas.put("Matemáticas", Arrays.asList("Juan", "María", "Pedro"));
	        asignaturas.put("Historia", Arrays.asList("María", "Ana", "Pedro"));
	        asignaturas.put("Ciencias", Arrays.asList("Juan", "Ana", "Luis"));

	        Map<String, Integer> contadorEstudiantes = new HashMap<>();

	        for (List<String> estudiantes : asignaturas.values()) {
	            for (String estudiante : estudiantes) {
	                contadorEstudiantes.put(estudiante, contadorEstudiantes.getOrDefault(estudiante, 0) + 1);
	            }
	        }

	        System.out.println("Estudiantes en varias asignaturas:");
	        for (Map.Entry<String, Integer> entry : contadorEstudiantes.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println("Estudiante: " + entry.getKey() + ", Asignaturas: " + entry.getValue());
	            }
	        }
	    }

}
