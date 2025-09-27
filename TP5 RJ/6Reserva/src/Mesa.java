public class Mesa {

    private final int numero;
    private final int capacidad;

    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public int getNumero() {
        return numero;
    }
    
    public String mostrarInfo() {
        return "Mesa N " + numero + " (Capacidad: " + capacidad + " personas)";
    }
}