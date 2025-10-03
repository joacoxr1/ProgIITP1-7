package pkg5simspago;

public class Transferencia implements Pagable {
    private final String banco;

    public Transferencia(String banco) {
        this.banco = banco;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pago de $" + monto + " mediante Transferencia bancaria en " + banco);
    }
}
