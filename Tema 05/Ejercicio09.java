/**
 * 
 * Crea un programa que escriba la primera cifra de un número entero dado por
 * el usuario.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio09 {
  public static void main(String[] args) {
    System.out.println("Este programa dice cuál es la primera cifra de un número entero que me digas.");
    System.out.print("Dime el número: ");
    int numero = Integer.parseInt(System.console().readLine());
    int i = 1;
    if (numero != 0) {
      while (numero != 0) {
        numero = numero / 10;
        i++;
      }
    } else {
      System.out.println("El número tiene 1 cifra.);
    }
    System.out.println("El número tiene " + i + " cifra(s).");
  }
}
