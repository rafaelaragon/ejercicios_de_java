package ejercicio01;

/**
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class PruebaGato {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    Gato[] gat = new Gato[4];
    
    String nombre;
    String raza;
    
    for (int i = 0; i < 4; i++) {
      System.out.println("Gato " + (i+1));
      System.out.print("Nombre: ");
      nombre = s.nextLine();
      gat[i].setNombre(nombre);
      System.out.print("Raza: ");
      raza = s.nextLine();
      gat[i].setRaza(raza);
    }
    
    for (int i = 0; i < 4; i++) {
      System.out.println("Gato " + (i+1));
      System.out.println("Nombre: " + gat[i].getNombre());
      System.out.println("Raza: " + gat[i].getRaza());
    }
  }
}
