package tema05;

/**
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se
 * debe pedir por teclado.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio19 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa imprime una pirámide por pantalla.");
    System.out.print("Dime qué carácter quieres utilizar en la pirámide: ");
    String a = s.nextLine();
    System.out.print("Introduzca la altura de la pirámide: ");
    int altura = Integer.parseInt(s.nextLine());

    int planta = 1;
    int largo = 1;
    int espacio = altura - 1;
    while (planta <= altura) {
      for (int i = 0; i < espacio; i++) {
        System.out.print(" ");
      }

      for (int i = 0; i < largo; i++) {
        System.out.print(a);
      }
      System.out.println();
      planta++;
      espacio--;
      largo += 2;
    }
  }
}
