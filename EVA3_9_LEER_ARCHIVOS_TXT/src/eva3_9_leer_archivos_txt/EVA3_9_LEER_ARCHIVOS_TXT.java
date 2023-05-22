package eva3_9_leer_archivos_txt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class EVA3_9_LEER_ARCHIVOS_TXT {

    //C:\Archivos\Prueba.txt
    final static String RUTA = "C:\\Archivos\\Prueba.txt";

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            readUsingFiles(RUTA);//LEE UN ARCHIVO COMPLETO, PERO INEFICIENTE CON ARCHIVOS GRANDES
            readingUsingBufferedReader(RUTA);//MEJOR OPCIÓN PARA LEER TEXTO
            readingUsingFileReader(RUTA);//HIBRIDO CON BUFFERED, PERO INEFICIENTE(util para otros archivos que no sean textos)
            readUsingScanner(RUTA);//HERRAMIENTO PARA PROCESAR INPUTS (COMO EL TECLADO)
        } catch (IOException e) {
            e.printStackTrace(); //Imprime todo el error
        }

    }

    //CON FILES LEE STOLO EL CONTENIDO DEL ARCHIVO Y SE TRANSFIERE
    //A LA MEMORIA PRINCIPAL (RAM)
    //ÚTIL CON ARCHVIOS PEQUEÑOS
    public static void readUsingFiles(String ruta) throws IOException {
        System.out.println("LEER UN ARCHIVO CON FILES");
        //CONSTRUIMOS LA RUTA EN BASE A LA CADENA DE TEXTO
        Path path = Paths.get(ruta);
        /*
        List<String> todasLineas = Files.readAllLines(path);//vamos a declarar una lista
        //List --> Arreglos de lo que queremos (int, String, double, etc).
        System.out.println("Resultado: ");
        //System.out.println(todasLineas.toString());
        for (int i = 0; i < todasLineas.size(); i++) {
            System.out.println(todasLineas.get(i));
        }
         */
        byte[] bytes = Files.readAllBytes(path);
        System.out.println(new String(bytes));

    }

    //LINEA POR LINEA
    //USADO EN ARCHIVOS GRANDES PARA NO NECESITAR ABRIR TODO EL ARCHIVO GRANDE
    //BufferedReader maneja archivos más grandes, leen archivos binarios, leen imagenes
    /*
    Permite procesar archivos más grandes, ya que los lee por partes
    En el caso de texto, nos permite leerlo línea por línea.
    Es un mecanismo adecuado para trabajar con multitarea (hilos) (EL files no)
     */
    public static void readingUsingBufferedReader(String ruta) throws IOException {
        System.out.println("");
        System.out.println("LEER UN ARCHIVO CON BUFFERED READER");
        //Tres lineas obligatorias para el BufferedReader
        File file = new File(ruta); // <-- Abre Archivos
        FileInputStream fileInputStream = new FileInputStream(file);// <-- Lo interpreta como bytes
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);// <-- Lo procesa como texto

        //Buffer memoria temporal
        BufferedReader bufReader = new BufferedReader(inputStreamReader);
        String linea;
        while ((linea = bufReader.readLine()) != null) {
            System.out.println(linea);
        }
        bufReader.close(); //Si se trabaja con el BufferedReader hay que cerrarlo
    }

    /*
    No es la mejor opción para leer archivos de texto
    */
    public static void readingUsingFileReader(String ruta) throws IOException {
        System.out.println("");
        System.out.println("LEER UN ARCHIVO CON FILE READER");
        File file = new File(ruta);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufReader = new BufferedReader(fileReader);
        String linea;
        while ((linea = bufReader.readLine()) != null) {
            System.out.println(linea);
        }
        bufReader.close();
        fileReader.close();
    }
    
    public static void readUsingScanner(String ruta) throws IOException{
        System.out.println("");
        System.out.println("LEER UN ARCHIVO CON SCANNER");
        Path path = Paths.get(ruta);
        Scanner sc = new Scanner(path);
        while(sc.hasNextLine()){
            String linea = sc.nextLine();
            System.out.println(linea);
        }
        sc.close();//Necesario cerrarlo para no bloquarlo
        //Abrir un archivo ES OBLIGATORIO cerrarlo
        
    }
}
