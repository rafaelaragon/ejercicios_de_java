package tema05;

/**
 * Escribe un programa que, dado un número entero positivo, diga cuáles son y
 * cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden,
 * de izquierda a derecha. Usa long en lugar de int donde sea necesario para
 * admitir números largos.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio32 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa dice cuánto suman los dígitos pares de un número que le des.");
    System.out.print("Introduzca el número: ");
    int numero = Integer.parseInt(s.nextLine());
    if (numero < 0) {
      System.out.println("¡Usa números positivos!");
    } else {

      int aux = numero;
      int girado = 0;
      int suma = 0;

      while (aux > 0) {
        girado = (girado * 10) + (aux % 10);
        aux /= 10;
      }

      System.out.print("Dígitos pares: ");
      while (girado > 0) {
        int digito = girado % 10;
        if (digito % 2 == 0) {
          System.out.print(" " + digito);
          suma += digito;
          girado /= 10;
        } else {
          girado /= 10;
        }
      }
      System.out.println(" ");
      System.out.println("Su suma vale " + suma);
    }
  }
}
