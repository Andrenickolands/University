package documentation_graph_tree;

import java.util.InputMismatchException;
import java.util.Scanner;
import graph.GraphMain;
import tree.TreeMain;

/**
 *
 * @author nicolas sepulveda
 */
public class Documentation_Graph_Tree {

    //scanner
    Scanner data = new Scanner(System.in);
    //variable menu
    boolean salir = false;

    //objetos de las clases main
    GraphMain GR = new GraphMain();
    TreeMain TR = new TreeMain();

    //método main
    public static void main(String[] args) {
        //objeto que permite llamar al metodo menu
        Documentation_Graph_Tree sd = new Documentation_Graph_Tree();
        sd.menu();
    }

    //método protegido de tipo void llamado menú
    protected void menu() {
        //variable del switch
        int opcion;

        //ciclo while que evalua salir
        while (!salir) {
            System.out.println("\t\n Hola bienvenido");
            System.out.println("1. Grafo");
            System.out.println("2. Árbol");
            System.out.println("3. Salir");

            //gestión de excepciones try que evalua la escritura de valores de tipo entero
            try {
                System.out.println("\t\nDigita un numero para escoger la opcion: ");
                //variable que guarda los datos de tipo entero ingresado a través del scanner
                opcion = data.nextInt();

                //función switch que evalua 3 opciones incluyendo default
                switch (opcion) {
                    case 1 ->
                        graph();
                    case 2 ->
                        tree();
                    default ->
                        System.out.println("Opcion no valida, intenta de nuevo");
                }

            } catch (InputMismatchException e) {
                System.out.println("Debes escribir un numero");
                String next = data.next();
            }
        }
        System.out.println("Adios un gusto");
    }

    //método que llama al grafo
    protected void graph() {
        GR.main();
    }

    //método que llama al árbol
    protected void tree() {
        TR.main();
    }
}
