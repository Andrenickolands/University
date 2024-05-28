package GrafoDirigido;

import grafosproject.Paradas;
import grafosproject.Rutas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Nico
 */
// paradas = vertices
//numParadas = numVertices
public class GrafoDirigido {

    private final Map<Integer, Paradas> paradas;
    private final Map<Integer, List<Rutas>> listaAdyacencia;
    private final int[][] matrizAdyacencia;
    private int numParadas;
    private List<Paradas> listaParadas;

    public GrafoDirigido(int numParadas) {
        this.paradas = new HashMap<>();
        this.listaAdyacencia = new HashMap<>();
        this.matrizAdyacencia = new int[numParadas][numParadas];
        for (int i = 0; i < numParadas; i++) {
            Arrays.fill(this.matrizAdyacencia[i], Integer.MAX_VALUE);
        }
        listaParadas = new ArrayList<>();
        this.numParadas = numParadas;
    }

    public void agregarParada(int indice, String nombre) {
        Paradas parada = new Paradas(indice, nombre);
        paradas.put(indice, parada);
        listaAdyacencia.put(indice, new ArrayList<>());
    }

    public void agregarRuta(int inicio, int fin, int distancia) {
        Rutas ruta = new Rutas(inicio, fin, distancia);
        listaAdyacencia.get(inicio).add(ruta);
        matrizAdyacencia[inicio][fin] = distancia;
    }

    //Imprime la matrix del Grafo
    public void printGraphMatrix() {
        System.out.print("\n\n");
        System.out.println("Matriz de Adyacencia:");
        System.out.print("\n");
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            for (int j = 0; j < matrizAdyacencia[i].length; j++) {
                if (matrizAdyacencia[i][j] == Integer.MAX_VALUE) {
                    System.out.print("0 ");
                } else {
                    System.out.print(matrizAdyacencia[i][j] + " ");
                }
            }
            System.out.println();
        }

//        for (int i = 0; i < numParadas; i++) {
//            for (int j = 0; j < numParadas; j++) {
//                System.out.print(matrizAdyacencia[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

    //imprime la lista de adyacencia
    public void printListaAdyacencia() {
        System.out.print("\n\n");
        System.out.println("Lista de Adyacencia:");
        System.out.print("\n");

        for (int key : listaAdyacencia.keySet()) {
            for (Rutas ruta : listaAdyacencia.get(key)) {
                System.out.println("Inicio: " + key + ": " + " -- " + ruta.distancia + " km -->" + " Fin: " + ruta.fin);
            }
        }
    }

    public void bfs(int inicio) {
        boolean[] visitado = new boolean[paradas.size()];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(inicio);
        visitado[inicio] = true;
        
        System.out.print("\n\n");
        System.out.println("BFS2:");
        System.out.print("\n");

        while (!queue.isEmpty()) {
            int actual = queue.poll();
            System.out.print(actual + " ");
            for (Rutas ruta : listaAdyacencia.get(actual)) {
                if (!visitado[ruta.fin]) {
                    queue.add(ruta.fin);
                    visitado[ruta.fin] = true;
                }
            }
        }
        System.out.println();
    }

    public void dfs(int inicio) {
        boolean[] visitado = new boolean[paradas.size()];
        System.out.print("\n\n");
        System.out.println("DFS2:");
        System.out.print("\n");
        
        dfsUtil(inicio, visitado);
        System.out.println();
    }

    private void dfsUtil(int actual, boolean[] visitado) {
        visitado[actual] = true;
        System.out.print(actual + " ");
        for (Rutas ruta : listaAdyacencia.get(actual)) {
            if (!visitado[ruta.fin]) {
                dfsUtil(ruta.fin, visitado);
            }
        }
    }
    
    
    // Método para realizar la búsqueda de Dijkstra
    public void dijkstraCamino(int inicio, int fin) {
        int n = paradas.size();
        int[] dist = new int[n];
        int[] prev = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(prev, -1);
        dist[inicio] = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(i -> dist[i]));
        pq.add(inicio);

