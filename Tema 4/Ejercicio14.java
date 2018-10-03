/**
 * 
 * Realiza un programa que diga si un número (entero) es par y/o si es divisible por 5.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio14 {
  public static void main(String[] args) {
    System.out.println("Este programa te dice si un nombre es par o no y si es  divisible por 5.");
    System.out.println("Porfavor introduzca el número: ");
    int num = Integer.parseInt(System.console().readLine());
    if (num % 2 == 0) {
      System.out.println("El número " + num + " es par.");
      } else {
          System.out.println("El número " + num + " es impar.");
        }
      
          if (num % 5 == 0) {
            System.out.println("El número " + num + " es divisible por 5.");
          } else {
              System.out.println("El número " + num + " no es divisible por 5.");
            }
  }
}
