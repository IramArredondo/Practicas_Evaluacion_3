
package eva3_6_finally;


public class EVA3_6_FINALLY {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 9, y = 1;
        try{
        int resu = x / y;
        System.out.println("El resultado es: " + resu);
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir entre 0");
        }finally{ //OBLIGA A LA EJECUCIÓN DE ESTA SECCIÓN DE CÓDIGO
            //ES OPCIONAL
            System.out.println("SIEMPRE ME VOY A EJECUTAR!!");
        }
        System.out.println("Fin del programa");
    }
    
}
