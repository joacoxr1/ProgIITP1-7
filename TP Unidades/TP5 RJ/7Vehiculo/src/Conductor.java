public class Conductor {

    private final String nombre;
    private final String licencia;
    private Vehiculo vehiculo; 

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }
    
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void mostrarDatosCompletos() {
        System.out.println("\n INFORMACION DEL CONDUCTOR");
        System.out.println("Nombre: " + nombre);
        System.out.println("Licencia: " + licencia);
        
        if (vehiculo != null) {
            System.out.println("Asignado a Vehiculo Patente: " + vehiculo.getPatente() + " (Acceso a traves del Conductor)");
        } else {
            System.out.println("Vehículo: No tiene un vehículo asignado");
        }
    }
}