/*

 */
package calculadora;

/**
 *
 * @author Nicolás
 */
public class calculos {

    final double cedula = 0.0;

    public void getSuma(double a, double b, double c, double d) throws ErrorCedulaException {
        if (a == cedula) {
            throw new ErrorCedulaException();
        }

        double suma = a + b;
        double suma2 = c + d;
        System.out.println(a + " + " + b + " = " + suma);
        System.out.println(c + " + " + d + " = " + suma2);
    }

    public void getResta(double a, double b, double c, double d) throws ErrorCedulaException {
        if (a == cedula) {
            throw new ErrorCedulaException();
        }

        double resta = a - b;
        double resta2 = c - d;
        System.out.println(a + " - " + b + " = " + resta);
        System.out.println(c + " - " + d + " = " + resta2);
    }

    public void getDivision(double a, double b, double c, double d) throws ErrorCedulaException,ErrorDivisionException{
        if (a == cedula) {
            throw new ErrorCedulaException();
        }

        if (b == 0.0) {
            throw new ErrorDivisionException();
        }
        
        if (d == 0.0) {
            throw new ErrorDivisionException();
        }

        double division = a / b;
        double division2 = c / d;
        System.out.println(a + " / " + b + " = " + division);
        System.out.println(c + " / " + d + " = " + division2);
    }

    public void getMultiplicacion(double a, double b, double c, double d) throws ErrorCedulaException {
        if (a == cedula) {
            throw new ErrorCedulaException();
        }

        double multiplicacion = a * b;
        double multiplicacion2 = c * d;
        System.out.println("\n\n" + a + " * " + b + " = " + multiplicacion);
        System.out.println(c + " * " + d + " = " + multiplicacion2);
    }

    public void getPotenciacion(double a, int b, double c, int d) throws ErrorCedulaException {
        if (a == cedula) {
            throw new ErrorCedulaException();
        }

        double potencia = Math.pow(a, b);
        double potencia2 = Math.pow(c, d);
        System.out.println("\n\n" + a + " ^ " + b + " = " + potencia);
        System.out.println(c + " ^ " + d + " = " + potencia2);
    }

    public void getLogaritmo(double a, double b, double c, int d) throws ErrorCedulaException {
        if (a == cedula) {
            throw new ErrorCedulaException();
        }

        double logaritmo = Math.log(a);
        double logaritmo2 = Math.log(b);
        double logaritmo3 = Math.log(c);
        double logaritmo4 = Math.log(d);
        System.out.println("\n\nln(e) " + a + " = " + logaritmo);
        System.out.println("ln(e) " + b + " = " + logaritmo2);
        System.out.println("ln(e) " + c + " = " + logaritmo3);
        System.out.println("ln(e) " + d + " = " + logaritmo4);
    }

    public void getLogaritmoBases(double a, int b, double c, int d) throws ErrorCedulaException {
        if (a == cedula) {
            throw new ErrorCedulaException();
        }

        double log = Math.log10(a) / Math.log10(b);
        double log2 = Math.log10(c) / Math.log10(d);
        System.out.println("\n\nlog en base " + b + " de " + a + " = " + log);
        System.out.println("log en base " + c + " de " + d + " = " + log2);
    }

    public void getRadicacion2(double a, double b, double c, int d) throws ErrorCedulaException {
        if (a == cedula) {
            throw new ErrorCedulaException();
        }

        double radicacion = Math.sqrt(a);
        double radicacion2 = Math.sqrt(b);
        double radicacion3 = Math.sqrt(c);
        double radicacion4 = Math.sqrt(d);
        System.out.println("\n\nLa raiz cuadrada de " + a + " = " + radicacion);
        System.out.println("La raiz cuadrada de " + b + " = " + radicacion2);
        System.out.println("La raiz cuadrada de " + c + " = " + radicacion3);
        System.out.println("La raiz cuadrada de " + d + " = " + radicacion4);
    }

    public void getRadicacion3(double a, double b, double c, double d) throws ErrorCedulaException {
        if (a == cedula) {
            throw new ErrorCedulaException();
        }

        double radicacion = Math.cbrt(a);
        double radicacion2 = Math.cbrt(b);
        double radicacion3 = Math.cbrt(c);
        double radicacion4 = Math.cbrt(d);
        System.out.println("\n\nLa raiz cubica de " + a + " = " + radicacion);
        System.out.println("La raiz cubica de " + b + " = " + radicacion2);
        System.out.println("La raiz cubica de " + c + " = " + radicacion3);
        System.out.println("La raiz cubica de " + d + " = " + radicacion4);
    }

    public void getPorcentaje(double a, double b, double c, double d) throws ErrorCedulaException {
        if (a == cedula) {
            throw new ErrorCedulaException();
        }

        double porcentaje = (a * b) / 100;
        double porcentaje2 = (c * d) / 100;
        System.out.println("\n\n" + a + " % " + b + " = " + porcentaje);
        System.out.println(c + " % " + d + " = " + porcentaje2);
    }

    public class ErrorCedulaException extends Exception {

        public ErrorCedulaException() {
            super("\nEl primer valor es igual al ultimo numero de mi cedula ");
        }
    }
    
     public class ErrorDivisionException extends Exception {

        public ErrorDivisionException() {
            super("\nNo se puede dividir por 0 ");
        }
    }
}