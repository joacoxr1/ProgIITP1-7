package bibliotecaylibros;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Biblioteca {
    private final ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) return l;
        }
        return null;
    }

    public boolean eliminarLibro(String isbn) {
        Iterator<Libro> it = libros.iterator();
        while (it.hasNext()) {
            Libro l = it.next();
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> salida = new ArrayList<>();
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) salida.add(l);
        }
        return salida;
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("Autores disponibles en la biblioteca:");
        for (Libro l : libros) {
            l.getAutor().mostrarInfo();
        }
    }
}
