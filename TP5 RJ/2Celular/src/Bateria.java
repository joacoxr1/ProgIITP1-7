public class Bateria {

    private final String modelo;
    private final int capacidad; // en mAh

    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }
    
    public String mostrarInfo() {
        return "Bateria Modelo: " + modelo + ", Capacidad: " + capacidad + "mAh";
    }
}