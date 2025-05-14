import clases.Algoritmos;

public class Aplicacion {
    public static void main(String[] args) {

        
        System.out.println("10 es par? " + Algoritmos.esPar(10));
        System.out.println("5 es par? " + Algoritmos.esPar(5));

        System.out.println("5 es primo? " + Algoritmos.esPrimo(5));
        System.out.println("9 es primo? " + Algoritmos.esPrimo(9));

        System.out.println("'Hola' al reves: " + Algoritmos.stringEnReversa("Hola"));

        System.out.println("¿'Reconocer'? es palíndromo" + Algoritmos.esPalindromo("Reconocer"));
        System.out.println("¿'Lavaplatos' es palíndromo? " + Algoritmos.esPalindromo("Lavaplatos"));

        System.out.println("Secuencia FizzBuzz hasta 20:");
        Algoritmos.secuenciaFizzBuzz(20);
    }
}
