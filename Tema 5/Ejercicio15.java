package tema05;

/**
 * Escribe un programa que dados dos números, uno real (base) y un entero
 * positivo (exponente), saque por pantalla todas las potencias con base el
 * numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el
 * 5, se deberán mostrar 2^1, 2^2, 2^3, 2^4 y 2^5.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio15 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa pide una base y un exponente y calcula el resultado.");
    System.out.print("Dime la base: ");
    double base = Double.parseDouble(s.nextLine());
    double aux = base;
    System.out.print("Dime el exponente: ");
    int exponente = Integer.parseInt(s.nextLine());
    int aux2 = 1;
    for (int i = 0; i < exponente; i++) {
      System.out.printf("%.2f elevado a %d equivale a %.2f \n", aux, aux2, base);
      System.out.println(" ");
      base = base * aux;
      aux2++;
    }
  }
}
