/*

 */
package proyectofinal_primercorte;

/**
 *
 * @author Nicolás
 */
public class nodo {
    private String materia;
    private nodo avanza;

    protected nodo(String mat) {
        this.materia = mat;
        this.avanza = null;
    }

    protected String getMateria() {
        return materia;
    }

    protected void setMateria(String materia) {
        this.materia = materia;
    }

    protected nodo getAvanza() {
        return avanza;
    }

    protected void setAvanza(nodo avanza) {
        this.avanza = avanza;
    }
    
}
