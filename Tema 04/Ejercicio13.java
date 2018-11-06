/**
 * 
 * Crea un programa que ordene de menor a mayor 3 números 
 * introducidos por el usuario.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio13 {
  public static void main(String[] args) {
    System.out.println("Este programa ordena de menor a mayor 3 números que me des.");
    System.out.print("Escribe el primer número: ");
    int num1 = Integer.parseInt(System.console().readLine());
    System.out.print("Escribe el segundo número: ");
    int num2 = Integer.parseInt(System.console().readLine());
    System.out.print("Escribe el tercer número: ");
    int num3 = Integer.parseInt(System.console().readLine());
    if ((num1 < num2) && (num1 < num3) && (num2 < num3)) {
      
      System.out.println("El primer número es " + num1);
      System.out.println("El segundo número es " + num2);
      System.out.println("El tercer número es " + num3);
    }
    if ((num1 < num2) && (num1 < num3) && (num3 < num2)) {
      
      System.out.println("El primer número es " + num1);
      System.out.println("El segundo número es " + num3);
      System.out.println("El tercer número es " + num2);
    }
    if ((num2 < num1) && (num2 < num3) && (num1 < num3)) {
      
      System.out.println("El primer número es " + num2);
      System.out.println("El segundo número es " + num1);
      System.out.println("El tercer número es " + num3);
    }
    if ((num2 < num1) && (num2 < num3) && (num3 < num1)) {
      
      System.out.println("El primer número es " + num2);
      System.out.println("El segundo número es " + num3);
      System.out.println("El tercer número es " + num1);
    }
    if ((num3 < num1) && (num3 < num2) && (num1 < num2)) {
      
      System.out.println("El primer número es " + num3);
      System.out.println("El segundo número es " + num1);
      System.out.println("El tercer número es " + num2);
    }
    if ((num3 < num1) && (num3 < num2) && (num2 < num1)) {
      
      System.out.println("El primer número es " + num3);
      System.out.println("El segundo número es " + num2);
      System.out.println("El tercer número es " + num1);
    }
    if ((num1 == num2) || (num1 == num3) || (num2 == num3)) {
      
      System.out.println("¡No introduzcas números iguales!");
    }
  }
}
    
