import java.util.ArrayList;
/**
 * 
 */
public class Muro
{
    private ArrayList<EntradaTexto> mensajes;
    private ArrayList<EntradaFoto> fotos;
    private ArrayList<EntradaUnionAGrupo> unionAGrupo;
    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        mensajes = new ArrayList<>();
        fotos = new ArrayList<>();
        unionAGrupo = new ArrayList<>();
    }

    public void addEntradaTexto(EntradaTexto entradaTexto){
        mensajes.add(entradaTexto);
    }

    public void addEntradaFoto(EntradaFoto entradaFoto){
        fotos.add(entradaFoto);
    }
    
    public void addEntradaUnionAGrupo(EntradaUnionAGrupo entradaNameGrupo){
        unionAGrupo.add(entradaNameGrupo);
    }

    public String toString(){
        String cadenaADevolver = "";
        
        for (EntradaTexto entrada : mensajes)
        {
            cadenaADevolver += entrada + "\n";
        }

        for (EntradaFoto entrada : fotos)
        {
            cadenaADevolver += entrada + "\n";
        }  
        
        for (EntradaUnionAGrupo entradaGrupo : unionAGrupo)
        {
            cadenaADevolver += unionAGrupo + "\n";
        }  
        return cadenaADevolver;
    }

    public void zzMuestraDatos(){
        System.out.println(this);
        System.out.println("=================");
    }
}












