import java.util.ArrayList;
import java.time.*;
import java.time.temporal.ChronoUnit;
/**
 * 
 */
public class Entrada
{
    private String usuario;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    // private ArrayList<String> comentarios;
    /**
     * Constructor for objects of class Entrada
     */
    public Entrada(String autor)
    {
        usuario = autor;
        //comentarios = new ArrayList<>();
        cantidadMeGusta = 0;
        momentoPublicacion = LocalDateTime.now(); 
    }

    public void meGusta(){
        cantidadMeGusta ++;
    }

    public String getUsuario(){
        return usuario;
    }

    public int getMeGusta(){
        return cantidadMeGusta;
    }

    public LocalDateTime getMomentoPublicacion(){
        return momentoPublicacion;
    }

    public String toString(){
        return "";
    }    
}



