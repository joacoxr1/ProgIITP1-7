public class Motor {

    private final String tipo;
    private final String numeroSerie;

    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public String mostrarInfo() {
        return "Motor Tipo: " + tipo + ", Serie: " + numeroSerie;
    }
}