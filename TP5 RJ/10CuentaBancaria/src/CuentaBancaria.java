public class CuentaBancaria {

    private final String cbu;
    private final double saldo; 
    private final ClaveSeguridad clave; 
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo, String codigoClave, String fechaClave) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigoClave, fechaClave); 
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }
    
    public String getCbu() {
        return cbu;
    }
    
    public void mostrarInfoCompleta() {
        System.out.println("INFORMACION DE LA CUENTA BANCARIA");
        System.out.println("CBU: " + cbu + ", Saldo: $" + saldo);
        
        if (clave != null) {
            System.out.println("Seguridad: " + clave.mostrarInfo());
        }
        
        if (titular != null) {
            System.out.println("Titular: " + titular.getNombre() + " (Acceso a traves de la Cuenta)");
        }
    }
}