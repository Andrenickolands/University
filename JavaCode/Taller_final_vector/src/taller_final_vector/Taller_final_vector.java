/*
 Ejercio 1
 Diseña un programa que solicite al usuario ingresar un vector de números enteros y luego muestre la suma de todos los elementos.
 */
package taller_final_vector;

import java.util.Scanner;

public class Taller_final_vector {

    //Variable color de texto
    String b = "\u001B[0m"; //declara el final de la pintada de los colores
    String Azul = "\033[34m";
    String Rojo = "\033[31m";
    String fGris = "\033[47m";

    //Lector
    Scanner data = new Scanner(System.in);

    //Variable del menú
    boolean salir = false;

    //Variable de la suma
    int sum = 0;

    //Variable del número
    int num;

    //Variable tamaño vector
    int tam;

    //Vector entero
    int vector[] = new int[tam];

    public static void main(String[] args) {
        Taller_final_vector sd = new Taller_final_vector();
        sd.menu();
    }

    public void menu() {
        int opcion;

        do {
            System.out.println(Azul + "\t Hola bienvenido" + b);
            System.out.println("Escoge una opcion");
            System.out.println("1. Ingresa el vector");
            System.out.println("2. Ver suma de todos los elementos");
            System.out.println("3. Salir");

            opcion = data.nextInt();

            switch (opcion) {
                case 1 ->
                    Ingresar();
                case 2 ->
                    VerSum();
                default ->
                    System.out.println(Rojo + "Ingrese un número del 1 al 4" + "\n" + b);

            }
        } while (!salir);
    }

    public void Ingresar() {
        System.out.println(Azul + "\t Ingresar vector  " + b);
        
        //Guarda el tamaño del vector
        System.out.println("Cuantos numeros quieres que sumemos?");
        tam = data.nextInt();
        System.out.print("\n");
        
        System.out.println(fGris + "Ingresa los " + tam + "numeros del vector  " + b);
        System.out.print("\n");

        //Llena el vector con los números enteros
        for (int i = 0; i < tam; i++) {
            System.out.println("Digita el numero " + (i + 1));
            num = data.nextInt();       
            sum += num; //Suma los números
            System.out.print("\n");
        }
    }


    public void VerSum() {
        System.out.println(Azul + "\t   Suma  " + b);
        
        //Imprime la suma de los números ingresados
        System.out.println(fGris + "La suma de todos los elementos del vector es: " + b + "\n" + sum);
        data.nextLine();
        data.nextLine(); //segundo data next line para que el menu se muestre al dar enter
    }
}
