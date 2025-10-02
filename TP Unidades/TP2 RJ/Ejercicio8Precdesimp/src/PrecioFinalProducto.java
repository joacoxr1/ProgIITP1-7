import java.util.Scanner;

public class PrecioFinalProducto {

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto / 100) - (precioBase * descuento / 100);
    }

    public static void main(String[] args) {
        try (Scanner string = new Scanner(System.in)) {
            System.out.print("Ingrese el precio base del producto: ");
            double precioBase = string.nextDouble();

            System.out.print("Ingrese el impuesto en porcentaje : ");
            double impuesto = string.nextDouble();

            System.out.print("Ingrese el descuento en porcentaje : ");
            double descuento = string.nextDouble();

            double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
            System.out.println("El precio final del producto es: " + precioFinal);
        }
    }
}
