package tema05;

/**
 * Realiza una programa que calcule las horas transcurridas entre dos horas de
 * dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
 * El día de la semana se puede pedir como un número (del 1 al 7) o como una
 * cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
 * los datos correctamente y que el segundo día es posterior al primero.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio30 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int dia1 = 0;
    int dia2 = 0;
    System.out.println("Este programa calcula las horas que hay entro dos horas de la semana.");

    System.out.print("Introduzca el primer día: ");
    String primerdia = s.nextLine().toLowerCase();

    System.out.print("Introduzca la primera hora: ");
    int hora1 = Integer.parseInt(s.nextLine());
    if ((hora1 < 0) || (hora1 > 23)) {
      System.out.println("¡Introduce una hora válida!");
    } else {

      switch (primerdia) {
        case "lunes":
          dia1 = 1;
          break;
        case "martes":
          dia1 = 2;
          break;
        case "miercoles":
        case "miércoles":
          dia1 = 3;
          break;
        case "jueves":
          dia1 = 4;
          break;
        case "viernes":
          dia1 = 5;
          break;
        case "sabado":
        case "sábado":
          dia1 = 6;
          break;
        case "domingo":
          dia1 = 7;
          break;
        default:
          dia1 = 666;
          break;
      }
      if (dia1 > 665) {
        System.out.println("¡Introduce un día de la semana válido!");
      } else {
        System.out.print("Introduzca el segundo día: ");
        String segundodia = s.nextLine().toLowerCase();

        System.out.print("Introduzca la segunda hora: ");
        int hora2 = Integer.parseInt(s.nextLine());
        if ((hora2 < 0) || (hora2 > 23)) {
          System.out.println("¡Introduce una hora válida!");
        } else {

          switch (segundodia) {
            case "lunes":
              dia2 = 1;
              break;
            case "martes":
              dia2 = 2;
              break;
            case "miercoles":
            case "miércoles":
              dia2 = 3;
              break;
            case "jueves":
              dia2 = 4;
              break;
            case "viernes":
              dia2 = 5;
              break;
            case "sabado":
            case "sábado":
              dia2 = 6;
              break;
            case "domingo":
              dia2 = 7;
              break;
            default:
              dia2 = 666;
              break;
          }
          if (dia2 > 665) {
            System.out.println("¡Introduce un día de la semana válido!");
          } else {
            if (dia2 <= dia1) {
              System.out.println("El segundo día tiene que ser posterior al primero.");
            } else {
              int horaFinal1 = ((dia1 * 24) + hora1);
              int horaFinal2 = ((dia2 * 24) + hora2);
              int horaFinal = horaFinal2 - horaFinal1;
              System.out.println("Hay  " + horaFinal + " horas.");
            }
          }
        }
      }
    }
  }
}
