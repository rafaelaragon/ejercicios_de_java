package ejercicio02;

/**
 *Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases 
 * de la primera. Para la clase Vehiculo, crea los atributos de clase 
 * vehiculosCreados y kilometrosTotales, así como el atributo de instancia 
 * kilometrosRecorridos.
 * Crea también algún método específico para cada una de las subclases.
 * 
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class PruebaVehiculo {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  
    int km;
    
    Bicicleta b01 = new Bicicleta();
    Coche c01 = new Coche();

      System.out.println("VEHÍCULOS");  
      System.out.println("=========");      
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.println("Elige una opción (1-8): ");
      
      int opcion = Integer.parseInt(s.nextLine());
      
      switch (opcion) {
        case 1:
          System.out.print("¿Cuántos kilómetros quiere recorrer? ");
          km = Integer.parseInt(s.nextLine());
          b01.recorreKilometros(km);
          break;
        case 2:
          b01.haceCaballito();
          break;
        case 3:
          System.out.print("¿Cuántos kilómetros quiere recorrer? ");
          km = Integer.parseInt(System.console().readLine());
          c01.recorreKilometros(km);
          break;
        case 4:
          c01.quemaRueda();
          break;
        case 5:
          System.out.print("Kilómetros recorridos con la bicicleta: ");
          System.out.println(b01.getKilometrosRecorridos() + " Km");
          break;
        case 6:
          System.out.print("Kilómetros recorridos con el coche: ");
          System.out.println(c01.getKilometrosRecorridos() + " Km");
          break;
        case 7:
          System.out.print("Kilómetros recorridos en total: ");
          System.out.println(Vehiculo.getKilometrosTotales() + " Km");
          break;
        default:
          break;
      }
    }
  }
