public class Main {

    public static void main(String[] args) {

        System.out.println("GESTION DE PASAPORTE Y TITULAR");
        
        Titular titularPersona = new Titular("Julian Perez", "24798325");

        Pasaporte pasaporteViajero = new Pasaporte(
                987654,
                "26-09-2025",
                "img_jp.jpg",
                "JPEG"
        );
        
        pasaporteViajero.setTitular(titularPersona); 
        titularPersona.setPasaporte(pasaporteViajero); 

        pasaporteViajero.mostrarInfoCompleta();
        titularPersona.mostrarInfoCompleta();
    }
}