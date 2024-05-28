package GrafoPonerado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author Nico
 */
//tren
public class GrafoPonderado {

    private Map<String, List<Arista>> adjList;
    private Map<String, Integer> parada;

    public GrafoPonderado() {
        this.adjList = new HashMap<>();
        this.parada = new HashMap<>();
    }

    public void agregarEstacion(String estacion) {
        adjList.putIfAbsent(estacion, new ArrayList<>());
        parada.putIfAbsent(estacion, parada.size());
    }

    public void agregarRuta(String origen, String destino, int distancia) {
        adjList.get(origen).add(new Arista(destino, distancia));
    }

    public void bfs(String inicio) {
        Set<String> visitados = new HashSet<>();
        Queue<String> cola = new LinkedList<>();
        cola.add(inicio);
        visitados.add(inicio);

        while (!cola.isEmpty()) {
            String estacion = cola.poll();
            System.out.print(estacion + " ");
            for (Arista arista : adjList.get(estacion)) {
                if (!visitados.contains(arista.destino)) {
                    visitados.add(arista.destino);
                    cola.add(arista.destino);
                }
            }
        }
        System.out.println();
    }

    public void dfs(String inicio) {
        Set<String> visitados = new HashSet<>();
        Stack<String> pila = new Stack<>();
        pila.push(inicio);

        while (!pila.isEmpty()) {
            String estacion = pila.pop();
            if (!visitados.contains(estacion)) {
                visitados.add(estacion);
                System.out.print(estacion + " ");
                for (Arista arista : adjList.get(estacion)) {
                    if (!visitados.contains(arista.destino)) {
                        pila.push(arista.destino);
                    }
                }
            }
        }
        System.out.println();
    }

    public void imprimirMatrizAdyacencia() {
        int n = parada.size();
        int[][] matriz = new int[n][n];

        for (String estacion : parada.keySet()) {
            int i = parada.get(estacion);
            for (Arista arista : adjList.get(estacion)) {
                int j = parada.get(arista.destino);
                matriz[i][j] = arista.distancia;
            }
        }

        System.out.print("\n\n");
        System.out.println("Matriz de Adyacencia:");
        System.out.print("\n");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public void imprimirListaAdyacencia() {
        System.out.print("\n\n");
        System.out.println("Lista de Adyacencia:");
        System.out.print("\n");
        for (String estacion : adjList.keySet()) {
            System.out.print(estacion + ": ");
            for (Arista arista : adjList.get(estacion)) {
                System.out.print(arista.destino + "(" + arista.distancia + " km) ");
            }
            System.out.println();
        }
    }
    
    public Map<String, Integer> dijkstra(String inicio) {
        Map<String, Integer> distancias = new HashMap<>();
        PriorityQueue<Nodo> colaPrioridad = new PriorityQueue<>();
        Set<String> visitados = new HashSet<>();

        // Inicializar distancias
        for (String estacion : adjList.keySet()) {
            distancias.put(estacion, Integer.MAX_VALUE);
        }
        distancias.put(inicio, 0);
        colaPrioridad.add(new Nodo(inicio, 0));

        while (!colaPrioridad.isEmpty()) {
            Nodo actual = colaPrioridad.poll();
            String estacionActual = actual.estacion;

            if (!visitados.contains(estacionActual)) {
                visitados.add(estacionActual);

                for (Arista arista : adjList.get(estacionActual)) {
                    String destino = arista.destino;
                    int nuevaDistancia = distancias.get(estacionActual) + arista.distancia;

                    if (nuevaDistancia < distancias.get(destino)) {
                        distancias.put(destino, nuevaDistancia);
                        colaPrioridad.add(new Nodo(destino, nuevaDistancia));
                    }
                }
            }
        }

        return distancias;
    }

}
