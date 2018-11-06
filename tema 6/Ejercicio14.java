package tema06;

/**
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
 * El programa intentará adivinar el número que estás pensando - un número entre
 * 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
 * programa debe preguntar si el número que estás pensando es mayor o menor que
 * el que te acaba de decir.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio14 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa intenta adivinar un número del 0 al 100.");
    System.out.print("Introduzca el número: ");
    int numero = Integer.parseInt(s.nextLine());
    int maximo = 101;
    int minimo = 0;
    if ((numero < 0) || (numero > 100)) {
      System.out.println("¡El número debe ser del 1 al 100!");
    } else {
      for (int i = 4; i >= 0; i--) { // Si quieres aumentar los intentos, aumenta el valor de i.
        int intento = (minimo + (int) (Math.random() * maximo));
        if ((intento < minimo) || (intento > maximo)) {
          i++;
        } else if (intento != numero) {
          System.out.print("El número es mayor o menor a " + intento + "? (menor/mayor) ");
          String respuesta = s.nextLine();
          switch (respuesta) {
            case "menor":
              if (numero > intento) {
                System.out.println("¿Acaso crees que puedes engañarme? Sé que es mayor que " + intento + ".");
                System.out.println("Intentos restantes: " + i);
                maximo = intento - 1;
              } else {
                System.out.println("Intentos restantes: " + i);
                maximo = intento - 1;
              }
              break;
            case "mayor":
              if (numero < intento) {
                System.out.println("¿Acaso crees que puedes engañarme? Sé que es menor que " + intento + ".");
                System.out.println("Intentos restantes: " + i);
                minimo = intento + 1;
              } else {
                System.out.println("Intentos restantes: " + i);
                minimo = intento + 1;
              }
              break;
            default:
              System.out.println("No entiendo lo que dices.");
          }
        } else {
          System.out.println("Sin duda, el número era " + intento + ".");
          System.out.println("He acertado, que inteligente soy.");
          break;
        }
        if (i == 0) {
          System.out.println("Así que el número era " + numero + "? Casi lo tenía.");
        }
      }
    }
  }
}
