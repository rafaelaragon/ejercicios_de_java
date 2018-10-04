/**
 * 
 * Crea un programa que escriba la última cifra de un número entero dado por
 * el usuario.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio17 {
  public static void main(String[] args) {
    System.out.println("Este programa dice cuál es la última cifra de un número entero que me digas.");
    System.out.print("Dime el número: ");
    int numero = Integer.parseInt(System.console().readLine());
    int solucion = numero % 10;
    System.out.println("La última cifra de " + numero + " es " + solucion);
  }
}
