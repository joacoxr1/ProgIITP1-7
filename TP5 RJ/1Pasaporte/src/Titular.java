public class Titular {

    private final String nombre; 
    private final String dni;
    private Pasaporte pasaporte;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
    
    public void mostrarInfoCompleta() {
        System.out.println("\n INFORMACION DEL TITULAR");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        
        if (pasaporte != null) {
            System.out.println("Pasaporte Num: " + pasaporte.getNumero() + " (Acceso a traves del Titular)");
        } else {
            System.out.println("Pasaporte: No tiene un pasaporte asignado");
        }
    }
}