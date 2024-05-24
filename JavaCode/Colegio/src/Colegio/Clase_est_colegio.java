/*
 
 */
package Colegio;

/**
 *
 * @author AndresNicolasSepulve
 */
public class Clase_est_colegio extends Clase_estudiante {

    int co_pelao;

    public Clase_est_colegio(String nombre_estudiante, String apellido_estudiante, double[] notas) {
        super(nombre_estudiante, apellido_estudiante, notas);
    }

    public Clase_est_colegio(int co_pelao, String nombre_estudiante, String apellido_estudiante, double[] notas) {
        super(nombre_estudiante, apellido_estudiante, notas);
        this.co_pelao = co_pelao;
    }

    public int getCo_pelao() {
        return co_pelao;
    }

    public void setCo_pelao(int co_pelao) {
        this.co_pelao = co_pelao;
    }

    @Override
    public double cacular_promedio() {
        double prom2 = super.cacular_promedio();
        System.out.println("El promedio del estudiante " + co_pelao + " es " + prom2);
        return prom2;
    }

}
