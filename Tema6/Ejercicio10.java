package tema06;

/**
 * Realiza un programa que pinte por pantalla diez líneas formadas por
 * caracteres. El carácter con el que se pinta cada línea se elige de forma
 * aleatoria entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben
 * tener una longitud aleatoria entre 1 y 40 caracteres.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio10 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa pinta diez líneas con caracters.");
    System.out.println("El carácter de cada línea se elige aleatoriamente.");
    System.out.println("Las líneas miden entre 1 y 40 caracteres.");
    System.out.println();
    int caracter = 0;

    for (int i = 0; i < 4; i++) {
      int numero1 = ((int) (Math.random() * 60) + 1);
      if (numero1 <= 10) {
        caracter = 1;
      } else if (numero1 <= 20) {
        caracter = 2;
      } else if (numero1 <= 30) {
        caracter = 3;
      } else if (numero1 <= 40) {
        caracter = 4;
      } else if (numero1 <= 50) {
        caracter = 5;
      } else {
        caracter = 6;
      }
    }
  }
}
