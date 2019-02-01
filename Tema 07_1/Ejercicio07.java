package tema07;

/**
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedirá entonces por
 * teclado dos valores y a continuación cambiará todas las ocurrencias del
 * primer valor por el segundo en la lista generada anteriormente. Los números
 * que se han cambiado deben aparecer entrecomillados.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio07 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] numero = new int[100];
    for (int i = 0; i < 100; i++) {
      int aleatorio = ((int) (Math.random() * 21));
      numero[i] = aleatorio;
      System.out.print(numero[i] + " ");
    }
    System.out.println();
    System.out.println("Vamos a cambiar un valor por otro.");
    System.out.print("Dime el valor que quieres sustituir: ");
    int sustituido = Integer.parseInt(s.nextLine());
    if ((sustituido < 0) || (sustituido > 20)) {
      System.out.println("¡Tiene que ser un número del 0 al 20!");
    } else {
      System.out.print("Dime el valor por el que quiere sustituirlo: ");
      int sustituto = Integer.parseInt(s.nextLine());
      for (int i = 0; i < 100; i++) {
        if (numero [i] == sustituido) {
          numero [i] = sustituto;
        }
        System.out.print(numero[i] + " ");
      }
    }
  }
}
