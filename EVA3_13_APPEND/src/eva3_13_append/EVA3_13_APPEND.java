package eva3_13_append;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA3_13_APPEND {

    public static void main(String[] args) {
        // TODO code application logic here
        String ruta = "C:\\Archivos\\";
        try {
            writeUsingBufferedWriter(ruta + "archivoBufferedWriter.txt", "Prueba de escritura de archivos"
                    + "Usando la clase BufferedWriter \n");
        } catch (IOException ex) {
            ex.printStackTrace();//Imprime la excepción que se genera
        }
    }
  
//---------------------------------------------------------------------------

    public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException{
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file, true); //Cambio agregando el ", true"
        BufferedWriter bufWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < 10; i++) {
            bufWriter.write((i+1)+ ".- " + datos);
        }
        bufWriter.close();
        fileWriter.close();
    }
}
