/*

 */
package ejercicio4_estrcturadedatos2;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Nicoláss
 */
public class manipulacionDeArchivos {

    Scanner data = new Scanner(System.in);
    boolean salir = false;

    accesoSecuencial AS = new accesoSecuencial();
    accesoDirecto AD = new accesoDirecto();

    public void main() throws IOException {
        manipulacionDeArchivos sd = new manipulacionDeArchivos();
        sd.menu();
    }

    protected void menu() throws IOException {
        int opcion;

        while (!salir) {
            System.out.println("\t\n Hola bienvenido");
            System.out.println("1. Ejercicio acceso secuencial");
            System.out.println("2. Ejercicio acceso directo aleatorio");
            System.out.println("3. Salir");

            try {
                System.out.println("\t\nDigita un numero para escoger la opcion: ");
                opcion = data.nextInt();

                switch (opcion) {
                    case 1 ->
                        accesoSecuencial();
                    case 2 ->
                        accesoDirecto();
                    default ->
                        System.out.println("Opcion no valida, intenta de nuevo");
                }

            } catch (InputMismatchException e) {
                System.out.println("Debes escribir un numero");
                data.next();
            }
        }
        System.out.println("Adios un gusto");
    }

    protected void accesoSecuencial() throws IOException {
        // lectura archivos
        AS.lectura();

        // escritura archivos
        AS.escrituraConSobreEscritura();

        //Lectura neuvamente
        AS.lectura();
        
        // escritura archivos
        AS.escrituraSinSobreEscritura();
        
        //Lectura neuvamente
        AS.lectura();
    }

    protected void accesoDirecto() {
        AD.accesoDirectoo();
    }

}
