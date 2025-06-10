package IterableIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CatalogoLibros implements Iterable<Libro> {
    private List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    @Override
    public Iterator<Libro> iterator() {
        return libros.iterator();
    }
}
