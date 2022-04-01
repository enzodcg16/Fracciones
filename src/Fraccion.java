// Declaraci�n de la clase Fracci�n
public class Fraccion {
    
    // Declaraci�n de las variables de instancias
    int numerador;
    int denominador;

    // Declaraci�n del constructor de la clase Fraccion
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    // Declaraci�n del m�todo suma de fracciones
    public Fraccion sumar(Fraccion a) {
        int n = (a.numerador * this.denominador) + (a.denominador * this.numerador);
        int d = this.denominador * a.denominador;
        Fraccion f = new Fraccion(n, d);
        return f;
    }
    // Declaraci�n del m�todo resta de fracciones
    public Fraccion restar(Fraccion a) {
        int n = a.denominador * this.numerador - a.numerador * this.denominador;
        int d = this.denominador * a.denominador;
        Fraccion f = new Fraccion(n, d);
        return f;
    }
    // Declaraci�n del m�todo mostrar fracci�n
    public void mostrar() {
        System.out.println(numerador+"/"+denominador);
    }
}