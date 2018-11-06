package tema06;

/**
 * Escribe un programa que, dado un número introducido por teclado, elija al
 * azar uno de sus dígitos.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio24 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Este programa elige un dígito al azar de un número que le des.");
    System.out.print("Introduzca el número: ");
    long numero = Long.parseLong(s.nextLine());
    long aux = numero;
    long girado = 0;
    int longitud = 0;

    if (numero < 0) {
      System.out.print("¡Usa números positivos!"); // Para comprobar si el número es positivo.
    } else {

      while (aux > 0) {
        girado = (girado * 10) + (aux % 10);  // Gira el número para poder seleccionarlo dígito a dígito.
        aux /= 10;
        longitud++;
      }
    }
    System.out.print("El dígito elegido es: ");
    int aleatorio = ((int)(Math.random() * longitud));
    long digito = 0;
    long primerDigito = 0;
    for (int i = 0; i < longitud; i++) {  //Muestra el número dígito a dígito.
      digito = girado % 10;
      girado /= 10;
      if (i == aleatorio) {
        System.out.println(digito);
      }
    }
    System.out.println();
  }
}
