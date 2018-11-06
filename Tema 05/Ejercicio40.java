package tema05;

/**
 * Realiza un programa que pinte por pantalla un rombo hueco hecho con
 * asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
 * sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
 * mensaje de error.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio40 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa pinta una X con la altura que elijas.");
    System.out.print("Introduzca la altura: ");
    int h = Integer.parseInt(s.nextLine());
    if ((h < 3) || (h % 2 == 0)) {
      System.out.println("ERROR, LA ALTURA HA DE SER UN NÚMERO IMPAR MAYOR O IGUAL A 3.");
    } else {
      int altura2 = (h / 2);
      int espaciosCentrales2 = 1;
      int espaciosIzquierda2 = (h - 2);

      for (int i = 0; i <= espaciosIzquierda2; i++) {
        System.out.print(" ");
      }
      System.out.println("*");
      for (int i = 0; i < altura2 - 1; i++) { // Parte inferior de la X
        for (int j = espaciosIzquierda2; j > 0; j--) { // Espacios izquierda
          System.out.print(" ");
        }
        System.out.print("*"); // Lado izquierdo
        for (int j = 0; j < espaciosCentrales2; j++) { // Espacios centrales
          System.out.print(" ");
        }
        System.out.println("*");
        espaciosIzquierda2--;
        espaciosCentrales2 += 2;
      }
      int altura1 = ((h / 2) + 1);
      int espaciosCentrales1 = h - 2;
      int espaciosIzquierda1 = ((h / 2) + 1);

      for (int i = 0; i < altura1; i++) { // Parte superior de la X
        for (int j = 1; j < espaciosIzquierda1; j++) { // Espacios izquierda
          System.out.print(" ");
        }
        System.out.print("*"); // Lado izquierdo
        for (int j = espaciosCentrales1; j > 0; j--) { // Espacios centrales
          System.out.print(" ");
        }
        if (i < altura1 - 1) {
          System.out.println("*"); // Lado derecho
        } else {
          System.out.println("");
        }
        espaciosIzquierda1++;
        espaciosCentrales1 -= 2;
      }
    }
  }
}
