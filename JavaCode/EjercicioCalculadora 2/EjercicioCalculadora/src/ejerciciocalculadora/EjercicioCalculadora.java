package ejerciciocalculadora;

import ejerciciocalculadora.Excepcion.DivisionPorCeroException;
import java.util.Scanner;

public class EjercicioCalculadora {

    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Cedula");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("6. Potenciar");
            System.out.println("7. Extraer raíz");
            System.out.print("Ingrese una opción: ");
            opcion = Lectura.nextInt();

            double a, b;
            System.out.print("Ingrese el primer número: ");
            a = Lectura.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            b = Lectura.nextDouble();

            switch (opcion) {
                case  1:
                    
                    
                    Excepcion ced = new Excepcion();
                    System.out.println("Digite la cedula: "+ced.obtenerUltimoNumeroCedula());
                    
                    break;



                case 2:
                    Excepcion S = new Excepcion();
                    System.out.println(S.getSuma(a, b));
                    break;
                case 3:
                    Excepcion R = new Excepcion();

                    System.out.println("La resta es: " + R.getRestar(a, b));
                    break;
                case 4:
                    Excepcion M = new Excepcion();
                    System.out.println("La multiplicación es: " + M.getMultiplicar(a, b));
                    break;
                case 5:
                  
                 try {
                    Excepcion D = new Excepcion();
                    System.out.println("La division es: " + D.getDividir(a, b));
                } catch (DivisionPorCeroException e) {
                    System.out.println(e.getMessage());
                }
                break;

                case 6:
                    Excepcion P = new Excepcion();
                    System.out.println("La potencia es: " + P.getPotencia(a, b));
                    break;
                case 7:
                        try {
                            Excepcion Ra = new Excepcion();
                               System.out.println("La raíz es: " + Ra.getRaiz(a));
                        }catch (Excepcion.ErrorCedulaException e){
                            System.out.println(e.getMessage());
                        }
                 
                    break;

            }

        } while (opcion != 0);
    }
}
