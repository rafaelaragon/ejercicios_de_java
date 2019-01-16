package ejercicio07;

/**
 * Queremos gestionar la venta de entradas (no numeradas) de Expocoches
 * Campanillas que tiene 3 zonas, la sala principal con 1000 entradas
 * disponibles, la zona de compra-venta con 200 entradas disponibles y la zona
 * vip con 25 entradas disponibles. Hay que controlar que existen entradas antes
 * de venderlas.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class PruebaZona {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int entradasTotales = 2000;
    Zona z01 = new Zona(entradasTotales);

    int opcion;
    int numEntradas;

    do {
      System.out.println("1. Mostrar número de entradas libres.");
      System.out.println("2. Comprar entradas.");
      System.out.println("3. Salir.");
      System.out.println();
      System.out.print("Elija una opción (1-3): ");
      opcion = Integer.parseInt(s.nextLine());
      System.out.println();

      switch (opcion) {
        case 1:
          System.out.println("Quedan por vender " + z01.getEntradasPorVender() + " entradas.");
          System.out.println();
          break;
        case 2:
          System.out.print("¿Cuántas entradas quiere? ");
          numEntradas = Integer.parseInt(s.nextLine());
          if (entradasTotales - numEntradas < 0) {
            System.out.println("Lo siento, se han agotado las entradas.");
          } else {
            entradasTotales -= numEntradas;
            z01.setEntradasPorVender(entradasTotales);
          }
          System.out.println();
          break;
        case 3:
          break;
        default:
          System.out.println("Por favor, elija una opción del 1 al 3.");
          break;
      }
    } while (opcion != 3);

  }
}
