public class Main {

    public static void main(String[] args) {
        Motor motorNuevo = new Motor("Diesel", "ABC-98765");
        

        Conductor chofer = new Conductor("Julia Perez", "1124931");
        Vehiculo miAuto = new Vehiculo(
            "GHA-324", 
            "Toyota Corolla", 
            motorNuevo
        );
        
        miAuto.setConductor(chofer); 
        chofer.setVehiculo(miAuto); 

        // 5. Pruebas
        miAuto.mostrarInfoCompleta();
        chofer.mostrarDatosCompletos();
    }
}