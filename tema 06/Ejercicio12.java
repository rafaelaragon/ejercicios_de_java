package tema06;

/**
 * Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
 * con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
 * convertir un entero en un carácter.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio12 {
  
public static void main(String[] args) 
    throws InterruptedException {

    int linea = 0;
    for(int i = 0; i < 7956; i++) {
      System.out.print((char)(Math.random() * 95 + 32));
      
      if (linea++ == 233) {
        linea = 0;
        Thread.sleep(100);
        System.out.println();
      }
    }
  }
}
