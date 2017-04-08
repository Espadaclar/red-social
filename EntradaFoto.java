import java.util.ArrayList;
import java.time.*;
import java.time.temporal.ChronoUnit;
/**
 * @autor franciscoJavier.
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

    public EntradaFoto(String autor, int meGusta,  int  dayOfMonth, int month, int year, int  hour, int minute,
                        String url, String titulo, ArrayList comentarios)
    {
        super(autor, meGusta,dayOfMonth, month, year, hour, minute, comentarios );
        urlImagen = url;
        this.titulo = titulo;
    }
    
    public void meGusta(){
        super.meGusta();
    }

    public void addComent(String text){
        addComentario(text);
    }

    public String getUrlImage(){
        return urlImagen;
    }

    public String getTituloImagen(){
        return titulo;
    }

    /**
     * getCantidadDeDatosAsociadosALaEntrada que devuelva el número de datos asociado a cada entrada (en caso de EntradaTexto, 
     * por ejemplo, 5: el usuario, la cantidad de me gusta, el momento de publicacion, los comentarios y el mensaje). 
     */
    public int getCantidadDeDatosAsociadosALaEntrada(){
        return 6;
    }

    public String toString(){       
        String cadenaADevolver = "========= ENTRADA FOTO ===\n";
        cadenaADevolver += super.toString()+ "\n";
        cadenaADevolver += "Título foto: " +titulo + "\n";
         cadenaADevolver += "Url de la foto: \n";
          cadenaADevolver += urlImagen ;
        return cadenaADevolver;
    }

    public String getHTML(){
        String a = "<h2>=== -- ENTRADA DE FOTOS.</h2>";
        a += "<dif class=\"uno\">";
        a += "<p> Titulo: " +titulo+ "</p>";
        a += "<p> Direccion URL de foto: </p>";
        a += "<p> " +urlImagen+ "</p>";
        a += "<p> <img src=\""+urlImagen+ "\"> </p>";
         a += super.getHTML();
         a += "</div>";
        return a;
    }
    
    public void mostrar(){
        System.out.println(this);
    }

    public void mostraDatosExclusivos(){
        System.out.println(urlImagen+ "\n" +titulo);
    }
}

