package tema07;

/**
 * Escribe un programa que lea 10 números por teclado y que luego los muestre en
 * orden inverso, es decir, el primero que se introduce es el último en
 * mostrarse y viceversa.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio03 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int contador = 1;
    double[] num = new double[10];
    for (int i = 0; i < 10; i++) {
      System.out.print("Dime el número " + contador + ": ");
      num[i] = Double.parseDouble(s.nextLine());
      contador++;
    }
    System.out.println();
    System.out.print("En orden inverso, los números son: ");
    for (int i = 9; i >= 0; i--) {
      System.out.print(num[i] + ", ");
    }
  }
}
