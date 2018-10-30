package tema06;

/**
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario
 * debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
 * fallido, el programa dirá cuántas oportunidades quedan y si el número
 * introducido es menor o mayor que el número secreto.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio06 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa quiere que averigües un número al azar del 0 al 100.");
    int intentos = 4;
    int numero = ((int) (Math.random() * 100));
    // Si quieres hacer trampas simplemente pega esto en esta línea.  System.out.println(numero);
    for (int i = 0; i < 5; i++) {
      System.out.print("Adivine el número: ");
      int adivina = Integer.parseInt(s.nextLine());
      if ((adivina < 0) || (adivina > 100)) {
        System.out.println("¡Ese número no está comprendido entre 0 y 100!");
        System.out.println("Intentos restantes: " + intentos);
      } else if (adivina < numero) {
        System.out.println("El número que buscas es mayor que " + adivina);
        System.out.println("Intentos restantes: " + intentos);
      } else if (adivina > numero) {
        System.out.println("El número que buscas es menor que " + adivina);
        System.out.println("Intentos restantes: " + intentos);
      } else {
        System.out.println("¡Felicidades, lo has adivinado!");
        break;
      }
      if (intentos == 0) {
        System.out.println("Has perdido. El número era " + numero);
      }
      intentos--;
    }
    System.out.println();
  }
}
