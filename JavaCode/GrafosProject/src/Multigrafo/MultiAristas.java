
package Multigrafo;

/**
 *
 * @author Nico
 */
public class MultiAristas {
    int destination;
    double value;

    public MultiAristas(int destination, double value) {
        this.destination = destination;
        this.value = value;
    }

    @Override
    public String toString() {
        return "(" + destination + ", " + value + ")";
    }

}
