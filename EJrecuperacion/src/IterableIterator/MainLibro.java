package IterableIterator;

public class MainLibro {
    public static void main(String[] args) {
        CatalogoLibros catalogo = new CatalogoLibros();
        catalogo.agregarLibro(new Libro("El Quijote", "Cervantes", 1605));
        catalogo.agregarLibro(new Libro("Harry Potter", "J.K. Rowling", 2001));
        catalogo.agregarLibro(new Libro("El Código Da Vinci", "Dan Brown", 2003));

        System.out.println("Todos los libros:");
        for (Libro libro : catalogo) {
            System.out.println(libro);
        }
    }
}

