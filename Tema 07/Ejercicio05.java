package tema07;

/**
 * Escribe un programa que pida 10 números por teclado y que luego muestre los
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio05 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int minimo = 1000000000;
    int maximo = -1000000000;
    int[] numero = new int[10];
    for (int i = 0; i < 10; i++) {
      int aleatorio = ((int) (Math.random() * 101));
      numero[i] = aleatorio;
      if (numero[i] < minimo) {
        minimo = numero[i];
      }
      if (numero[i] > maximo) {
        maximo = numero[i];
      }
    }
    for (int i = 0; i < 10; i++) {
      System.out.print(numero[i]);
      if (numero[i] == minimo) {
        System.out.println(" mínimo");
      } else if (numero[i] == maximo) {
        System.out.println(" maximo");
      } else {
        System.out.println();
      }
    }
  }
}
