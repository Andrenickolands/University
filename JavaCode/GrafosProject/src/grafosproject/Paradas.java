
package grafosproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nico
 */
public class Paradas implements Comparable<Paradas> {
    
    public String nombre;
    public int indice; 
    public List<Rutas> adjacencies = new ArrayList<>();
    public Double minDistance = Double.POSITIVE_INFINITY;
    public Paradas previous;

    public Paradas(int indice, String nombre) {
        this.indice = indice;
        this.nombre = nombre;
    }
    
     @Override
    public int compareTo(Paradas other) {
        return Double.compare(this.minDistance, other.minDistance);
    }

    @Override
    public String toString() {
        return "(" + indice + ": " + nombre + ")";
    }

    public String getNombre() {
        return nombre;
    }
    
}