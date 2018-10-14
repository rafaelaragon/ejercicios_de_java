package tema05;

/**
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide
 * hueca.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio20 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa imprime una pirámide hueca por pantalla.");
    System.out.print("Dime qué carácter quieres utilizar en la pirámide: ");
    String a = s.nextLine();
    System.out.print("Introduzca la altura de la pirámide: ");
    int alturaDada = Integer.parseInt(s.nextLine());

    int altura = 1;
    int espaciosFuera = alturaDada - 1;
    int espaciosDentro = 0;

    while (altura < alturaDada) {
      for (int i = 1; i <= espaciosFuera; i++) {
        System.out.print(" ");
      }

      System.out.print(a);
      for (int i = 1; i < espaciosDentro; i++) {
        System.out.print(" ");
      }

      if (altura > 1) {
        System.out.print(a);
      }

      System.out.println();
      altura++;
      espaciosFuera--;
      espaciosDentro += 2;
    }

    for (int i = 1; i < altura * 2; i++) {
      System.out.print(a);
    }

  }
}
