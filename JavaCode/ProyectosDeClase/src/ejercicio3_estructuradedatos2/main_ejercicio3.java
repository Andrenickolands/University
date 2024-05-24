/*

 */
package ejercicio3_estructuradedatos2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author AndresNicolasSepulve
 */
public class main_ejercicio3 {

    Scanner data = new Scanner(System.in);
    boolean salir = false;

    //objeto
    ListaEnlazada lista = new ListaEnlazada();

    public void main() {
        main_ejercicio3 sd = new main_ejercicio3();
        sd.menu();
    }

    protected void menu() {
        int opcion;

        while (!salir) {
            System.out.println("\t\n Hola bienvenido");
            System.out.println("1. Ejercicio LinkedList");
            System.out.println("2. Salir");

            try {
                System.out.println("\t\nDigita un numero para escoger la opcion: ");
                opcion = data.nextInt();

                switch (opcion) {
                    case 1 ->
                        ListaEnlzadas();

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

    protected void ListaEnlzadas() {
        System.out.println("\n");

        // Agregar elementos
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.agregar(40);

        // Imprimir la lista
        System.out.println("\nLista original:");
        lista.imprimir();

        // Eliminar un elemento
        lista.eliminar(20);

        // Actualizar un elemento
        lista.actualizar(30, 35);

        // Imprimir la lista
        System.out.println("\nLista despues de eliminar y actualizar:");
        lista.imprimir();

        // Tamaño de la lista
        System.out.println("\nTamanio de la lista: " + lista.getTamanio());

    }

}
