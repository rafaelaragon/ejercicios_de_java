package tema05;

/**
 * Escribe un programa que diga si un número introducido por teclado es o no
 * capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
 * programa debe aceptar números de cualquier longitud siempre que lo permita el
 * tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
 * long en lugar de int ya que el primero admite números más largos.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio36 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa te dice si un número es o no capicúo.");
    System.out.print("Introduzca el número: ");
    long numero = Long.parseLong(s.nextLine());
    long aux = numero;
    long girado = 0;
    if (numero < 0) {
      System.out.println("¡Usa números positivos!");
    } else {
      while (aux > 0) {
        girado = (girado * 10) + (aux % 10);
        aux /= 10;
      }
    }
    if (numero == girado) {
      System.out.println("El número " + numero + " es capicúo.");
    } else {
      System.out.println("El número " + numero + " no es capicúo.");
    }
  }
}
