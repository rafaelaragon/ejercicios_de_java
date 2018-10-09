/**
 * 
 * Crea un programa que muestre los números del 320 al 160 hacia atrás de 5 en 5.
 * Usa for.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    int i = 320;
    while (i >= 160) {
      System.out.print(i + " ");
      i -= 20;
    }
  }
}

