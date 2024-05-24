/*

 */
package ejercicio3_estructuradedatos2;

/**
 *
 * @author AndresNicolasSepulve
 */
class Nodo {

    private int elemento;
    private Nodo avanza;

    protected Nodo(int elem) {
        this.elemento = elem;
        this.avanza = null;
    }

    protected int getElemento() {
        return elemento;
    }

    protected void setElemento(int elemento) {
        this.elemento = elemento;
    }

    protected Nodo getAvanza() {
        return avanza;
    }

    protected void setAvanza(Nodo avanza) {
        this.avanza = avanza;
    }

}
