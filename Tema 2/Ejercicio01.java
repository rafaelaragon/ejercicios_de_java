/**
 * 
 * Escribe un programa en el que se declaren variables enteras x e y.
 * 
 * Asígnales los valores 144 y 999.
 * 
 * Muestra por pantalla el valor de cada variable.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    int x = 144;
    int y = 999;
    int sum = x + y;
    int res = x - y;
    int mul = x * y;
    float div = (float)x / y ;
    System.out.println(x + " + " + y + " = " + sum);
    System.out.println(x + " - " + y + " = " + res);
    System.out.println(x + " * " + y + " = " + mul);
    System.out.println(x + " / " + y + " = " +div);
  }
}
