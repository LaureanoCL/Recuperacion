package Nivel5;

import java.util.*;


public class ordenarMap {
    public static void main(String[] args) {
        Map<String, Double> productos = new HashMap<>();
        
        productos.put("Piña", 3.00);
        productos.put("Melocoton", 0.90);
        productos.put("Naranja", 0.80);
        productos.put("Pera", 0.60);

        List<Map.Entry<String, Double>> listaEntradas = new ArrayList<>(productos.entrySet());

        listaEntradas.sort(Map.Entry.comparingByValue());

        System.out.println("Productos ordenados por precio:");
        for (Map.Entry<String, Double> entry : listaEntradas) {
            System.out.println("Producto: " + entry.getKey() + ", Precio: " + entry.getValue());
        }
    }
}

