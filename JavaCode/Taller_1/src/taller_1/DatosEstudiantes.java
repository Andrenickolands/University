/*
Crea una clase llamada Estudiante con los siguientes atributos: 
nombre (String), 
edad (int) y 
notas (ArrayList<Double>).
 */
package taller_1;


public class DatosEstudiantes {
    int edad;
    String nombre;

    public DatosEstudiantes(String nombre, int edad) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}


