package tema06;

/**
 * Realiza un programa que genere una secuencia de cinco monedas de curso legal
 * lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos, 5
 * céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
 * posiciones posibles son cara y cruz.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio21 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String moneda = "";
    String posicion = "";
    System.out.println("Este programa muestra cinco lanzamientos de moneda.");
    System.out.println();
    
    for (int i = 0; i < 5; i++) {
      int numero = ((int) (Math.random() * 8) + 1);
      switch (numero) {
        case 1:
          moneda = "1 céntimo  ";
          break;
        case 2:
          moneda = "2 céntimos ";
          break;
        case 3:
          moneda = "5 céntimos ";
          break;
        case 4:
          moneda = "10 céntimos";
          break;
        case 5:
          moneda = "20 céntimoa";
          break;
        case 6:
          moneda = "50 céntimos";
          break;
        case 7:
          moneda = "1 euro     ";
          break;
        case 8:
          moneda = "2 euros    ";
          break;
      }
      int numero2 = ((int) (Math.random() * 2) + 1);
      switch (numero2) {
        case 1:
          posicion = "cara";
          break;
        case 2:
          posicion = "cruz";
          break;
      }
      System.out.println(moneda + "    " + posicion);
    }
  }
}
