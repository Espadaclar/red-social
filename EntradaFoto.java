import java.util.ArrayList;
import java.time.*;
/**
 * 
 */
public class EntradaFoto
{
    private String usuario;
    private String urlImagen;
    private String titulo;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    private ArrayList<String> comentarios;

    /**
     * Constructor for objects of class EntradaFoto
     */
    public EntradaFoto(String autor, String url, String titulo)
    {

        urlImagen = url;
        usuario = autor;
        urlImagen = url;
        this.titulo = titulo;
        momentoPublicacion = LocalDateTime.now();
        comentarios = new ArrayList<>();
    }

    public void meGusta(){
         cantidadMeGusta ++;
    }

    public void unLike(){

    }

    public void addComentario(String text){
        comentarios.add(text);
    }

    public String getUrlImage(){
        return urlImagen;
    }

    public String getTituloImagen(){
        return titulo;
    }

    public LocalDateTime getMomentoPublicacion(){
        return momentoPublicacion;
    }

    public String toString(){
        LocalDateTime momentoActual = LocalDateTime.now(); 
        int minutos = momentoActual.getMinute() - momentoPublicacion.getMinute();
        int segundo = momentoActual.getSecond() - momentoPublicacion.getSecond();
        if(segundo < 0){
            segundo = segundo * -1;
        }
        String datosGenerales = "EntradaFoto: Nombre usuario --> " +usuario+ ". Catidad de meGusta --> " +
            cantidadMeGusta+ ". Comentarios recibidos --> No ha recibido ningún comentario. Este post fue creado hace --> " + minutos+ 
            " minutos y --> " +segundo+ " segundos. URL de la foto --> " +urlImagen;
         if(!comentarios.isEmpty()){
            datosGenerales = "EntradaFoto: Nombre usuario --> " +usuario+ ". Catidad de meGusta --> " +
            cantidadMeGusta+  ". Este post fue creado hace --> " + minutos+ " minutos, y -->" +segundo+
            " segundos. URL de la foto --> " +urlImagen;
        }  

        return datosGenerales;
    }

}








