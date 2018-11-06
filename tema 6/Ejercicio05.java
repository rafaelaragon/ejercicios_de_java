package tema06;

/**
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media.
 * de esos números.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio05 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa muestra 50 números aleatorios del 100 al 199.");
    int numero = 0;
    int aux1 = 0;
    int mayor = 0;
    int aux2 = 0;
    int menor = 200;
    int total = 0;
    for (int i = 0; i < 50; i++) {
       numero = (100 + (int)(Math.random() * 100));
       total+= numero;
       aux1 = numero;
       if (aux1 > mayor) {
         mayor = aux1;
       }
       aux2 = numero;
       if (aux2 < menor) {
         menor = aux2;
       }
    System.out.print(numero + " ");
    }
    int media = total/50;
    System.out.println();
    System.out.println("El mayor es: " + mayor);
    System.out.println("El menor es: " + menor);
    System.out.println("La media es: " + media);
  }
}
