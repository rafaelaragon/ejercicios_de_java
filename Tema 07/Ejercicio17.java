package tema07;

/**
 * Escribe un programa que muestre por pantalla un array de 10 números enteros
 * generados al azar entre 0 y 100. A continuación, el programa debe pedir un
 * número al usuario. Se debe comprobar que el número introducido por teclado se
 * encuentra dentro del array, en caso contrario se mostrará un mensaje por
 * pantalla y se volverá a pedir un número; así hasta que el usuario introduzca
 * uno correctamente. A continuación, el programa rotará el array hacia la
 * derecha las veces que haga falta hasta que el número introducido quede
 * situado en la posición 0 del array. Por último, se mostrará el array rotado
 * por pantalla.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio17 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] array = new int[10];
    boolean esNumero = false;
    int numero;
    
    for (int i = 0; i < 10; i++) {
      array[i] = ((int) (Math.random() * 101));
      System.out.print(array[i] + " ");
    }
    System.out.println();
    do {
      System.out.print("Elige uno de los números que se han generado: ");
      numero = Integer.parseInt(s.nextLine());

      for (int i = 0; i < 10; i++) {
        if (array[i] == numero) {
          esNumero = true;
        }
      }
      if (!esNumero) {
        System.out.println("Escoge un número de los que se han generado.");
      }
    } while (!esNumero);

    int aux = 0;
    while (array[0] != numero) {
      aux = array[9];
      for (int i = 9; i > 0; i--) {
        array[i] = array[i - 1];
      }
      array[0] = aux;
    }
    
     System.out.print(" Índice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%4d ", i);
    }
    System.out.println();
    System.out.print(" Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%4d ", array[i]);
    }
    System.out.println();
  }
}
