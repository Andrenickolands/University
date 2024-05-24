
package taller_final_pilas;

import java.util.Stack;

public class Expresion {
    //variable que guarda la expresión matemática
     String Expr;
     
     public static boolean Expresion(String Expr) {
        //Creo el stack para almacenar los datos que el usuario digita y lo importo
        Stack<Character> pila = new Stack<Character>();
        
        //recorre la pila
        for (int i = 0; i < Expr.length(); i++) {
            char signo = Expr.charAt(i);
            
            //verifica si la expresión esta balanceada
            if (signo == '(') {
                pila.push(signo);
            }
            else if(signo == ')'){
                if (pila.isEmpty() || pila.pop() != '(') {
                    
                    return false;
                }
            }
            
        }
        return pila.isEmpty();
    }
}
