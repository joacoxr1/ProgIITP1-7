public class Artista {

    private final String nombre;
    private final String genero;

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String mostrarInfo() {
        return "Artista: " + nombre + ", Genero: " + genero;
    }
}