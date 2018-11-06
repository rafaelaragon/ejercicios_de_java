package tema05;

/**
 * Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio16 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa te dice si un número es o no primo.");
    System.out.print("Introduzca el número: ");
    int numero = Integer.parseInt(s.nextLine());
    for (int i = 2; i < numero; i++) {
      if ((numero % i) == 0) {
        System.out.println("El número introducido no es primo.");
        break;
      } else {
        System.out.println("El número introducido es primo.");
        break;
      }
    }
  }
}
