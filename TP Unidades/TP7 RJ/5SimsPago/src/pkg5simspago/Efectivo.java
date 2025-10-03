package pkg5simspago;

public class Efectivo implements Pagable {
    @Override
    public void pagar(double monto) {
        System.out.println("Pago de $" + monto + " en efectivo");
    }
}
