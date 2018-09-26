/**
 * 
 * Crea un programa que calcule el área de un rectángulo.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula el área de un rectángulo.");
    System.out.print("Introduce la base del rectángulo 'm,cm,km...': ");
     String linea; 
    linea = System.console().readLine();
    int base = Integer.parseInt(linea);
    System.out.print("Introduce la altura del rectángulo 'm,cm,km...': ");
    linea = System.console().readLine();
    int altura = Integer.parseInt(linea);
    System.out.println("La base es " + base + " y la altura es " + altura + ".");
    int prod = base * altura;
    System.out.println("El área del rectángulo es " + prod + ".");
  }
}
