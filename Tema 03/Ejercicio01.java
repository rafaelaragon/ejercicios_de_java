/**
 * 
 * Realiza un programa que multiplique dos números dados por el usuario.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("Este programa es un multiplicador de números enteros.");
    System.out.print("Introduce el primer número: ");
    String linea;
    linea = System.console().readLine();
    int num1 = Integer.parseInt(linea);
    System.out.print("Introduce el segundo número: ");
    linea = System.console().readLine();
    int num2 = Integer.parseInt(linea);
    int prod = num1 * num2;
    System.out.println("Los números a multiplicar son " + num1 + " y " + num2 + ".");
    System.out.println(num1 + " por " + num2 + " es igual a " + prod + ".");
  }
}
    
