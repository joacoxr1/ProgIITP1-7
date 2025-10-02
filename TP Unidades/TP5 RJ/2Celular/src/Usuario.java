public class Usuario {

    private final String nombre;
    private final String dni;
    

    private Celular celular; 

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void mostrarDatosCompletos() {
        System.out.println("\n INFORMACION DEL USUARIO");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        
        if (celular != null) {
            System.out.println("Tiene Celular Marca: " + celular.getMarca() + " (Acceso a traves del Usuario)");
        } else {
            System.out.println("Celular: No tiene un celular asignado");
        }
    }
}