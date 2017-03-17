import java.util.ArrayList;
/**
 * 
 */
public class Muro
{
    //     private ArrayList<EntradaTexto> mensajes;
    //     private ArrayList<EntradaFoto> fotos;
    //     private ArrayList<EntradaUnionAGrupo> unionAGrupo;

    private ArrayList<Entrada> conjuntoDeEntradas;
    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        //         mensajes = new ArrayList<>();
        //         fotos = new ArrayList<>();
        //         unionAGrupo = new ArrayList<>();
        conjuntoDeEntradas = new ArrayList<>();
    }

    public void addEntradaTexto(Entrada entrada){
        //mensajes.add(entradaTexto);
        conjuntoDeEntradas.add(entrada);
    }

    //     public void addEntradaFoto(EntradaFoto entradaFoto){
    //         //fotos.add(entradaFoto);
    //         conjuntoDeEntradas.add(entradaFoto);
    //     }
    // 
    //     public void addEntradaUnionAGrupo(EntradaUnionAGrupo entradaNameGrupo){
    //         //unionAGrupo.add(entradaNameGrupo);
    //         conjuntoDeEntradas.add(entradaNameGrupo);
    //     }

    public String toString(){
        String cadenaADevolver = "";

        //         for (EntradaTexto entrada : mensajes)
        //         {
        //             cadenaADevolver += entrada + "\n";
        //         }
        // 
        //         for (EntradaFoto entrada : fotos)
        //         {
        //             cadenaADevolver += entrada + "\n";
        //         }  
        // 
        //         for (EntradaUnionAGrupo entradaGrupo : unionAGrupo)
        //         {
        //             cadenaADevolver += unionAGrupo + "\n";
        //         }  

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

