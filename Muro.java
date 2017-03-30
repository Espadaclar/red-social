import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.time.LocalDate;
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
            //variable para ir recorriendo el Array cadena.

            int i = 0;
            //aux solo interactua  la 1º vez que isntanceof sea true, dando a i el valor de -1. En cuanto salga del
            // del if en el que se encuentra. i toma el valor de 0. Esto es debido a que todos los if con instanceof
            // tiene que comenzar con i ++, porque no se sabe el tipo de entrada que se ejecutará en 1º lugar.
            int aux = 0;
            archivo.write("<h1>   DATOS DE TODAS LAS ENTRADAS. ______________________  "  +fecha+    " </h1>");

            for(Entrada entrada: conjuntoDeEntradas){
                if(entrada instanceof EntradaTexto){
                    if(aux == 0){ 
                        i = -1;
                        aux ++;
                    }
                    i ++;
                    archivo.write("<h2>" +cadena[i]+ "</h2>");
                    i ++;
                    archivo.write("<p>" +cadena[i]+ "</p>");
                    i ++;
                    archivo.write("<p>" +cadena[i]+ "</p>");
                    i ++;
                    archivo.write("<p>" +cadena[i]+ "</p>");
                    i ++;
                    archivo.write("<p>" +cadena[i]+ "</p>");
                    i ++;
                    archivo.write("<p>" +cadena[i]+ "</p>");
                }

                if(entrada instanceof EntradaFoto){// instanceof comprueba que la entrada es de tipo EntradaFoto
                    if(aux == 0){ 
                        i = -1;
                        aux ++;
                    }
                    //archivo.write("<div id= \"escuson\" >" );
                    i ++;
                    archivo.write("<h2>" +cadena[i]+ "</h2>");
                    i ++;
                    archivo.write("<p>" +cadena[i]+ "</p>");
                    i ++;
                    archivo.write("<p>" +cadena[i]+ "</p>");
                    i ++;
                    archivo.write("<p>" +cadena[i]+ "</p>");
                    i ++;
                    archivo.write("<p>" +cadena[i]+ "</p>");
                    i ++;
                    archivo.write("<p>" +cadena[i]+ "</p>");
                    i ++;
                    archivo.write("<p>" +cadena[i]+ "</p>");
                    i ++;
                    archivo.write("<p><a href=\" " +cadena[i]+ "\" " +  ">" +cadena[i]+ "</a></p>"  );
                    //<a href="http://www.html.net/">Desde aquí enlazamos con HTML.net</a> 
                    // archivo.write("</div>" );
                }
                if(entrada instanceof EntradaUnionAGrupo){
                    if(aux == 0){ 
                        i = -1;
                        aux ++;
                    }
                    i ++;
                    archivo.write("<h2>" +cadena[i]+ "</h2>");
                    i ++;
                    archivo.write("<p>" +cadena[i]+ "</p>");
                    i ++;
                    archivo.write("<p>" +cadena[i]+ "</p>");
                    i ++;
                    archivo.write("<p>" +cadena[i]+ "</p>");
                    i ++;
                    archivo.write("<p>" +cadena[i]+ "</p>");
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
