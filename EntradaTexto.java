
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
        int minutos = momentoActual.getMinute() - momentoPublicacion.getMinute();
        int segundo = momentoActual.getSecond() - momentoPublicacion.getSecond();
        if(segundo < 0){
            segundo = segundo * -1;
        }
        String datosGenerales = "EntradaTexto: Nombre usuario --> " +usuario+ "  Mensje enviado --> " +mensaje+ ". Catidad de meGusta --> " +
            cantidadMeGusta+  ". Comentarios recibidos --> No ha recibido ningún comentario.. Este post fue creado hace --> " +
            minutos+ " minutos, y -->" +segundo+ " segundos.";
        if(!comentarios.isEmpty()){
            datosGenerales = "EntradaTexto: Nombre usuario --> " +usuario+ "  Mensje enviado --> " +mensaje+ "  Catidad de meGusta --> " +
            cantidadMeGusta+  ". Este post fue creado hace --> " + minutos+ " minutos, y -->" +segundo+
            " segundos.";
        }
        return datosGenerales;
    }

    private void losComentarios(){
        if(!comentarios.isEmpty()){
            for(int i = 0; i < comentarios.size(); i ++){
                System.out.println("\n" +comentarios.get(i).toString());
            }
        }
        else{
            System.out.println("No ha recibido ningún comentario.");
        }        
    }

}




