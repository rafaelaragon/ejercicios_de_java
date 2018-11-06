package tema06;

/**
 * Escribe un programa que muestre 50 números enteros aleatorios comprendidos
 * entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
 * luego el máximo de los pares el mínimo de los impares y la media de todos los
 * números generados.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio19 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

System.out.println("Este programa muestra 50 números aleatorios del -100 al 200.");
    System.out.println("También muestra el máximo de los pares, el mínimo de los impares y la media de todos.");
    int numero = 0;
    int aux1 = 0;
    int mayor = 0;
    int aux2 = 0;
    int menor = 200;
    int total = 0;
    for (int i = 0; i < 50; i++) {
       numero = (-100 + (int)(Math.random() * 301));
       total+= numero;
       if (numero % 2 == 0) {
       aux1 = numero;
       }
       if (aux1 > mayor) {
         mayor = aux1;
       }
       if (numero % 2 != 0) {
       aux2 = numero;
       }
       if (aux2 < menor) {
         menor = aux2;
       }
    System.out.print(numero + " ");
    }
    int media = total/50;
    System.out.println();
    System.out.println("El mayor de los pares es: " + mayor);
    System.out.println("El menor de los impares es: " + menor);
    System.out.println("La media es: " + media);
  }
}
