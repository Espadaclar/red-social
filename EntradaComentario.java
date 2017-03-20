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
