/**
 * 
 * Escribe un programa que pida una hora y que muestre buenos días, 
 * buenas tardes o buenas noches según la hora.
 * (de 5 a 12 mañana, de 12 a 20 tarde y de 20 a 5 noche).
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.println("Este programa pregunta la hora y te saluda.");
    System.out.print("¿Qué hora es? ");
    String linea = System.console().readLine();
    double hora = Double.parseDouble(linea);
    if (hora >= 5.0 && hora < 12.0) {
      System.out.println("Buenos días.");
    }
        if (hora >= 12.0 && hora < 20.0) {
      System.out.println("Buenas tardes.");
    }
    if (hora >= 20.0 && hora <=23.59) {
      System.out.println("Buenas noches.");
    }
          if (hora >=0.0 && hora<5.0) {
      System.out.println("Buenas noches.");
    }

          if (hora < 0.0 || hora >= 24) {
      System.out.println("¡Indica una hora real!");
    }
  }
}
    

