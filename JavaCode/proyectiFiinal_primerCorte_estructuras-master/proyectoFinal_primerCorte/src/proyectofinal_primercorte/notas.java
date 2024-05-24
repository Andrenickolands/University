/*
     Arrays
 */
package proyectofinal_primercorte;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nicolás
 */
public class notas {


    Double notas[] = new Double[5];
    Scanner data = new Scanner(System.in);
    estudiantes ES = new estudiantes();

    protected void agregarNotas() {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese nota del estudiante numero: " + (i + 1));
            notas[i] = data.nextDouble();
        }
    }

    protected void imprimirNotas() {
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }
    
    protected void buscarNotas() {
        
    }
    
    protected void actuazlizarNotas() {
        
    }
    
    protected void eliminarNotas() {
        
    }

}
