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
        //
        int minutos = momentoActual.getMinute() - momentoPublicacion.getMinute();
        int segundo = momentoActual.getSecond() - momentoPublicacion.getSecond();
        if(momentoActual.getMinute() < momentoPublicacion.getMinute()){
            minutos = ( 60 - momentoPublicacion.getMinute() ) + momentoActual.getMinute()  ;
        }
        if(momentoActual.getSecond() < momentoPublicacion.getSecond()){
            segundo = ( 60 - momentoPublicacion.getSecond() ) + momentoActual.getSecond() ;
        }
        if(momentoActual.getMinute() == momentoPublicacion.getMinute()){
            minutos =   momentoPublicacion.getMinute()  ;
        }
        if(momentoActual.getSecond() == momentoPublicacion.getSecond()){
            segundo =  momentoPublicacion.getSecond() ;
        }

        String datosGenerales = "Autor. " +usuario+ "\n";
        datosGenerales += "URL de la imagen. " +urlImagen+ "\n";        
        datosGenerales += "Título. " +titulo+ "\n";        
        datosGenerales += "Tiempo trascurrido desde la publicación. "  +minutos+ " minutos y " +segundo+ " segundos.\n";
        datosGenerales += "Cantidad de meGusta. " +cantidadMeGusta+ "\n";

        if(comentarios.isEmpty()){
            datosGenerales += "=== Comentarios. ===\n  No ha recibido ningún comentario.\n" ;
        }
        else{
            datosGenerales += "=== Comentarios. ===\n " ;
            for(String comentario: comentarios){
                System.out.println(comentario);
            }
        }
        return datosGenerales;
    }
}








