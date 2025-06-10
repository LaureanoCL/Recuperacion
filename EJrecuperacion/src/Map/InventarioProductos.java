package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventarioProductos {

    private static HashMap<String, Integer> inventario = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1 -> anadirProducto();
                case 2 -> actualizarStock();
                case 3 -> mostrarCantidadProducto();
                case 4 -> mostrarStockTotal();
                case 5 -> eliminarProducto();
                case 6 -> mostrarProductoMayorStock();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("""
                \nSeleccione una opción:
                1. Añadir producto
                2. Actualizar stock
                3. Mostrar cantidad de un producto
                4. Mostrar stock total
                5. Eliminar producto
                6. Mostrar producto con mayor stock
                0. Salir""");
    }

    private static void anadirProducto() {
        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Cantidad: ");
        int cantidad = Integer.parseInt(scanner.nextLine());
        if (inventario.containsKey(nombre)) {
            System.out.println("El producto ya existe. Use la opción de actualizar stock.");
        } else {
            inventario.put(nombre, cantidad);
            System.out.println("Producto añadido.");
        }
    }

    private static void actualizarStock() {
        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();
        if (inventario.containsKey(nombre)) {
            System.out.print("Cantidad a sumar/restar (negativo para restar): ");
            int cantidad = Integer.parseInt(scanner.nextLine());
            int nuevaCantidad = inventario.getOrDefault(nombre, 0) + cantidad;
            if (nuevaCantidad < 0) nuevaCantidad = 0;
            inventario.put(nombre, nuevaCantidad);
            System.out.println("Stock actualizado.");
        } else {
            System.out.println("El producto no existe.");
        }
    }

    private static void mostrarCantidadProducto() {
        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();
        if (inventario.containsKey(nombre)) {
            System.out.println("Cantidad disponible: " + inventario.get(nombre));
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void mostrarStockTotal() {
        int total = 0;
        for (int cantidad : inventario.values()) {
            total += cantidad;
        }
        System.out.println("Stock total en inventario: " + total);
    }

    private static void eliminarProducto() {
        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();
        if (inventario.remove(nombre) != null) {
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void mostrarProductoMayorStock() {
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }
        Map.Entry<String, Integer> maxEntry = null;
        for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        System.out.println("Producto con mayor stock: " + maxEntry.getKey() + " (" + maxEntry.getValue() + " unidades)");
    }
}
