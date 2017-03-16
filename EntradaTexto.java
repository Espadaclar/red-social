
import java.util.ArrayList;
import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Usuario
 */
class EntradaTexto {
    private String usuario;
    private String mensaje;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    private ArrayList<String> comentarios;

    public EntradaTexto(String autor, String texto){
        usuario = autor;
        mensaje = texto;
        comentarios = new ArrayList<>();
        cantidadMeGusta = 0;
        momentoPublicacion = LocalDateTime.now(); 
    }

    public void meGusta(){
        cantidadMeGusta ++;
    }

    public void addComentario(String text){
        comentarios.add(text);
    }

    public String getMensaje(){
        return mensaje;
    }

    public LocalDateTime getMomentoPublicacion(){
        return momentoPublicacion;
    }

    public String toString(){
         String cadenaADevolver = "========= ENTRADA TEXTO ===\n";
        
        cadenaADevolver += "Usuario: " + usuario + "\n";
        cadenaADevolver += "Mensaje: " +mensaje + "\n";
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
        return cadenaADevolver; 
    }

    public void zMostrarComentarios(){
        System.out.println(this);
    }

}

