
package GrafoPonerado;

/**
 *
 * @author Nico
 */
public class Arista {
    String destino;
    int distancia;

    public Arista(String destino, int distancia) {
        this.destino = destino;
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "(" + destino + ", " + distancia + ")";
    }
    
}
