/*
 Ejercicio 5
 Diseña un programa que simule una fila de un supermercado. El programa debe permitir agregar clientes a la fila y atenderlos en orden, mostrando el nombre del cliente atendido.
 */
package taller_final_colas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Taller_Final_Colas {

    //Variable color de texto
    String b = "\u001B[0m"; //declara el final de la pintada de los colores
    String Azul = "\033[34m";
    String fGris = "\033[47m";
    String Rojo = "\033[31m";
    String Verde = "\033[32m";

    //Lector
    Scanner data = new Scanner(System.in);

    //Creo la cola
    Queue<Cliente> Filas = new LinkedList<>();

    //Variable del menú
    boolean salir = false;

    //Variables contador
    int j = 1;
    int z = 1;

    //Variables objeto
    String Nombre;

    public static void main(String[] args) {
        Taller_Final_Colas sd = new Taller_Final_Colas();
        sd.Filas = new LinkedList();
        sd.menu();
    }

    public void menu() {
        int opcion;

        do {
            System.out.println(Azul + "\t Hola bienvenido" + b);
            System.out.println("Escoge una opcion");
            System.out.println("1. Agregar un cliente");
            System.out.println("2. Mostrar clientes");
            System.out.println("3. Ver cliente actual en la caja");
            System.out.println("4. Salir");

            opcion = data.nextInt();

            switch (opcion) {
                case 1 ->
                    Agregar();
                case 2 ->
                    Mostrar();
                case 3 ->
                    VerClienteCaja();
                default ->
                    System.out.println(Rojo + "Ingrese un número del 1 al 4" + "\n" + b);
            }
        } while (!salir);
    }

    public void Agregar() {
        String resp;

        //Ciclo para preguntar si agregar otro cliente
        do {
            System.out.println(Azul + "\tCliente " + j++ + b);
            data.nextLine();

            //Pide los datos y los agrega
            System.out.println("Ingresa el nombre del cliente ");
            Nombre = data.nextLine();
            Cliente FilaClintes = new Cliente(Nombre);
            Filas.add(FilaClintes);

            //Pregunta para devolver el ciclo y agreagar otro cliente
            System.out.println(fGris + "Desea agregar otro cliente? (S/N)" + b);
            resp = data.next();

        } while (resp.equalsIgnoreCase("S"));
    }

    public void Mostrar() {
        System.out.print("\n");
        System.out.println(Azul + "\tClientes:" + b);

        //Recorre la fila y muestra el ombre de los clientes
        for (Cliente cliente : Filas) {
            System.out.println(fGris + "Cliente " + z++ + b);
            System.out.println(cliente.getNombre() + "\n");
        }
        data.nextLine();
        data.nextLine();

    }

    public void VerClienteCaja() {   
        System.out.println(Azul + "\tCliente en la caja registradora:" + b);
        data.nextLine();
        
        //verifica si la fila esta vacia y lo expresa
        if (Filas.isEmpty()) {
            System.out.println(Rojo + "No se esta atendiendo a nadies porque la fila esta vacia" + b);
        } else {
            //verifica quien esta de primeras en la fila
            Cliente cliente = Filas.peek();
            System.out.println(Verde + "El cliente que se atiende actualmente en la caja es: " + b + "\n" + cliente.getNombre());

            // el primero se elimina y muestra el que siguecomo primero
            Filas.poll();
        }
        data.nextLine();
        data.nextLine();
    }
}
