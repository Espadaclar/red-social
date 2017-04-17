import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.time.LocalDate;
import java.util.ArrayList;

import java.awt.Desktop;
import java.io.File;

import java.util.Scanner;
import java.net.URL;
import java.util.Random;
/**
 * @ autor franciscoJavier
 */
public class Muro
{
    private ArrayList<Entrada> conjuntoDeEntradas;
    private ArrayList<String> entradasJuanYElena;
    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        conjuntoDeEntradas = new ArrayList<>();
        entradasJuanYElena = new ArrayList<>();
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
        // conjuntoDeEntradas.clear();
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
            //"<link href=\"p1.css\" type=\"text/css\" rel=\"stylesheet\"/> "  tres posibilidades, aleatorias
            Random ale = new Random();
            int elige = ale.nextInt(4);
            if(elige == 0){
                archivo.write("<link href=\"p4.css\" type=\"text/css\" rel=\"stylesheet\"/> "); 
            }
            else if(elige == 1){
                archivo.write("<link href=\"p2.css\" type=\"text/css\" rel=\"stylesheet\"/> "); 
            }
            else if(elige == 2){
                archivo.write("<link href=\"p3.css\" type=\"text/css\" rel=\"stylesheet\"/> "); 
            }
            else if(elige == 3){
                archivo.write("<link href=\"p4.css\" type=\"text/css\" rel=\"stylesheet\"/> "); 
            }

            archivo.write("</head>");
            archivo.write("<body>");            
            // etiqueta para mostrar acentos y la letra ñ, correctamente.
            archivo.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>");
            
            archivo.write("<h1>   DATOS DE TODAS LAS ENTRADAS. ______________________  "  +fecha+    " </h1>");

            for(Entrada entrada: conjuntoDeEntradas){
                archivo.write(entrada.getHTML());
                //((EntradaTexto)entrada).getHTMLTexto();
            }
            archivo.write("</body>");
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

    /**
     * lee los datos de las entradas de Juan y de Elena.
     */
    public void mostrarMuroEnNavegador(String usuario){    
        conjuntoDeEntradas.clear();
        entradasJuanYElena.clear();
        try {
            URL url = new URL("https://script.google.com/macros/s/AKfycbzHc3p1twTfyF7o0_cxSwnxSsyOemuHnSu406ly9DZIf5Ck2BA/exec?user="+usuario+"");
            Scanner sc = new Scanner(url.openStream());
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                //ArrayList entradasJuanYElena almacena todas las líneas
                entradasJuanYElena.add(linea);                
            }

            for(int i = 0; i < entradasJuanYElena.size(); i ++){

                String datosFechaHora[] = entradasJuanYElena.get(i).split(";");
                String autor = datosFechaHora[1];

                if(entradasJuanYElena.get(i).contains("EntradaTexto")){
                    //paso el el String a entero
                    int meGusta = Integer.parseInt(datosFechaHora[2]);
                    String mensaje = datosFechaHora[4];
                    String comentarios = datosFechaHora[5];

                    //prepara condición para mostrar comentarios, si los hay.
                    String listaComentarios[] = comentarios.split("%");
                    ArrayList<String> comentariosElenaYJuan = new ArrayList<>();
                    for(int a = 0; a < listaComentarios.length; a ++){
                        if(!comentarios.contains("Sin comentarios")){
                            String valor = listaComentarios[a];
                            comentariosElenaYJuan.add(valor);
                        }

                    }

                    // divide el datosFechaHora[3]  en dos elementos separados por -.
                    String fechaHora[] =  datosFechaHora[3].split("-");
                    //en fechaHora[0] se encuentra la fecha, la divide en elementos separados por /.
                    String fecha[] = fechaHora[0].split("/");
                    //en fechaHora[1] se encuentra la hora, la divide en dos elementos separados por :.
                    String horaYMinutos[] = fechaHora[1].split(":");
                    //paso los String de la fecha y la hora  a enteros.
                    int dayOfMonth = Integer.parseInt(fecha[0]);
                    int month = Integer.parseInt(fecha[1]);
                    int year = Integer.parseInt(fecha[2]);
                    int hour = Integer.parseInt(horaYMinutos[0]);
                    int minutes = Integer.parseInt(horaYMinutos[1]);
                    Entrada entradaTexto = new EntradaTexto(autor, meGusta, dayOfMonth, month, year, hour, minutes, mensaje, comentariosElenaYJuan);
                    conjuntoDeEntradas.add(entradaTexto);
                }
                else if(entradasJuanYElena.get(i).contains("EntradaFoto")){
                    //paso el  String a entero
                    int meGusta = Integer.parseInt(datosFechaHora[2]);
                    String urlFoto = datosFechaHora[4];
                    String titulo = datosFechaHora[5];
                    String comentarios = datosFechaHora[6];

                    //prepara condición para mostrar comentarios, si los hay.
                    String listaComentarios[] = comentarios.split("%");
                    ArrayList<String> comentariosElenaYJuan = new ArrayList<>();
                    for(int a = 0; a < listaComentarios.length; a ++){
                        if(!comentarios.contains("Sin comentarios")){
                            String valor = listaComentarios[a];
                            comentariosElenaYJuan.add(valor);
                        }

                    }

                    // divide el datosFechaHora[3]  en dos elementos separados por -.
                    String fechaHora[] =  datosFechaHora[3].split("-");
                    //en fechaHora[0] se encuentra la fecha, la divide en elementos separados por /.
                    String fecha[] = fechaHora[0].split("/");
                    //en fechaHora[1] se encuentra la hora, la divide en dos elementos separados por :.
                    String horaYMinutos[] = fechaHora[1].split(":");   
                    //paso los String de la fecha y la hora  a enteros.
                    int dayOfMonth = Integer.parseInt(fecha[0]);
                    int month = Integer.parseInt(fecha[1]);
                    int year = Integer.parseInt(fecha[2]);
                    int hour = Integer.parseInt(horaYMinutos[0]);
                    int minutes = Integer.parseInt(horaYMinutos[1]);
                                        
                    Entrada entradaFoto = new EntradaFoto(autor, meGusta, dayOfMonth, month, year, hour, minutes, urlFoto, titulo, comentariosElenaYJuan);
                    conjuntoDeEntradas.add(entradaFoto);
                }
                else if(entradasJuanYElena.get(i).contains("EntradaUnionAGrupo")){
                    //paso el el String a entero
                    int meGusta = Integer.parseInt(datosFechaHora[2]);
                    String nameGrupo = datosFechaHora[4];
                    // divide el datosFechaHora[3]  en dos elementos separados por -.
                    String fechaHora[] =  datosFechaHora[3].split("-");
                    //en fechaHora[0] se encuentra la fecha, la divide en elementos separados por /.
                    String fecha[] = fechaHora[0].split("/");
                    //en fechaHora[1] se encuentra la hora, la divide en dos elementos separados por :.
                    String horaYMinutos[] = fechaHora[1].split(":");
                    int dayOfMonth = Integer.parseInt(fecha[0]);
                    int month = Integer.parseInt(fecha[1]);
                    int year = Integer.parseInt(fecha[2]);
                    int hour = Integer.parseInt(horaYMinutos[0]);
                    int minutes = Integer.parseInt(horaYMinutos[1]);
                    Entrada entradaUnionAGrupo = new EntradaUnionAGrupo(autor, meGusta, dayOfMonth, month, year, hour, minutes, nameGrupo);
                    conjuntoDeEntradas.add(entradaUnionAGrupo);
                }
            }

            sc.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        mostrarMuroEnNavegador();

    }

}

