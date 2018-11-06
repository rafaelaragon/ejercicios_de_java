package tema06;

/**
 * Escribe un programa que muestre por pantalla 100 números enteros separados
 * por un espacio. Los números deben estar generados de forma aleatoria en un
 * rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
 * almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej.
 * [25]).
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio25 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Este programa muestra 100 números al azar del 10 al 200.");
    System.out.println("Si es primo, lo muestra entre almohadillas.");
    System.out.println("Si es múltiplo de 5, lo muestra entre corchetes.");

    for (int i = 0; i < 100; i++) {
      int aleatorio = (10 + (int) (Math.random() * 191));
      
      boolean primo = true;
      for (int j = 2; j < aleatorio; j++) {
        if ((aleatorio % j) == 0) {
          primo = false;
        }
      }
        if (primo) {
          System.out.print("#" + aleatorio + "#, ");
        } else if (aleatorio % 5 == 0) {
          System.out.print("[" + aleatorio + "], ");
        } else {
          System.out.print(aleatorio + ", ");
        }
      }
    }
  }
