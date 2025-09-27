public class Main {

    public static void main(String[] args) {
        Contribuyente persona = new Contribuyente("Leandro Montoya", "20-15478963-2");
        
        Impuesto deuda = new Impuesto(4500.0, persona);

        Calculadora calc = new Calculadora(); 
       
        calc.calcular(deuda);
    }
}