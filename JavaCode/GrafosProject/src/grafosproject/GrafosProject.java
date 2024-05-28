/*

 */
package grafosproject;

import GrafoDirigido.GrafoDirigido;
import GrafoNoDirigido.GrafoNoDirigido;
import GrafoPonerado.GrafoPonderado;
import Multigrafo.Multigrafo;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class GrafosProject {

    //Scanner
    Scanner data = new Scanner(System.in);
    //Variable del menú
    boolean salir = false;

    public static void main(String[] args) throws IOException {
        GrafosProject sd = new GrafosProject();
        sd.menu();
    }

    protected void menu() throws IOException {
        int opcion;

        while (!salir) {
            System.out.println("\t\n Hola bienvenido");
            System.out.println("1. Grafo dirigido - trasmilenio");
            System.out.println("2. Grafo no dirigido - avenidas");
            System.out.println("3. Grafo ponderado - metro");
            System.out.println("4. Multigrafo - codigos de parada");
            System.out.println("5. Salir");

            try {
                System.out.println("\t\nDigita un numero para escoger la opcion: ");
                opcion = data.nextInt();

                switch (opcion) {
                    case 1 ->
                        GrafoDirigido();
                    case 2 ->
                        GrafoNoDirigido();
                    case 3 ->
                        GrafoPonderado();
                    case 4 ->
                        Multigrafo();
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

    public void GrafoDirigido() {

        GrafoDirigido graph = new GrafoDirigido(7);

        graph.agregarParada(0, "Portal banderas");
        graph.agregarParada(1, "Marsella");
        graph.agregarParada(2, "Av boyaca");
        graph.agregarParada(3, "Ricaurte");
        graph.agregarParada(4, "De la sabana");
        graph.agregarParada(5, "calle 34");
        graph.agregarParada(6, "calle 76");

        graph.agregarRuta(0, 1, 4);
        graph.agregarRuta(1, 2, 8);
        graph.agregarRuta(2, 3, 9);
        graph.agregarRuta(3, 4, 4);
        graph.agregarRuta(4, 5, 3);
        graph.agregarRuta(5, 6, 2);

        graph.printGraphMatrix();
        graph.printListaAdyacencia();

        graph.bfs(0);

        graph.dfs(6);

        graph.dijkstraDistanciaRecorrida(0);

        graph.dijkstraCamino(0, 6);

    }

    public void GrafoNoDirigido() {

        GrafoNoDirigido graph = new GrafoNoDirigido(7);

        graph.agregarParada(0, "Avenida boyaca");
        graph.agregarParada(1, "Avenida cali");
        graph.agregarParada(2, "Avenida americas");
        graph.agregarParada(3, "Avenida guayacane");
        graph.agregarParada(4, "Avenida calle 13");
        graph.agregarParada(5, "Avenida NQS");
        graph.agregarParada(6, "Autopista norte");

        graph.agregarRuta(0, 4, 2);
        graph.agregarRuta(1, 5, 4);
        graph.agregarRuta(2, 6, 3);
        graph.agregarRuta(3, 2, 8);
        graph.agregarRuta(4, 1, 20);
        graph.agregarRuta(5, 0, 30);

        graph.printGraphMatrix();
        graph.printListaAdyacencia();

        graph.bfs(0);

        graph.dfs(4);
        
        graph.dijkstra(0);

    }

    public void GrafoPonderado() {
        GrafoPonderado graph = new GrafoPonderado();
        graph.agregarEstacion("Estacion A");
        graph.agregarEstacion("Estacion B");
        graph.agregarEstacion("Estacion C");
        graph.agregarEstacion("Estacion D");

        graph.agregarRuta("Estacion A", "Estacion B", 5);
        graph.agregarRuta("Estacion A", "Estacion C", 10);
        graph.agregarRuta("Estacion B", "Estacion D", 3);
        graph.agregarRuta("Estacion C", "Estacion D", 2);

        graph.imprimirMatrizAdyacencia();
        graph.imprimirListaAdyacencia();
        System.out.print("\n\n");
        System.out.println("BFS:");
        graph.bfs("Estacion D");
        System.out.print("\n\n");
        System.out.println("DFS:");
        graph.dfs("Estacion C");
        
        System.out.print("\n\n");
        System.out.println("Dijkstra:");
        Map<String, Integer> distancias = graph.dijkstra("Estacion A");
        System.out.println("Distancias desde A:");
        for (Map.Entry<String, Integer> entrada : distancias.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }

    public void Multigrafo() {
        Multigrafo graph = new Multigrafo();
        System.out.print("\n\n");
        System.out.println("CODIGOS DE PARADA: ");
        System.out.print("\n");
        graph.addArista(0, 1, 4.0);
        graph.addArista(0, 1, 2.0); // Segunda arista entre los mismos vértices con diferente peso
        graph.addArista(0, 4, 1.5);
        graph.addArista(1, 2, 3.2);
        graph.addArista(1, 2, 2.5); // Segunda arista entre los mismos vértices con diferente peso
        graph.addArista(1, 3, 2.2);
        graph.addArista(1, 4, 2.8);
        graph.addArista(2, 3, 4.1);
        graph.addArista(3, 4, 3.5);

        graph.printGraph();
        graph.printGraphMatrix();
        
        System.out.print("\n\n");
        System.out.print("DFS");
        System.out.print("\n");
        graph.dfs(0);
        System.out.print("\n\n");
        System.out.print("BFS");
        System.out.print("\n");
        graph.bfs(0);
        System.out.print("\n\n");
        System.out.print("Dijkstra");
        System.out.print("\n");
        graph.dijkstra(0);
    }

}
