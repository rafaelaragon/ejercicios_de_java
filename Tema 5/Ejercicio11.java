/*
*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
*los 5 primeros números enteros a partir de uno que se introduce por teclado.
 */
package tema05;

/**
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio11 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Este programa calcula 5 veces el cuadrado y el cubo de un número que me des.");
    System.out.print("Porfavor, introduzca el número: ");
    double numero = Integer.parseInt(s.nextLine());
    double cuadrado = numero * numero;
    double cubo = numero * numero * numero;
    for (int i = 0; i < 4; i++) {
      System.out.printf("%-10s %-10s %-10s\n", numero, cuadrado, cubo);
      cuadrado = cuadrado * numero;
      cubo = cubo * numero * numero;
    }
  }
}
