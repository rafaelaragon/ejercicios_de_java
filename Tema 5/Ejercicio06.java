/**
 * 
 * Crea un programa que muestre los números del 320 al 160 hacia atrás de 5 en 5.
 * Usa do-while.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio06 {
  public static void main(String[] args) {
    int i = 320;
    do {
      i -= 5;
      System.out.print(i +" ");
    } while (i > 160);
  }
}


