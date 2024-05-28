/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GrafoSimple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nico
 */
public class GrafoSimple {
    private Map<Integer, List<Integer>> adjList; // Lista de adyacencia para almacenar el grafo
    private int[][] adjacencyMatrix; //Matrix de adyancencia
    private int numVertices;

    public GrafoSimple(int numVertices) {
        adjList = new HashMap<>();
        this.numVertices = numVertices;
        adjacencyMatrix = new int[numVertices][numVertices];
    }

    // Método para añadir un vértice al grafo
    private void addVertice(int vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }
    
    // Método para añadir una arista al grafo
    private void addArista(int source, int destination, int value) {
        this.addVertice(source);
        this.addVertice(destination);
        adjList.get(source).add(destination);
        adjList.get(destination).add(source); // Comentar esta línea para un grafo dirigido
        
        adjacencyMatrix[source][destination] = value;
        adjacencyMatrix[destination][source] = value; // Si el grafo es no dirigido
    }

    // Método para obtener la lista de adyacencia del grafo
    public Map<Integer, List<Integer>> getAdjList() {
        return adjList;
    }

    // Método para imprimir el grafo
    public void printGraph() {
        for (int vertice : adjList.keySet()) {
            System.out.println("Vertice " + vertice + " está conectado con " + adjList.get(vertice));
        }
    }
    
    //Imprime la matrix del Grafo
    public void printGraphMatrix() {
        System.out.println("Matriz de Adyacencia:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    
}
