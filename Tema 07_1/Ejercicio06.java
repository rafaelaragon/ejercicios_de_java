package tema07;

/**
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición 0
 * debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
 * la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
 * del array.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio06 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int contador = 1;
    float [] numero = new float[15];
    for (int i = 0; i < 15; i++) {
      System.out.print("Dime el número " + contador + ": ");
      numero[i] = Float.parseFloat(s.nextLine());
      contador++;
    }
    System.out.println("Original");
    for (int i = 0; i < 15; i++) {
      System.out.print(numero[i] + "  ");
    }
    System.out.println();
    System.out.println("Rotado");
    System.out.print(numero[14] + "  ");
    for (int i = 0; i < 14; i++) {
      System.out.print(numero[i] + "  ");
    }
    System.out.println();
  }
}
