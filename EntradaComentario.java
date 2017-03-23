import java.util.ArrayList;
/**
 * Write a description of class EntradaComentario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaComentario  extends Entrada
{
    private ArrayList<String> comentarios;

    /**
     * Constructor for objects of class EntradaComentario
     */
    public EntradaComentario(String autor)
    {
        super(autor);
        comentarios = new ArrayList<>();
    }

    public void addComentario(String text){
        comentarios.add(text);
    }

    public ArrayList<String> getComentarios(){
        return comentarios;
    }

    /**
     * getCantidadDeDatosAsociadosALaEntrada que devuelva el número de datos asociado a cada entrada (en caso de EntradaTexto, 
     * por ejemplo, 5: el usuario, la cantidad de me gusta, el momento de publicacion, los comentarios y el mensaje). 
     */
    public  int getCantidadDeDatosAsociadosALaEntrada(){
        return 4;
    }
    
    public String toString(){
        
        String datos = "";
        datos += super.toString();
         if (getComentarios().isEmpty()) {
            datos += "La entrada no tiene comentarios.\n";
        }
        else {
            //Se recopilan los comentarios
            datos += "Comentarios:\n";
            for (String comentario : getComentarios()) {
                datos += comentario + "\n";
            }
        } 
        return datos;
    }
}
