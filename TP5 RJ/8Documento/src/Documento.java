public class Documento {

    private final String titulo;
    private final String contenido;
    private final FirmaDigital firma; 

    public Documento(String titulo, String contenido, String hashFirma, String fechaFirma, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(hashFirma, fechaFirma, usuario); 
    }

    public void mostrarInfoCompleta() {
        System.out.println("INFORMACION DEL DOCUMENTO");
        System.out.println("Titulo: " + titulo);
        System.out.println("Contenido (extracto): " + contenido.substring(0, Math.min(contenido.length(), 20)) + "...");
        
        if (firma != null) {
            System.out.println("Contiene Firma Digital:");
            System.out.println("-> " + firma.mostrarInfo());
        }
    }
}