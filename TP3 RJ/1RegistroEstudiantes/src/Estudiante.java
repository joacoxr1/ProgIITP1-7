public class Estudiante {

    String nombre;
    String apellido;
    String curso;
    double calificacion;

    public void mostrarInfo() {
        System.out.println("Informacion del Estudiante ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }

    // Subir y bajar calificaciones
    public void subirCalificacion(double puntos) {
        calificacion = calificacion + puntos;
        System.out.println("Calificacion subida a: " + calificacion);
    }

    public void bajarCalificacion(double puntos) {
        calificacion = calificacion - puntos;
        System.out.println("Calificacion bajada a: " + calificacion);
    }
}