public class Main {

    public static void main(String[] args) {

        Libro miLibro = new Libro();

        miLibro.setAnioPublicacion(2023); 

        System.out.println("Anio de publicacion inicial: " + miLibro.getAnioPublicacion());

        System.out.println("\n Intentando modificar el anio ");


        miLibro.setAnioPublicacion(-2022); 

        miLibro.setAnioPublicacion(2024);

        System.out.println("\n--- Informacion final del libro ---");
        System.out.println("Anio de publicacion final: " + miLibro.getAnioPublicacion());
    }
}