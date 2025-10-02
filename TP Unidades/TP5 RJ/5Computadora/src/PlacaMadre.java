public class PlacaMadre {

    private final String modelo;
    private final String chipset;

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    public String getModelo() {
        return modelo;
    }
    
    public String mostrarInfo() {
        return "PlacaMadre Modelo: " + modelo + ", Chipset: " + chipset;
    }
}