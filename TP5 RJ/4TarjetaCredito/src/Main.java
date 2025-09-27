public class Main {

    public static void main(String[] args) {

        Banco bancoEmisor = new Banco("Banco Central", "30-12345678-9");
        
        Cliente clienteNuevo = new Cliente("Martin Sosa", "28987654");

        TarjetaDeCredito miTarjeta = new TarjetaDeCredito(
            "4560-1234-5678-9012", 
            "12/2028", 
            bancoEmisor
        );
        
        miTarjeta.setCliente(clienteNuevo); 
        clienteNuevo.setTarjeta(miTarjeta); 
        miTarjeta.mostrarInfoCompleta();
        clienteNuevo.mostrarDatosCompletos();
    }
}