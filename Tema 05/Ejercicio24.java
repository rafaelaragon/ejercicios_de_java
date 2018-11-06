package tema05;

/**
 * Escribe un programa que lea un número n e imprima una pirámide de números
 * con n filas como en la siguiente figura.
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio24 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa crea pirámides de números de una forma especial.");
    System.out.print("Introduce la altura de la pirámide: ");
    int altura = Integer.parseInt(s.nextLine());

    int planta = 1;
    int largo = 1;
    int espacio = altura - 1;
    while (planta <= altura) {
      for (int i = 1; i <= espacio; i++) {
        System.out.print(" ");
      }

      for (int i = 1; i < largo; i++) {
        System.out.print(i);
      }
      for (int i = largo; i > 0; i--) {
        System.out.print(i);
      }
      System.out.println();
      planta++;
      espacio--;
      largo ++;
    }
  }
}
