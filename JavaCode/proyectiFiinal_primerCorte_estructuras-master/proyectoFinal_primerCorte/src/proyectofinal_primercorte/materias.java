/*
   listaEnlazada
 */
package proyectofinal_primercorte;

import java.util.List;
import proyectofinal_primercorte.menus.menuMaterias;

/**
 *
 * @author Nicolás
 */
public class materias {
    
     //variables
    private nodo primerNodo;
    private nodo ultimoNodo;
    private int tamanio;

    //lista
    private List<nodo> materias;

    public materias() {
        this.primerNodo = null;
        this.ultimoNodo = null;
        this.tamanio = 0;
    }

    public void agregarMateria(String materia) {
        nodo nuevoNodo = new nodo(materia);

        if (estaVaciaLaMateria()) {
            primerNodo = ultimoNodo = nuevoNodo;
        } else {
            ultimoNodo.setAvanza(nuevoNodo);
            ultimoNodo = nuevoNodo;
        }
        tamanio++;
    }

    public boolean eliminarMateria(String materia) {
        if (estaVaciaLaMateria()) {
            return false;
        }

        nodo actual = primerNodo;
        nodo anterior = null;

        while (actual != null && actual.getMateria() != materia) {
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

    public boolean actualizarMateria(String materiaAnterior, String materiaNueva) {
        if (estaVaciaLaMateria()) {
            return false;
        }
        nodo actual = primerNodo;
        while (actual != null && actual.getMateria() != materiaAnterior) {
            actual = actual.getAvanza();
        }
        if (actual == null) {
            return false;
        }
        actual.setMateria(materiaNueva);
        return true;
    }

    public void imprimirMateria() {
         if (estaVaciaLaMateria()) {
            System.out.println("La lista esta vacía");
            return;
        }
        nodo actual = primerNodo;
        while (actual != null) {
            System.out.print(actual.getMateria() + " ");
            actual = actual.getAvanza();
        }
        System.out.println();

    }

    public boolean estaVaciaLaMateria() {
        //primerNodo == null
        return tamanio == 0;
    }

    public int getCantidadMaterias() {
        return tamanio;
    }

}
