package universidadpc;

public class Curso {
    private final String codigo;
    private final String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor p) {
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }
        this.profesor = p;
        if (p != null && !p.getCursos().contains(this)) {
            p.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        System.out.print("Curso: " + codigo + " - " + nombre);
        if (profesor != null) {
            System.out.println(" Profesor: " + profesor.getId() + " - " + profesor.getNombre());
        } else {
            System.out.println(" Profesor: No asignado");
        }
    }
}

