package eva3_4_multiples_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_4_MULTIPLES_EXCEPCIONES {

    public static void main(String[] args) {
        // TODO code application logic here
        int x, y;
        do{
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el valor (entero) de x: ");
            x = sc.nextInt();
            System.out.println("Introduce el valor (entero) de y: ");
            y = sc.nextInt();
            int resu = x / y;
            System.out.println("La división de " + x + "/" + y + " es: " + resu);
            break;
        }catch(InputMismatchException e){
            System.out.println("La captura de datos es incorrecta: " + e.getMessage() + ", vuelve a introducir datos");
            System.out.println("");
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir entre 0 " + e.getMessage() + ", vuelve a introducir datos");
            System.out.println("");
        }
        }while(true);
        System.out.println("PROGRAMA TERMINADO CON ÉXITO");
    }

}
