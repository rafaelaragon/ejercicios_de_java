package tema06;

/**
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
 * continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
 * dados tengan el mismo valor.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio13 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa muestra la tirada de dos dados, hasta que");
    System.out.println("ambas coincidan.");
    
    int tirada1;
    int tirada2;
    int intentos = 0;
    do {
    tirada1 = ((int)(Math.random() * 6) + 1);
      System.out.print(tirada1 + " ");
    tirada2 = ((int)(Math.random() * 6) + 1);
    System.out.println(tirada2);
    intentos++;
    } while (tirada1 != tirada2);
    System.out.println();
    System.out.println("Han hecho falta " + intentos + " tiradas.");
  }
}
