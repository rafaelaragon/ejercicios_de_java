package tema06;

/**
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio01 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa muestra la tirada de tres dados, así como la suma de estos.\n");

    int suma = 0;
    int tirada = 0;
    for (int i = 0; i < 3; i++) {
      tirada = ((int)(Math.random() * 6) + 1);
    System.out.print(tirada + " ");
    suma += tirada;
    }
    System.out.println();
    System.out.println("La suma de las tiradas es " + suma);
  }
}
