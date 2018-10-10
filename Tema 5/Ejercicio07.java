/**
 * 
 * Crea un programa que actúe de caja fuerte. Tienes 4 intentos para introducir la clave.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    for (int i = 4; i > 0; i--) {
      System.out.print("Introduzca la clave: ");
      int clave = Integer.parseInt(System.console().readLine());
      if (clave == 1234) {
        System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
        break;
      } else {
        System.out.println("Lo siento, esa no es la combinación. Intentos restantes: " + (i - 1));
      }
    }
  }
}



