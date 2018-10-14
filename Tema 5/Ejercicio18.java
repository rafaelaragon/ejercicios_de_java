package tema05;

/**
 * Escribe un programa que obtenga los números enteros comprendidos entre dos
 * números introducidos por teclado y validados como distintos, el programa debe
 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en
 * 7.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio18 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa obtiene los números enteros comprendidios entre dos números");
    System.out.println(" dados por el usuario de 7 en 7, de menor a mayor");
    System.out.print("Introduzca el primer número: ");
    int numero1 = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca el segundo número: ");
    int numero2 = Integer.parseInt(s.nextLine());
    if (numero1 == numero2) {
      System.out.println("Introduce un valor válido.");
    } else {

      for (int i = numero1; i < numero2 +1; i+= 7) {
        System.out.print( numero1 + ", ");
        numero1 += 7;
      }
    }
  }
}
