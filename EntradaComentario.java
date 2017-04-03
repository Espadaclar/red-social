import java.util.ArrayList;
/**
 * @ franciscoJavier
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
    
     public EntradaComentario(String autor, String meGusta, int year, int month, int  dayOfMonth, int  hour, int minute )
    {
        super(autor, meGusta, year, month, dayOfMonth, hour, minute );
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
        String datos = super.toString()+ "\n";
        if (getComentarios().isEmpty()) {
            datos += "La entrada no tiene comentarios. ";
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

    public String getHTML(){
        String a = super.getHTML();
        if (getComentarios().isEmpty()) {
            a += "<p> La entrada no tiene comentarios. </p>";
        }
        else {
            //Se recopilan los comentarios
            a += "<p> Comentarios: </p>";
            for (String comentario : getComentarios()) {
                a += "<p class=\"clase\">" +comentario + "</p>";
            }
        } 
        return a;
    }

    public void mostrar(){
        System.out.println(this);
    }
}
