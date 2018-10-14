package tema05;

/**
 * Escribe un programa que lea una lista de diez números y determine cuántos son
 * positivos, y cuántos son negativos.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio13 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int pos = 0;
    int neg = 0;
    System.out.println("Este programa te pide que des diez números, y te dice cuáles son positivos y negativos.");
    for (int i = 0; i < 10; i++) {
      int num = 1;
      System.out.print("Dime el número " + num + ": ");
      int numero = Integer.parseInt(s.nextLine());
      num++;
      if (numero >= 0) {
        pos++;
      }
      if (numero < 0) {
        neg++;
      }
    }
    System.out.println("De los 10 números " + pos + " son positivos y " + neg + " son negativos.");
  }
}
