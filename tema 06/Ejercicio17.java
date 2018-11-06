package tema06;

/**
 * Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
 * Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
 * serán de 4 unidades. No hay que comprobar que los datos se introducen
 * correctamente; podemos suponer que el usuario los introduce bien. Dentro de
 * la pecera hay que colocar de forma aleatoria un pececito, que puede estar
 * situado en cualquiera de las posiciones que quedan en el hueco que forma el
 * rectángulo.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio17 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Este programa muestra una pecera con un pez dentro.");
    System.out.println("Introduzca el ancho de la pecera (mínimo 4 unidades): ");
    int ancho = Integer.parseInt(s.nextLine());
    System.out.println("Introduzca el alto de la pecera (mínimo 4 unidades): ");
    int altura = Integer.parseInt(s.nextLine());

    int latitudPez = ((int) (Math.random() * (ancho - 2)) + 1);
    int longitudPez = ((int) (Math.random() * (altura - 2)) + 1);

    for (int i = 0; i < ancho; i++) { // Techo de la pecera
      System.out.print("*");
    }
    System.out.println();

    for (int i = 0; i < altura - 2; i++) {
      System.out.print("*"); // Lado izquierdo
      for (int j = 0; j < ancho - 2; j++) {
        if ((i == latitudPez - 1) && ( j == longitudPez - 1)) {
          System.out.print("&");
        } else {
          System.out.print(" "); // Espacios centrales
        }
      }
      System.out.println("*"); // Lado derecho
    }

    for (int i = 0; i < ancho; i++) { // Base de la pecera
      System.out.print("*");
    }
    System.out.println();
  }
}
