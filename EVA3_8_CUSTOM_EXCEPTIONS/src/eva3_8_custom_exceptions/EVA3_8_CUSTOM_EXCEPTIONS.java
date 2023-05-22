package eva3_8_custom_exceptions;

public class EVA3_8_CUSTOM_EXCEPTIONS {

    public static void main(String[] args) {
        Persona perso = new Persona();
        perso.setNombre("Iram");
        perso.setApellido("Arredondo");
        //No combiene usar un try-catch -> usar if mejor
        try {
            perso.setEdad(-10);
        } catch (DatoEntradaCheckedException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Nombre: " + perso.getNombre());
        System.out.println("Apellido: " + perso.getApellido());
        System.out.println("Edad: " + perso.getEdad());
    }
}

class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
        nombre = "---";
        apellido = "---";
        edad = 0;
    }

    public Persona(String nombre, String apellido, int edad) throws DatoEntradaCheckedException {
        this.nombre = nombre;
        this.apellido = apellido;
        setEdad(edad);
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

    public void setEdad(int edad) throws DatoEntradaCheckedException {
        if (edad < 0) {
            //throw new DatoEntradaException(); <-- UNCHECKED
            throw new DatoEntradaCheckedException();
        }
        this.edad = edad;
    }

}

class DatoEntradaException extends RuntimeException {

    public DatoEntradaException() {
        super("Dato de entrada incorrecto!! El valor debe ser positivo.");
    }

}

class DatoEntradaCheckedException extends Exception{
    
    public DatoEntradaCheckedException(){
        super("Dato de entrada incorrecto!! El valor debe ser positivo");
    }
}