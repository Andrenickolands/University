/*

 */
package Main;

import ejercicio1_estructuradedatos2.Ejercicio1_estructuradedatos;
import ejercicio2_estructuradedatos2.main;
import ejercicio3_estructuradedatos2.main_ejercicio3;
import ejercicio4_estrcturadedatos2.manipulacionDeArchivos;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Nicolás
 */
public class Main_proyectos_universidad {

    //Scanner
    Scanner data = new Scanner(System.in);

    //Variable del menú
    boolean salir = false;

    //objetos
    Ejercicio1_estructuradedatos ejer1 = new Ejercicio1_estructuradedatos();
    main ejer2 = new main();
    main_ejercicio3 ejer3 = new main_ejercicio3();
    manipulacionDeArchivos ejer4 = new manipulacionDeArchivos();

    public static void main(String[] args) throws IOException {
        Main_proyectos_universidad sd = new Main_proyectos_universidad();
        sd.menu_proyectos_universidad();
    }

    protected void menu_proyectos_universidad() throws IOException {
        int option;

        do {
            System.out.println("\t Hola bienvenido");
            System.out.println("Estos son mis ejercicios realizados para la materia estructura de datos 2");
            System.out.println("Selecciona una opción");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Salir");
            option = data.nextInt();

            switch (option) {
                case 1 ->
                    ejer1.main();
                case 2 ->
                    ejer2.main();
                case 3 ->
                    ejer3.main();
                case 4 ->
                    ejer4.main();
                default ->
                    System.out.println("Opcion no valida, intenta de nuevo");
            }
        } while (!salir);
        System.out.println("Adios un gusto");
    }

}
