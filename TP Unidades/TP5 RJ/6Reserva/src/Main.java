public class Main {

    public static void main(String[] args) {
        
        Cliente clienteNuevo = new Cliente("Ana Torres", "11-7016-8900");
        

        Mesa mesaOcupada = new Mesa(5, 4);


        Reserva reservaNoche = new Reserva(
            "5-10-2025", 
            "21:30", 
            clienteNuevo, 
            mesaOcupada
        );

        reservaNoche.mostrarInfoCompleta();
    }
}