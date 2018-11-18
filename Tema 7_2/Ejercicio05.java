package tema07_2;

/**
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con
 * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
 * continuación, el programa deberá dar la posición tanto del máximo como del
 * mínimo.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio05 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[][] array = new int[6][10];
    int maximo = -1;
    int minimo = 1001;
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;
    
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 10; j++) {
        array[i][j] = ((int) (Math.random() * 1001));
        if (array[i][j] > maximo) {
          maximo = array[i][j];
          x1 = i;
          y1 = j;
        }
        if (array[i][j] < minimo) {
          minimo = array[i][j];
          x2 = i;
          y2 = j;
        }
      }
    }
    
    System.out.print("               ");
    for (int i = 0; i < 10; i++) {
    System.out.printf("%6d ",i);
    }
    System.out.println();
    System.out.println("             -----------------------------------------------------------------------");
    
    for (int i = 0; i < 6; i++) {
      System.out.print("       ");
      System.out.printf("%6d| ",i);
      for (int j = 0; j < 10; j++) {
        System.out.printf("%6d ", array[i][j]);
      }
      System.out.println();
    }
    System.out.println();
    System.out.println("            El número más grande es " + maximo +", está en "+ x1 + "," + y1);
    System.out.println("            El número más pequeño es " + minimo +", está en "+ x2 + "," + y2);
  }
}
