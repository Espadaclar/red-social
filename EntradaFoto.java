import java.util.ArrayList;
import java.time.*;
import java.time.temporal.ChronoUnit;
/**
 * 
 */
public class EntradaFoto extends EntradaComentario
{
    private String urlImagen;
    private String titulo;
    
    /**
     * Constructor for objects of class EntradaFoto
     */
    public EntradaFoto(String autor, String url, String titulo)
    {
        super(autor);
        urlImagen = url;
        this.titulo = titulo;
    }

    public void meGusta(){
          super.meGusta();
    }

    public void addComentario(String text){
        addComentario(text);
    }

    public String getUrlImage(){
        return urlImagen;
    }

    public String getTituloImagen(){
        return titulo;
    }

    public String toString(){       
         String cadenaADevolver = "========= ENTRADA FOTO ===\n";
        
        cadenaADevolver += "Usuario: " + getUsuario() + "\n";
        cadenaADevolver += "Título foto: " +titulo + "\n";
        cadenaADevolver += "Url de la foto: " +urlImagen + "\n";
        cadenaADevolver += getMeGusta() + " me gusta.\n";
        
        long segundosQueHanPasadoDesdeCreacion = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanPasadoDesdeCreacion = segundosQueHanPasadoDesdeCreacion / 60;
        long segundosResiduales = segundosQueHanPasadoDesdeCreacion % 60;
        
        cadenaADevolver += "Hace ";
        if (minutosQueHanPasadoDesdeCreacion > 0) {
            cadenaADevolver += minutosQueHanPasadoDesdeCreacion + " minutos ";
        }
        cadenaADevolver += segundosResiduales + " segundos.\n";       
        
        if (getComentarios().isEmpty()) {
            cadenaADevolver += "La entrada no tiene comentarios.\n";
        }
        else {
            //Se recopilan los comentarios
            cadenaADevolver += "Comentarios:\n";
            for (String comentario : getComentarios()) {
                cadenaADevolver += comentario + "\n";
            }
        }  
        cadenaADevolver += " ";
        return cadenaADevolver;
    }
}








