package ejerciciocalculadora;

import java.util.Scanner;

    public class Excepcion  {

    Scanner Lectura = new Scanner(System.in);

    public class DivisionPorCeroException extends Exception {

        public DivisionPorCeroException(String mensaje) {
            super("Mal Division por cero");
        }

    }

    public class ErrorCedulaException extends Exception {

        public ErrorCedulaException() {
            super("El primer argumento es igual al último número de su cédula ");
        }
    }
    
    public int obtenerUltimoNumeroCedula() {
        System.out.print("Ingrese su número de cédula: ");
        String cedula = Lectura.nextLine();
        return Integer.parseInt(cedula.substring(cedula.length() - 1));
   
    }
    
    
    public  double getSuma(double a, double b) {
        return a + b;
    }

    public  double getRestar(double a, double b) {
        return a - b;
    }

    public  double getMultiplicar(double a, double b) {
        return a * b;
    }

    public double getDividir(double a, double b) throws DivisionPorCeroException {
        if (b == 0) {
            
            throw new DivisionPorCeroException("No se puede dividir por cero");
        }
        return a / b;
    }

    public  double getPotencia(double a, double b) {
        return Math.pow(a, b);
    }

    public  double getRaiz(double a) throws ErrorCedulaException {
        if (a == obtenerUltimoNumeroCedula()) {
            throw new ErrorCedulaException();
        }
        return Math.sqrt(a);
    }

    
    
    
}

