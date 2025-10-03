package pkg3empleadosypolimorfismo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Macarena", 120000));
        empleados.add(new EmpleadoTemporal("Luis", 20, 3000));

        for (Empleado e : empleados) {
            System.out.println(e.getNombre() + " - Sueldo: " + e.calcularSueldo());

            switch (e) {
                case EmpleadoPlanta empleadoPlanta -> {
                    System.out.println("Empleado de planta");
                    EmpleadoPlanta ep = empleadoPlanta;
                    System.out.println("Sueldo base: " + ep.calcularSueldo());
                    
                    
                }
                case EmpleadoTemporal empleadoTemporal -> {
                    System.out.println("Empleado temporal");
                    EmpleadoTemporal et = empleadoTemporal;
                    System.out.println(" Pago por dia: " + et.calcularSueldo());
                }
                default -> {
                }
            }
        }
    }
}


