/*

 */
package ejercicio2_estructuradedatos2;

import java.util.Scanner;

/**
 *
 * @author Nicolás
 */
public class main {

    Scanner data = new Scanner(System.in);

    Pilas pil = new Pilas();
    Colas col = new Colas();

    boolean salir = false;

    public void main() {
        main sd = new main();
        sd.menu();
    }

    protected void menu() {
        int opcion;

        do {
            System.out.println("\t\n Hola bienvenido");
            System.out.println("1. Ejercicio pilas");
            System.out.println("2. Ejercicio colas");
            System.out.println("3. Salir");

            opcion = data.nextInt();

            switch (opcion) {
                case 1 ->
                    Pilas();
                case 2 ->
                    Colas();
                default ->
                    System.out.println("Opcion no valida, intenta de nuevo");
            }
        } while (!salir);
        System.out.println("Adios un gusto");

    }

    protected void Pilas() {
        pil.agregarP();
        pil.MostrarP();
        pil.primerElementoP();
        pil.ultimoMomentoP();
        pil.tamanoPilaP();
        pil.BuscarElementosP();
        pil.eliminarUltimoElementoP();
        pil.eliminarElementosP();
    }

    protected void Colas() {
        col.agregarC();
        col.MostrarC();
        col.primerElementoC();
        col.ultimoMomentoC();
        col.tamanoColaC();
        col.BuscarElementosC();
        col.eliminarPrimerElementoC();
        col.eliminarElementosC();
    }
}
