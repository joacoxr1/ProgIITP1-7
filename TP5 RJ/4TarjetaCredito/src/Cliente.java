public class Cliente {

    private final String nombre;
    private final String dni;
    private TarjetaDeCredito tarjeta; 

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void mostrarDatosCompletos() {
        System.out.println("\n INFORMACION DEL CLIENTE");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        
        if (tarjeta != null) {
            System.out.println("Tiene Tarjeta Num: " + tarjeta.getNumero() + " (Acceso a traves del Cliente)");
        } else {
            System.out.println("Tarjeta: No tiene una tarjeta asignada");
        }
    }
}