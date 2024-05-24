/*
00Crea una clase llamada Estudiante con los siguientes atributos: 
00nombre (String), 
00edad (int) y 
00notas (ArrayList<Double>).

00Crea un programa que permita al usuario introducir 
00el nombre, 
00edad 
notas de un número variable de estudiantes por teclado 
(usando un bucle while, por ejemplo), 
y que los añada a un ArrayList.

00A continuación, 
00muestra por pantalla 
00el nombre, 
00edad 
promedio de notas de cada uno de los estudiantes almacenados en el ArrayList.
 */
package taller_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Taller_1 {

    Scanner data = new Scanner(System.in);
    ArrayList<DatosEstudiantes> listaDatosEstudiantes;
    boolean salir = false;
    int edad;
    String nombre;

    public static void main(String[] args) {
        Taller_1 sd = new Taller_1();
        sd.listaDatosEstudiantes = new ArrayList();
        sd.menu();
    }

    public void menu() {
        int opcion;

        do {
            System.out.println("\t Hola bienvenido al sistema de registro de estudiantes");
            System.out.println("1. Agregar un estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Salir");
            opcion = data.nextInt();

            switch (opcion) {
                case 1 ->
                    Agregar();
                case 2 ->
                    Mostrar();
                default ->
                    System.out.println("Ingrese un número del 1 al 3");
            }
        } while (!salir);
    }

    public void Agregar() {
        String respuesta;
        int i = 1;

        do {
            System.out.println("\tEstudiante" + i++);
            System.out.println("Ingresa el nombre del estudiante ");
            nombre = data.next();

            System.out.println("ingresa la edad de tu estudiante ");
            edad = data.nextInt();
            
            System.out.println("ingresa las notas de tu estudiante ");
            notas = data.nextInt();

            listaDatosEstudiantes.add(new DatosEstudiantes(nombre, edad));
            System.out.println("Vuelo agregado exitosamente.");

            System.out.println("Desea agregar otro estudiante? (S/N)");
            respuesta = data.next();

        } while (respuesta.equalsIgnoreCase("S"));

    }

    public void Mostrar() {
         for (int i = 0; i < listaDatosEstudiantes.size(); i++) {
               System.out.println("Nombre: " + listaDatosEstudiantes.get(i).getNombre() + "\t" + "Edad: " + listaDatosEstudiantes.get(i).getEdad() + "\t" );
          }  
    }
}
