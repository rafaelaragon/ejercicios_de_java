/**
 * 
 * Realiza un conversor de pesetas a euros.
 * 
 * La cantidad de pesetas que se quiere convertir debe estar en una variable.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    int pes = 5000;
    double conversor = pes / 166.386;
    System.out.println("Tienes " + pes + " pesetas.");
    System.out.println("Equivalen a " + conversor + " euros.");
  }
}
