package eva3_7_throw_exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EVA3_7_THROW_EXCEPTION {

    public static void main(String[] args) {
        //EL PROGRAMADOR PUEDE GENERAR EXCEPCIONES PARA UNA MEDIDA DE CONTROL
        Prueba pba = new Prueba();
        //checked: es forzoso atenderlas
        //unchecked: errores de lógica, no es forzoso resolverlas
        //int resu = 5 / 0
        try {
            System.out.println("INTRODUCE UN VALOR: ");
            Scanner sc = new Scanner(System.in);
            int valor = sc.nextInt();
            pba.capturaMayorCero(valor);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } 
            //ARITHMETIC EXCEPTION ES "UNCHECK", NO HAY OBLIGACIÓN EN RESOLVERLA
            try {
                pba.division(1, 0);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    class Prueba {

        public void capturaMayorCero(int valor) throws Exception {
            if (valor <= 0) // voy a generar una excepcion
            {
                throw new Exception(valor + " es negativo, solo se aceptan valores positivos");
            }
            System.out.println("El valor es de: " + valor);
        }

        public int division(int x, int y) throws ArithmeticException {
            if (y == 0) {
                throw new ArithmeticException("El valor del divisor es cero, no se puede realizar la operación");
            }
            return x / y;
        }
    }
