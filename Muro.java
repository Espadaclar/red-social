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

