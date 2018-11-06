package tema06;

/**
 * Modifica el programa anterior para que la probabilidad de que salga un 1 sea
 * de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
 * 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio08 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa muestra 3 apuestas de la quiniela.");
    for (int i = 0; i < 14; i++) {
      int numero1 = ((int) (Math.random() * 6) + 1);
      if (numero1 <= 3) {
        System.out.print("|1 ");
      } else if (numero1 <= 5){
        System.out.print("|X ");
      } else {
        System.out.print("|2 ");
      }
      int numero2 = ((int) (Math.random() * 6) + 1);
      if (numero2 <= 3) {
        System.out.print(" 1 ");
      } else if (numero2 <= 5){
        System.out.print(" X ");
      } else {
        System.out.print(" 2 ");
      }
      int numero3 = ((int) (Math.random() * 6) + 1);
      if (numero3 <= 3) {
        System.out.println(" 1|");
      } else if (numero3 <= 5){
        System.out.println(" X|");
      } else {
        System.out.println(" 2|");
      }
    }
    System.out.println("---------");
    for (int i = 0; i < 2; i++) {
      int numero1 = ((int) (Math.random() * 4));
      if (numero1 == 3) {
        System.out.print("|M ");
      } else{
        System.out.print("|"+ numero1 + " ");
      }
      int numero2 = ((int) (Math.random() * 4));
      if (numero2 == 3) {
        System.out.print(" M ");
      } else{
        System.out.print(" "+ numero2 + " ");
      }
      int numero3 = ((int) (Math.random() * 4));
      if (numero3 == 3) {
      System.out.println(" M|");
      } else{
        System.out.println(" "+ numero3 + "|");
      }
    }
  }
}
