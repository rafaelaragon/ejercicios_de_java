package tema06;

/**
 * Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y
 * 8. Escribe un programa que genere de forma aleatoria la tirada de cinco
 * dados.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio23 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String resultado = "";
    for (int i = 0; i < 5; i++) {
      int tirada = ((int) (Math.random() * 6) + 1);
      switch (tirada) {
        case 1:
          resultado = "As";
          break;
        case 2:
          resultado = "K";
          break;
        case 3:
          resultado = "Q";
          break;
        case 4:
          resultado = "J";
          break;
        case 5:
          resultado = "7";
          break;
        case 6:
          resultado = "8";
          break;
      }
      System.out.print(resultado + " ");
    }
    System.out.println();
  }
}
