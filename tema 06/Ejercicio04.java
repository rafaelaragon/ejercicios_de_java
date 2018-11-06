package tema06;

/**
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados
 * por espacios.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio04 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa muestra 20 números aleatorios del 1 al 10.");
    for (int i = 0; i < 20; i++) {
      int numero = ((int)(Math.random() * 11));
    System.out.print(numero + " ");
    }
    System.out.println();
  }
}
