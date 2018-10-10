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
    while (numero > 10) {
       numero = numero / 10;
       i++;
    }
        System.out.println("El número " + numero + " tiene " + i + " cifras.");
  }
}
