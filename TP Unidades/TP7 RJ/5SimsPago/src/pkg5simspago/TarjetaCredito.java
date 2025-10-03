package pkg5simspago;

public class TarjetaCredito implements Pagable {
    private final String numero;

    public TarjetaCredito(String numero) {
        this.numero = numero;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pago de $" + monto + " Tarjeta de Credito N " + numero);
    }
}
