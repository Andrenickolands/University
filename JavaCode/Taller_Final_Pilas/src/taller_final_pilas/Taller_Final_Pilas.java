/*
 Ejercicio 4
 Diseña un programa que verifique si una expresión matemática con paréntesis está balanceada. Es decir, si los paréntesis de apertura y cierre estáncorrectamente emparejados.
 */
package taller_final_pilas;

import java.util.Scanner;
import static taller_final_pilas.Expresion.Expresion;

public class Taller_Final_Pilas {

    //Variable color de texto
    String b = "\u001B[0m"; //declara el final de la pintada de los colores
    String Azul = "\033[34m";
    String fGris = "\033[47m";
    String Rojo = "\033[31m";
    String Verde = "\033[32m";

    //Lector
    Scanner data = new Scanner(System.in);
  
    //Variable del objeto
    String Expr;
    
    //Llamo el método
    public static void main(String[] args) {
       Taller_Final_Pilas  sd = new Taller_Final_Pilas ();
        sd.Ingresar();   
    }
    
    public void Ingresar() {
        System.out.println(Azul + "\t Balanceo de expresiones matematicas" + b);
        data.nextLine(); //Salto de linea
        
        //Pido los datos
        System.out.println(fGris + "Ingresa una espresion matematica con parentesis" + b);
        Expr = data.next();
        
        //Verifico los datos segun el bjeto
        if (Expresion(Expr)) {
            System.out.println(Verde + "la expresion " + Expr + " esta balancecada" + b);
        }
        else{
            System.out.println(Rojo + "La expresion " + Expr + " no esta balanceada" + b);
        }

    }
}
