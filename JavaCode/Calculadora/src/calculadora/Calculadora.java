/*

 */
package calculadora;

import calculadora.calculos.ErrorCedulaException;
import calculadora.calculos.ErrorDivisionException;

/**
 *
 * @author Nicolás
 */
public class Calculadora {

    public static void main(String[] args) throws ErrorCedulaException, ErrorDivisionException {

        try {
            getMetodo();
        } catch (calculos.ErrorCedulaException e) {
            System.out.println(e.getMessage());
        } finally {
            calculos ob = new calculos();
            System.out.println("Intenta: ");
            ob.getResta(3.0, 1.0, 30.0, 10.0);
            getMetodo2();
        }
    }

    static void getMetodo() throws ErrorCedulaException, ErrorDivisionException {
        calculos ob = new calculos();

        try {
            ob.getDivision(20.0, 0.0, 40.0, 10.0);
        } catch (calculos.ErrorDivisionException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Intenta: ");
            ob.getDivision(20.0, 2.0, 40.0, 10.0);
        }

        try {
            ob.getSuma(0.0, 2.0, 4.0, 4.0);
        } catch (calculos.ErrorCedulaException e) {
            System.out.println("\nEl primer valor de la suma no puede ser igual a mi numero de cedula");
        } finally {
            System.out.println("Intenta: ");
            ob.getSuma(2.0, 2.0, 4.0, 4.0);
        }

        ob.getResta(0.0, 1.0, 30.0, 10.0);
    }

    static void getMetodo2() throws ErrorCedulaException, ArithmeticException {
        calculos ob = new calculos();

        ob.getMultiplicacion(10.0, 10.0, 8.0, 4.0);
        ob.getPotenciacion(5.0, 2, 6.0, 3);
        ob.getLogaritmo(100.0, 20.0, 10.0, 40);
        ob.getLogaritmoBases(100.0, 10, 8.0, 2);
        ob.getRadicacion2(25.0, 4.0, 6.0, 10);
        ob.getRadicacion3(16.0, 4.0, 6.0, 10.0);
        ob.getPorcentaje(1000.0, 20.0, 50.0, 12.5);

    }
}