
import java.util.ArrayList;
import java.time.*;
import java.time.temporal.ChronoUnit;

import java.util.Arrays;
/**
 *@ autor franciscoJavier
 */
class EntradaTexto extends EntradaComentario {    
    private String mensaje;

    public EntradaTexto(String autor, String texto){
        super(autor);
        mensaje = texto;
    }
    
    public EntradaTexto(String autor, int meGusta,  int  dayOfMonth, int month, int year, int  hour, int minute, String mensaje, ArrayList comentarios){
        super(autor, meGusta,dayOfMonth, month, year, hour, minute, comentarios );
        this.mensaje = mensaje;
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

    /**
     * getCantidadDeDatosAsociadosALaEntrada que devuelva el número de datos asociado a cada entrada (en caso de EntradaTexto, 
     * por ejemplo, 5: el usuario, la cantidad de me gusta, el momento de publicacion, los comentarios y el mensaje). 
     */
    public int getCantidadDeDatosAsociadosALaEntrada(){
        return 5;
    }
    
    public String toString(){
        String cadenaADevolver = "========= ENTRADA TEXTO ===\n";

        cadenaADevolver += "Mensaje: " +mensaje + "\n"; 
        cadenaADevolver += super.toString();
        return cadenaADevolver; 
    }

    public String getHTML(){
        String a = "<h2>=== -- ENTRADA DE MENSAJES.</h2>";
        a += super.getHTML();
        a += "<p> Mensaje: " +mensaje+ "</p>"; 
        return a;
    }
    
    public void mostrarAutorYMensaje(){
        System.out.println("Autor: " +getUsuario()+ "\nMensaje: " +mensaje);
    }

    public void mostraDatosExclusivos(){
        System.out.println(mensaje);
    }
    
    public void mostrar(){
        System.out.println(this);
    }

}


