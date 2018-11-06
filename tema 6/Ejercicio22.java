package tema06;

/**
 * Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
 * aleatorio. La cabeza se representará con el carácter @ y se debe colocar
 * exactamente en la posición 13 (con 12 espacios delante). A partir de ahí, el
 * cuerpo irá serpenteando de la siguiente manera: se generará de forma
 * aleatoria un valor entre tres posibles que hará que el siguiente carácter se
 * coloque una posición a la izquierda del anterior, alineado con el anterior o
 * una posición a la derecha del anterior. La longitud de la serpiente se pedirá
 * por teclado y se supone que el usuario introducirá un dato correcto.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio22 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la longitud de la serpiente: ");
    int longitud = Integer.parseInt(s.nextLine());

    int espacio = 12;
    System.out.println("            @"); // Cabeza
    for (int i = 1; i < longitud; i++) {
      int numero = ((int) (Math.random() * 3) + 1);
      if (numero == 1) {
        espacio--;
      }
      if (numero == 3) {
        espacio++;
      }
      for (int j = 0; j < espacio; j++) {
        System.out.print(" "); // Espacio Izquierdo
      }
      System.out.println("*"); // Cuerpo
    }
  }
}
