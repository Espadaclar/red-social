import java.time.*;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaUnionAGrupo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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

    public String getHTMLGrupo(){
        String a = super.getHTMLEntrada();
        a += "<p> Grupo: "+grupo +  "</p>";
        return a;
    }
    
    public void mostraDatosExclusivos(){
        System.out.println(grupo);
    }
    
    public void mostrar(){
        System.out.println(this);
    }
}







