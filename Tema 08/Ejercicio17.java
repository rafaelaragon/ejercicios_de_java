package Ejercicios;

/**
 * Escribe un programa que pase de binario a decimal.
 *
 * @author Rafael Aragón Rodríguez
 *
 */
import java.util.Scanner;

public class Ejercicio17 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca el número binario: ");
    long binario = Long.parseLong(s.nextLine());
    long decimal =matematicas.Conversores.binDec(binario);
    System.out.println(binario + " convertido a decimal vale " + decimal);
  }
}
