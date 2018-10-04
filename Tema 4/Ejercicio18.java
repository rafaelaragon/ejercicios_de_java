/**
 * 
 * Crea un programa que escriba la primera cifra de un número entero dado por
 * el usuario. Se permiten números de hasta 5 cifras.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio18 {
  public static void main(String[] args) {
    System.out.println("Este programa dice cuál es la primera cifra de un número entero que me digas.");
    System.out.print("Dime el número (máximo 5 cifras): ");
    int numero = Integer.parseInt(System.console().readLine());
    int solucion=0;
    if (numero < 10) {
      solucion = numero;
    }
    
    if ((numero >= 10) && (numero < 100)) {
      solucion = numero / 10;
    }
    
    if ((numero >= 100) && (numero < 1000)) {
      solucion = numero / 100;
    }
    
    if ((numero >= 1000 && (numero < 10000))) {
      solucion = numero / 1000;
    }
    
    if ((numero >= 10) && (numero < 100000)) {
      solucion = numero / 10000;
    }
    
    System.out.println("La primera cifra de " + numero + " es " + solucion);
  }
}
