package tema05;

/**
 * Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
 * hay dentro de un número. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio41 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa dice cuántos dígitos son pares e impares en un número.");
    System.out.print("Introduzca el número: ");
    long numero = Long.parseLong(s.nextLine());
    long aux = numero;
    long girado = 0;
    int longitud = 0;
    if (numero < 0) {
      System.out.print("¡Usa números positivos!");
    } else {
      while (aux > 0) {
        girado = (girado * 10) + (aux % 10);
        aux /= 10;
        longitud++;
      }
    }
    long digito = 0;
    int par = 0;
    int impar = 0;
    for (int i = 0; i < longitud; i++) {
      digito = girado % 10;
      girado /= 10;
      if (digito % 2 == 0) {
        par++;
      } else {
        impar++;
      }
    }
    System.out.println("En el número " + numero + " hay " + par + " dígitos pares.");
    System.out.println("En el número " + numero + " hay " + impar + " dígitos impares.");     
  }
}
