package Nivel2;

import java.util.ArrayList;
import java.util.Iterator;

public class parte2 {
	public static void main(String[] args) {
		
		ArrayList<String> palabras = new ArrayList<>();
		
		palabras.add("Letra");
		palabras.add("Palabra");
		palabras.add("Anselmo");   
		palabras.add("Camion");
		palabras.add("Pedro");  
		palabras.add("Oblicuo");   
		palabras.add("Utopia");   
		palabras.add("Criterio");   
		palabras.add("Oro");   
	
        Iterator<String> iterator = palabras.iterator();
        while (iterator.hasNext()) {
            String palabra = iterator.next();
            char firstChar = Character.toUpperCase(palabra.charAt(0));
            if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
                iterator.remove();
            }
        }
        while (iterator.hasNext()) {
            String palabra = iterator.next();
            System.out.println(palabra);
    
	}
        
	}
}
