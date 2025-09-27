public class Cliente {

    private final String nombre;
    private final String telefono;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String mostrarInfo() {
        return "Cliente: " + nombre + ", Telefono: " + telefono;
    }
}