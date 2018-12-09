package Ejercicios;

/**
 * Une y amplía los dos programas anteriores de tal forma que se permita
 * convertir un número entre cualquiera de las siguientes bases:decimal,binario,
 * hexadecimal y octal.
 *
 * @author Rafael Aragón Rodríguez
 *
 */
import java.util.Scanner;

public class Ejercicio19 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce un número: ");
    String numero = s.nextLine();
    System.out.print("Introduce la base del número ");
    int base = Integer.parseInt(s.nextLine());
    System.out.print("Introduce la base a la que quieres convertir el número: ");
    int base2 = Integer.parseInt(s.nextLine());
    String solución = matematicas.Conversores.conversorPrincipal(numero, base, base2);
    System.out.println("" + solución);
  }
}
