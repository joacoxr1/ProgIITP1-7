public class CodigoQR {
    private final String valor;
    private final Usuario usuario; 

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario; 
    }

    public void mostrarQR() {
        System.out.println("Codigo QR generado con valor: " + valor);
        if (usuario != null) {
            System.out.println("Para: " + usuario.mostrarInfo());
        }
    }
}