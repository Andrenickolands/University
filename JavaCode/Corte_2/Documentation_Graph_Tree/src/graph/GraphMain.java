/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graph;

/**
 *
 * @author nicolas sepulveda
 */
/**
 * Este proyecto de un grafo dirigiddo consta de 
 * dos clases una donde se desarrolla el grafo (Graph.java) y otra clase main donde se verifica el grafo (GraphMain)
 */

public class GraphMain {
    //clase main que ejecuta el código
    public void main() {
        //creación de un objeto de tipo Graph llamado graph con un tamaño de 4 vertices
        Graph graph = new Graph(4);
        //agrega una arista entre los vertices 0 y 1 usando el método .addEdge con sus parámetros src y dest
        graph.addEdge(0, 1);
        //agrega una arista entre los vertices 1 y 2
        graph.addEdge(1, 2);
        //agrega una arista entre los vertices 2 y 3
        graph.addEdge(2, 3);
        // Si agregamos una arista que crea un ciclo
        // graph.addEdge(3, 0);

        //Se crea un ciclo condicional if donde pregunta si el grafo es ciclico a través del método (.isCyclic()), retornarndo un resultado si se cumple o sino la condición
        if (graph.isCyclic()) {
            System.out.println("El grafo contiene ciclos.");
        } else {
            System.out.println("El grafo no contiene ciclos.");
        }
    }
}

