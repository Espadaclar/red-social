import java.util.ArrayList;
/**
 * 
 */
public class Muro
{
    private ArrayList<Entrada> conjuntoDeEntradas;
    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        conjuntoDeEntradas = new ArrayList<>();
    }

    public void addEntradaTexto(Entrada entrada){
        conjuntoDeEntradas.add(entrada);
    }

    /**
     * verCantidadDatosPorEntrada que nos muestre por pantalla tantas líneas como entradas haya indicando por 
     * cada línea la cantidad de datos asociados a esa entrada.
     */
    public void verCantidadDatosPorEntrada(){
        for(Entrada entrada: conjuntoDeEntradas){
            System.out.println(
                entrada.getCantidadDeDatosAsociadosALaEntrada());
        }
    }

    public void mostraDatosExclusivos(){
        System.out.println(conjuntoDeEntradas);
    }

    /**
     * imprima por pantalla los datos exclusivos de los post pero no de todos, si no filtrados.
     * El primer parámetro indicamos el tipo de posts que queremos mostrar y en el segundo el autor de dichos post.
     * Si algún parámetro vale null se entiende que no se quiere filtrar por ese filtro.
     */
    public void mostrarDatosExclusivosEntradasFiltradas(String tipoEntrada, String autor){

        for (Entrada entrada : conjuntoDeEntradas)
        {
            if(tipoEntrada.equals("EntradaFoto") && entrada.getUsuario().equals(autor)){
                if(entrada instanceof EntradaFoto){ // instanceof comprueba que la entrada es de tipo EntradaFoto
                    ((EntradaFoto)entrada).mostraDatosExclusivos(); //convierte a la VL entrada en EntradaFoto
                }
            }
            if(tipoEntrada.equals("EntradaTexto") && entrada.getUsuario().equals(autor)){
                if(entrada instanceof EntradaTexto){
                    ((EntradaTexto)entrada).mostraDatosExclusivos();
                }
            }
            if(tipoEntrada.equals("EntradaUnionAGrupo") && entrada.getUsuario().equals(autor)){
                if(entrada instanceof EntradaUnionAGrupo){
                    ((EntradaUnionAGrupo)entrada).mostraDatosExclusivos();
                }
            }

        }
    }

    public String toString(){
        String cadenaADevolver = "";

        for (Entrada entrada : conjuntoDeEntradas)
        {
            cadenaADevolver += entrada + "\n";
        }
        return cadenaADevolver;
    }

    public void zzMuestraDatos(){
        System.out.println(this);
        System.out.println("=================");
    }
}

