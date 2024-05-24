/*

 */
package calculadora_pruebas;

import figuras.Circulo;
import figuras.Cuadrado;
import figuras.Rectangulo;
import figuras.Triangulo;

/**
 *
 * @author Nicolás
 */
public class Calculadora_pruebas {

   
    public static void main(String[] args) {
        resta R = new resta();
        System.out.println( R.getResta(20,1));
        Sum S = new Sum();
        System.out.println( S.getSuma(40,2));
        division D = new division();
        System.out.println( D.getDivision(200,2));
        multiplicacion M = new multiplicacion();
        System.out.println( M.getMultiplicacion(60,2));
        potenciacion P = new potenciacion();
        System.out.println( P.getPotenciacion(30,2));
        radicacion Ra = new radicacion();
        System.out.println( Ra.getRadicacion(10));
        
        //figuras
        Circulo C = new Circulo();
        System.out.println( C.getAreaCirculo(4));
        System.out.println( C.getPerimetroCirculo(4));
        
         Cuadrado Cua = new Cuadrado();
        System.out.println( Cua.getAreaCuadrado(15));
        System.out.println( Cua.getPerimetroCuadrado(15));
        
         Rectangulo Rec = new Rectangulo();
        System.out.println( Rec.getAreaRectangulo(7, 3));
        System.out.println( Rec.getPerimetroRectangulo(7, 3));
        
         Triangulo T = new Triangulo();
        System.out.println( T.getAreaTrianguloRectangulo(4, 6));
        System.out.println( T.getHipotenusa(4, 6));
        System.out.println( T.getPerimetroTrianguloRectangulo(4, 6));
        
        System.out.println( T.getAreaTrianguloIsoseles(20, 40));
        System.out.println( T.getPerimetroTrianguloIsoseles(20, 40));
        
        
        System.out.println( T.getAreaTrianguloEquilatero(100, 100));
        System.out.println( T.getcomprobarAreaTrianguloEquilatero(100));
        System.out.println( T.getPerimetroTrianguloEquilatero(100));   
    }
}
