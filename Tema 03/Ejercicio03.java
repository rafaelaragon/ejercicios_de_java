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
public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("Bienvenido al conversor de pesetas a euros.");
    System.out.print("Escribe el número de  pesetas que quieres convertir: ");
    String linea;
    linea = System.console().readLine();
    int pes = Integer.parseInt(linea);
    double conversor = (pes / 166.386);
    System.out.printf("%d pesetas equivalen a %.2f euros.\n", pes, conversor);
  }
}


