package tema07_2;

/**
 * Realiza un programa que sea capaz de rotar todos los elementos de una
 * matriz cuadrada una posición en el sentido de las agujas del reloj. La matriz
 * debe tener 12 filas por 12 columnas y debe contener números generados al
 * azar entre 0 y 100. Se debe mostrar tanto la matriz original como la matriz
 * resultado, ambas con los números convenientemente alineados.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio09 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[][] array = new int[12][12];
    int fila;
    int aux1;
    int aux2;
    
    for(int i = 0; i < 12; i++) {
      for (int j = 0; j < 12; j++) {
        array[i][j] = ((int) (Math.random() * 101));
      }
    }
    for (int i = 0; i < 12; i++) {
      for (int j = 0; j < 12; j++) {
        System.out.printf("%3d ",array[i][j]);
      }
      System.out.println();
    }
    System.out.println();
    
    for(fila = 0; fila < 6; fila++) {
      
      // rota por arriba
      aux1 = array[fila][11 - fila];
      for (int i = 11 - fila; i > fila; i--) {
        array[fila][i] = array[fila][i - 1];
      }
        
      // rota por la derecha
      aux2 = array[11 - fila][11 - fila];
      for (int i = 11 - fila; i > fila + 1; i--) {
        array[i][11 - fila] = array[i - 1][11 - fila];
      }
      array[fila + 1][11 - fila] = aux1;
      
      // rota por abajo
      aux1 = array[11 - fila][fila];
      for (int i = fila; i < 11 - fila - 1; i++) {
        array[11 - fila][i] = array[11 - fila][i + 1];
      }
      array[11 - fila][11 - fila - 1] = aux2;
        
      // rota por la izquierda
      for (int i = fila; i < 11 - fila - 1; i++) {
        array[i][fila] = array[i + 1][fila];
      }
      array[11 - fila - 1][fila] = aux1;

    }
    
    System.out.println("Vamos a girar los números según el sentido del reloj.");
    System.out.println();
    for (int i = 0; i < 12; i++) {
      for (int j = 0; j < 12; j++) {
        System.out.printf("%3d ",array[i][j]);
      }
      System.out.println();
    }
  }
}
