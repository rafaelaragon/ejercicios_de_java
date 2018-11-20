package tema07_2;

/**
 * Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
 * a qué casillas podría saltar un alfil que se encuentra en esa posición. Como
 * se indica en la figura, el alfil se mueve siempre en diagonal. El tablero
 * cuenta con 64 casillas. Las columnas se indican con las letras de la “a” a la
 * “h” y las filas se indican del 1 al 8.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio08 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    boolean valido;
    int fila = 0;
    int columna = 0;
    do {
      valido = true;
      System.out.print("Introduzca la posición del alfil: ");
      String posicion = s.nextLine();

      columna = (int) (posicion.charAt(0)) - 96; 
      fila = (int) (posicion.charAt(1)) - 48;

      if ((columna > 8) || (columna < 1) || (fila > 8) || (fila < 1)) {
        valido = false;
        System.out.println("¡Coordenada no válida!");
      }
    } while (!valido);

    System.out.print("El alfil puede moverse a: ");
    for (int i = 1; i < 9; i++) {
      for (int j = 1; j < 9; j++) {
        if (Math.abs(i - fila) == Math.abs(j - columna) && Math.abs(i - fila) != 0) {
          System.out.print((char) (j + 96) + (i + " "));
        }
      }
    }
    System.out.println();
  }
}
