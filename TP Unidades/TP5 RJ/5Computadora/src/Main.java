public class Main {

    public static void main(String[] args) {

        Propietario pablo = new Propietario("Pablo Gomez", "35610213");
        
        Computadora pcPablo = new Computadora(
            "HP", 
            "PC-4590X", 
            "MSI Z590-A",
            "Intel Z590"       
        );
        
        pcPablo.setPropietario(pablo); 
        pablo.setComputadora(pcPablo); 
        pcPablo.mostrarInfoCompleta();
        pablo.mostrarDatosCompletos();
    }
}