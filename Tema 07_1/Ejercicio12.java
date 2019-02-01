package tema07;

/**
 * Realiza un programa que pida 10 números por teclado y que los almacene en un
 * array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
 * “inicial” y “final”. Se debe comprobar que inicial es menor que final y que
 * ambos números están entre 0 y 9. El programa deberá colocar el número de la
 * posición inicial en la posición final, rotando el resto de números para que
 * no se pierda ninguno. Al final se debe mostrar el array resultante.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio12 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] array = new int[10];
    int[] aux = new int[10];
    int i;
    int contador = 1;

    for (i = 0; i < 10; i++) {
      System.out.print("Introduzca el numero " + contador + ": ");
      array[i] = Integer.parseInt(s.nextLine());
      contador++;
    } // Muestro el array original
    System.out.print("  Índice ");
    for (i = 0; i < 10; i++) {
      System.out.printf("%6d", i);
    }
    System.out.println();
    System.out.print("  Valor  ");
    for (i = 0; i < 10; i++) {
      System.out.printf("%6d", array[i]);
    }
    System.out.println();
    System.out.print("Dime la posición inicial: ");
    int inicial = Integer.parseInt(s.nextLine());
    if ((inicial < 0) || (inicial > 9)) {
      System.out.println("¡La posición tiene que ser de 0 a 9!");
    } else {
      System.out.print("Dime la posición final: ");
      int fin = Integer.parseInt(s.nextLine());
      if ((fin < 0) || (fin > 9)) {
        System.out.println("¡La posición tiene que ser de 0 a 9!");
      } else if (inicial >= fin) {
        System.out.println("¡La posición inicial tiene que ser menor que la final!");
      } else { // Cambio de posición el array seleccionado.
        for (int j = 0; j < 10; j++) {
          aux[j] = array[j];
        }
        aux[fin] = array[inicial];
    for (i = fin + 1; i < 10; i++) {
      aux[i] = array[i - 1];
    }
    aux[0] = array[9];
    
    for (i = 0; i < inicial; i++) {
      aux[i + 1] = array[i];
    }  // Muestro el array ya girado
        System.out.print("  Índice ");
        for (i = 0; i < 10; i++) {
          System.out.printf("%6d", i);
        }
        System.out.println();
        System.out.print("  Valor  ");
        for (i = 0; i < 10; i++) {
          System.out.printf("%6d", aux[i]);
        }
        System.out.println();
      }
    }
  }
}
