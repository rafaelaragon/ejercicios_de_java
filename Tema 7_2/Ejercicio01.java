package tema07_2;

/**
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num
 * y asigna los valores según la siguiente tabla. Muestra el contenido de todos
 * los elementos del array dispuestos en forma de tabla como se muestra en la
 * figura.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio01 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int [][] array = new int [6][3];
    array[0][0] = 0;
    array[1][0] = 30;
    array[2][0] = 2;
    array[5][0] = 5;
    array[0][1] = 75;
    array[4][1] = 0;
    array[2][2] = -2;
    array[3][2] = 9;
    array[5][2] = 11;
    for (int i = 0; i < 3;i++) {
      for (int j = 0; j < 6; j++) {
        System.out.printf("%2d ",array[j][i]);
      }
      System.out.println();
    }
  }
}
