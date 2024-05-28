/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GrafoNoDirigido;

import grafosproject.Paradas;
import grafosproject.Rutas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
public class GrafoNoDirigido {

    private final Map<Integer, Paradas> paradas;
    private final Map<Integer, List<Rutas>> listaAdyacencia;
    private final int[][] matrizAdyacencia;
    private int numParadas;
    private List<Paradas> listaParadas;

    public GrafoNoDirigido(int numParadas) {
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
        listaAdyacencia.putIfAbsent(indice, new ArrayList<>());
    }

    public void agregarRuta(int inicio, int fin, int distancia) {
        Rutas ruta = new Rutas(inicio, fin, distancia);
        listaAdyacencia.get(inicio).add(ruta);
        listaAdyacencia.get(fin).add(new Rutas(fin, inicio, distancia));
        matrizAdyacencia[inicio][fin] = distancia;
        matrizAdyacencia[fin][inicio] = distancia;
    }

    //Imprime la matrix del Grafo
    public void printGraphMatrix() {
        System.out.print("\n\n");
        System.out.println("Matriz de Adyacencia:");
        System.out.print("\n");
        
        int n = paradas.size();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(matriz[i], Integer.MAX_VALUE);
        }

        for (int i : listaAdyacencia.keySet()) {
            for (Rutas ruta : listaAdyacencia.get(i)) {
                matriz[i][ruta.fin] = ruta.distancia;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == Integer.MAX_VALUE) {
                    System.out.print("0 ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public void printListaAdyacencia() {
        System.out.print("\n\n");
        System.out.println("Lista de Adyacencia:");
        System.out.print("\n");
        
        for (int i : listaAdyacencia.keySet()) {
            System.out.print(paradas.get(i).nombre + " --- ");
            for (Rutas ruta : listaAdyacencia.get(i)) {
                System.out.print("(" + paradas.get(ruta.fin).nombre + ", " + ruta.distancia + " km) ");
            }
            System.out.println();
        }
    }

    public void bfs(int inicio) {
        Set<Integer> visitados = new HashSet<>();
        Queue<Integer> cola = new LinkedList<>();
        cola.add(inicio);
        visitados.add(inicio);
        
        System.out.print("\n\n");
        System.out.println("BFS2:");
        System.out.print("\n");

        while (!cola.isEmpty()) {
            int actual = cola.poll();
            System.out.println("Visitando parada: " + paradas.get(actual).nombre);

            for (Rutas ruta : listaAdyacencia.get(actual)) {
                if (!visitados.contains(ruta.fin)) {
                    cola.add(ruta.fin);
                    visitados.add(ruta.fin);
                }
            }
        }
    }

    public void dfs(int inicio) {
        Set<Integer> visitados = new HashSet<>();
        Stack<Integer> pila = new Stack<>();
        pila.push(inicio);
        visitados.add(inicio);

        System.out.print("\n\n");
        System.out.println("DFS2:");
        System.out.print("\n");

        while (!pila.isEmpty()) {
            int actual = pila.pop();
            System.out.println("Visitando: " + paradas.get(actual).nombre);

            for (Rutas ruta : listaAdyacencia.get(actual)) {
                if (!visitados.contains(ruta.fin)) {
                    pila.push(ruta.fin);
                    visitados.add(ruta.fin);
                }
            }
        }
    }

//    private void dfsUtil(int actual, boolean[] visitado) {
//        visitado[actual] = true;
//        System.out.print(actual + " ");
//        for (Rutas ruta : listaAdyacencia.get(actual)) {
//            if (!visitado[ruta.fin]) {
//                dfsUtil(ruta.fin, visitado);
//            }
//        }
//    }
    
    public void dijkstra(int inicio) {
        Map<Integer, Integer> distancias = new HashMap<>();
        PriorityQueue<Rutas> cola = new PriorityQueue<>(Comparator.comparingInt(r -> r.distancia));
        cola.add(new Rutas(inicio, inicio, 0));
        distancias.put(inicio, 0);

        while (!cola.isEmpty()) {
            Rutas actual = cola.poll();
            int distanciaActual = actual.distancia;

            if (distanciaActual > distancias.getOrDefault(actual.fin, Integer.MAX_VALUE)) {
                continue;
            }

            for (Rutas ruta : listaAdyacencia.get(actual.fin)) {
                int nuevaDistancia = distanciaActual + ruta.distancia;
                if (nuevaDistancia < distancias.getOrDefault(ruta.fin, Integer.MAX_VALUE)) {
                    distancias.put(ruta.fin, nuevaDistancia);
                    cola.add(new Rutas(ruta.fin, ruta.fin, nuevaDistancia));
                }
            }
        }

        System.out.print("\n");
        for (Map.Entry<Integer, Integer> entry : distancias.entrySet()) {
            System.out.println("Distancia desde " + paradas.get(inicio).nombre + " a " + paradas.get(entry.getKey()).nombre + " es " + entry.getValue() + " km");
        }
    }
}
