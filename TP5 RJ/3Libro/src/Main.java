public class Main {

    public static void main(String[] args) {

        Autor autorNuevo = new Autor("Gabriel Garcia Marquez", "Colombiana");
        

        Editorial editorialNueva = new Editorial("Sudamericana", "Av. Corrientes 532");

        Libro libroMagico = new Libro(
            "Cien anios de soledad", 
            "978-0307474474", 
            autorNuevo, 
            editorialNueva
        );

        libroMagico.mostrarInfoCompleta();
    }
}