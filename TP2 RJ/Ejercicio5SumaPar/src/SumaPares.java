import java.util.Scanner;

public class SumaPares {
    public static void main(String[] args) {
        try (Scanner string = new Scanner(System.in)) {
            int numero;
            int suma = 0;

            do {
                System.out.print("Ingrese un numero (0 para terminar): ");
                numero = string.nextInt();

                if (numero != 0 && numero % 2 == 0) {
                    suma += numero;
                }
            } while (numero != 0);

            System.out.println("La suma de los numeros pares es: " + suma);
        }
    }
}

