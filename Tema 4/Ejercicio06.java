/**
 * 
 * Realiza un programa que calcule cuánto tiempo tardará en caer un objeto
 * en función de la altura a la cual cae.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio06 {
  public static void main(String[] args) {
    System.out.print("Este programa calcula cuánto tiempo tardará en caer ");
    System.out.println("un ordenador en función de la altura a la que caiga.");
    System.out.print("Dime desde cuántos metros cae el ordenador: ");
    double h = Double.parseDouble(System.console().readLine());
    double calculo1 = 2 * h /9.81;
    double t = Math.sqrt(calculo1);
    if (h<0) {
      System.out.println("¡No te puedes caer hacia arriba!");
    } else {
        System.out.println("El ordenador se cae desde " + h + " metros.");
        System.out.printf("El ordenador reventará a los %.3f segundos.\n", t);
      }
  }
}
