package tema06;

/**
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
 * para los 14 partidos y el pleno al quince (15 filas).
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio07 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa muestra 3 apuestas de la quiniela.");
    for (int i = 0; i < 14; i++) {
      int numero1 = ((int) (Math.random() * 3) + 1);
      if (numero1 == 3) {
        System.out.print("|X");
      } else{
        System.out.print("|"+ numero1);
      }
      int numero2 = ((int) (Math.random() * 3) + 1);
      if (numero2 == 3) {
        System.out.print("   X");
      } else{
        System.out.print("   "+ numero2);
      }
      int numero3 = ((int) (Math.random() * 3) + 1);
      if (numero3 == 3) {
      System.out.println("   X|");
      } else{
        System.out.println("   "+ numero3 + "|");
      }
    }
    System.out.println("-----------");
    for (int i = 0; i < 2; i++) {
      int numero1 = ((int) (Math.random() * 4));
      if (numero1 == 3) {
        System.out.print("|M");
      } else{
        System.out.print("|"+ numero1);
      }
      int numero2 = ((int) (Math.random() * 4));
      if (numero2 == 3) {
        System.out.print("   M");
      } else{
        System.out.print("   "+ numero2);
      }
      int numero3 = ((int) (Math.random() * 4));
      if (numero3 == 3) {
      System.out.println("   M|");
      } else{
        System.out.println("   "+ numero3 + "|");
      }
    }
  }
}
