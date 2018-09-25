/**
 * 
 * Realiza un programa que añada I.V.A. a un recibo.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio06 {
  public static void main(String[] args) {
    double eur = 49.95;
    double iva = eur * 0.21;
    double tot = eur + iva;
    System.out.println("Precio sin IVA: " + eur + " euros.");
    System.out.println("IVA: " + iva + " euros.");
    System.out.println("Total a pagar: " + tot + " euros.");
  }
}
