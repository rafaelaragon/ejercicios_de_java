package tema06;

/**
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los
 * siguientes requisitos: a) El ordenador mostrará una tirada que consiste en
 * mostrar 3 figuras. Hay 5 figuras posibles: corazón, diamante, herradura,
 * campana y limón. b) Si las tres figuras son diferentes se debe mostrar el
 * mensaje “Lo siento, ha perdido”. c) Si hay dos figuras iguales y una
 * diferente se debe mostrar el mensaje “Bien, ha recuperado su moneda”. d) Si
 * las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado 10
 * monedas”.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio16 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String corazon = " ♡ ";
    String diamante = " ♢ ";
    String herradura = " Ω ";
    String campana = " ☏ ";
    String limon = " ۝ ";

    int figura1 = 0;
    int figura2 = 0;
    int figura3 = 0;

    System.out.println("Soy una tragaperras, dame tu dinero.");
    System.out.println("¿Eres mayor de edad? (y/n) "); // Para hacer la tirada.
    String ignorame = s.nextLine();
    System.out.print("|");
    for (int i = 0; i < 3; i++) {
      int tirada = ((int) (Math.random() * 5) + 1);
      switch (tirada) {
        case 1:
          System.out.print(corazon);
          break;
        case 2:
          System.out.print(diamante);
          break;
        case 3:
          System.out.print(herradura);
          break;
        case 4:
          System.out.print(campana);
          break;
        case 5:
          System.out.print(limon);
          break;
      }
      if (i == 0) {
        figura1 = tirada;
      }
      if (i == 1) {
        figura2 = tirada;
      }
      if (i == 2) {
        figura3 = tirada;
      }
    }
    System.out.println("|");
    if ((figura1 == figura2) && (figura1 == figura3)) {
      System.out.println("Enhorabuena, ha ganado 10 monedas.");
    } else if ((figura1 == figura2) || (figura2 == figura3) || (figura1 == figura3)) {
      System.out.println("Bien, ha recuperado su moneda.");
    } else {
      System.out.println("Lo siento, ha perdido.");
    }
  }
}
