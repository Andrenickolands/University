/*

 */
package Colegio;

/**
 *
 * @author AndresNicolasSepulve
 */
public class Clase_estudiante {
    String nombre_estudiante;
    String apellido_estudiante;
    double sum = 0.0;
    double prom = 0.0;
    double notas[] = new double[5];
  

    public Clase_estudiante(String nombre_estudiante, String apellido_estudiante, double[] notas) {
        this.nombre_estudiante = nombre_estudiante;
        this.apellido_estudiante = apellido_estudiante;
        this.notas = notas;
    }


    public String getNomApeDamaris() {
        return nombre_estudiante + apellido_estudiante;
    }

    public double[] getNotasDamaris() {
        return notas;
    }

    public void setDamaris(String nombre_estudiante, String apellido_estudiante, double[] notas, double prom) {
        this.nombre_estudiante = nombre_estudiante;
        this.apellido_estudiante = apellido_estudiante;
        this.notas = notas;
        this.prom = prom;
    }

    
    public double cacular_promedio() {
        for (int i = 0; i < notas.length; i++) {
            sum += notas[i];  
        }
        prom = sum / notas.length;
        System.out.println("El promedio del estudiante " + nombre_estudiante + " " + apellido_estudiante + " es " + prom);
        return prom;
    } 
    
}