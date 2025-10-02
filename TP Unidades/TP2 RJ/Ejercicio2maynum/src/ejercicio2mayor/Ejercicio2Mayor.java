package ejercicio2mayor;

import java.util.Scanner;

public class Ejercicio2Mayor {

    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = string.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = string.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        int num3 = string.nextInt();

        int mayor;

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        // Mostrar el resultado
        System.out.println("El mayor es: " + mayor);

        entrada.close();
    }
}
