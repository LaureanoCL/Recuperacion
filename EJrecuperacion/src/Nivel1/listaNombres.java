package Nivel1;

import java.util.*;

public class listaNombres {

	public static void main(String[] args) {
		ArrayList<String> nom = new ArrayList<>();
		
		nom.add("Juan");
		nom.add("Maria");
		nom.add("Andrea");
		nom.add("Francisco");
		nom.add("Gabriel");
		
		for(String n : nom) {
			
			System.out.println(n);
		}
		
		for(int i = 0; i < nom.size(); i++) {
			
			
			System.out.println(nom.get(i));
		}
	}
}
