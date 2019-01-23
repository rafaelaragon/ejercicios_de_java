package ejercicio03;

/**
 * Escribe un programa que ordene 10 números enteros introducidos por teclado y
 * almacenados en un objeto de la clase ArrayList.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Ejercicio03 {

  public static void main(String[] args) {
    ArrayList<Integer> n = new ArrayList<>();
    Scanner s = new Scanner(System.in);
    
    for(int i = 0; i < 10; i ++) {
      System.out.print("Introduzca el numero " + (i+1) + ": ");
      n.add(Integer.parseInt(s.nextLine()));
    }
    
    Collections.sort(n);
    
    for(int ordenado : n) {
      System.out.println(ordenado);
    }
  }
}
