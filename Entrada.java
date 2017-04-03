import java.util.ArrayList;
import java.time.*;
import java.time.temporal.ChronoUnit;
/**
 * @autor franciscoJavier.
 */
public abstract class Entrada
{
    private String usuario;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    // private ArrayList<String> comentarios;
    /**
     * Constructor for objects of class Entrada
     */
    public Entrada(String autor )
    {
        usuario = autor;
        //comentarios = new ArrayList<>();
        cantidadMeGusta = 0;
        momentoPublicacion = LocalDateTime.now(); 
    } 
    
     public Entrada(String autor, String meGusta, int year, int month, int  dayOfMonth, int  hour, int minute )
    {
        usuario = autor;
        //comentarios = new ArrayList<>();
        cantidadMeGusta = 0;
        momentoPublicacion = LocalDateTime.of(year, month, dayOfMonth, hour, minute); 
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

    /**
     * para que en las otras clases funcione este mt, también lo ponemos aquí. para que las clases hijas pudedan sobreescribirlo. 
     */
    public int getCantidadDeDatosAsociadosALaEntrada(){
        return 4454567;
    }

    public String getHTML(){
        String a = "";
        a += "<p> Usuario: " +usuario+ "</p>";
        a += "<p> Cantidad meGusta: " +cantidadMeGusta+ "</p>";
        a += "<p> Tiempo transcurrido: " +tiempoTranscurrido()+ "</p>";
        
        return a;
    }

    private String tiempoTranscurrido(){
        String datos = "";
        long segundosQueHanPasadoDesdeCreacion = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanPasadoDesdeCreacion = segundosQueHanPasadoDesdeCreacion / 60;
        long segundosResiduales = segundosQueHanPasadoDesdeCreacion % 60;

        datos += "Hace ";
        if (minutosQueHanPasadoDesdeCreacion > 0) {
            datos += minutosQueHanPasadoDesdeCreacion + " minutos ";
        }
        datos += segundosResiduales + " segundos.";
        return datos;
    }

    public String toString(){
        String datos = "Usuario: " +usuario+ "\n";
        datos += "Cantidad me gusta: " +cantidadMeGusta+ "\n";
        datos += tiempoTranscurrido();       
        return datos;
    }  

    public abstract void mostrar();
}

