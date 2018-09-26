/**
 * 
 * Crea un programa que sume, reste, multiplique y divida.
 * 
 * 
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.print("Este programa suma, resta, multiplica y divide "); 
    System.out.println("dos números enteros elegidos por el usuario.");
    System.out.print("Introduce el primer número: ");
    String linea; 
    linea = System.console().readLine();
    int num1 = Integer.parseInt(linea);
    System.out.print("Introduce el segundo número: ");
    linea = System.console().readLine();
    int num2 = Integer.parseInt(linea);
    System.out.println("Los números son " + num1 + " y " + num2 + ".");
    int sum = num1 + num2;
    System.out.println(num1 + " más " + num2 + " es igual a " + sum + ".");
    int res = num1 - num2;
    System.out.println(num1 + " menos " + num2 + " es igual a " + res + ".");
    int prod = num1 * num2;
    System.out.println(num1 + " por " + num2 + " es igual a " + prod + ".");
    double div = (double)num1 / (double)num2;
    System.out.println(num1 + " entre " + num2 + " es igual a " + div + ".");
  }
}
