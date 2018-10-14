package tema05;

/**
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio22 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Números primos entre el 2 y el 100.");
    boolean primo = true;
    for (int n = 2; n <= 100; n++) {

      primo = true;
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          primo = false;
        }
      }
      if (primo) {
        System.out.print(n + ", ");
      }
    }
  }
}
