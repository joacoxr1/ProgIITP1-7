public class NaveEspacial {

    private final String nombre;
    private int combustible;


    private static final int LIMITE_COMBUSTIBLE = 100;

    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = combustibleInicial;
    }

    public void despegar() {
        if (combustible >= 10) { 
            combustible -= 10;
            System.out.println("La nave " + nombre + " ha despegado");
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        int combustibleNecesario = distancia;
        if (combustible >= combustibleNecesario) {
            combustible -= combustibleNecesario;
            System.out.println("La nave " + nombre + " avanzo " + distancia + " km.");
        } else {
            System.out.println("Combustible insuficiente para avanzar " + distancia + " km.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if ((combustible + cantidad) <= LIMITE_COMBUSTIBLE) {
            combustible += cantidad;
            System.out.println("Combustible recargado. Cantidad actual: " + combustible);
        } else {
            System.out.println("La recarga supero el limite. La nave solo puede tener un maximo de " + LIMITE_COMBUSTIBLE + " unidades.");
            combustible = LIMITE_COMBUSTIBLE;
        }
    }

    public void mostrarEstado() {
        System.out.println("\n Estado de la Nave Espacial");
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + combustible + " unidades");
    }
}