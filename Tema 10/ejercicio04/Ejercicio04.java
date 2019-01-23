package ejercicio04;

/**
 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa
 * debe ordenar palabras en lugar de números.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio04 {

  public static void main(String[] args) {
    ArrayList<String> p = new ArrayList<>();
    Scanner s = new Scanner(System.in);
    
    for(int i = 0; i < 10; i ++) {
      System.out.print("Introduzca la palabra " + (i+1) + ": ");
      p.add(s.nextLine());
    }
    
    Collections.sort(p);
    System.out.println("Por orden alfabético: ");
    
    for(int i = 0; i < p.size(); i++) {
      System.out.println(p.get(i));
    }  
  }
}
