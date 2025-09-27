
package tp1ejercicio8;

import java.util.Scanner;

public class TP1Ejercicio8 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Ingresa el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = sc.nextInt();

    
        int divisionEntera = num1 / num2;
        System.out.println("División entera: " + divisionEntera);

        double divisionDecimal = (double) num1 / num2;
        System.out.println("División decimal: " + divisionDecimal);

        sc.close();
    }
    
}
