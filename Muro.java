import java.util.ArrayList;
/**
 * 
 */
public class Muro
{
    private ArrayList<EntradaTexto> mensajes;
    private ArrayList<EntradaFoto> fotos;
    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        mensajes = new ArrayList<>();
        fotos = new ArrayList<>();
    }

    public void addEntradaTexto(EntradaTexto entradaTexto){
        mensajes.add(entradaTexto);
    }
    
    public void addEntradaFoto(EntradaFoto entradaFoto){
        fotos.add(entradaFoto);
    }
    
    public String toString(){
        return " " +mensajes+ " " +fotos;
    }
    
    public void zzMuestraDatos(){
        for(int i = 0; i < mensajes.size(); i ++){
            System.out.println( mensajes.get(i).toString());
        }
        System.out.println("");
        for(int i = 0; i < fotos.size(); i ++){
            System.out.println( fotos.get(i).toString());
        }
        System.out.println("=================");
        
    }
}























