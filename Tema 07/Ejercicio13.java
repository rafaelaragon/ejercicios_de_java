package tema07;

/**
 * Escribe un programa que rellene un array de 100 elementos con números enteros
 * aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación el
 * programa mostrará el array y preguntará si el usuario quiere destacar el
 * máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo el
 * número destacado entre dobles asteriscos.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio13 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] array = new int[100];
    String respuesta = "";
    int maximo = 0;
    int minimo = 0;
    int menor = 501;
    int mayor = -1;

    for (int i = 0; i < 100; i++) {
      array[i] = ((int) (Math.random() * 501));
      System.out.print(array[i] + " ");
      if (array[i] < menor) {
        menor = array[i];
      }
      if (array[i] > mayor) {
        mayor = array[i];
      }
    }
    System.out.println();
    System.out.print("¿Quieres destacar el máximo o el mínimo? ");
    respuesta = (s.nextLine().toLowerCase());
    switch (respuesta) {
      case "maximo":
      case "máximo":
        maximo = 1;
        break;
      case "minimo":
      case "mínimo":
        minimo = 1;
        break;
      default:
        System.out.println("Lo siento, no te he entendido.");
        break;
    }
    if ((minimo == 0) && (maximo == 0)) {
      System.out.println();
    } else {
        if (maximo == 1) {
          for (int i = 0; i < 100; i++) {
            if (array[i] == mayor) {
              System.out.print("**" + array[i] + "** ");
            } else {
              System.out.print(array[i] + " ");
            }
          }
          System.out.println();
        } else {
          for (int i = 0; i < 100; i++) {
            if (array[i] == menor) {
              System.out.print("**" + array[i] + "** ");
            } else {
              System.out.print(array[i] + " ");
            }
          }
          System.out.println();
                  
        }
    }
  }
}
