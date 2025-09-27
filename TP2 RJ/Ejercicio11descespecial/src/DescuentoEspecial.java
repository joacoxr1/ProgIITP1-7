import java.util.Scanner;

public class DescuentoEspecial {

    // Variable global para el descuento (10%)
    static double DESCUENTO = 0.10;

    public static void calcularDescuentoEspecial(double precio) {
        // Variable local para el descuento aplicado
        double descuentoAplicado = precio * DESCUENTO;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static void main(String[] args) {
        try (Scanner string = new Scanner(System.in)) {
            System.out.print("Ingrese el precio del producto: ");
            double precio = string.nextDouble();

            calcularDescuentoEspecial(precio);
        }
    }
}