        while (!pq.isEmpty()) {
            int u = pq.poll();
            if (u == fin) break;

            for (Rutas ruta : listaAdyacencia.get(u)) {
                int v = ruta.fin;
                int weight = ruta.distancia;
                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    prev[v] = u;
                    pq.add(v);
                }
            }
        }

        // Imprimir distancia y camino
        System.out.print("\n\n");
        System.out.println("Dijkstra:");
        System.out.print("\n");
        System.out.println("Distancia desde la parada " + inicio + " hasta la parada " + fin + ": " +  dist[fin]);
        System.out.print("Camino: ");
        printPath(prev, fin);
    }
    
    private void printPath(int[] prev, int fin) {
        List<Integer> path = new ArrayList<>();
        for (int at = fin; at != -1; at = prev[at]) {
            path.add(at);
        }
        Collections.reverse(path);
        System.out.println("Path: " + path);
    }

    public void dijkstraDistanciaRecorrida(int inicio) {
        int[] distancias = new int[paradas.size()];
        boolean[] visitado = new boolean[paradas.size()];
        Arrays.fill(distancias, Integer.MAX_VALUE);
        distancias[inicio] = 0;

        for (int i = 0; i < paradas.size(); i++) {
            int u = minDistancia(distancias, visitado);
            visitado[u] = true;

            for (Rutas ruta : listaAdyacencia.get(u)) {
                if (!visitado[ruta.fin] && distancias[u] != Integer.MAX_VALUE && distancias[u] + ruta.distancia < distancias[ruta.fin]) {
                    distancias[ruta.fin] = distancias[u] + ruta.distancia;
                }
            }
        }

        printDistanciaRecorrida(distancias);
    }

    private int minDistancia(int[] distancias, boolean[] visitado) {
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int v = 0; v < distancias.length; v++) {
            if (!visitado[v] && distancias[v] <= min) {
                min = distancias[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    private void printDistanciaRecorrida(int[] distancias) {
        System.out.print("\n\n");
        System.out.println("Distancia recorrida por parada desde el inicio con Dijkstra:");
        System.out.print("\n");

        for (int i = 0; i < distancias.length; i++) {
            System.out.println("Parada " + i + ": " + (distancias[i] == Integer.MAX_VALUE ? "INF" : distancias[i]) + " km");
        }
    }

}













//    public void CalcularRutas(Paradas source) {
//        source.minDistance = 0.0;
//        PriorityQueue<Paradas> paradaQueue = new PriorityQueue<>();
//        paradaQueue.add(source);
//
//        while (!paradaQueue.isEmpty()) {
//            Paradas u = paradaQueue.poll();
//
//            for (Rutas e : u.adjacencies) {
//                Paradas v = e.destino;
//                double distancia = e.distancia;
//                double distanceThroughU = u.minDistance + distancia;
//
//                if (distanceThroughU < v.minDistance) {
//                    paradaQueue.remove(v);
//                    v.minDistance = distanceThroughU;
//                    v.previous = u;
//                    paradaQueue.add(v);
//                }
//            }
//        }
//    }
//
//    public List<Paradas> getRutaMasCorta(Paradas destino) {
//        List<Paradas> path = new ArrayList<>();
//        for (Paradas parada = destino; parada != null; parada = parada.previous) {
//            path.add(parada);
//        }
//        Collections.reverse(path);
//        return path;
//    }

//        graph.CalcularRutas(0);

//        System.out.println("Distancia a " + 6.nombre + ": " + 6.minDistance);
//        List<Paradas> parada = getRutaMasCorta(6);
//        System.out.println("Path: " + parada);



//public void bfs3(int inicio) {
//        Set<Integer> visited = new HashSet<>();
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(inicio);
//        visited.add(inicio);
//
//        while (!queue.isEmpty()) {
//            int parada = queue.poll();
//            System.out.print(parada + " ");
//            for (Rutas ruta : listaAdyacencia.get(parada)) {
//                if (!visited.contains(ruta.fin)) {
//                    queue.add(ruta.fin);
//                    visited.add(ruta.fin);
//                }
//            }
//        }
//        System.out.println();
//    }
//
//    public void dfs3(int inicio) {
//        Set<Integer> visited = new HashSet<>();
//        Stack<Integer> stack = new Stack<>();
//        stack.push(inicio);
//
//        while (!stack.isEmpty()) {
//            int parada = stack.pop();
//            if (!visited.contains(parada)) {
//                System.out.print(parada + " ");
//                visited.add(parada);
//                for (Rutas ruta : listaAdyacencia.get(parada)) {
//                    if (!visited.contains(ruta.fin)) {
//                        stack.push(ruta.fin);
//                    }
//                }
//            }
//        }
//        System.out.println();
//    }