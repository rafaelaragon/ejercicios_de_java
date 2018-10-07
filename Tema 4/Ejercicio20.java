/**
 * 
 * Crea un programa que diga si un número entero positivo dado por el usuario es capicúo.
 * Se permiten números de hasta 5 cifras.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio20 {
  public static void main(String[] args) {
    System.out.println("Este programa dice si un número positivo es o no capicúo.");
    System.out.print("Dime el número (máximo 5 cifras): ");
    int numero = Integer.parseInt(System.console().readLine());
    if (numero < 10) {
      System.out.println("El número " + numero + " es capicúo.");
    } 
    
    if ((numero >= 10) && (numero < 100)) {
      if ((numero / 10) == (numero % 10)) {
        System.out.println("El número " + numero + " es capicúo.");
      }
    }
    
    if ((numero >= 100) && (numero < 1000)) {
      if (((numero / 100) == (numero % 10))) {
        System.out.println("El número " + numero + " es capicúo.");
      }
    } 
    
    if ((numero >= 1000 && (numero < 10000))) {
      if (((numero / 1000) == (numero % 10)) && (((numero / 100)% 10) == ((numero / 10) % 10))) {
        System.out.println("El número " + numero + " es capicúo.");
      }
    }
    
    if ((numero >= 10) && (numero < 100000)) {
      if (((numero / 10000) == (numero % 10)) && (((numero / 1000)% 10) == ((numero / 10) % 10))) {
        System.out.println("El número " + numero + " es capicúo.");
      }
    }
  }
}

