package tema07;

/**
 * Define un array de 10 caracteres con nombre simbolo y asigna valores a los
 * elementos según la tabla que se muestra a continuación. Muestra el contenido
 * de todos los elementos del array. ¿Qué sucede con los valores de los elementos
 * que no han sido inicializados?
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio02 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    String [] simbolo =  new String[10];
    simbolo[0] = "a";
    simbolo[1] = "x";
    simbolo[4] = "@";
    simbolo[6] = "''";
    simbolo[7] = "+";
    simbolo[8] = "Q";
    for (int i = 0; i < 10; i++) {
      System.out.print(simbolo[i] + ", ");
    }
  }
}
