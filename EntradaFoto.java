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
        url = "http://www.significadodelossueños.net/wp-content/uploads/2013/10/So%C3%B1ar-con-muchedumbre.gif";

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

        String datosGenerales = "Nombre usuario --> " +usuario+ ". Catidad de meGusta --> " +
            cantidadMeGusta+  ". Comentarios recibidos --> No ha recibido ningún comentario. Minutos transcurridos --> " +
            minutos+ ". Segundos transcurridos -->" +segundo+ " Foto --> " +urlImagen;
         if(!comentarios.isEmpty()){
            datosGenerales = "Nombre usuario --> " +usuario+ ". Catidad de meGusta --> " +
            cantidadMeGusta+  ". Minutos transcurridos --> " + minutos+ ". Segundos transcurridos -->" +segundo+
            " Foto --> " +urlImagen;
        }  

        return datosGenerales;
    }

}








