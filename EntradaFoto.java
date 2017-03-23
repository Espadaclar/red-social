import java.util.ArrayList;
import java.time.*;
import java.time.temporal.ChronoUnit;
/**
 * 
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

    public void meGusta(){
        super.meGusta();
    }

    public void addComentario(String text){
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
        cadenaADevolver += "Url de la foto: " +urlImagen + "\n";
        
  
        cadenaADevolver += " ";
        return cadenaADevolver;
    }

    public void mostrar(){
        System.out.println(this);
    }
}




