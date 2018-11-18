package tema07_2;

/**
 * Escribe un programa que pida 20 números enteros. Estos números se deben
 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
 * tratara. La suma total debe aparecer en la esquina inferior derecha.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio02 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[][] array = new int[4][5];

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print("Dime el dato " + i + " " + j + ": ");
        array[i][j] = Integer.parseInt(s.nextLine());
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
