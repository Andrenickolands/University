/*
 
 */
package ejercicio1_estructuradedatos2;

import java.util.Scanner;

/**
 *
 * @author Nicolás
 */
public class Ejercicio1_estructuradedatos {

    //Scanner
    Scanner data = new Scanner(System.in);

    //objetos
    Arreglos arr = new Arreglos();
    Listas lis = new Listas();

    //Variable del menú
    boolean salir = false;

    public void main() {
        Ejercicio1_estructuradedatos sd = new Ejercicio1_estructuradedatos();
        sd.menu();
    }

    public void menu() {
        int option;

        do {
            System.out.println("\t Hola bienvenido");
            System.out.println("Selecciona una opción");
            System.out.println("1. Arreglos");
            System.out.println("2. Listas");
            System.out.println("3. Salir");
            option = data.nextInt();

            switch (option) {
                case 1 ->
                    menuArreglos();
                case 2 ->
                    menuListas();
                default ->
                    System.out.println("Opcion no valida, intenta de nuevo");
            }
        } while (!salir);
        System.out.println("Adios un gusto");
    }

    protected void menuArreglos() {
        int option;

        do {
            System.out.println("\t Hola bienvenido a los arreglos");
            System.out.println("Selecciona lo que quieres hacer");
            System.out.println("1. crear");
            System.out.println("2. imprimir");
            System.out.println("3. actualizar");
            System.out.println("4. buscar");
            System.out.println("5. eliminar un dato");
            System.out.println("6. eliminar todo");
            System.out.println("7. Salir");
            option = data.nextInt();

            switch (option) {
                case 1 ->
                    crear();
                case 2 ->
                    imprimir();
                case 3 ->
                    actualizar();
                case 4 ->
                    buscar();
                case 5 ->
                    eliminar();
                case 6 ->
                    eliminarTodo();
                default ->
                    System.out.println("Opcion no valida, intenta de nuevo");
            }
        } while (!salir);
        System.out.println("Adios un gusto");
    }

    protected void menuListas() {
        int option;

        do {
            System.out.println("\t Hola bienvenido a las Listas");
            System.out.println("Selecciona lo que quieres hacer");
            System.out.println("1. crear");
            System.out.println("2. imprimir");
            System.out.println("3. actualizar");
            System.out.println("4. buscar");
            System.out.println("5. eliminar un dato");
            System.out.println("6. eliminar toda la lista");
            System.out.println("7. Salir");
            option = data.nextInt();

            switch (option) {
                case 1 ->
                    crearListas();
                case 2 ->
                    imprimirListas();
                case 3 ->
                    actualizarListas();
                case 4 ->
                    buscarListas();
                case 5 ->
                    eliminarListasUnDato();
                case 6 ->
                    eliminarListas();
                default ->
                    System.out.println("Opcion no valida, intenta de nuevo");
            }
        } while (!salir);
        System.out.println("Adios un gusto");
    }

    protected void crear() {
        System.out.println("\nIngresa los datos del primer arreglo son números");
        arr.crear_Arreglo1();

        System.out.println("\nIngresa los datos del segundo arreglo son ");
        arr.crear_Arreglo2();
    }

    protected void imprimir() {
        System.out.println("\nPrimer arreglo");
        arr.imprimir_Arreglo1();
        System.out.println("\nSegundo arreglo");
        arr.imprimir_Arreglo2();
    }

    protected void actualizar() {
        System.out.println("\nActualiza el primer arreglo");
        arr.actualizar_Arreglo1();
        System.out.println("\nActualiza el segundo arreglo");
        arr.actualizar_Arreglo2();
    }

    protected void buscar() {
        System.out.println("\nSe ha buscado el primer arreglo");
        arr.buscarDato_Arreglo1();
        System.out.println("\nSe ha buscado el segundo arreglo");
        arr.buscarDato_Arreglo2();
    }

    protected void eliminar() {
        arr.eliminarPorPosicion_Arreglo1();
        arr.eliminarPorPosicion_Arreglo2();
    }

    protected void eliminarTodo() {
        arr.eliminarTodo_Arreglo1();
        arr.eliminarTodo_Arreglo2();
    }

    protected void crearListas() {
        lis.ingresarListas();
    }

    protected void imprimirListas() {
        lis.imprimirListas();
    }

    protected void actualizarListas() {
        lis.actualizarrListas();
    }

    protected void buscarListas() {
        lis.buscarListas();
    }

    protected void eliminarListasUnDato() {
        lis.eliminarListasUnDato();
    }

    protected void eliminarListas() {
        lis.eliminarListas();
    }
}
