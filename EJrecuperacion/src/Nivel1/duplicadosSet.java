package Nivel1;

import java.util.*;


public class duplicadosSet {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("Pedro");
		set.add("Pablo");
		set.add("Paloma");
		set.add("Pedro");   //duplicado
		set.add("Pilar");
		set.add("Paloma");  //duplicado
		set.add("Pedro");   //duplicado
		
		System.out.println("Cantidad de elementos en el HashSet: " + set.size());
	}

}
