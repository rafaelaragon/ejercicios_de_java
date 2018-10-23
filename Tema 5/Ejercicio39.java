package tema05;

/**
 * Escribe un programa que pida un número entero positivo por teclado y que
 * muestre a continuación los números desde el 1 al número introducido junto con
 * su factorial.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio39 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa calcula factoriales.");
    System.out.print("Introduzca el número a 'factorializar': ");
    int numero = Integer.parseInt(s.nextLine());
    int factorial = 1;
    if (numero <= 0) {
      System.out.println("¡Tiene que ser un número entero positivo!");
    } else {
      for (int i = 1; i <= numero; i++) {
        factorial = factorial * i;
        System.out.println("El factorial de " + i + " es: " + factorial);
      }
    }
  }
}
