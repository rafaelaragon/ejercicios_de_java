/*
 *Escribe un programa que muestre los n primeros términos de la serie de
 *Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
 *y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
 *los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se
 *debe introducir por teclado.
 */
package tema05;

/**
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;
public class Ejercicio12 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Este programa muestra tantos dígitos de la sucesión de Fibonacci como quieras.");
    System.out.print("¿Cuántos dígitos quieres ver? ");
    int numero = Integer.parseInt(s.nextLine());
    int sucesion = 1;
    int sucesion1 = 1;
    int sucesion2 = sucesion + sucesion1;
    int aux;
    System.out.print("0, 1, 1, ");
    for (int i = 0; i < numero - 3; i++) {

      System.out.print(sucesion2 + ", ");
      aux = sucesion2;
      sucesion2 = sucesion2 + sucesion1;
      sucesion1 = aux;

    }
  }
}
