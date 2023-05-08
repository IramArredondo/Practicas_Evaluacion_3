package eva3_1_unchecked_exceptions;

import java.util.Scanner;

public class EVA3_1_UNCHECKED_EXCEPTIONS {

    public static void main(String[] args) {
        // TODO code application logic here

        //ARITMETIC EXCEPTION:
        //División entre 0
        System.out.println("INICIANDO EL PROGRAMA");
        int x = 5,y=0;
        System.out.println("INICIALIZANDO LAS VARIABLES");
        int resu = x/y;
        System.out.println("CALCULANDO LA DIVISIÓN");
        System.out.println("División = " + resu);
        
        //INPUTMISMATCH EXCEPTION //Error de captura de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = sc.nextInt();
        System.out.println("Tu número es: " + num);
        
        //INDEXOUTOFBOUND EXCEPTION
        int[] arreglo = new int[5]; //0 - (N-1)
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        //Posición no válida
        arreglo[5] = 600; //error de lógica: 5 no es una posición valida
        
        //NULLPOINTEREXCEPTION
        Prueba objPrueba = null;
        System.out.println("Valor de x = " + objPrueba.x);
    }

}

class Prueba {

    public int x = 100;
}
