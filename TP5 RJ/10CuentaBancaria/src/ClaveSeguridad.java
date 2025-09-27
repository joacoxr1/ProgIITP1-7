public class ClaveSeguridad {

    private final String codigo;
    private final String ultimaModificacion;

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    public String mostrarInfo() {
        return "Clave: " + codigo + ", Ultima Modificacion: " + ultimaModificacion;
    }
}