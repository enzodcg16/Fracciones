import java.io.*;
import java.util.Scanner;
/**
NOMBRE DEL PROYECTO: FRACCIONES
AUTOR: Lorenzo Caballero
ORGANIZACION: UTP DAVID
 */
// Se define la clase Fracciones
public class Fracciones {
    // Establecer la clase main
    
    public static void main(String[] args) {
        
        // Leer por consola la primera fracciòn considerando el numerador y el denominador
        System.out.println("Primera Fracción:");
        System.out.print("\tEscribe el numerador: ");
        int n1 = Leer().nextInt();
        System.out.print("\tEscribe el denominador: ");
        int d1 = Leer().nextInt();
        
        // Leer por consola la segunda fracción considerando el numerador y el denominador
        System.out.println("Segunda Fracción:");
        System.out.print("\tEscribe el numerador: ");
        int n2 = Leer().nextInt();
        System.out.print("\tEscribe el denominador: ");
        int d2 = Leer().nextInt();
        
        // Creando las nuevas fracciones como objetos en base a la clase Fraccion
        Fraccion a = new Fraccion(n1,d1);
        Fraccion b = new Fraccion(n2,d2);
        
        // Realizando las opeaciones entre las fracciones objeto y guardando los resultados como fracciones
        Fraccion resuls = a.restar(b);
        Fraccion resultr = a.sumar(b);
        
        // Mostrando los resultados
        System.out.print("\nEl resultado de la resta es: ");
        resuls.mostrar();
        System.out.print("El resultado de la suma es: ");
        resultr.mostrar();
    }
    // Se establece la lectura por consola mediante la clase Scanner 
    private static Scanner Leer() {
        return new Scanner(System.in);
    }
}