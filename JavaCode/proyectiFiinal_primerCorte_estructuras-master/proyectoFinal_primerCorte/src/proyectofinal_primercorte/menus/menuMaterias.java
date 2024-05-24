/*

 */
package proyectofinal_primercorte.menus;

/**
 *
 * @author Nicolás
 */
import java.util.Scanner;
import proyectofinal_primercorte.materias;

public class menuMaterias {

    Scanner data = new Scanner(System.in);

    String materiaAnterior;
    String materiaNueva;
    String materiaEliminar;
    String materiaAgregar;
    int j = 1;

    materias MA = new materias();

    public void agregarMaterias() {
        MA.agregarMateria("Ingles");
        MA.agregarMateria("Matematicas");
        MA.agregarMateria("Religion");
        MA.agregarMateria("Etica");
        MA.agregarMateria("Espanol");
        MA.agregarMateria("Arte");
        MA.agregarMateria("Musica");
        MA.agregarMateria("Educacion fisica");
        MA.agregarMateria("Filosofia");
        MA.agregarMateria("Quimica");
        MA.agregarMateria("Sociales");

//        // Eliminar un elemento
//        MA.eliminarMateria("");
//
//        // Actualizar un elemento
//        MA.actualizarMateria("", "");
        // Imprimir la lista
//        System.out.println("\nLista despues de eliminar y actualizar:");
//        MA.imprimirMateria();
        // Tamaño de la lista
//        System.out.println("\nTamanio de la lista: " + MA.getCantidadMaterias());

        String resp;

        do {
            System.out.println("\tMateria" + j++);
            data.nextLine();
            System.out.println("Ingresa el nombre de la materia ");
            materiaAgregar = data.nextLine();

            MA.agregarMateria(materiaAgregar);
            System.out.println("Tarea agregada exitosamente.");

            System.out.println("Desea agregar otra tarea? (S/N)");
            resp = data.next();

        } while (resp.equalsIgnoreCase("S"));
    }

    public void imprimirMaterias() {
        System.out.println("\n");

        // Imprimir la lista
        System.out.println("\nLista de materias:");
        MA.imprimirMateria();
        System.out.println("\nLa cantidad de materias es:");
        MA.getCantidadMaterias();
    }

    public void actualziadorMaterias() {
        System.out.println("\n");

        // Imprimir la lista
        System.out.println("\nQue materia quieres cambiar:");
        materiaAnterior = data.nextLine();
        System.out.println("\nPor cual la quieres cambiar:");
        materiaNueva = data.nextLine();

        MA.actualizarMateria(materiaAnterior, materiaNueva);
    }

    public void eliminadorMaterias() {
        System.out.println("\n");

        // Imprimir la lista
        System.out.println("\nQue materia quieres eliminar:");
        materiaEliminar = data.nextLine();

        MA.eliminarMateria(materiaEliminar);
    }

}
