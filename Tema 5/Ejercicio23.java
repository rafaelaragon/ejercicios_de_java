package tema05;

/**
 * Escribe un programa que permita ir introduciendo una serie indeterminada de
 * números mientras su suma no supere el valor 10000. Cuando esto último ocurra,
 * se debe mostrar el total acumulado, el contador de los números introducidos y
 * la media.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio23 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa suma, hace la media y cuenta los números");
    System.out.println("que introduzcas hasta llegar a mil.");
    int i = 0;
    int suma = 0;
    int numero = 0;
    do {
      System.out.print("Introduce un número: ");
      numero = Integer.parseInt(s.nextLine());
      suma = suma + numero;
      i++;
      
    } while (suma <= 10000);
    System.out.println(" ");
    System.out.println("Has introducido " + i + " números.");
    System.out.println("La media de los números es de " + suma / i + ".");
    System.out.println("El total acumulado es de " + suma + ".");
  }
}
