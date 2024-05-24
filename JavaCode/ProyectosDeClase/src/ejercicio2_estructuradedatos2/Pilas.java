/*

 */
package ejercicio2_estructuradedatos2;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Nicolás
 */
class Pilas {

    //Scanner
    Scanner data = new Scanner(System.in);

    Stack<String> pila = new Stack<>();

    protected void agregarP() {
        System.out.println("\nLa Pila esta vacia? " + pila.isEmpty());

        //base pila
        pila.push("Manzana");
        pila.push("Pera");
        pila.push("Naranja");
        pila.push("Limon");
        pila.push("Guayaba");
        //tope pila
    }

    protected void MostrarP() {
        //recorrido e imprimir
        System.out.println("\nLa pila es: ");
        for (String imprimirPila : pila) {
            System.out.println("Pila: " + imprimirPila);
        }
    }

    protected void Mostrar2P() {
        if (pila.isEmpty()) {
            System.out.println("\nLa pila esta vacia");
        } else {
            System.out.println("\nLa pila es " + pila);
        }
    }

    protected void primerElementoP() {
        System.out.println("\nPrimer elemento de la pila: " + pila.firstElement());
    }

    protected void ultimoMomentoP() {
        System.out.println("\nÚltimo elemento de la pila: " + pila.peek());
    }

    protected void tamanoPilaP() {
        System.out.println("\nTamaño de la pila: " + pila.size());
    }

    protected void BuscarElementosP() {
        System.out.println("\nQué elemento quieres buscar en la pila? ");
        String elemento = data.nextLine();
        System.out.println("\nEl elemento " + elemento + " se encuentra en la posición " + pila.search(elemento));
    }

    protected void BuscarElementosObjetoP() {

    }

    protected void eliminarUltimoElementoP() {
        pila.pop();
        System.out.println("\nUltimo elemento eliminado de la pila");

        Mostrar2P();
    }

    protected void eliminarElementosP() {
        pila.clear();
        System.out.println("\nElementos eliminados de la pila");

        Mostrar2P();
    }
}
