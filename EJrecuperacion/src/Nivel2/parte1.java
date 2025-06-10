package Nivel2;

import java.util.ArrayList;
import java.util.Iterator;


public class parte1 {
	public static void main(String[] args) {
		
		ArrayList<String> palabras = new ArrayList<>();
		
		palabras.add("Letra");
		palabras.add("Palabra");
		palabras.add("Camion");
		palabras.add("Pedro");  
		palabras.add("Criterio");   
	
		Iterator<String> iterator = palabras.iterator();
		while (iterator.hasNext()) {
			String palabra = iterator.next();
			System.out.println(palabra.toUpperCase());
    }
    
	}
}
