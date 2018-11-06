package tema06;

/**
 * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
 * agua. La capacidad será indicada por el usuario. La cuba se llenará con una
 * cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
 * pueda admitir. El ancho de la cuba no varía.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio20 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Este programa muestra una cuba con o sin agua.");
    System.out.print("Introduzca la altura de la cuba: ");
    int altura = Integer.parseInt(s.nextLine());
    int numero = ((int)(Math.random() * altura + 1));
    
    for (int i = altura; i > 0; i--) {
      System.out.print("*"); // Lado izquierdo
      if ( i <= numero) {
        System.out.print("===="); // Con agua
      } else {
        System.out.print("    "); // Sin agua
      }
      System.out.println("*"); // Lado derecho
    }
    System.out.println("******"); // Base
    System.out.println(numero);
  }
}
