public class Reproductor {

    public void reproducir(Cancion cancion) {
        if (cancion != null) {
            System.out.println("Reproduciendo: " + cancion.mostrarInfo());
        } else {
            System.out.println("No se puede reproducir.");
        }
    }
}