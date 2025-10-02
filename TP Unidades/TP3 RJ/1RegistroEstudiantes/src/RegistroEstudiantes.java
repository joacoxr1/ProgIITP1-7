public class RegistroEstudiantes {

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Joaquin";
        estudiante1.apellido = "Rodriguez";
        estudiante1.curso = "Sistemas Operativos";
        estudiante1.calificacion = 8.5;


        estudiante1.mostrarInfo();
        
        System.out.println("\n Tarea: Aumentar y disminuir calificacion ");
        
        estudiante1.subirCalificacion(1.0);
        
        estudiante1.bajarCalificacion(0.5);
    }
}