package tema05;

/**
 * Realiza un programa que pinte la letra U por pantalla hecha con asteriscos.
 * El programa pedirá la altura. Fíjate que el programa inserta un espacio y
 * pinta dos asteriscos menos en la base para simular la curvatura de las
 * esquinas inferiores.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio33 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa muestra una U con la altura que elijas.");
    System.out.print("Introduzca la altura de la U: ");
    int altura = Integer.parseInt(s.nextLine());
    int h = altura;
    int espacios = altura - 1;

    for (int i = 1; i < altura; i++) { // Lado izquierdo.
      System.out.print("*");
      for (int j = 0; j < espacios; j++) { // Espacios.
        System.out.print(" ");
      }
      System.out.println("*"); // Lado derecho.
    }
    System.out.print(" ");
    for (int k = 1; k < altura; k++) {
      System.out.print("*");
    }
  }
}

