public class Autor {

    private final String nombre;
    private final String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String mostrarInfo() {
        return "Autor: " + nombre + " (" + nacionalidad + ")";
    }
}