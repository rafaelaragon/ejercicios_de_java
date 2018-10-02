/**
 * 
 * Realiza un programa que resuelva ecuaciones de primer grado.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    System.out.print("Este programa resuelve ecuaciones de primer grado .");
    System.out.println(" del tipo ax+b=0");
    System.out.print("Dime el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.print("Dime el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());
    // Este es el proceso que voy a seguir: ax+b=0; ax=-b; x=-b/a;
    double x = (-b)/a;
    if (a==0) {
      System.out.println("Esta ecuación no tiene solución real.");
    }  else {
    System.out.println("'a' vale " + a + " y 'b' vale " + b + ".");
    System.out.println("x = " + x); 
    }
  }
}
