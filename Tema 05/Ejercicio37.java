package tema05;

/**
 * Realiza un conversor del sistema decimal al sistema de “palotes”.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio37 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa convierte un número al sistema de palotes.");
    System.out.print("Introduzca el número: ");
    long numero = Long.parseLong(s.nextLine());
    long aux = numero;
    long girado = 0;
    int longitud = 0;
    if (numero < 0) {
      System.out.print("¡Usa números positivos!");
    } else {
      System.out.print(numero + " equivale a: ");
      while (aux > 0) {
        girado = (girado * 10) + (aux % 10);
        aux /= 10;
        longitud++;
      }
    }
    long digito = 0;
    for (int i = 0; i < longitud; i++) {
      digito = girado % 10;
      girado /= 10;
      for (int j = 1; j <= digito; j++) {
        System.out.print("|");
      }
      if (i < longitud - 1) {
        System.out.print("-");
      }   
    }
    System.out.println(".");    
  }
}
