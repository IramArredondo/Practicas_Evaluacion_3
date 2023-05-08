
package eva3_3_try_catch;


public class EVA3_3_TRY_CATCH {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 5 , y = 0;
        try{//genera la excepcion
        int resu = x / y;
        System.out.println("Resultado: " + resu);
        }catch(ArithmeticException /*NullPointerException*/ e){//captura la excepcion
            //se genera un objeto exception llamado "e"
            //tipo ArithmeticException
            System.out.println("Exceptión: " + e.getMessage());
        }
        System.out.println("FIN DEL PROGRAMA");
    }
    
}
