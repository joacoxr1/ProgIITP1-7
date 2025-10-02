package universidadpc;

public class UniversidadPC {
    public static void main(String[] args) {
        Universidad uni = new Universidad("UTN");

        Profesor p1 = new Profesor("P1", "Miguel Montoya", "Matematica");
        Profesor p2 = new Profesor("P2", "Ana Suarez", "Programacion");
        Profesor p3 = new Profesor("P3", "Luis Molina", "Ingles");

        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        Curso c1 = new Curso("C101", "Algebra");
        Curso c2 = new Curso("C102", "Phyton I");
        Curso c3 = new Curso("C103", "Bases de Datos");
        Curso c4 = new Curso("C104", "Ingles I");
        Curso c5 = new Curso("C105", "Estructuras de Datos");

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        uni.asignarProfesorACurso("C101", "P1");
        uni.asignarProfesorACurso("C102", "P2");
        uni.asignarProfesorACurso("C103", "P2");
        uni.asignarProfesorACurso("C104", "P3");
        uni.asignarProfesorACurso("C105", "P1");

        System.out.println(" Listado de cursos ");
        uni.listarCursos();
        System.out.println("\n Listado de profesores ");
        uni.listarProfesores();

        System.out.println("\n Cambiar profesor del curso C103 a P3...");
        uni.asignarProfesorACurso("C103", "P3");
        uni.listarCursos();

  
        System.out.println("\n Eliminar curso C102...");
        uni.eliminarCurso("C102");
        uni.listarCursos();
       
        System.out.println("\n Eliminar profesor P1...");
        uni.eliminarProfesor("P1");
        uni.listarCursos();
    }
}


