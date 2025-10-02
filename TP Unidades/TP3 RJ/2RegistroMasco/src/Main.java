public class Main {

    public static void main(String[] args) {

        Mascota mascota1 = new Mascota();
        mascota1.nombre = "Apolo";
        mascota1.especie = "Gato";
        mascota1.edad = 3;

        mascota1.mostrarInfo();


        mascota1.cumplirAnios();
        
        System.out.println("\n Verificando la nueva informacion ");
        mascota1.mostrarInfo();
    }
}