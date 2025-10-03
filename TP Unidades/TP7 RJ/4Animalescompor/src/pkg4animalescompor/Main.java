package pkg4animalescompor;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Baco: "));
        animales.add(new Gato("Apolo: "));
        animales.add(new Vaca("Lola: "));

        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido(); 
        }
    }
}
