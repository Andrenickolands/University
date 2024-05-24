/*

 */
package Colegio;

/**
 *
 * @author Nicolás
 */
public class Clase_principal_main {

    public static void main(String[] args) {
        
        String nombre_estudiante = "Sophie";
        String apellido_estudiante = "NN";
        double[] notas = {5.0, 3.0, 4.0, 5.0, 3.0};
        Clase_estudiante obj_estudiante = new Clase_estudiante(nombre_estudiante,apellido_estudiante,notas);
        obj_estudiante.cacular_promedio();
        
        String nombre_est = "Scarlet";
        String apellido_est = "Lorenz";
        double[] notasest = {5.0, 5.0, 5.0, 5.0, 5.0};  
        Clase_est_colegio obj_est = new Clase_est_colegio(nombre_est,apellido_est,notasest);
        obj_est.setCo_pelao(1234);
        obj_est.cacular_promedio();
    }
}
