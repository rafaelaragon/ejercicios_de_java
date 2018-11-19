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

    int[][] array = new int[8][8];
    System.out.print("Introduzca la posición del alfil: ");
    String posicion = s.nextLine();

    int columna = (int) (posicion.charAt(0)) - 96; //He utilizado el solucionario para ver cóme leer carácter a carácter
    int fila = (int) (posicion.charAt(1)) - 48;

    System.out.print("El alfil puede moverse a las siguientes posiciones: ");

    for (int y = 8; y > 0; y--) {
      for (int x = 1; x <= 8; x++) {
        if ((fila - y) == (columna - x)) {
          if ((fila == y) && (columna == x)) {
          } else {
          System.out.print((char) (x + 96) + "" + fila + " "); //Este char también he tenido que buscarlo.
          }
        }
      }
    }
  }
}
