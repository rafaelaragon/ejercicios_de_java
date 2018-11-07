package tema07;

/**
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes
 * de un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteriscos o cualquier otro carácter.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio08 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Este programa muestra en pantalla la media de las");
    System.out.println("temperaturas a lo largo de un año.");
    int mes = 1;
    float [] temperatura = new float [12];
    for (int i = 0; i < 12; i ++) {
      
      System.out.print("Dime la temperatura del mes " + mes + ": ");
      temperatura[i] = Float.parseFloat(s.nextLine());
      mes++;
    }
    System.out.println();
    for (int i = 0; i < 12; i++) {
      for (int j = 0; j < temperatura[i]/2; j++) {
        System.out.print("█");
      }
      System.out.println();
    }
  }
}
