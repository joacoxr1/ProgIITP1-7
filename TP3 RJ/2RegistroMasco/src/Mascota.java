public class Mascota {

    String nombre;
    String especie;
    int edad;

    public void mostrarInfo() {
        System.out.println("Informacion de la Mascota");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " anios");
    }

    public void cumplirAnios() {
        edad = edad + 1;
        System.out.println( nombre + " ha cumplido anios y  nueva edad es: " + edad);
    }
}