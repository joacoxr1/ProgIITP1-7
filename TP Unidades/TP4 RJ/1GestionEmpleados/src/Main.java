public class Main {

    public static void main(String[] args) {

        System.out.println("gestion de empleados");
        
        Empleado emp1 = new Empleado(101, "Hernan Rodriguez", "Gerente", 75000.0);
        
        Empleado emp2 = new Empleado("Sandra Alvarez", "Analista");

        System.out.println("\n Aplicando aumentos de salario ");

        emp1.actualizarSalario(10.0); 
       
        emp2.actualizarSalario(2500); 
        System.out.println("\n Mostrando informacion de los empleados ");
        System.out.println("Estado de emp1: " + emp1.toString());
        System.out.println("Estado de emp2: " + emp2.toString());
        System.out.println("\n Mostrando total de empleados ");
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}
