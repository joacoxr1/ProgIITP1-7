public class Main {

    public static void main(String[] args) {

        Usuario usuarioAPP = new Usuario("Fernando Garcia", "fgarcia@gmail.com");
       
        GeneradorQR generador = new GeneradorQR(); 
       
        generador.generar("url:app.com/fg234", usuarioAPP);
    }
}