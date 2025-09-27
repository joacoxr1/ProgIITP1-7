public class Main {

    public static void main(String[] args) {

        System.out.println("GESTION DE REPRODUCTOR Y CANCIONES");

        Artista DJProductor = new Artista("Paul Van Dyk", "ElectroTrance");
        
        Cancion cancionExitosa = new Cancion("Nothing But You", DJProductor);
        Reproductor reproductor = new Reproductor(); 
        

        System.out.println("\n Prueba de Dependencia ");
        reproductor.reproducir(cancionExitosa);
    }
}