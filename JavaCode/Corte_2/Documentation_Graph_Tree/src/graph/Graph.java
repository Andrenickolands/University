/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graph;
import java.util.*;
/**
 *
 * @author nicolas sepulveda
 */
/**
 * Esta es la segunda clase del proyecto Graoh donde se desarrolla el código para la construcción del grafo
 * En esta clase existe una variable de tipo entero llamada V y lista de tipo entero llamada adjList e importamo tola la clase java.util
 */
public class Graph {
    //variable que representa la cantidad de vértices del grafo
    int V;
    //lista tipo entero que sirve para almacenar la información del grafo 
    List<List<Integer>> adjList;

    //método constructor público de tipo Graph que recibe un parámetro, la variable de tipo entero V
    public Graph(int V) {
        //Inicializa el parametro int V
        this.V = V;
        //Crea la lista ArrayList con V elementos y la nombra adjList
        adjList = new ArrayList<>(V);
        //ciclo for utilizado para agregar datos a adjList a través del método .add()
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    //método público de tipo void llamado addEdge que ingresa 2 parámetros de tipo entero, el primero src que significa search y el segundo dest que significa destino
    public void addEdge(int src, int dest) {
        //usando el método .get() obtiene src de la lista tomando el vértice y su posición
        //Usando el método .add() obteniendo un elemento como vértice destino
        adjList.get(src).add(dest);
    }

    
    //método privado de tipo Boolean llamado isCyclicUtil que ingresa los parámetros int v, boolean[] visited "visitado", y int parent "parentesco"
    private boolean isCyclicUtil(int v, boolean[] visited, int parent) {
        //inicializa la matriz de booleanos con tamaño v, en true
        visited[v] = true;
        //crea un ciclo for ich de tipo entero que recorre el método get que obtiene los valores de la lista
        for (Integer i : adjList.get(v)) {
            //crea un ciclo condicional if que evalué si la matriz booleana recorrida con i no ha sido visitada previamente 
            if (!visited[i]) {
                //En este ciclo condicional recursivo se evalua si isCyclicUtil usando los argumentos i, visited, y v ha detectado un ciclo en el grafo
                if (isCyclicUtil(i, visited, v)) {
                    return true;
                }
            //Sino en este ciclo se evalua si el vertice actual i es diferente al pariente y si lo es retorna true indicando la presencia de un ciclo
            } else if (i != parent) {
                return true;
            }
        }
        //si retorna falso no hay presencia de ciclo
        return false;
    }

    //método público de tipo boolean llamado isCyclic
    public boolean isCyclic() {
        //se crea un arreglo de tipo boolean que ingresa los vértices visitados
        boolean[] visited = new boolean[V];
        //Se crea un ciclo for que recorre los vértices
        for (int i = 0; i < V; i++) {
             //crea un ciclo condicional if que evalué si la matriz booleana recorrida con i no ha sido visitada previamente 
            if (!visited[i]) {
                //si no ha sido visitada previamente evalua si existe un clico desde el vertice actual 
                if (isCyclicUtil(i, visited, -1)) {
                    return true;
                }
            }
        }
        //si retorna falso no hay presencia de ciclo
        return false;
    }
}
