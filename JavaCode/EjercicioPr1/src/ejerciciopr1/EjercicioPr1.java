/*
 Crea un sistema de registro de estudiantes utilizando ArrayListy programación orientada a objetos. 

Cada estudiante debe tener los siguientes atributos: 
nombre, 
edad, 
género y 
una lista de cursos que 
está tomando. 

Cada curso debe tener los siguientes atributos: 
nombre, 
código y 
nota.

agregar 
estudiantes y 
cursos 

buscar estudiantes por nombre y

mostrar su información 
detallada, 
incluyendo los cursos que está tomando y 
sus respectivas notas.
 */
package ejerciciopr1;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioPr1 {

    Scanner data = new Scanner(System.in);
    ArrayList<DatosEstudiantes> listaDatosEstudiantes;
    ArrayList<DatosCursos> listaDatosCursos;

    boolean salir = false;
    String nombre, genero, listcursos, nombreC;
    int edad, codigo;
    double nota;

    public static void main(String[] args) {
        EjercicioPr1 sd = new EjercicioPr1();
        sd.listaDatosEstudiantes = new ArrayList();
        sd.listaDatosCursos = new ArrayList();
        sd.menu();
    }

    public void menu() {
        int opcion;

        do {
            System.out.println("\t Hola bienvenido");
            System.out.println("1. Ingresar datos de un estudiante");
            System.out.println("2. buscar un estudiante");
            System.out.println("3. eliminar un esudiante");
            System.out.println("4. Agregar un curso");
            System.out.println("5. eliminar un curso");
            System.out.println("6. Mostrar estudiantes registradados");
            System.out.println("7. Salir");

            opcion = data.nextInt();

            switch (opcion) {
                case 1 ->
                    IngresarE();
                case 2 ->
                    BuscarE();
                case 3 ->
                    EliminarE();
                case 4 ->
                    IngresarC();
                case 5 ->
                    EliminarC();
                case 6 ->
                    Mostrar();
                default ->
                    System.out.println("Ingrese un número del 1 al 7");
            }
        } while (!salir);
    }

    public void IngresarE() {
        String respuestaE;
        int i = 1;

        do {
            System.out.println("\tEstudiante" + i++);
            System.out.println("Ingresa el nombre completo de la persona ");
            nombre = data.next();

            System.out.println("ingresa la edad del estudiante ");
            edad = data.nextInt();

            System.out.println("ingresa el genero del estudiante ");
            genero = data.next();

            System.out.println("ingresa el nombre del curso que esta tomando el estudiante ");
            listcursos = data.next();

            DatosEstudiantes datos = new DatosEstudiantes(nombre, edad, genero, listcursos);
            listaDatosEstudiantes.add(datos);

            System.out.println("Desea agregar otro estudiante? (S/N)");
            respuestaE = data.next();

        } while (respuestaE.equalsIgnoreCase("S"));

    }

    public void BuscarE() {
        String nombreBe;
        int indexBe;

        System.out.println("Ingrese el nombre del estudiante a buscar ");
        nombreBe = data.next();
        indexBe = listaDatosEstudiantes.indexOf(nombreBe);

        if (indexBe != -1) {
            System.out.println("Fue encontrado el estuiante " + nombreBe + "con una edad de " + edad + "de genero " + genero + "\t" + "Inscrito en los siguientes cursos " + listcursos + nota);
        } else {
            System.out.println("El nombre del estudiante no fue encontrado");
        }
    }

    public void EliminarE() {
        String nombreEe;
        int indexEe;

        System.out.println("Ingrese el nombre del estudiante a buscar ");
        nombreEe = data.next();
        indexEe = listaDatosEstudiantes.indexOf(nombreEe);

        if (indexEe != -1) {
            listaDatosEstudiantes.remove(indexEe);
            System.out.println("El estudiante fue eliminado");
        } else {
            System.out.println("El nombre del estudiante no fue encontrado");
        }

    }

    public void IngresarC() {
        String respuestaC;
        int i = 1;

        do {
            System.out.println("\tCurso" + i++);
            System.out.println("Ingresa el nombre del curso ");
            nombreC = data.next();

            System.out.println("ingresa el codigo del curso ");
            codigo = data.nextInt();

            System.out.println("\tNota" + i++);
            System.out.println("ingresa la nota del estudiante ");
            nota = data.nextDouble();

            DatosCursos datos = new DatosCursos(nombreC, codigo, nota);
            listaDatosCursos.add(datos);

            System.out.println("Desea agregar otro curso? (S/N)");
            respuestaC = data.next();

        } while (respuestaC.equalsIgnoreCase("S"));

    }

    public void EliminarC() {
        String nombreEc;
        int indexEc;

        System.out.println("Ingrese el nombre del curso a buscar ");
        nombreEc = data.next();
        indexEc = listaDatosCursos.indexOf(nombreEc);

        if (indexEc != -1) {
            listaDatosCursos.remove(indexEc);
            System.out.println("El curso fue eliminado");
        } else {
            System.out.println("El nombre del curso no fue encontrado");
        }

    }

    public void Mostrar() {
        for (int i = 0; i < listaDatosEstudiantes.size(); i++) {
            System.out.println("Nombre: " + listaDatosEstudiantes.get(i).get_nombre() + "\t" + "Edad: " + listaDatosEstudiantes.get(i).get_edad() + "\t" + "Genero: " + listaDatosEstudiantes.get(i).get_genero() + "\t" + "Cursos inscritos y sus notas: " + listaDatosEstudiantes.get(i).get_listCursos() + "\t" + listaDatosCursos.get(i).get_nota());
        }
    }
}
