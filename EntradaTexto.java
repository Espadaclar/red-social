
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

        cadenaADevolver += "Mensaje: " +mensaje + "\n"; 
        cadenaADevolver += super.toString();
        return cadenaADevolver; 
    }

    public void mostrarAutorYMensaje(){
        System.out.println("Autor: " +getUsuario()+ "\nMensaje: " +mensaje);
    }

    public void mostrar(){
        System.out.println(this);
    }

}


