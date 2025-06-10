package Nivel2;

import java.util.*;

public class parte3 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        
        numeros.add(8);
        numeros.add(5);
        numeros.add(14);
        numeros.add(3);
        numeros.add(11);
        numeros.add(20);
        numeros.add(29);
        numeros.add(21);
        numeros.add(4);

        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            int num = it.next();
            if (num % 2 != 0) {
                it.remove(); 
            }
        }

        System.out.println("Lista sin impares:");
        System.out.println(numeros);
    }
}
