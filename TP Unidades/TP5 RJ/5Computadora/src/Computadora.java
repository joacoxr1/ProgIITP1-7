public class Computadora {

    private final String marca;
    private final String numeroSerie;
    private final PlacaMadre placaMadre; 
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipsetPlaca) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipsetPlaca); 
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void mostrarInfoCompleta() {
        System.out.println("INFORMACION DE LA COMPUTADORA");
        System.out.println("Marca: " + marca + ", Numero de Serie: " + numeroSerie);
        
        if (placaMadre != null) {
            System.out.println("Contiene: " + placaMadre.mostrarInfo());
        }
        
        if (propietario != null) {
            System.out.println("Asignada a: " + propietario.getNombre() + " (Acceso a traves de la Computadora)");
        }
    }
}