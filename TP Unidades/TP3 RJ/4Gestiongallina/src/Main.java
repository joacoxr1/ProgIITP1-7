public class Main {

    public static void main(String[] args) {

        Gallina gallina1 = new Gallina();
        gallina1.idGallina = "Gallina A";
        gallina1.edad = 1;
        gallina1.huevosPuestos = 0;

        Gallina gallina2 = new Gallina();
        gallina2.idGallina = "Gallina B";
        gallina2.edad = 2;
        gallina2.huevosPuestos = 3;

        System.out.println("Simular accion ");
        gallina1.ponerHuevo();
        gallina1.envejecer();
        gallina2.ponerHuevo();

        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
}