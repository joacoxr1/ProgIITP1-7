public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anio) {
        if (anio > 0) { 
            this.anioPublicacion = anio;
            System.out.println("El anio de publicacion ha sido actualizado a: " + anio);
        } else {
            System.out.println("No se puede establecer un anio de publicacion invalido.");
        }
    }
}