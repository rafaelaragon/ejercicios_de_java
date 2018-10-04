/**
 * 
 * Crea un programa que escriba la primera cifra de un número entero dado por
 * el usuario. Se permiten números de hasta 5 cifras.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio19 {
  public static void main(String[] args) {
    System.out.println("Este programa dice cuál es la primera cifra de un número entero que me digas.");
    System.out.print("Dime el número (máximo 5 cifras): ");
    int numero = Integer.parseInt(System.console().readLine());
    int solucion=0;
    
    if (numero < 10) {
      solucion = 1;
    
    } else if (numero < 100) {
      solucion = 2;
    
    } else if (numero < 1000) {
      solucion = 3;
    
    } else if (numero < 10000) {
      solucion = 4;
    
    } else if (numero < 100000) {
      solucion = 5;
    }
    
    if (numero >= 100000) {
      System.out.println("¡Te he dicho que no tenga más de 5 dígitos!");
    } else {
        System.out.println("El número " + numero + " tiene " + solucion + " cifras.");
      }
  }
}
