package bibliotecaylibros;

public class BibliotecaYlibros {
    public static void main(String[] args) {
        Biblioteca biblio = new Biblioteca("Biblioteca Central");

        Autor a1 = new Autor("A1", "Gabriel Garcia Marquez", "Colombiana");
        Autor a2 = new Autor("A2", "J. K. Rowling", "Britanica");
        Autor a3 = new Autor("A3", "Julio Cortazar", "Argentina");


        biblio.agregarLibro("ISBN001", "Cien Anios de Soledad", 1967, a1);
        biblio.agregarLibro("ISBN002", "Harry Potter y la piedra filosofal", 1997, a2);
        biblio.agregarLibro("ISBN003", "Rayuela", 1963, a3);
        biblio.agregarLibro("ISBN004", "Harry Potter y la camara secreta", 1998, a2);
        biblio.agregarLibro("ISBN005", "El amor en los tiempos del colera", 1985, a1);

 
        System.out.println("\n Listado de libros: ");
        biblio.listarLibros();


        System.out.println("\n Buscar libro ISBN002 ");
        Libro buscado = biblio.buscarLibroPorIsbn("ISBN002");
        if (buscado != null) buscado.mostrarInfo();

  
        System.out.println("\n  Libros publicados en 1997 ");
        for (Libro l : biblio.filtrarLibrosPorAnio(1997)) l.mostrarInfo();

        System.out.println("\n Eliminar ISBN003 ");
        boolean elim = biblio.eliminarLibro("ISBN003");
        System.out.println("Eliminado: " + elim);

        System.out.println("Listado tras eliminacion:");
        biblio.listarLibros();

        System.out.println("\n Cantidad total de libros ");
        System.out.println(biblio.obtenerCantidadLibros());

        System.out.println("\n Autores disponibles ");
        biblio.mostrarAutoresDisponibles();

    }
}

