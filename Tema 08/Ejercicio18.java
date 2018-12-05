package Ejercicios;

/**
 * Escribe un programa que pase de decimal a binario.
 *
 * @author Rafael Aragón Rodríguez
 *
 */
import java.util.Scanner;

public class Ejercicio18 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
  
    System.out.print("Intruduzca un número decimal: ");
    long decimal = Long.parseLong(s.nextLine());
    
    String binario = matematicas.Conversores.decBin(decimal);
    System.out.println(decimal + " convertido a binario es " + binario);
  }
}
