public class Contribuyente {

    private final String nombre;
    private final String cuil;

    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    public String mostrarInfo() {
        return "Contribuyente: " + nombre + ", CUIL: " + cuil;
    }
}
