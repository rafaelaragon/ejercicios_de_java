/**
 * 
 * Crea un programa que calcule el volumen de un cono.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio09 {
  public static void main(String[] args) {
    System.out.print("Este programa calcula el volúmen de un cono en función de"); 
    System.out.println(" su radio y de su altura.");
    System.out.print("Dime el valor del radio: ");
    String linea; 
    linea = System.console().readLine();
    double radio = Double.parseDouble(linea);
    System.out.print("Dime el valor de la altura: ");
    linea = System.console().readLine();
    double altura = Double.parseDouble(linea);
    double producto = radio * radio * altura * 3.141592;
    double resultado = producto / 3;
    System.out.printf("El volumen del cono es %.2f.\n", resultado);
  }
}

