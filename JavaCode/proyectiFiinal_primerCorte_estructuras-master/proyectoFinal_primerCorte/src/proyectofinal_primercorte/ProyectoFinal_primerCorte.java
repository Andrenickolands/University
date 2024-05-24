/*
    main
 */
package proyectofinal_primercorte;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import proyectofinal_primercorte.menus.menuMaterias;

/**
 *
 * @author Nicolás
 */
public class ProyectoFinal_primerCorte {

    Scanner data = new Scanner(System.in);
    boolean salir = false;

    //objeto
    estudiantes ES = new estudiantes();
    notas NO = new notas();
    tareas TA = new tareas();
    menuMaterias MMA = new menuMaterias();

    public static void main(String[] args) throws IOException {
        ProyectoFinal_primerCorte sd = new ProyectoFinal_primerCorte();
        sd.menu();
    }

    protected void menu() throws IOException {
        int opcion;

        while (!salir) {
            System.out.println("\t\n Hola bienvenido");
            System.out.println("1. Agregar");
            System.out.println("2. Buscar");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("5. Mostrar");

            try {
                System.out.println("\t\nDigita un numero para escoger la opcion: ");
                opcion = data.nextInt();

                switch (opcion) {
                    case 1 ->
                        menuAgregar();
                    case 2 ->
                        menuBuscar();
                    case 3 ->
                        menuActualizar();
                    case 4 ->
                        menuEliminar();
                    case 5 ->
                        menuMostrar();
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

    protected void menuAgregar() throws IOException {
        int opcion;

        while (!salir) {
            System.out.println("\t\n Menu estudiantes");
            System.out.println("1. Agregar estudiantes");
            System.out.println("2. Agregar notas");
            System.out.println("3. Agregar tareas");
            System.out.println("4. volver");
            System.out.println("5. Salir");

            try {
                System.out.println("\t\nDigita un numero para escoger la opcion: ");
                opcion = data.nextInt();

                switch (opcion) {
                    case 1 ->
                        ES.ingresarEstudiantes();
                    case 2 ->
                        NO.agregarNotas();
                    case 3 ->
                        TA.crear();
                    case 4 ->
                        menu();
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

    protected void menuBuscar() throws IOException {
        int opcion;

        while (!salir) {
            System.out.println("\t\n Menu estudiantes");
            System.out.println("1. Buscar estudiantes");
            System.out.println("2. Buscar notas");
            System.out.println("3. Buscar tareas");
            System.out.println("4. volver");
            System.out.println("5. Salir");

            try {
                System.out.println("\t\nDigita un numero para escoger la opcion: ");
                opcion = data.nextInt();

                switch (opcion) {
                    case 1 ->
                        ES.buscarEstudiantes();
                    case 2 ->
                        NO.buscarNotas();
                    case 3 ->
                        TA.buscarTarea();
                    case 4 ->
                        menu();
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

    protected void menuActualizar() throws IOException {
        int opcion;

        while (!salir) {
            System.out.println("\t\n Menu estudiantes");
            System.out.println("1. Actualizar estudiantes");
            System.out.println("2. Actualizar notas");
            System.out.println("3. Actualizar tareas");
            System.out.println("4. Actualizar materias");
            System.out.println("5. volver");
            System.out.println("6. Salir");

            try {
                System.out.println("\t\nDigita un numero para escoger la opcion: ");
                opcion = data.nextInt();

                switch (opcion) {
                    case 1 ->
                        ES.actualizarEstudiantes();
                    case 2 ->
                        NO.actuazlizarNotas();
                    case 3 ->
                        TA.actuazlizarTarea();
                    case 4 ->
                        MMA.actualziadorMaterias();
                    case 5 ->
                        menu();
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

    protected void menuEliminar() throws IOException {
        int opcion;

        while (!salir) {
            System.out.println("\t\n Menu estudiantes");
            System.out.println("1. Eliminar estudiantes");
            System.out.println("2. Eliminar notas");
            System.out.println("3. Eliminar tareas");
            System.out.println("4. Eliminar materias");
            System.out.println("5. volver");
            System.out.println("6. Salir");

            try {
                System.out.println("\t\nDigita un numero para escoger la opcion: ");
                opcion = data.nextInt();

                switch (opcion) {
                    case 1 ->
                        ES.eliminarListasUnDato();
                    case 2 ->
                        NO.eliminarNotas();
                    case 3 ->
                        TA.eliminarTarea();
                    case 4 ->
                        MMA.eliminadorMaterias();
                    case 5 ->
                        menu();
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

    protected void menuMostrar() throws IOException {
        int opcion;

        while (!salir) {
            System.out.println("\t\n Menu estudiantes");
            System.out.println("1. Mostrar estudiantes");
            System.out.println("2. Mostrar notas");
            System.out.println("3. Mostrar tareas");
            System.out.println("4. Mostrar materias");
            System.out.println("5. volver");
            System.out.println("6. Salir");

            try {
                System.out.println("\t\nDigita un numero para escoger la opcion: ");
                opcion = data.nextInt();

                switch (opcion) {
                    case 1 ->
                        ES.imprimirEstudiantes();
                    case 2 ->
                        NO.imprimirNotas();
                    case 3 ->
                        TA.mostrarTarea();
                    case 4 ->
                        MMA.imprimirMaterias();
                    case 5 ->
                        menu();
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

}
