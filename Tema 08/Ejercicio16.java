package Ejercicios;

/**
 * Muestra los números capicúa que hay entre 1 y 99999.
 *
 * @author Rafael Aragón Rodríguez
 *
 */
import java.util.Scanner;

public class Ejercicio16 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    for (int i = 1; i < 99999; i++) {
      if(matematicas.Varias.esCapicua(i)) {
        System.out.print(i + " ");
      }
    }
  }
}
