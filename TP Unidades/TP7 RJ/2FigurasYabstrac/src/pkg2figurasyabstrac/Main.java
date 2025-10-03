package pkg2figurasyabstrac;

public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[2];
        figuras[0] = new Circulo("Circulo", 5);
        figuras[1] = new Rectangulo("Rectangulo", 4, 6);

        for (Figura f : figuras) {
            System.out.println(f.getNombre() + " - area: " + f.calcularArea());
        }
    }
}
