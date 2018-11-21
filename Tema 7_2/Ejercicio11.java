package tema07_2;

/**
 * Realiza un programa que muestre por pantalla un array de 10 filas por 10
 * columnas relleno con números aleatorios entre 200 y 300. A continuación, el
 * programa debe mostrar los números de la diagonal que va desde la esquina
 * superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
 * y la media de los números que hay en esa diagonal.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio11 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int [][] array = new int [10][10];
    
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        array[i][j] = (200 + (int) (Math.random() * 101));
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
    
    System.out.println();
    int j = 0;
    int espacios = 0;
    int maximo = 0;
    int minimo = 1000;
    int total = 0;
    
    for (int i = 0; i < 10; i++) {
      System.out.println(array[i][j]);
      if (array[i][j] > maximo) {
        maximo = array[i][j];
      }
      if (array[i][j] < minimo) {
        minimo = array[i][j];
      }
      total += array[i][j];
      j++;
      espacios++;
      for (int k = 0; k < espacios; k++) {
        System.out.print("    ");
      }
    }
    int media = total / 10;
    System.out.println();
    
    System.out.println("El número más alto es " + maximo + ".");
    System.out.println("El número más bajo es " + minimo + ".");
    System.out.println("La media de los números es " + media + ".");
    
  }
}
