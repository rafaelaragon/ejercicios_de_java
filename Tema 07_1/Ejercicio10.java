package tema07;

/**
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y
 * que los almacene en un array. El programa debe ser capaz de pasar todos los
 * números pares a las primeras posiciones del array (del 0 en adelante) y todos
 * los números impares a las celdas restantes. Utiliza arrays auxiliares si es
 * necesario.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio10 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] numero = new int[20];
    int[] par = new int[20];
    int[] impar = new int[20];
    for (int i = 0; i < 20; i++) {
      int aleatorio = ((int) (Math.random() * 101));
      numero[i] = aleatorio;
      System.out.print(numero[i] + " ");
    }
    System.out.println();

    int pares = 0;
    int impares = 0;
    for (int i = 0; i < 20; i++) {
      if ((numero [i] % 2) == 0) {
       par[pares] = numero [i];
       pares++;
      } else {
        impar[impares] = numero[i];
        impares++;
      }
    }
   for (int i = 0; i < pares; i++) {
     System.out.print(par[i] + " ");
   }
   for (int i = 0; i < impares; i++) {
     System.out.print(impar[i] + " ");
   }
  }
}
