package ejercicio02;

/**
 * Cambia el programa anterior de tal forma que los datos de los gatos se
 * introduzcan directamente en el código de la forma
 * gatito[2].setColor(“marrón”) o bien mediante el constructor, de la forma
 * gatito[3] = new Gato(“Garfield”, “naranja”, “macho”). Muestra a continuación
 * los datos de todos los gatos utilizando un bucle.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class PruebaGato {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Gato[] gatito = new Gato[3];

    System.out.println();
      
    gatito[0] = new Gato();
    gatito[0].setNombre("Whiskas");
    gatito[0].setColor("Pardo");
    gatito[0].setRaza("Persa");
    
    gatito[1] = new Gato("Doraemon", "azul", "Cósmico");
    gatito[2] = new Gato("Nyan Cat", "Multicolor", "Cósmico");

    System.out.println();

    for (int i = 0; i < 3; i++) {
      System.out.println("Gato nº" + (i + 1));
      System.out.println("Nombre: " + gatito[i].getNombre());
      System.out.println("Color: " + gatito[i].getColor());
      System.out.println("Raza: " + gatito[i].getRaza());
    }
  }

  public PruebaGato() {
  }
}
