/**
 * 
 * Realiza un programa que resuelva ecuaciones de segundo grado
 * del tipo ax2 + bx + c = 0.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio09 {
  public static void main(String[] args) {
    System.out.print("Este programa resuelve ecuaciones de segundo grado .");
    System.out.println(" del tipo ax2+bx+c=0");
    System.out.print("Dime el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.print("Dime el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());
    System.out.print("Dime el valor de c: ");
    double c = Double.parseDouble(System.console().readLine());
    double raiz = (b * b)-(4 * a * c);
    double x1 = ((-b + Math.sqrt(raiz)) / (2 * a));
    double x2 = ((-b - Math.sqrt(raiz)) / (2 * a));
    if (a==0) {
      System.out.println("Esta ecuación no tiene solución real.");
    }  else if(raiz < 0) {
        System.out.println("Esta ecuación no tiene solución real.");
      } else
          System.out.println("'a' vale " + a + ", 'b' vale " + b + " y 'c' vale " + c + ".");
          System.out.printf("x = %.2f\n", x1); 
          System.out.printf(" x = %.2f\n", x2); 
  }
}

