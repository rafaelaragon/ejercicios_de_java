package tema05;

/**
 * Escribe un programa que pida dos números por teclado y que luego mezcle en
 * dos números diferentes los dígitos pares y los impares. Se van comprobando
 * los dígitos de la siguiente manera: primer dígito del primer número, primer
 * dígito del segundo número, segundo dígito del primer número, segundo dígito
 * del segundo número, tercer dígito del primer número… Para facilitar el
 * ejercicio, podemos suponer que el usuario introducirá dos números de la misma
 * longitud y que siempre habrá al menos un dígito par y uno impar. Usa long en
 * lugar de int donde sea necesario para admitir números largos.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio34 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa mezcla los dígitos pares e impares de dos números que tú elijas.");
    System.out.print("Introduzca el primer número: ");
    long n1 = Long.parseLong(s.nextLine());
    long aux1 = n1;
    long girado1 = 0;
    int longitud = 0;

    while (aux1 > 0) {
      girado1 = (girado1 * 10) + (aux1 % 10);
      aux1 /= 10;
      longitud++;
    }
    System.out.print("Introduzca el segundo número: ");
    long n2 = Long.parseLong(s.nextLine());
    long aux2 = n2;
    long girado2 = 0;

    while (aux2 > 0) {
      girado2 = (girado2 * 10) + (aux2 % 10);
      aux2 /= 10;
    }

    long par = 0;
    long impar = 0;
    long digito;

    for (int i = 0; i < longitud; i++) {

      digito = girado1 % 10;

      if ((digito % 2) == 0) {
        par = par * 10 + digito;
      } else {
        impar = impar * 10 + digito;
      }

      digito = girado2 % 10;

      if ((digito % 2) == 0) {
        par = par * 10 + digito;
      } else {
        impar = impar * 10 + digito;
      }
      girado1 /= 10;
      girado2 /= 10;
    }

    System.out.println("El resultado de los pares es: " + par);
    System.out.println("El resultado de los impaes es: " + impar);

  }
}
