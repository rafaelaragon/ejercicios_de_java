/**
 * 
 * Crea un programa que muestre la tabla de multiplicar de un número introducido
 * por el usuario.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio08 {
  public static void main(String[] args) {
    System.out.print("Introduzca el número a multiplicar: ");
      int numero = Integer.parseInt(System.console().readLine());
    for (int i = 1; i <= 10; i++) {
      System.out.println (numero + " por " + i + " = " + (numero * i));
    }
  }
}


