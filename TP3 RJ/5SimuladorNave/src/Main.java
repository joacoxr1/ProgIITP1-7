public class Main {

    public static void main(String[] args) {

        NaveEspacial nave1 = new NaveEspacial("Explorador", 50);

        System.out.println("--- Prueba 1: Avanzar 30 km sin recargar ");
        nave1.avanzar(30);
        nave1.mostrarEstado();

        System.out.println("\n Prueba 2: Recargar y avanzar 30 km ");
        nave1.recargarCombustible(50);
        nave1.avanzar(30);
        nave1.mostrarEstado();


        System.out.println("\n Prueba 3: Recargar mas del limite ");
        nave1.recargarCombustible(100);
        nave1.mostrarEstado();
    }
}
