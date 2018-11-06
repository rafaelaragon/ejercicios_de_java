package tema06;

/**
 * Realiza un generador de melodía con las siguientes condiciones: a) Las notas
 * deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol, la y si.
 * b) Una melodía está formada por un número aleatorio de notas mayor o igual a
 * 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…). c) Cada grupo de 4
 * notas será un compás y estará separado del siguiente compás mediante la barra
 * vertical “|” (Alt + 1). El final de la melodía se marca con dos barras. d) La
 * última nota de la melodía debe coincidir con la primera.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio15 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numeroDeCompases = ((int) (Math.random() * 7) + 1);
    String nota = "";
    String aux = "";
    for (int i = 1; i <= numeroDeCompases; i++) {
      for (int j = 0; j < 4; j++) {
        int notas = ((int) (Math.random() * 7) + 1);
        switch (notas) {
          case 1:
            nota = "do ";
            break;
          case 2:
            nota = "re ";
            break;
          case 3:
            nota = "mi ";
            break;
          case 4:
            nota = "fa ";
            break;
          case 5:
            nota = "sol ";
            break;
          case 6:
            nota = "la ";
            break;
          case 7:
            nota = "si ";
            break;
        }
        if ((i == 1) && (j == 0)) {
          aux = nota;
        }
        if ((i == numeroDeCompases) && (j == 3)) {
            nota = aux;
        } 
          System.out.print(nota + " ");
      }
      System.out.print("| ");
    }
    System.out.println("|");
  }
}
