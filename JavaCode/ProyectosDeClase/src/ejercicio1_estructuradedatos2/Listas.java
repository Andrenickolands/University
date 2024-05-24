/*

 */
package ejercicio1_estructuradedatos2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nicolás
 */
class Listas {

    //Scanner
    Scanner data = new Scanner(System.in);

    //lIstas
    List<Integer> numeros = new ArrayList<>();

    //variables
    int num, numNuevo, numBuscar, a = 0;

    protected void ingresarListas() {
        System.out.println("\nDigita el numero a agregar a la lista");
        num = data.nextInt();

        numeros.add(num);
    }

    protected void imprimirListas() {
        System.out.println("\nLa lista es");
        for (int n : numeros) {
            System.out.println("Número " + (a++ + 1) + ": " + n);
        }

        System.out.println("El primer dato en la lista es ");
        System.out.println(numeros.get(0));
    }

    protected void actualizarrListas() {
        System.out.println("Digita el dato que quieres actualizar");
        num = data.nextInt();

        System.out.println("Digita el nuevo dato");
        numNuevo = data.nextInt();

        int index = numeros.indexOf(num);
        if (index != -1) {
            numeros.set(index, numNuevo);
            System.out.println("El cambio se realizó exitosamente");
        } else {
            System.out.println("El dato " + num + " no se encontró en la lista");
        }

        imprimirListas();
    }

    protected void eliminarListasUnDato() {
        System.out.println("\nDigita el número a eliminar de la lista");
        numNuevo = data.nextInt();

        if (numeros.remove(Integer.valueOf(numNuevo))) {
            System.out.println("Se eliminó exitosamente");
        } else {
            System.out.println("El número " + numNuevo + " no se encontró en la lista");
        }

        imprimirListas();
    }

    protected void eliminarListas() {
        numeros.clear();
    }

    protected void buscarListas() {
        System.out.println("\nElementos de la lista");
        System.out.println(numeros.size());

        System.out.println("La lista esta vacia?");
        System.out.println(numeros.isEmpty());

        System.out.println("Digita el dato a buscar en la lista?");
        numBuscar = data.nextInt();
        System.out.println(numeros.contains(numBuscar));

        System.out.println("Digita el dato a buscar por la posición en la lista?");
        numBuscar = data.nextInt();
        System.out.println("El numero en esa posición es: " + numeros.get(numBuscar));
    }
}

