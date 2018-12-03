package matinal.example.com.material10;

public class Encapsulador {

    private int idImagen;
    private String textoTitulo, textoContenido;

    public Encapsulador(int idImagen, String textoTitulo, String textoContenido) {
        this.idImagen = idImagen;
        this.textoTitulo = textoTitulo;
        this.textoContenido = textoContenido;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public String getTextoTitulo() {
        return textoTitulo;
    }

    public String getTextoContenido() {
        return textoContenido;
    }
}
