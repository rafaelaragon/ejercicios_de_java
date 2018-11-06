package tema05;

/**
 * Realiza un programa que pida un número por teclado y que luego muestre ese
 * número al revés.
 * 
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio25 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa muestra números al revés.");
    System.out.print("Introduzca el número a girar: ");
    int numero = Integer.parseInt(s.nextLine());
    if (numero < 0) {
      System.out.println("¡Usa números positivos!");
    } else {

    int aux = numero;
    int girado = 0;

    while (aux > 0) {
      girado = (girado * 10) + (aux % 10);
      aux /= 10;
    }

    System.out.println("Al girar el " + numero + " obtene " + girado + ".");
    }
  }
}
