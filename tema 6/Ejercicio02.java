package tema06;

/**
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja
 * francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
 * diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
 * cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A
 * (que sería el 1). Para convertir un número en una cadena de caracteres
 * podemos usar String.valueOf(n).
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio02 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa muestra una carta de la baraja francesa al azar.");
    int numero = ((int) (Math.random() * 13) + 1);
    if (numero == 1) {
      System.out.print("As");
    } else if (numero == 11) {
      System.out.print("Jota");
    } else if (numero == 12) {
      System.out.print("Reina");
    } else if (numero == 13) {
      System.out.print("Rey");
    } else {
      System.out.print(numero);
    }
    System.out.print(" de ");
    int palo = ((int) (Math.random() * 4) + 1);
    switch (palo) {
      case 1:
        System.out.println("Corazones.");
        break;
      case 2:
        System.out.println("Picas.");
        break;
      case 3:
        System.out.println("Diamantes.");
        break;
      case 4:
        System.out.println("Tréboles.");
        break;  
    }
  }
}
