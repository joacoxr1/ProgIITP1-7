package pkg5simspago;

public class Main {

    public static void procesarPago(Pagable medio, double monto) {
        medio.pagar(monto);
    }

    public static void main(String[] args) {
        Pagable pago1 = new TarjetaCredito("4583-3193-8816");
        Pagable pago2 = new Transferencia("Banco Nacion");
        Pagable pago3 = new Efectivo();

        procesarPago(pago1, 5000);
        procesarPago(pago2, 12000);
        procesarPago(pago3, 2000);
    }
}
