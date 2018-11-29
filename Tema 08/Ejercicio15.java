package Ejercicios;

/**
 * Muestra los números primos que hay entre 1 y 1000.
 *
 * @author Rafael Aragón Rodríguez
 *
 */
import java.util.Scanner;

public class Ejercicio15 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Los números primos entre 1 y 1000 son: ");
    for (int i = 1; i < 1000; i++) {
      if (matematicas.Varias.esPrimo(i)) {
        System.out.print(i + " ");
      }
    }
  }
}

