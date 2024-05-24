/*
00Crea una clase llamada Tarea con los siguientes atributos: 
00descripción (String)  
00completada (boolean)

Crea un programa que permita al usuario introducir la descripción de un número variable de tareas por teclado (usando un bucle while, por ejemplo)
y que las añada a un ArrayList con el valor de completada en falso

00muestra por pantalla la lista de tareas. 
Permite al usuario marcar una tarea como completada 
actualiza el valor correspondiente en el ArrayList.
 */
package taller_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Taller_3 {

    Scanner data = new Scanner(System.in);
    ArrayList<DatosTarea> listaDatosTarea;
    boolean salir = false;
    String nombreTarea, descripion;
    boolean completada;
    int j = 1;

    public static void main(String[] args) {
        Taller_3 sd = new Taller_3();
        sd.listaDatosTarea = new ArrayList();
        sd.menu();
    }

    public void menu() {
        int opcion;

        do {
            System.out.println("\t Hola bienvenido al sistema de lista de tareas");
            System.out.println("1. Crear una tarea");
            System.out.println("2. Ver tareas");
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
        String resp;

        do {
            System.out.println("\tTarea" + j++);
            System.out.println("Ingresa el nombre de la tarea ");
            nombreTarea = data.next();

            System.out.println("Ingresa la descripción de la tarea ");
            descripion = data.next();

            listaDatosTarea.add(new DatosTarea(nombreTarea, descripion));
            System.out.println("Vuelo agregado exitosamente.");

            System.out.println("Desea agregar otro estudiante? (S/N)");
            resp = data.next();

        } while (resp.equalsIgnoreCase("S"));

    }

    public void Mostrar() {
        for (int i = 0; i < listaDatosTarea.size(); i++) {
               System.out.println("\tTarea" + j++ + "\t" + listaDatosTarea.get(i).getNombreTarea() + "\t" + "Descripción: " + listaDatosTarea.get(i).getDescripion());
          }  
        
        System.out.println("Deseas marcar alguna como completada? ");
        
    }
}


