public class Gallina {

    String idGallina;
    int edad;
    int huevosPuestos;

    public void ponerHuevo() {
        huevosPuestos = huevosPuestos + 1;
        System.out.println("La gallina " + idGallina + " ha puesto un huevo.");
    }

    public void envejecer() {
        edad = edad + 1;
        System.out.println("La gallina " + idGallina + " ha envejecido y ahora tiene " + edad + " anios.");
    }
    
    public void mostrarEstado() {
        System.out.println("\n Estado de la Gallina ");
        System.out.println("ID: " + idGallina);
        System.out.println("Edad: " + edad + " anios");
        System.out.println("Huevos puestos: " + huevosPuestos);
    }
}