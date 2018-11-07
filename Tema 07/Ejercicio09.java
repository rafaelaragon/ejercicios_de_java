package tema07;

/**
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
 * números junto con la palabra “par” o “impar” según proceda.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio09 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int numero = 1;
    int[] array = new int[8];
    for (int i = 0; i < 8; i++) {
      System.out.print("Dime el numero " + numero + ": ");
      array[i] = Integer.parseInt(s.nextLine());
      numero++;
    }
    System.out.println();
    
    for (int i = 0; i < 8; i++) {
      System.out.print(array[i]);
      if ((array[i] % 2) == 0 ) {
        System.out.println("  par");
      } else {
        System.out.println("  impar");
      }
    }            
  }
}
