package tema05;

/**
 * Escribe un programa que pida una base y un exponente (entero positivo) y que
 * calcule la potencia.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio14 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa pide una base y un exponente y calcula el resultado.");
    System.out.print("Dime la base: ");
    int base = Integer.parseInt(s.nextLine());
    int aux = base;
    System.out.print("Dime el exponente: ");
    int exponente = Integer.parseInt(s.nextLine());
    for (int i = 1; i < exponente; i++) {
      base = base * aux;
    }
    System.out.println(aux + " elevado a " + exponente + " equivale a " + base);
  }
}
