/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GrafoPonerado;

/**
 *
 * @author Nico
 */
public class Nodo implements Comparable<Nodo> {

    String estacion;
    int distancia;

    public Nodo(String estacion, int distancia) {
        this.estacion = estacion;
        this.distancia = distancia;
    }

    @Override
    public int compareTo(Nodo otro) {
        return Integer.compare(this.distancia, otro.distancia);
    }

}
