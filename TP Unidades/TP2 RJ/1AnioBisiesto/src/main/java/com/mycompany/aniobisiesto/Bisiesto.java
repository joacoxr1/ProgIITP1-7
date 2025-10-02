/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aniobisiesto;


import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {

            System.out.print("Ingrese un año: ");
            int anio = entrada.nextInt();
            

            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                System.out.println("El año " + anio + " es bisiesto.");
            } else {
                System.out.println("El año " + anio + " no es bisiesto.");
            }
        }
    }
}
