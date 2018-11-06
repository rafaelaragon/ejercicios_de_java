package tema06;

/**
 * Realiza un programa que vaya generando números aleatorios pares entre 0 y 100
 * y que no termine de generar números hasta que no saque el 24. El programa
 * deberá decir al final cuántos números se han generado.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio09 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa genera números al azar hasta que sale 24.");
    System.out.println("Cuando sale, dice cuántos números se han generado.");
    System.out.println();
    int numero = 0;
    int contador = 0;
    do {
      numero = ((int) (Math.random() * 101));
      if (numero % 2 == 0) {
        System.out.print(numero + " ");
        contador++;
      }
    } while (numero != 24);
    System.out.println();
    System.out.println("Se han generado " + contador + " números.");
  }
}
