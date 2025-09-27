public class Main {

    public static void main(String[] args) {

        Bateria miBateria = new Bateria("Li-Ion 5000", 5000);
        

        Usuario usuarioA = new Usuario("Sofia Lopez", "30123456");


        Celular celularSofia = new Celular("3515202193", "Samsung", "S22", miBateria);

        celularSofia.setUsuario(usuarioA); 
        usuarioA.setCelular(celularSofia); 

        celularSofia.mostrarInfoCompleta();
        usuarioA.mostrarDatosCompletos();
    }
}
