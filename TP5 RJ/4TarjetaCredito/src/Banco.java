public class Banco {

    private final String nombre;
    private final String cuit;

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String mostrarInfo() {
        return "Banco: " + nombre + ", CUIT: " + cuit;
    }
}