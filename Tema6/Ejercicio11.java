package tema06;

/**
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 * final aparecerá el número de suspensos, el número de suficientes, el número
 * de bienes, etc.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio11 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa genera 20 notas al azar.");
    System.out.println();
    int nota = 0;
    int contador = 0;
    int suspenso = 0;
    int suficiente = 0;
    int bien = 0;
    int notable = 0;
    int sobresaliente = 0;

    for (int i = 0; i < 20; i++) {
      nota = ((int) (Math.random() * 5) + 1);
      switch (nota) {
        case 1:
          System.out.print("Suspenso, ");
          suspenso++;
          break;
        case 2:
          System.out.print("Suficiente, ");
          suficiente++;
          break;
        case 3:
          System.out.print("Bien, ");
          bien++;
          break;
        case 4:
          System.out.print("Notable, ");
          notable++;
          break;
        case 5:
          System.out.print("Sobresaliente, ");
          sobresaliente++;
          break;
      }
    }
    System.out.println();
    System.out.println("Suspensos: " + suspenso);
    System.out.println("Suficientes: " + suficiente);
    System.out.println("¿Bienes?: " + bien);
    System.out.println("Notables: " + notable);
    System.out.println("Sobresalientes: " + sobresaliente);
  }
}
