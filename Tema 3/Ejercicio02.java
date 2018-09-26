/**
 * 
 * Realiza un conversor de pesetas a euros.
 * 
 * La cantidad de pesetas que se quiere convertir debe estar en una variable.
 * 
 * La cantidad de pesetas debe de introducirse por teclado.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.println("Bienvenido al conversor de pesetas a euros.");
    System.out.print("Escribe el número de  euros que quieres convertir: ");
    String linea;
    linea = System.console().readLine();
    int eur = Integer.parseInt(linea);
    double conversor = (eur * 166.386);
    System.out.print(eur + " euros equivalen a " + (int)conversor + " pesetas.");
  }
}

