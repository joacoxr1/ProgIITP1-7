public class Celular {

    private final String imei;
    private final String marca;
    private final String modelo;
    

    private final Bateria bateria; 
    

    private Usuario usuario;


    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }


    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void mostrarInfoCompleta() {
        System.out.println("INFORMACION DEL CELULAR");
        System.out.println("IMEI: " + imei + ", Marca: " + marca + ", Modelo: " + modelo);
        
        if (bateria != null) {
            System.out.println("Contiene: " + bateria.mostrarInfo());
        }
        
        if (usuario != null) {
            System.out.println("Asignado a: " + usuario.getNombre() + " (Acceso a traves del Celular)");
        }
    }
}