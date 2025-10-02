public class Main {

    public static void main(String[] args) {

        Usuario usuarioFirmante = new Usuario("Ricardo Diaz", "rdiaz@gmail.com");
       
        Documento contrato = new Documento(
            "Contrato Laboral", 
            "El presente documento establece:", 
            "RDiaZ",
            "27-09-2025", 
            usuarioFirmante 
        );
        
        contrato.mostrarInfoCompleta();
    }
}