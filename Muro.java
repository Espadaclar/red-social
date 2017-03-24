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
    public void mostrarDatosExclusivosEntradasFiltradas(String nombreEntrada, String nombreUsuario){
        if(nombreEntrada != null && nombreUsuario != null){
            int cont = 1;
            for(Entrada entrada: conjuntoDeEntradas){

                if(entrada instanceof EntradaTexto){
                    System.out.println("===Datos filtrados de EntradaTexto, entrada nº " +cont+ "\n");
                    if(entrada.getUsuario().equals(nombreUsuario)){
                        ((EntradaTexto)entrada).mostraDatosExclusivos();
                        cont ++;
                    }
                }
                else if(entrada instanceof EntradaFoto){// instanceof comprueba que la entrada es de tipo EntradaFoto
                    System.out.println("===Datos filtrados de EntradaFoto, entrada nº " +cont+ "\n");
                    if(entrada.getUsuario().equals(nombreUsuario)){
                        ((EntradaFoto)entrada).mostraDatosExclusivos();//convierte a la VL entrada en EntradaFoto
                        cont ++;
                    }
                }
                else if(entrada instanceof EntradaUnionAGrupo){
                    System.out.println("===Datos filtrados de EntradaUnionAGrupo, entrada nº " +cont+ "\n");
                    if(entrada.getUsuario().equals(nombreUsuario)){
                        ((EntradaUnionAGrupo)entrada).mostraDatosExclusivos();
                    }
                }

            }
            System.out.println("===========================");
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

