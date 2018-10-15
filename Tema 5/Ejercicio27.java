package tema05;

/**
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
 * entre 1 y un número leído por teclado.
 * 
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio27 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa muestra los múltiplos de 3 que hay entre 1 y el número que elijas.");
    System.out.print("Introduzca el número: ");
    int numero = Integer.parseInt(s.nextLine());
    System.out.println("Los múltiplos de tres entre 1 y " + numero + " son: ");
    for (int i = 1; i <= numero; i++) {
      if (i % 3 == 0) {
        System.out.print(i + ",");
      }
    }
  }
}
