/**
 * 
 * Crea un conversor de Mb a Kb.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.println("Bienvenido a este conversor de Mb a Kb."); 
    System.out.print("Dime el número de megabytes a convertir: ");
    String linea; 
    linea = System.console().readLine();
    int mb = Integer.parseInt(linea);
    int resultado = mb * 1024;
    System.out.println(linea + " megabytes equivalen a " + resultado + " kilobytes.");
  }
}


