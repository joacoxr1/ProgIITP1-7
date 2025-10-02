public class Main {

    public static void main(String[] args) {
        Proyecto proyectoFinal = new Proyecto("Promo Final", 5);
        EditorVideo editor = new EditorVideo(); 
        editor.exportar("MP4 H.264", proyectoFinal);
    }
}
