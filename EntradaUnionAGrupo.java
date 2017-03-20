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

    public String toString(){
        String cadenaADevolver = "========= ENTRADA GRUPO ===\n";
        cadenaADevolver += "Se ha unido al grupo: " +grupo + "\n";
        cadenaADevolver += super.toString()+ "\n";
       
        return cadenaADevolver; 
    }

    public void mostrar(){
        System.out.println(this);
    }
}







