package tema07_2;

/**
 * Realiza un programa que muestre por pantalla un array de 9 filas por 9
 * columnas relleno con números aleatorios entre 500 y 900. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * inferior izquierda a la esquina superior derecha, así como el máximo, el
 * mínimo y la media de los números que hay en esa diagonal.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio12 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[][] array = new int[9][9];

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        array[i][j] = (500 + (int) (Math.random() * 401));
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println();
    int j = 8;
    int espacios = 8;
    int maximo = 0;
    int minimo = 1000;
    int total = 0;

    for (int i = 0; i < 9; i++) {
      for (int k = 0; k < espacios; k++) {
        System.out.print("    ");
      }
      espacios--;
      System.out.println(array[i][j]);
      if (array[i][j] > maximo) {
        maximo = array[i][j];
      }
      if (array[i][j] < minimo) {
        minimo = array[i][j];
      }
      total += array[i][j];
      j--;
    }

    int media = total / 10;
    System.out.println();

    System.out.println("El número más alto es " + maximo + ".");
    System.out.println("El número más bajo es " + minimo + ".");
    System.out.println("La media de los números es " + media + ".");
  }
}
