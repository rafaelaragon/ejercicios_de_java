/**
 * 
 * Realiza un conversor de euros a pesetas.
 * 
 * La cantidad de euros que se quiere convertir debe estar en una variable.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    double eur = 29.95;
    double conversor = eur * 166.386;
    System.out.println("Tienes " + eur + " euros.");
    System.out.println("Equivalen a " + conversor + " pesetas.");
  }
}
