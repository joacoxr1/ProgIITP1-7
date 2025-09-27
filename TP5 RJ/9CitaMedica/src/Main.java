public class Main {

    public static void main(String[] args) {

        Paciente pacienteNuevo = new Paciente("Lucia Rodriguez", "Nobis N400");
        Profesional medico = new Profesional("Dr Usedo Nicolas", "Cardiologia");

        CitaMedica turno = new CitaMedica(
            "20-11-2025", 
            "16:00", 
            pacienteNuevo, 
            medico
        );
        
        turno.mostrarInfoCompleta();
    }
}