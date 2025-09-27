public class Editorial {

    private final String nombre;
    private final String direccion;

    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String mostrarInfo() {
        return "Editorial: " + nombre + ", Dir: " + direccion;
    }
}