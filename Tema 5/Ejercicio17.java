package tema05;

/**
 * Realiza un programa que sume los 100 números siguientes a un número entero y
 * positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio17 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa suma los 100 números siguientes (enteros y positivos) del que introduzcas.");
    System.out.print("Introduzca el número: ");
    int numero = Integer.parseInt(s.nextLine());
    int total = 0;
    if (numero < 0) {
      System.out.println("Introduce un valor válido.");
    } else {

      for (int i = numero; i < numero + 100; i++) {
        total = total + i;
      }
      System.out.println("La suma resulta en " + total);
    }
  }
}
