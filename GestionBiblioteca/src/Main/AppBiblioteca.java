package Main;

import DAO.AutorDAO;
import DAO.LibroDAO;
import DTO.Autor;
import DTO.Libro;
import java.util.*;

public class AppBiblioteca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AutorDAO autorDAO = new AutorDAO();
        LibroDAO libroDAO = new LibroDAO();
        int opcion;

        do {
            System.out.println("\n=== Gestión de Biblioteca ===");
            System.out.println("1. Insertar autor");
            System.out.println("2. Ver autores");
            System.out.println("3. Insertar libro");
            System.out.println("4. Ver libros");
            System.out.println("5. Modificar título de un libro");
            System.out.println("6. Eliminar un libro");
            System.out.println("0. Salir");
            System.out.println("Seleccione opción: ");
            opcion = sc.nextInt(); 
            sc.nextLine();

                switch (opcion) {
                    case 1 -> {
                        System.out.print("Nombre del autor: ");
                        String nombre = sc.nextLine();
                        System.out.print("País del autor: ");
                        String pais = sc.nextLine();
                        autorDAO.insertarAutores(new Autor(nombre, pais));
                    }
                    case 2 -> {
                        for (Autor a : autorDAO.obtenerAutores()) {
                            System.out.println("ID: " + a.getId() + ": " + a.getNombre() + " (" + a.getPais() + ")");
                        }
                    }
                    case 3 -> {
                        System.out.print("Título del libro: ");
                        String titulo = sc.nextLine();
                        System.out.print("Año: ");
                        int año = sc.nextInt();
                        System.out.print("ID del autor: ");
                        int idAutor = sc.nextInt(); 
                        sc.nextLine();
                        libroDAO.insertarLibro(new Libro(titulo, año, idAutor));
                    }
                    case 4 -> {
                        for (Libro l : libroDAO.obtenerLibros()) {
                            System.out.println("ID: " + l.getId() + ": " + l.getTitulo() + " (" + l.getAño() + "), ID del autor: " + l.getIdAutor());
                        }
                    }
                    case 5 -> {
                        System.out.print("ID del libro a modificar: ");
                        int id = sc.nextInt(); sc.nextLine();
                        System.out.print("Nuevo título: ");
                        String nuevoTitulo = sc.nextLine();
                        libroDAO.modificarTitulo(id, nuevoTitulo);
                    }
                    case 6 -> {
                        System.out.print("ID del libro a eliminar: ");
                        int id = sc.nextInt(); sc.nextLine();
                        libroDAO.eliminarLibro(id);
                    }
                    case 0 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opción inválida.");
                }
        } while (opcion != 0);
    }
}

