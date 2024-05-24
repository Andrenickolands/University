/*
   listas
 */
package proyectofinal_primercorte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nicolás
 */
public class estudiantes {
    //Scanner

    Scanner data = new Scanner(System.in);

    //lIstas
    List<String> nombres = new ArrayList<>();

    //variables
    String nom, nomNuevo, nomBuscar;
    int numeral = 1;
    

    protected void ingresarEstudiantes() {
        System.out.println("\nDigita el nombre del estudiante a agregar a la lista");
        nom = data.next();

        nombres.add(nom);
    }

    public List<String> getNombres() {
        return nombres;
    }
 
    protected int imprimirEstudiantes() {
        if (!nombres.isEmpty()) {
            System.out.println("\nLos estudiates son: ");
            for (int i = 0; i < nombres.size(); i++) {
                System.out.println(numeral + ") " + nombres.get(i));
                numeral++;
            }
        } else {
            System.out.println("Lista vacia");
        }
        return numeral;
    }

    protected void actualizarEstudiantes() {
        System.out.println("Digita el nombre que quieres actualizar");
        nom = data.next();

        System.out.println("Digita el nuevo nombre");
        nomNuevo = data.next();

        int index = nombres.indexOf(nom);
        if (index != -1) {
            nombres.set(index, nomNuevo);
            System.out.println("El cambio se realizó exitosamente");
        } else {
            System.out.println("El dato " + nom + " no se encontró en la lista");
        }
    }

    protected void eliminarListasUnDato() {
        System.out.println("\nDigita el nombre a eliminar de la lista");
        nomNuevo = data.next();

        if (nombres.remove(String.valueOf(nomNuevo))) {
            System.out.println("Se eliminó exitosamente");
        } else {
            System.out.println("El nombre " + nomNuevo + " no se encontró en la lista");
        }
    }

    protected void eliminarLista() {
        nombres.clear();
    }

    protected void buscarEstudiantes() {
        System.out.println("Digita el dato a buscar en la lista?");
        nomBuscar = data.next();
        System.out.println(nombres.contains(nomBuscar));
    }

    protected void ImprimirCantidadEstudiantes() {
        System.out.println("\nLos estudiantes son");
        System.out.println(nombres.size());
    }

    public int cantidadEstudiantes() {
        int cantidadEst = nombres.size();
        return cantidadEst;
    }

}
