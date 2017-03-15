
import java.util.ArrayList;
import java.time.*;
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
        datosGenerales += "Mensaje. " +mensaje+ "\n";
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

    public void zMostrarComentarios(){

        System.out.println(this);
        if(!comentarios.isEmpty()){
            for(int i = 0; i < comentarios.size(); i ++){
                System.out.println("   ." +comentarios.get(i));
            }
        }
        //         else{
        //             System.out.println("No ha recibido ningún comentario.");
        //         }        
    }

}

