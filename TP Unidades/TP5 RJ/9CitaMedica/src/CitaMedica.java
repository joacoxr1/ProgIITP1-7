public class CitaMedica {

    private final String fecha;
    private final String hora;
    private final Paciente paciente; 
    private final Profesional profesional; 

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente; 
        this.profesional = profesional; 
    }

    public void mostrarInfoCompleta() {
        System.out.println("INFORMACION DE LA CITA MEDICA");
        System.out.println("Fecha: " + fecha + ", Hora: " + hora);
        
        if (paciente != null) {
            System.out.println(paciente.mostrarInfo());
        }
        
        if (profesional != null) {
            System.out.println(profesional.mostrarInfo());
        }
    }
}