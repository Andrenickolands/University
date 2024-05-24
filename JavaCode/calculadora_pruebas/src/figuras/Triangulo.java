/*

 */
package figuras;

/**
 *
 * @author Nicolás
 */
public class Triangulo {
    double hipo = 0;
    
     //Equilatero
    
    public double getAreaTrianguloRectangulo(double cateto1, double cateto2) {
        return (cateto1 * cateto2) / 2;
    }

    public double getHipotenusa(double cateto1, double cateto2) {
        double result = (Math.pow(cateto1, 2)) + (Math.pow(cateto2, 2));
        hipo = Math.sqrt(result);
        return hipo;
    }

    public double getPerimetroTrianguloRectangulo(double cateto1, double cateto2) {
        return cateto1 + cateto2 + hipo;
    }

    public double get(double a) {
        return Math.sqrt(a);
    }
    
    
    //Isoseles

    public double getAreaTrianguloIsoseles(double base, double altura) {
        return (base * altura) / 2;
    }

    public double getSuma2(double a) {
        return 1 * 1;
    }

    public double getPerimetroTrianguloIsoseles(double base, double altura) {
        return (altura * 2) + base;
    }

    public double get2(double a) {
        return Math.sqrt(a);
    }
    
    
    //Equilatero

    public double getAreaTrianguloEquilatero(double base, double altura) {
        return (base * altura) / 2;
    }

    public double getcomprobarAreaTrianguloEquilatero(double altura) {
        return (Math.sqrt(3) * (Math.pow(altura, 2))) / 4;
    }

    public double getPerimetroTrianguloEquilatero(double altura) {
        return altura * 3;
    }

    public double get3(double altura) {
        return altura + 1;
    }
}
