public class TarjetaDeCredito {

    private final String numero;
    private final String fechaVencimiento;
    private final Banco banco; 
    
    private Cliente cliente;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco; 
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public String getNumero() {
        return numero;
    }
    
    public void mostrarInfoCompleta() {
        System.out.println("INFORMACION DE LA TARJETA");
        System.out.println("Numero: " + numero + ", Vencimiento: " + fechaVencimiento);
        
        if (banco != null) {
            System.out.println("Emitida por: " + banco.mostrarInfo());
        }
        
        if (cliente != null) {
            System.out.println("Titular: " + cliente.getNombre() + " (Acceso a traves de la Tarjeta)");
        }
    }
}
