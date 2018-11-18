package tema07_2;

/**
 * Modifica el programa anterior de tal forma que las sumas parciales y la suma
 * total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
 * que el ordenador se queda “pensando” antes de mostrar los números.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio04 {

  public static void main(String[] args) throws InterruptedException {
    Scanner s = new Scanner(System.in);

    int[][] array = new int[4][5];

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        array[i][j] = (100 + (int) (Math.random() * 900));
      }
    }
    System.out.println();
    int sumaFila = 0;

    for (int i = 0; i < 4; i++) {
      sumaFila = 0;
      for (int j = 0; j < 5; j++) {
        System.out.printf("%6d ", array[i][j]);
        sumaFila += array[i][j];
      }
      Thread.sleep(1000);

    System.out.printf("| %6d ", sumaFila);
    System.out.println();
  }

  int sumaColumna = 0;
  int sumaTotal = 0;

  System.out.println (
  "-------------------------------------------");
  for (int j = 0; j< 5; j++) {
        sumaColumna = 0;
    for (int i = 0; i < 4; i++) {
      sumaColumna += array[i][j];
    }
    sumaTotal += sumaColumna;
    Thread.sleep(1000);
    System.out.printf("%6d ", sumaColumna);
  }
  Thread.sleep(1000);
  System.out.printf ("| %6d ", sumaTotal);
    System.out.println();
  }
}
