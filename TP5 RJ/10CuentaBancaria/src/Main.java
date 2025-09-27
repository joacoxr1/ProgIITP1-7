public class Main {

    public static void main(String[] args) {
        
        Titular titularCuenta = new Titular("Andrea Garcia", "29123456");
        CuentaBancaria cuenta1 = new CuentaBancaria(
            "02300325242301", 
            55400.50, 
            "1374", 
            "20-09-2025"       
        );
        
        cuenta1.setTitular(titularCuenta); 
        titularCuenta.setCuenta(cuenta1); 
        cuenta1.mostrarInfoCompleta();
        System.out.println();
        titularCuenta.mostrarDatosCompletos();
    }
}
