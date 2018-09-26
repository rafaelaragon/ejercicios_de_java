/**
 * 
 * Crea un conversor de Kb a Mb.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.println("Bienvenido a este conversor de Kb a Mb."); 
    System.out.print("Dime el número de kilobytes a convertir: ");
    String linea; 
    linea = System.console().readLine();
    int kb = Integer.parseInt(linea);
    double resultado = (double)kb / 1024;
    System.out.printf("%d kilobytes equivalen a %.2f megabytes.\n", kb, resultado);
  }
}



