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
    
     public void meGusta(){
          super.meGusta();
    }    
    
    public String toString(){
         String cadenaADevolver = "========= GRUPO ===\n";
        
        cadenaADevolver += "Usuario: " + getUsuario() + "\n";
        cadenaADevolver += "Grupo: " +grupo + "\n";
        cadenaADevolver += getMeGusta() + " me gusta.\n";
        
        long segundosQueHanPasadoDesdeCreacion = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanPasadoDesdeCreacion = segundosQueHanPasadoDesdeCreacion / 60;
        long segundosResiduales = segundosQueHanPasadoDesdeCreacion % 60;
        
        cadenaADevolver += "Hace ";
        if (minutosQueHanPasadoDesdeCreacion > 0) {
            cadenaADevolver += minutosQueHanPasadoDesdeCreacion + " minutos ";
        }
        cadenaADevolver += segundosResiduales + " segundos.\n";         
        return cadenaADevolver; 
    }
    
    public void muestrDatos(){
        System.out.println(this);
    }
}













