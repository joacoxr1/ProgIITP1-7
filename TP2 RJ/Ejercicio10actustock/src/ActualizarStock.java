import java.util.Scanner;

public class ActualizarStock {

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    public static void main(String[] args) {
        try (Scanner string = new Scanner(System.in)) {
            System.out.print("Ingrese el stock actual del producto: ");
            int stockActual = string.nextInt();

            System.out.print("Ingrese la cantidad vendida: ");
            int cantidadVendida = string.nextInt();

            System.out.print("Ingrese la cantidad recibida: ");
            int cantidadRecibida = string.nextInt();

            int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
            System.out.println("El nuevo stock del producto es: " + nuevoStock);
        }
    }
}
