public class Calculadora {

    public void calcular(Impuesto impuesto) {
        if (impuesto != null) {
            double montoConIntereses = impuesto.getMonto() * 1.25;
            System.out.println("Calculo realizado:");
            System.out.println("Impuesto Original: $" + impuesto.getMonto());
            System.out.println("Monto Final (con 25% de interes): $" + montoConIntereses);
            
            System.out.println("Datos de la deuda: " + impuesto.mostrarInfo());
        } else {
            System.out.println("No se puede calcular: Impuesto es nulo.");
        }
    }
}
