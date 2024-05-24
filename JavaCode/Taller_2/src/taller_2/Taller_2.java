/*
00Crea una clase llamada Pregunta con los siguientes atributos:
00enunciado (String), 
00respuesta (String)  
00puntuacion (int).

00Crea un programa que permita al usuario introducir 
00el enunciado
respuesta 
puntuación de un número variable de preguntas por teclado (usando un bucle while, por ejemplo)
y que los añada a un ArrayList.A continuación, 

00muestra por pantalla cada una de las preguntas almacenadas en el ArrayList 
permite al usuario responderlas. 

Si la respuesta es correcta, suma la puntuación de la pregunta al puntaje total del usuario.
 */
package taller_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Taller_2 {

    Scanner data = new Scanner(System.in);
    ArrayList<DatosPregunta> listaDatosPregunta;
    boolean salir = false;
    int j = 1;
    String enunciado, respuesta;
    int puntuacion;

    public static void main(String[] args) {
        Taller_2 sd = new Taller_2();
        sd.listaDatosPregunta = new ArrayList();
        sd.menu();
    }

    public void menu() {
        int opcion;

        do {
            System.out.println("\t Hola bienvenido al sistema de juego de preguntas y respuestas");
            System.out.println("1. Crear una pregunta");
            System.out.println("2. Ver preguntas");
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
            System.out.println("\tPregunta" + j++);
            System.out.println("Ingresa el enunciado e la pregunta ");
            enunciado = data.next();

            System.out.println("Ingresa la respuesta de la pregunta ");
            respuesta = data.next();

            System.out.println("Ingresa el puntaje de la pregunta ");
            puntuacion = data.nextInt();

            listaDatosPregunta.add(new DatosPregunta(enunciado, respuesta, puntuacion));
            System.out.println("Vuelo agregado exitosamente.");

            System.out.println("Desea agregar otro estudiante? (S/N)");
            resp = data.next();

        } while (resp.equalsIgnoreCase("S"));
    }

    public void Mostrar() {
        for (int i = 0; i < listaDatosPregunta.size(); i++) {
            System.out.println("\tPregunta" + j++ + "\t" + listaDatosPregunta.get(i).getEnunciado() + "\t" + "Puntuación: " + listaDatosPregunta.get(i).getPuntuacion());
            
        }

    }
}
