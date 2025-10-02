public class Pasaporte {

    private final int numero;
    private final String fechaEmision;

    private final Foto foto; 
    
    private Titular titular;

    public Pasaporte(int numero, String fechaEmision, String nombreImagen, String formatoFoto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        
        this.foto = new Foto(nombreImagen, formatoFoto); 
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
    }
    
    public int getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }
    
    public void mostrarInfoCompleta() {
        System.out.println("INFORMACION DEL PASAPORTE ");
        System.out.println("Numero: " + numero);
        System.out.println("Emision: " + fechaEmision);
        System.out.println("Foto: " + foto.mostrarInfo());
        
        if (titular != null) {
            System.out.println("Titular: " + titular.getNombre() + " (Acceso a traves del Pasaporte)");
        } else {
            System.out.println("Titular: No asignado");
        }
    }
}