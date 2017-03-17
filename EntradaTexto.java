
import java.util.ArrayList;
import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 *
 */
class EntradaTexto extends EntradaComentario {    
    private String mensaje;
    
    public EntradaTexto(String autor, String texto){
        super(autor);
        mensaje = texto;
    }

    public void meGusta(){
          super.meGusta();
    }
    
    public String getMensaje(){
        return mensaje;
    }
       
     public void addComentario(String text){
        super.addComentario( text);
    }
    
    public String toString(){
         String cadenaADevolver = "========= ENTRADA TEXTO ===\n";
        
        cadenaADevolver += "Usuario: " + getUsuario() + "\n";
        cadenaADevolver += "Mensaje: " +mensaje + "\n";
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
        return cadenaADevolver; 
    }

    public void mostrarAutorYMensaje(){
        System.out.println("Autor: " +getUsuario()+ "\nMensaje: " +mensaje);
    }
    
    public void mostrar(){
        System.out.println(this);
    }

}













