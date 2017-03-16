import java.util.ArrayList;
import java.time.*;
import java.time.temporal.ChronoUnit;
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
         String cadenaADevolver = "========= ENTRADA FOTO ===\n";
        
        cadenaADevolver += "Usuario: " + usuario + "\n";
        cadenaADevolver += "Título foto: " +titulo + "\n";
        cadenaADevolver += "Url de la foto: " +urlImagen + "\n";
        cadenaADevolver += cantidadMeGusta + " me gusta.\n";
        
        long segundosQueHanPasadoDesdeCreacion = momentoPublicacion.until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanPasadoDesdeCreacion = segundosQueHanPasadoDesdeCreacion / 60;
        long segundosResiduales = segundosQueHanPasadoDesdeCreacion % 60;
        
        cadenaADevolver += "Hace ";
        if (minutosQueHanPasadoDesdeCreacion > 0) {
            cadenaADevolver += minutosQueHanPasadoDesdeCreacion + " minutos ";
        }
        cadenaADevolver += segundosResiduales + " segundos.\n";       
        
        if (comentarios.isEmpty()) {
            cadenaADevolver += "La entrada no tiene comentarios.\n";
        }
        else {
            //Se recopilan los comentarios
            cadenaADevolver += "Comentarios:\n";
            for (String comentario : comentarios) {
                cadenaADevolver += comentario + "\n";
            }
        }  
        cadenaADevolver += " ";
        return cadenaADevolver;
    }
}








