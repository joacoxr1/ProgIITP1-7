import java.util.Scanner;

public class CostoEnvioCompra {

    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            System.out.println("Zona invalida. Se asigna costo 0.");
            return 0;
        }
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        try (Scanner string = new Scanner(System.in)) {
            System.out.print("Ingrese el precio del producto: ");
            double precioProducto = string.nextDouble();

            System.out.print("Ingrese el peso del paquete en kg: ");
            double peso = string.nextDouble();

            System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
            String zona = string.next();

            double costoEnvio = calcularCostoEnvio(peso, zona);
            double total = calcularTotalCompra(precioProducto, costoEnvio);

            System.out.println("El costo de envio es: " + costoEnvio);
            System.out.println("El total a pagar es: " + total);
        }
    }
}
