package Multigrafo;

import java.util.ArrayList;
import java.util.Comparator;
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
public class Multigrafo {

    private Map<Integer, List<MultiAristas>> adjList; // Lista de adyacencia para almacenar el grafo
    private double[][] adjacencyMatrix; //Matrix de adyancencia
    private int numVertices;
    
    public Multigrafo() {
        adjList = new HashMap<>();
        adjacencyMatrix = new double[numVertices][numVertices];
        numVertices = 0;
    }

    // Método para añadir un vértice al grafo
    public void addVertice(int vertice) {
        adjList.putIfAbsent(vertice, new ArrayList<>());
        numVertices = Math.max(numVertices, vertice + 1);
        adjacencyMatrix = new double[numVertices][numVertices];
    }

    // Método para añadir una arista al grafo
    public void addArista(int source, int destination, double value) {
        this.addVertice(source);
        this.addVertice(destination);
        adjList.get(source).add(new MultiAristas(destination, value));
        adjList.get(destination).add(new MultiAristas(source, value)); // Comentar esta línea para un multigrafo dirigido

        adjacencyMatrix[source][destination] = value;
        adjacencyMatrix[destination][source] = value; // Si el grafo es no dirigido
    }

    // Método para imprimir la lista de adjacencia
    public void printGraph() {
        System.out.println("Lista de Adyacencia:");
        System.out.print("\n");
        for (int vertice : adjList.keySet()) {
            System.out.println("Codigo de parada " + vertice + " está conectada con las rutas " + adjList.get(vertice));
        }
    }

    //Imprime la matrix del Grafo
    public void printGraphMatrix() {
        System.out.print("\n\n");
        System.out.println("Matriz de Adyacencia:");
        System.out.print("\n");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Implementación de DFS
    public void dfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            int vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                System.out.print(vertex + " ");
                for (MultiAristas edge : adjList.get(vertex)) {
                    if (!visited.contains(edge.destination)) {
                        stack.push(edge.destination);
                    }
                }
            }
        }
    }

    // Implementación de BFS
    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");
            for (MultiAristas edge : adjList.get(vertex)) {
                if (!visited.contains(edge.destination)) {
                    visited.add(edge.destination);
                    queue.add(edge.destination);
                }
            }
        }
    }

    // Implementación del Algoritmo de Dijkstra
    public void dijkstra(int start) {
        Map<Integer, Double> distances = new HashMap<>();
        for (int vertex : adjList.keySet()) {
            distances.put(vertex, Double.MAX_VALUE);
        }
        distances.put(start, 0.0);

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.comparingDouble(distances::get));
        priorityQueue.add(start);

        while (!priorityQueue.isEmpty()) {
            int current = priorityQueue.poll();
            for (MultiAristas edge : adjList.get(current)) {
                double newDist = distances.get(current) + edge.value;
                if (newDist < distances.get(edge.destination)) {
                    distances.put(edge.destination, newDist);
                    priorityQueue.add(edge.destination);
                }
            }
        }

        // distancia más corta
        for (Map.Entry<Integer, Double> entry : distances.entrySet()) {
            System.out.println("Distancia desde " + start + " hacia " + entry.getKey() + " es: " + entry.getValue());
        }
    }
}
