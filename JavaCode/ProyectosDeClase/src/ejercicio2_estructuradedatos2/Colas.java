/*

 */
package ejercicio2_estructuradedatos2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Nicolás
 */
class Colas {

    //Scanner
    Scanner data = new Scanner(System.in);

    Queue<String> cola = new LinkedList<>();

    protected void agregarC() {
        System.out.println("\nLa Cola esta vacia? " + cola.isEmpty());

        //primero cola
        cola.add("Suzuki");
        cola.add("Bmw");
        cola.add("Mazda");
        cola.add("Toyota");
        cola.add("Ferrari");

        //ultimo cola
    }

    protected void MostrarC() {
        //recorrido e imprimir
        System.out.println("\nLa cola es: ");
        for (String imprimirCola : cola) {
            System.out.println("Pila: " + imprimirCola);
        }
    }

    protected void Mostrar2C() {
        if (cola.isEmpty()) {
            System.out.println("\nLa cola esta vacia");
        } else {
            System.out.println("\nLa cola es " + cola);
        }
    }

    protected void primerElementoC() {
        System.out.println("\nPrimer elemento de la cola: " + cola.peek());
    }

    protected void ultimoMomentoC() {
        System.out.println("\nÚltimo elemento de la cola: " + ((LinkedList<String>) cola).getLast());
    }

    protected void tamanoColaC() {
        System.out.println("\nTamaño de la cola: " + cola.size());
    }

    protected void BuscarElementosC() {
        System.out.println("\nQué elemento quieres buscar en la cola? ");
        String elemento = data.nextLine();

        if (((LinkedList<String>) cola).contains(elemento)) {
            System.out.println("\nEl elemento " + elemento + " se encuentra en la cola en la posición " + ((LinkedList<String>) cola).indexOf(elemento));
        } else {
            System.out.println("\nEl elemento  " + elemento + " no se encuentra n la cola");
        }

    }

    protected void eliminarPrimerElementoC() {
        cola.poll(); //remove() es similar
        System.out.println("\nPrimer elemento eliminado de la cola, la cola avanzo de lugar");

        Mostrar2C();
    }

    protected void eliminarElementosC() {
        cola.clear();
        System.out.println("\nElementos eliminados de la cola");

        Mostrar2C();
    }
}
