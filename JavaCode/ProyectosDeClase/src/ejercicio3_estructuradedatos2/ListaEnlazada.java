/*

 */
package ejercicio3_estructuradedatos2;

import java.util.List;

/**
 *
 * @author AndresNicolasSepulve
 */
class ListaEnlazada {

    //variables
    private Nodo primerNodo;
    private Nodo ultimoNodo;
    private int tamanio;

    //lista
    private List<Nodo> elementos;

    protected ListaEnlazada() {
        this.primerNodo = null;
        this.ultimoNodo = null;
        this.tamanio = 0;
    }

    protected void agregar(int elemento) {
        Nodo nuevoNodo = new Nodo(elemento);

        if (estaVacia()) {
            primerNodo = ultimoNodo = nuevoNodo;
        } else {
            ultimoNodo.setAvanza(nuevoNodo);
            ultimoNodo = nuevoNodo;
        }
        tamanio++;
    }

    protected boolean eliminar(int elemento) {
        if (estaVacia()) {
            return false;
        }

        Nodo actual = primerNodo;
        Nodo anterior = null;

        while (actual != null && actual.getElemento() != elemento) {
            anterior = actual;
            actual = actual.getAvanza();
        }

        if (actual == null) {
            return false;
        }
        if (actual == primerNodo) {
            primerNodo = primerNodo.getAvanza();
        } else if (actual == ultimoNodo) {
            ultimoNodo = anterior;
            anterior.setAvanza(null);
        } else {
            anterior.setAvanza(actual.getAvanza());
        }
        tamanio--;
        return true;
    }

    protected boolean actualizar(int elementoAnterior, int elementoNuevo) {
        if (estaVacia()) {
            return false;
        }
        Nodo actual = primerNodo;
        while (actual != null && actual.getElemento() != elementoAnterior) {
            actual = actual.getAvanza();
        }
        if (actual == null) {
            return false;
        }
        actual.setElemento(elementoNuevo);
        return true;
    }

    protected void imprimir() {
         if (estaVacia()) {
            System.out.println("La lista esta vacía");
            return;
        }
        Nodo actual = primerNodo;
        while (actual != null) {
            System.out.print(actual.getElemento() + " ");
            actual = actual.getAvanza();
        }
        System.out.println();

    }

    protected boolean estaVacia() {
        //primerNodo == null
        return tamanio == 0;
    }

    protected int getTamanio() {
        return tamanio;
    }
    
}
