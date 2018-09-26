/**
 * 
 * Realiza un conversor de euros a pesetas.
 * 
 * La cantidad de euros debe de introducirse por teclado.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.println("Bienvenido al conversor de euros a peseats.");
    System.out.print("Escribe el número de  euros que quieres convertir: ");
    String linea;
    linea = System.console().readLine();
    int eur = Integer.parseInt(linea);
    double conversor = (eur * 166.386);
    System.out.print(eur + " euros equivalen a " + (int)conversor + " pesetas.");
  }
}

