/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_12_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author IramA
 */
public class EVA3_12_SERIALIZABLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Persona perso1 = new Persona("Iram", "Arredondo", 19);
            guardarObjetos(perso1);
            Persona resu = leerObjetos();
            System.out.println("Nombre: " + resu.getNombre());
            System.out.println("Apellido: " + resu.getApellido());
            System.out.println("Edad: " + resu.getEdad());
        } catch (IOException ex) {
            Logger.getLogger(EVA3_12_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EVA3_12_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void guardarObjetos(Persona perso1) throws /*FileNotFoundException,*/ IOException{
        FileOutputStream abrirArchivo = new FileOutputStream("C:\\Archivos\\personas.per");
        ObjectOutputStream ouStream = new ObjectOutputStream(abrirArchivo);
        ouStream.writeObject(perso1);
        ouStream.close();
    }
    
    public static Persona leerObjetos() throws FileNotFoundException, IOException, ClassNotFoundException{
        Persona perso1 = null;
        FileInputStream abrirArchivos = new FileInputStream("C:\\Archivos\\personas.per");
        ObjectInputStream inStream = new ObjectInputStream(abrirArchivos);
        //casting : de object a persona
        perso1 = (Persona)inStream.readObject();
        return perso1;
    }
    
}

class Persona implements Serializable{ //Serializable permite guardar datos en un archivo no txt
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
