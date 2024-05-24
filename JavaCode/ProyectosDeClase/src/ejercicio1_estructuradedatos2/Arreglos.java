/*
 
 */
package ejercicio1_estructuradedatos2;

import java.util.Scanner;

/**
 *
 * @author Nicolás
 */
class Arreglos {

    //Scanner
    Scanner data = new Scanner(System.in);

    //variables
    int num, posicion = 0, w = 0, e = 0, posicionElim = 0;
    String nombre;
    boolean encontrado = false;

    //Arreglos
    int[] n = new int[3];
    String nombres[][] = new String[2][2];

    //CREAR
    protected void crear_Arreglo1() {
        System.out.println("\nDigita los datos del arreglo");
        for (int i = 0; i < n.length; i++) {
            System.out.println("Dato " + (i + 1) + ": ");
            n[i] = data.nextInt();
            data.nextLine();
        }
        data.nextLine();
    }

    protected void crear_Arreglo2() {
        System.out.println("\nDigita los datos del arreglo");
        System.out.println("Escribe nombres ");
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres.length; j++) {
                System.out.print((w++ + 1) + ". ");
                nombres[i][j] = data.nextLine();
            }
        }
        data.nextLine();
    }

    //IMPRIMIR
    protected void imprimir_Arreglo1() {
        for (int i = 0; i < n.length; i++) {
            System.out.println("Posición " + i + " = " + n[i]);
        }
    }

    protected void imprimir_Arreglo2() {
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres.length; j++) {
                System.out.println((e++ + 1) + ". Nombre en la posición " + (i) + (j) + " = " + nombres[i][j]);
            }
        }
        data.nextLine();
    }

    //ACTUALIZAR
    protected void actualizar_Arreglo1() {
        System.out.println("Qué posición del arreglo quieres cambiar?");
        posicion = data.nextInt();

        System.out.println("Comó lo vamos a cambiar?");
        num = data.nextInt();

        n[posicion] = num;

        System.out.print("\n");
        imprimir_Arreglo1();
    }

    protected void actualizar_Arreglo2() {
        System.out.println("Digita el nombre a modificar");
        nombre = data.next();

        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres.length; j++) {
                if (nombres[i][j].equalsIgnoreCase(nombre)) {
                    System.out.println("Digita el nuevo nombre para modificar " + nombres[i][j]);
                    nombres[i][j] = data.next();
                    encontrado = true;
                    System.out.println("El cambio se realizo exitosamente");
                    break;
                }
            }
        }

        if (encontrado == false) {
            System.out.println("El nombre " + nombre + " no ha sido encontrado");
        }

        System.out.print("\n");
        imprimir_Arreglo2();
    }

    //ELIMINAR
    protected void eliminarPorPosicion_Arreglo1() {
        System.out.print("\n");
        imprimir_Arreglo1();
        System.out.println("\nQué posición del arreglo quieres eliminar?");
        posicionElim = data.nextInt();

        for (int i = posicionElim; i < n.length - 1; i++) {
            n[posicionElim] = 0;
        }

        System.out.print("\n");
    }

    protected void eliminarTodo_Arreglo1() {
        System.out.print("\n");
        imprimir_Arreglo1();
        System.out.println("\nQuieres eliminar todo el arreglo números? Si No");
        String Respuesta = data.next();
        String si = "Si";
        String no = "No";

        if (si.equalsIgnoreCase(Respuesta)) {
            for (int i = 0; i < n.length; i++) {
                n[i] = 0;
                encontrado = true;
                System.out.println("Se elimino exitosamente");
                break;
            }
        } else {
            if (no.equalsIgnoreCase(Respuesta)) {
                System.out.println("Ok, no va a ser eliminado");
            }
        }

        if (encontrado == false) {
            System.out.println("El arreglo ya esta vacio");
        }

        System.out.print("\n");
    }

    protected void eliminarPorPosicion_Arreglo2() {
        System.out.print("\n");
        imprimir_Arreglo2();
        System.out.println("\nDigita el nombre a eliminar");
        nombre = data.nextLine();

        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres.length; j++) {
                if (nombres[i][j].equalsIgnoreCase(nombre)) {
                    nombres[i][j] = null;
                    encontrado = true;
                    System.out.println("Se elimino exitosamente");
                    break;
                }
            }
        }

        if (encontrado == false) {
            System.out.println("El nombre " + nombre + " no ha sido encontrado para poder eliminarlo");
        }
    }

    protected void eliminarTodo_Arreglo2() {
        System.out.print("\n");
        imprimir_Arreglo2();
        System.out.println("\nQuieres eliminar todo el arreglo Nombres? Si No");
        String Respuesta = data.next();
        String si = "Si";
        String no = "No";

        if (si.equalsIgnoreCase(Respuesta)) {
            for (int i = 0; i < nombres.length; i++) {
                for (int j = 0; j < nombres.length; j++) {
                    nombres[i][j] = null;
                    encontrado = true;
                    System.out.println("Se elimino exitosamente");
                    break;
                }
            }
        } else {
            if (no.equalsIgnoreCase(Respuesta)) {
                System.out.println("Ok, no va a ser eliminado");
            }
        }

        if (encontrado == false) {
            System.out.println("El arreglo ya esta vacio");
        }

        System.out.print("\n");
    }

    //BUSCAR
    protected void buscarDato_Arreglo1() {
        System.out.println("Qué número quieres buscar?");
        num = data.nextInt();
        int i = 0;

        while (i < n.length && n[i] < num) {
            i++;
        }

        if (i == n.length) {
            System.out.println("No se encontro el número en el arreglo");
        } else {
            if (n[i] == num) {
                System.out.println("El número " + num + " se encuentra en la posición " + i);
            } else {
                System.out.println("No se encontro el número");
            }
        }
        data.nextLine();
    }

    protected void buscarDato_Arreglo2() {
        System.out.println("Qué nombre quieres buscar?");
        nombre = data.next();

        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres.length; j++) {
                if (nombres[i][j].equalsIgnoreCase(nombre)) {
                    System.out.println("El nombre " + nombre + " se encuentra en la posición " + i + " " + j);
                    encontrado = true;
                    break;
                }
            }
        }

        if (encontrado == false) {
            System.out.println("El nombre " + nombre + " no ha sido encontrado");
        }
        System.out.println("\n");
    }
}
