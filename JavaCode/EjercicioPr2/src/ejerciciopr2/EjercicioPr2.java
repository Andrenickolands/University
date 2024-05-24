/*
Crea un sistema de registro de ventas utilizando ArrayList y programación orientada a objetos. 

Cada venta debe tener los siguientes atributos: 
número de venta, 
fecha de venta, 
cliente que realizó la venta 
y una lista de productos que se vendieron en esa venta. 

Cada producto debe tener los siguientes atributos: 
nombre, 
precio 
cantidad vendida.

El sistema debe permitir 
agregar ventas y productos a la lista correspondiente 

calcular el total de ventas en un período de tiempo dado 

mostrar la lista de ventas y sus detalles correspondientes.
 */
package ejerciciopr2;

import java.util.Scanner;

public class EjercicioPr2 {

    Scanner data = new Scanner(System.in);
    ArrayList<DatosVenta> listaDatosVenta;
    ArrayList<DatosProducto> listaDatosProducto;

    boolean salir = false;
    String nombre;
    double precio;
    int cantventas;

    public static void main(String[] args) {
        EjercicioPr2 sd = new EjercicioPr2();
        sd.listaDatosVenta = new ArrayList();
        sd.listaDatosProducto = new ArrayList();
        sd.menu();

    }

    public void menu() {
        int opcion;

        do {
            System.out.println("\t Hola bienvenido");
            System.out.println("1. Realzar una vena");
            System.out.println("2. crear un producto");
            System.out.println("3. calcular ventas");
            System.out.println("4. mostrar ventas");
            System.out.println("5. Salir");

            opcion = data.nextInt();

            switch (opcion) {
                case 1 ->
                    RealizarVenta();
                case 2 ->
                    CrearProducto();
                case 3 ->
                    CalcularVentas();
                case 4 ->
                    MostrarVentas();
                default ->
                    System.out.println("Ingrese un número del 1 al 5");
            }
        } while (!salir);
    }

    public void RealizarVenta() {

    }

    public void CrearProducto() {
        String respuesta;
        int i = 1;

        do {
            System.out.println("\tProducto" + i++);
            System.out.println("Ingresa el nombre del prducto ");
            nombre = data.next();

            System.out.println("ingresa el precio del producto ");
            precio = data.nextDouble();

            DatosProducto datos = new DatosProducto(nombre, precio);
            listaDatosProducto.add(datos);

            System.out.println("Desea agregar otro producto? (S/N)");
            respuesta = data.next();

        } while (respuesta.equalsIgnoreCase("S"));
    }

    public void CalcularVentas() {

    }

    public void menMostrarVentasu() {
         for (int i = 0; i < listaDatosVenta.size(); i++) {
                System.out.println( "Número de venta: " + listaDatosProducto.get(i).getPrecio() + "Nombre del comprador: " + listaDatosProducto.get(i).getPrecio() + "Fecha de la venta: " + listaDatosProducto.get(i).getPrecio() + "\t" + "Lista de productos comprados: " + listaDatosProducto.get(i).getNombre());
          }  
    }
}
