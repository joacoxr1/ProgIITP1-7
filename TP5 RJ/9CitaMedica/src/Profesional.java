public class Profesional {

    private final String nombre;
    private final String especialidad;

    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String mostrarInfo() {
        return "Profesional: " + nombre + ", Especialidad: " + especialidad;
    }
}