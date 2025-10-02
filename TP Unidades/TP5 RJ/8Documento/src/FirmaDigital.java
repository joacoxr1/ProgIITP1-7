public class FirmaDigital {

    private final String codigoHash;
    private final String fecha;
    private final Usuario usuario; 


    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario; 
    }

    public String mostrarInfo() {
        String info = "Firma Hash: " + codigoHash + ", Fecha: " + fecha;
        if (usuario != null) {
            info += " | " + usuario.mostrarInfo();
        }
        return info;
    }
}