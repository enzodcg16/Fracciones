// Declaración de la clase Fracción
public class Fraccion {
    
    // Declaración de las variables de instancias
    int numerador;
    int denominador;

    // Declaración del constructor de la clase Fraccion
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    // Declaración del método suma de fracciones
    public Fraccion sumar(Fraccion a) {
        int n = (a.numerador * this.denominador) + (a.denominador * this.numerador);
        int d = this.denominador * a.denominador;
        Fraccion f = new Fraccion(n, d);
        return f;
    }
    // Declaración del método resta de fracciones
    public Fraccion restar(Fraccion a) {
        int n = a.denominador * this.numerador - a.numerador * this.denominador;
        int d = this.denominador * a.denominador;
        Fraccion f = new Fraccion(n, d);
        return f;
    }
    // Declaración del método mostrar fracción
    public void mostrar() {
        System.out.println(numerador+"/"+denominador);
    }
}