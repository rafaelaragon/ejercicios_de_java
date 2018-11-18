package tema07_2;

/**
 * Modifica el programa anterior de tal forma que los números que se introducen
 * en el array se generen de forma aleatoria (valores entre 100 y 999).
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio03 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[][] array = new int[4][5];

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        array[i][j] =(100 + (int) (Math.random() * 900));
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
      System.out.printf("| %6d ", sumaFila);
      System.out.println();
    }

    int sumaColumna = 0;
    int sumaTotal = 0;

    System.out.println("-------------------------------------------");
    for (int j = 0; j < 5; j++) {
      sumaColumna = 0;
      for (int i = 0; i < 4; i++) {
        sumaColumna += array[i][j];
      }
      sumaTotal += sumaColumna;
      System.out.printf("%6d ", sumaColumna);
    }
    System.out.printf("| %6d ", sumaTotal);
  }
}
