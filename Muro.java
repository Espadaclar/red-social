import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.time.LocalDate;
import java.util.ArrayList;

import java.awt.Desktop;
import java.io.File;

/**
 * @ autor franciscoJavier
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
            for(Entrada entrada: conjuntoDeEntradas){
                if(entrada instanceof EntradaTexto){
                    if(entrada.getUsuario().equals(nombreUsuario)){
                        ((EntradaTexto)entrada).mostraDatosExclusivos();
                    }
                }
                else if(entrada instanceof EntradaFoto){// instanceof comprueba que la entrada es de tipo EntradaFoto
                    if(entrada.getUsuario().equals(nombreUsuario)){
                        ((EntradaFoto)entrada).mostraDatosExclusivos();//convierte a la VL entrada en EntradaFoto
                    }
                }
                else if(entrada instanceof EntradaUnionAGrupo){
                    if(entrada.getUsuario().equals(nombreUsuario)){
                        ((EntradaUnionAGrupo)entrada).mostraDatosExclusivos();
                    }
                }
            }
        }
    }

    public void mostrarMuroEnNavegador(){
        //para poner fecha actual.
        LocalDate fecha = LocalDate.now();

        // Obtenemos una referencia a una ruta donde estará el archivo
        Path rutaArchivo = Paths.get("prueba.html");

        // Abrimos el archivo, escribimos en él y lo cerramos. Si se produce una
        try  
        {
            BufferedWriter archivo = Files.newBufferedWriter(rutaArchivo);
            String cadena[] = toString().split("\n"); 

            archivo.write("<html>");
            archivo.write("<head>");
            //enlace a una página css, para dar formato a la presentación.
            archivo.write("<link href=\"p1.css\" type=\"text/css\" rel=\"stylesheet\"/> "); 
            archivo.write("</head>");
            archivo.write("<body>");

            archivo.write("<h1>   DATOS DE TODAS LAS ENTRADAS. ______________________  "  +fecha+    " </h1>");

            for(Entrada entrada: conjuntoDeEntradas){
                if(entrada instanceof EntradaTexto){
                    archivo.write("<h2>=== ENTRADAS DE TEXTO === </h2>");
                    archivo.write(((EntradaTexto)entrada).getHTMLTexto());
                    //((EntradaTexto)entrada).getHTMLTexto();
                }

                if(entrada instanceof EntradaFoto){// instanceof comprueba que la entrada es de tipo EntradaFoto
                    archivo.write("<h2>=== ENTRADAS DE FOTOS === </h2>");
                    archivo.write(((EntradaFoto)entrada).getHTMLFoto());

                }
                if(entrada instanceof EntradaUnionAGrupo){
                    archivo.write("<h2>=== ENTRADAS A GRUPO === </h2>");
                    archivo.write(((EntradaUnionAGrupo)entrada).getHTMLGrupo());

                }
            }
            archivo.write("<body>");
            archivo.write("</html>");
            archivo.close();
        }
        catch (IOException excepcion) {
            // Mostramos por pantalla la excepción que se ha producido
            System.out.println(excepcion.toString());

        }

        try {

            File objetofile = new File ("prueba.html");
            Desktop.getDesktop().open(objetofile);

        }catch (IOException ex) {

            System.out.println(ex);
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

    public void zzMuestraDatosArrayList(){
        for(int i = 0; i < conjuntoDeEntradas.size(); i ++ ){
            System.out.println(conjuntoDeEntradas.get(i));
        }

        System.out.println("=================");
    }

}
