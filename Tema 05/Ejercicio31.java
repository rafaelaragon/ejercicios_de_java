package tema05;

/**
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos.
 * El programa pedirá la altura. El palo horizontal de la L tendrá una longitud
 * de la mitad (división entera entre 2) de la altura más uno.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio31 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa pinta una L de la altura que quieras.");
    System.out.print("Introduzca la altura de la L: ");
    int altura = Integer.parseInt(s.nextLine());
    for (int i = 1; i < altura; i++) {
      System.out.println("*");
    }
    for (int i = 0; i < ((altura / 2) + 1); i++) {
      System.out.print("* ");
    }

  }
}
