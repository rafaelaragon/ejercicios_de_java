package ejercicio04;

/**
 * Crea la clase Fracción. Los atributos serán numerador y denominador. 
 * Y algunos de los métodos pueden ser invierte, simplifica, multiplica,
 * divide, etc.
 * 
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class PruebaFraccion {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    Fraccion f01 = new Fraccion();
    
    int opcion;
    
    System.out.print("Introduzca el numerador: ");
    int num = Integer.parseInt(s.nextLine());
    Fraccion.setNumerador(num);
    System.out.print("Introduzca el denominador: ");
    int den = Integer.parseInt(s.nextLine());
    Fraccion.setDenominador(den);
    
    System.out.println("FRACCIONES");
      System.out.println("=========");
      System.out.println("1. Invierte la fracción");
      System.out.println("2. Simplifica la fracción, si es posible");
      System.out.println("3. Multiplica la fracción");
      System.out.println("4. Divide la fracción");
      System.out.println("5. Salir");
      
      do {
        System.out.println(Fraccion.getNumerador() + "/" + Fraccion.getDenominador());
      System.out.print("Elige una opción (1-5): ");

      opcion = Integer.parseInt(s.nextLine());

      switch (opcion) {
        case 1:
          f01.invierte();
          break;
        case 2:
          f01.simplifica();
          break;
        case 3:
          System.out.print("¿Por qué número la quieres multiplicar? ");
          int multiplo = Integer.parseInt(s.nextLine());
          f01.multiplica(multiplo);
          break;
        case 4:
          System.out.print("¿Por qué número la quieres dividir? ");
          int divisor = Integer.parseInt(s.nextLine());
          f01.divide(divisor);
          break;
        default:
          break;
      }
    } while (opcion != 5);
  }
}
