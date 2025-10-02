import java.util.Scanner;

public class ClasificacionEdad {
    public static void main(String[] args) {
        try (Scanner string = new Scanner(System.in)) {
            System.out.print("Ingrese su edad: ");
            int edad = string.nextInt();
            
            if (edad < 12) {
                System.out.println("Nino.");
            } else if (edad >= 12 && edad <= 17) {
                System.out.println("Adolescente.");
            } else if (edad >= 18 && edad <= 59) {
                System.out.println("Adulto.");
            } else {
                System.out.println("Adulto mayor.");
            }
        }
    }
}
