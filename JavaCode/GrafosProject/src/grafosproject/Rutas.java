package grafosproject;

/**
 *
 * @author Nico
 */
public class Rutas {

    public int inicio;
    public int fin;
    public int distancia;
    public Paradas destino;

    public Rutas(int inicio, int fin, int distancia) {
        this.inicio = inicio;
        this.fin = fin;
        this.distancia = distancia;
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "(" + inicio + " --> " + fin + ", " + distancia + ")";
    }

}
