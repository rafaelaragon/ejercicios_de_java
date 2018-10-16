package tema05;

/**
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide
 * hueca.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio20_ {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa imprime una pirámide hueca por pantalla.");
    System.out.print("Dime qué carácter quieres utilizar en la pirámide: ");
    String a = s.nextLine();
    System.out.print("Introduzca la altura de la pirámide: ");
    int h = Integer.parseInt(s.nextLine());
    int espacios = h;
    int espaciosdentro = 0;
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < espacios; j++) {
        System.out.print(" "); // espacio izquierda
      }
      System.out.print(a); // lado izquierdo
      for (int k = 0; k < espaciosdentro; k++) {
        System.out.print(" ");
        espaciosdentro++;
      }
       System.out.println(a); // lado derecho
       espacios--;
       espaciosdentro++;
    }
  }
}
