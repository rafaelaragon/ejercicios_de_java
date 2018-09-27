/**
 * 
 * Crea un programa que calcule el área de un triángulo.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio06 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula el área de un triángulo.");
    System.out.print("Introduce la base del triángulo 'm,cm,km...': ");
     String linea; 
    linea = System.console().readLine();
    double base = Double.parseDouble(linea);
    System.out.print("Introduce la altura del triángulo 'm,cm,km...': ");
    linea = System.console().readLine();
    double altura = Double.parseDouble(linea);
    System.out.println("La base es " + base + " y la altura es " + altura + ".");
    double prod = base * altura;
    double div = prod / 2;
    System.out.printf("El área del triángulo es %.2f.\n", div);
  }
}
