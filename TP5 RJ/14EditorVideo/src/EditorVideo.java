public class EditorVideo {

    public void exportar(String formato, Proyecto proyecto) {
        Render nuevoRender = new Render(formato, proyecto); 
        
        System.out.println(" Comenzado el proceso de exportacion...");
        nuevoRender.mostrarEstado();
    }
}