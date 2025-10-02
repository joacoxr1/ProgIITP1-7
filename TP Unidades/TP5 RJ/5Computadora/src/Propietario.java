public class Propietario {

    private final String nombre;
    private final String dni;
    
    private Computadora computadora; 

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void mostrarDatosCompletos() {
        System.out.println("\n INFORMACION DEL PROPIETARIO");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        
        if (computadora != null) {
            System.out.println("Posee Computadora Marca: " + computadora.getMarca() + " (Acceso a traves del Propietario)");
        } else {
            System.out.println("Computadora: No tiene una computadora asignada");
        }
    }
}