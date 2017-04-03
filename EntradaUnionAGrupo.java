import java.time.*;
import java.time.temporal.ChronoUnit;
/**
 * @ autor franciscoJavier
 */
public class EntradaUnionAGrupo extends Entrada
{
    private String grupo;

    /**
     * Constructor for objects of class EntradaUnionAGrupo
     */
    public EntradaUnionAGrupo(String usuario, String grupo)
    {
        super(usuario);
        this.grupo = grupo;
    }
    
    public EntradaUnionAGrupo(String autor, String meGusta, int year, int month, int  dayOfMonth, int  hour, int minute, String nombreGrupo )
    {
        super(autor, meGusta, year, month, dayOfMonth, hour, minute );
        this.grupo = grupo;
    }

    public String getGrupo(){
        return grupo;
    }

    public void meGustaMucho(){
        meGusta();
    }    

    /**
     * getCantidadDeDatosAsociadosALaEntrada que devuelva el número de datos asociado a cada entrada (en caso de EntradaTexto, 
     * por ejemplo, 5: el usuario, la cantidad de me gusta, el momento de publicacion, los comentarios y el mensaje). 
     */
    public int getCantidadDeDatosAsociadosALaEntrada(){
        return 4;
    }
    
    public String toString(){
        String cadenaADevolver = "========= ENTRADA GRUPO ===\n";
        cadenaADevolver += "Se ha unido al grupo: " +grupo + "\n";
        cadenaADevolver += super.toString();
        //cadenaADevolver += super.toString()+ "\n";
       
        return cadenaADevolver; 
    }

    public String getHTML(){
        String a = "<h2>=== -- ENTRADA A GRUPO.</h2>";
        a += "<p> Nombre del grupo: "+grupo +  "</p>";
        a += super.getHTML();
        return a;
    }
    
    public void mostraDatosExclusivos(){
        System.out.println(grupo);
    }
    
    public void mostrar(){
        System.out.println(this);
    }
}






