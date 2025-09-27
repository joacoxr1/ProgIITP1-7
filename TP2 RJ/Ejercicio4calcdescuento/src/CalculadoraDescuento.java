import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {
        try (Scanner string = new Scanner(System.in)) {
            System.out.print("Ingrese el precio del producto: ");
            double precio = string.nextDouble();

            System.out.print("Ingrese la categoria del producto (A, B o C): ");
            String categoria = string.next();

            double descuento = 0;

            if (categoria.equalsIgnoreCase("A")) {
                descuento = 10;
            } else if (categoria.equalsIgnoreCase("B")) {
                descuento = 15;
            } else if (categoria.equalsIgnoreCase("C")) {
                descuento = 20;
            } else {
                System.out.println("Categoria no valida.");
            }

            if (descuento > 0) {
                double precioFinal = precio - (precio * descuento / 100);
                System.out.println("Descuento aplicado: " + descuento + "%");
                System.out.println("Precio final: " + precioFinal);
            }
        }
    }
}
