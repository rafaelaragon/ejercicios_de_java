package tema05;

/**
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
 * numero negativo y nos diga cuantos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el
 * cómputo.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio21 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa hace medias de números positivos.");
    System.out.println("Para parar, escribe un número negativo.");
    int numero;
    int i = 0;
    int sumaImpar = 0;
    int numeroImpar = 0;
    int mayor = 0;

    do {
      numero = Integer.parseInt(s.nextLine());

      if (numero >= 0) {
        i++;
        if ((numero % 2) == 1) {
          sumaImpar += numero;
          numeroImpar++;
        } else {
          if (numero > mayor) {
            mayor = numero;
          }
        }
      }
    } while (numero >= 0);

    System.out.println("Has introducido " + i + " números.");
    System.out.println("La media de los números impares es de " + sumaImpar / numeroImpar + ".");
    System.out.println("El mayor de los pares es " + mayor + ".");
  }
}
