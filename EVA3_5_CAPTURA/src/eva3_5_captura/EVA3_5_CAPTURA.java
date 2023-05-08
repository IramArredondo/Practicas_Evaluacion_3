
package eva3_5_captura;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_5_CAPTURA {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        do{
            try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el valor (entero) de x:");
            x = sc.nextInt();
            break;
            }catch(InputMismatchException e){
                System.out.println("Hubo un error en la captura del dato, vuelve a capturar");
                System.out.println("");
            }
        }while(true);
        System.out.println("Valor de x = " + x);
        
    }
    
}
