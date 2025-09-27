public class Vehiculo {

    private final String patente;
    private final String modelo;
    
    private final Motor motor; 
    
    private Conductor conductor;


    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
    
    public String getPatente() {
        return patente;
    }
    
    public void mostrarInfoCompleta() {
        System.out.println(" INFORMACION DEL VEHICULO ");
        System.out.println("Patente: " + patente + ", Modelo: " + modelo);
        
        if (motor != null) {
            System.out.println("Tiene: " + motor.mostrarInfo());
        }
       
        if (conductor != null) {
            System.out.println("Conductor Asignado: " + conductor.getNombre() + " (Acceso a traves del Vehiculo)");
        }
    }
}