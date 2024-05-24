/*
 Ejercicio 2
 Diseña un programaque solicite al usuario ingresar una matriz cuadrada de números enteros y luego muestre la suma de los elementos en la diagonal principal.
 */
package taller_final_matriz;

import java.util.Scanner;

public class Taller_Final_matriz {

   //Variable color de texto
    String b = "\u001B[0m"; //declara el final de la pintada de los colores
    String Azul = "\033[34m";
    String fGris = "\033[47m";
    String Rojo = "\033[31m";

    //Lector
    Scanner data = new Scanner(System.in);

    //Variable del menú
    boolean salir = false;

    //Matriz cuadrada entera
    int matriz[][] = new int[3][3];

    //Variable de la suma
    int sum = 0;

    public static void main(String[] args) {
        Taller_Final_matriz  sd = new Taller_Final_matriz ();
        sd.menu();
    }

    public void menu() {
        int opcion;

        do {
            System.out.println(Azul + "\t Hola bienvenido" + b);
            System.out.println("Escoge una opcion");
            System.out.println("1. Ingresa la matriz");
            System.out.println("2. Mostrar la matriz");
            System.out.println("3. Ver diagonal principal y su suma");
            System.out.println("4. Salir");

            opcion = data.nextInt();

            switch (opcion) {
                case 1 ->
                    Ingresar();
                case 2 ->
                    Mostrar();
                case 3 ->
                    VerDiag();
                default ->
                    System.out.println(Rojo + "Ingrese un número del 1 al 4" + "\n" + b);

            }
        } while (!salir);
    }

    public void Ingresar() {
        System.out.println(Azul + "\t Ingresa la matriz" + b);
        data.nextLine(); //Salto de linea

        //LLenar la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                //Muestra el orden para ingresar la matriz
                System.out.println("Fila " + (i + 1) + " - " + "Columna " + (j + 1));

                matriz[i][j] = data.nextInt();
            }
        }
        data.nextLine();
    }

    public void Mostrar() {
        System.out.println(Azul + "\t Esta es la matriz ingresada  " + b);
        System.out.print("\n");
        data.nextLine(); //Salto de linea

        //Recorre la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                //Imprime la matriz
                System.out.print(fGris + "\t" + "| " + matriz[i][j] + " |" + b);
            }
            //Imprime la matriz completa
            System.out.print("\n");
        }
        data.nextLine();
    }

    public void VerDiag() {
        System.out.println(Azul + "\t Esta es la diagonal Principal y su suma" + b);
        System.out.println(fGris + "La diagonal principal de la matriz es: " + b);
        
        //El for recorre la matriz y con el += suma la diagonal que son los i i
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][i]);
            sum += matriz[i][i];           
        }
        
        //muestra la suma de la diagonal
        System.out.print("\n");
        System.out.println(fGris + "La suma de la diagonal principal es: " + b + "\n" + sum); 
        data.nextLine();
        data.nextLine(); //segundo data next line para que el menu se muestre al dar enter
    }
}