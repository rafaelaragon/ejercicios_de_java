package tema05;

/**
 * Escribe un programa que muestre por pantalla todos los números enteros
 * positivos menores a uno leído por teclado que NO sean divisibles entre otro
 * también leído de igual forma.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio29 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa te dice qué enteros menores a un número ");
    System.out.println("que introduzcas no son divisibles por otro que también introduzcas.");
    System.out.print("Introduzca el número del que salen los enteros menores a él: ");
    int numero1 = Integer.parseInt(s.nextLine());
    if (numero1 < 0) {
      System.out.println("¡Introduce un número positivo!");
    } else {
      System.out.print("Introduzca el número del que quieres saber qué enteros no son divisibles: ");
      int numero2 = Integer.parseInt(s.nextLine());
      System.out.println("Los números enteros positivos menores a " + numero1 + "no divisibles por " + numero2 + " son:");
      for (int i = 1; i <= numero1; i++) {
        if ((numero2 % i) != 0) {
          System.out.print(i + ", ");
        }
      }
    }
  }
}
