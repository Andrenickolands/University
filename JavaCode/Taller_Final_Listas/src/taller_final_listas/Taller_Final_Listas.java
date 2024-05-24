/*
 Ejercicio 3
Diseña un programa que simule una lista de tareas pendientes. El programa debe permitir al usuario agregar tareas, eliminar tareas y mostrar todas las tareas pendientes.
 */
package taller_final_listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Taller_Final_Listas {

    //Variable color de texto
    String b = "\u001B[0m"; //declara el final de la pintada de los colores
    String Azul = "\033[34m";
    String Negro = "\033[30m";
    String Rojo = "\033[31m";
    String Verde = "\033[32m";
    String fGris = "\033[47m";

    //Lector
    Scanner data = new Scanner(System.in);

    //Variable del menú
    boolean salir = false;

    //Variables contador
    int j = 1;
    int z = 1;

    //Crea el arraylist
    ArrayList<DatosTareaa> listaDatosTarea;

    //Variables tarea
    String tarea, DescTarea, TareaE;
    int indexE;

    public static void main(String[] args) {
        Taller_Final_Listas sd = new Taller_Final_Listas();
        sd.listaDatosTarea = new ArrayList();
        sd.menu();
    }

    public void menu() {
        int opcion;

        do {
            System.out.println(Azul + "\t Hola bienvenido" + b);
            System.out.println("Escoge una opcion");
            System.out.println("1. Agregar una tarea");
            System.out.println("2. Eliminar una tarea");
            System.out.println("3. Mostrar mis tareas");
            System.out.println("4. Salir");

            opcion = data.nextInt();

            switch (opcion) {
                case 1 ->
                    Agregar();
                case 2 ->
                    Eliminar();
                case 3 ->
                    Mostrar();
                default ->
                    System.out.println(Rojo + "Ingrese un número del 1 al 4" + "\n" + b);
            }
        } while (!salir);
    }

    public void Agregar() {
        String resp;

        //Ciclo para preguntar si agregar otra tarea
        do {
            System.out.println(Azul + "\ttarea " + j++ + b);
            data.nextLine();

            //Pide los datos
            System.out.println("Ingresa el nombre de la tarea ");
            tarea = data.nextLine();

            System.out.println("Ingresa la descripcion de la tarea ");
            DescTarea = data.nextLine();

            //Ingresa los datos en el objeto
            listaDatosTarea.add(new DatosTareaa(tarea, DescTarea));
            System.out.println(Verde + "Tarea agregada exitosamente." + b);

            //Pregunta para devolver el ciclo y agreagar otra tarea
            System.out.println(fGris + "Desea agregar otra tarea? (S/N)" + b);
            resp = data.next();

        } while (resp.equalsIgnoreCase("S"));
    }

    public void Eliminar() {
        //Salto de linea
        System.out.println(Azul + "\t Eliminar tarea" + b);
        data.nextLine();

        //Pide el nombre de la tarea para buscarla
        System.out.println("Ingrese el nombre de la tarea a buscar ");
        TareaE = data.nextLine();

        //Busca la tarea
        indexE = listaDatosTarea.indexOf(TareaE);

        //Recorre y revisa si existe la tarea y la elimina
        for (int i = 0; i < listaDatosTarea.size(); i++) {
            if (TareaE.equalsIgnoreCase(listaDatosTarea.get(i).getTarea())) {
                listaDatosTarea.remove(i);
                
                System.out.println(Verde + "La tarea " + Negro + TareaE + b + Verde +" fue eliminada correctamente" + b);
                System.out.print("\n");
            } else {
                System.out.println(Rojo + "La tarea " + Negro + TareaE + b + Rojo + " no fue encontrada" + b);
                System.out.print("\n");
            }
            data.nextLine();
        }
    }

    public void Mostrar() {
        System.out.print("\n");
        System.out.println(Azul + "\tTareas:" + b);
        
        for (int i = 0; i < listaDatosTarea.size(); i++) {
            //Imprime las tarea
            System.out.println(fGris + "Tarea " + z++ + b);
            System.out.println(listaDatosTarea.get(i).getTarea() + "\n" + "_________________" + "\n" + "Descripcion: " + "\n" + listaDatosTarea.get(i).getDescTarea() + "\n\n");
        }
        data.nextLine();
        data.nextLine();

    }
}
