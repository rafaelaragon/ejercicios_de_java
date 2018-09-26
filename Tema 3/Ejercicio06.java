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
    int base = Integer.parseInt(linea);
    System.out.print("Introduce la altura del triángulo 'm,cm,km...': ");
    linea = System.console().readLine();
    int altura = Integer.parseInt(linea);
    System.out.println("La base es " + base + " y la altura es " + altura + ".");
    int prod = base * altura;
    double div = (double)prod / 2;
    System.out.println("El área del triángulo es " + div + ".");
  }
}
