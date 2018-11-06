package tema06;

/**
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la 
 * baraja de 40 cartas: 2,3,4,5,6,7,sota,caballo,rey y as
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio03 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa muestra una carta de la baraja española al azar.");
    int numero = ((int) (Math.random() * 10) + 1);
    if (numero == 1) {
      System.out.print("As");
    } else if (numero == 8) {
      System.out.print("Sota");
    } else if (numero == 9) {
      System.out.print("Caballo");
    } else if (numero == 10) {
      System.out.print("Rey");
    } else {
      System.out.print(numero);
    }
    System.out.print(" de ");
    int palo = ((int) (Math.random() * 4) + 1);
    switch (palo) {
      case 1:
        System.out.println("Espadas.");
        break;
      case 2:
        System.out.println("Palos.");
        break;
      case 3:
        System.out.println("Copas.");
        break;
      case 4:
        System.out.println("Oros.");
        break;  
    }
  }
}
