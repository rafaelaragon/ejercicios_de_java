package tema07;

/**
 * Un restaurante nos ha encargado una aplicación para colocar a los clientes en
 * sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
 * (mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
 * el programa no está preparado para colocar a grupos mayores a 4, por tanto,
 * si un cliente dice por ejemplo que son un grupo de 6, el programa dará el
 * mensaje “Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como
 * máximo e intente de nuevo”. Para el grupo que llega, se busca siempre la
 * primera mesa libre (con 0 personas). Si no quedan mesas libres, se busca
 * donde haya un hueco para todo el grupo, por ejemplo si el grupo es de dos
 * personas, se podrá colocar donde haya una o dos personas. Inicialmente, las
 * mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan
 * nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
 * pueden romper aunque haya huecos sueltos suficientes.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio15 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int mesa[] = new int[10];
    int mesasLlenas = 0;

    for (int i = 0; i < 10; i++) {
      mesa[i] = ((int) (Math.random() * 5));
      if (mesa[i] != 0) {
        mesasLlenas++;
      }
    }

    System.out.print("  Mesa nº   ");
    for (int i = 0; i < 10; i++) {
      System.out.printf(" %6d ", (i + 1));
    }
    System.out.println();
    System.out.print("  Ocupación ");
    for (int i = 0; i < 10; i++) {
      System.out.printf(" %6d ", mesa[i]);
    }
    System.out.println();
    for (int i = 0; i < 999; i++) {
      System.out.print("¿Cuántos son? ");
      int numClientes = Integer.parseInt(s.nextLine());
      if ((numClientes < 1) || numClientes > 4) {
        System.out.println("Lo siento, sólo aceptamos grupos de 1 a 4 personas.");
      } else {
        for (int j = 0; j < 10; j++) {
          if (mesa[j] == 0) {
            mesa[j] = numClientes;
            System.out.println("Pase a la mesa " + (j + 1));
            mesasLlenas++;
            break;
          }
          if (mesasLlenas == 10) {
          System.out.println("Lo siento, estamos llenos.");
          break;
        }
        }
        System.out.println();
        System.out.print("  Mesa nº   ");
        for (int j = 0; j < 10; j++) {
          System.out.printf(" %6d ", (j + 1));
        }
        System.out.println();
        System.out.print("  Ocupación ");
        for (int j = 0; j < 10; j++) {
          System.out.printf(" %6d ", mesa[j]);
        }
        System.out.println();
        System.out.println();
      }
    }
  }
}
