/**
 * 
 * Realiza un programa para BanderaDeEspaña.es que calcule el precio de sus banderas en función de su alto y ancho.
 * El precio de las banderas es de 1 céntimo el cm².
 * Si se añade escudo, el precio aumenta 2.50 €.
 * Los gastos de envío son de 3.25 €. El IVA ya está incluido.
 *
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio25 {
  public static void main(String[] args) {
    System.out.println("BanderasDeEspaña.es, tu tienda de banderas de España, para toda España.");
    System.out.println("Nota: Sólo envíos en península y Baleares.");
    System.out.println("--------------------------------------------------------------------------------");
    System.out.print("Indique el ancho de su bandera (cm): ");
    int ancho = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    System.out.print("Indique el alto de su bandera (cm): ");
    int alto = Integer.parseInt(System.console().readLine());
    if ((ancho < 0) || (alto < 0)) {
      System.out.println("Te crees más listo que BanderasDeEspaña.es, eh? Te quedas sin bandera.");
    }
    else {
    System.out.println(" ");
    int area = ancho * alto;
    System.out.println("Tu bandera mide " + ancho + " cm x " + alto + " cm.");
    System.out.println(" ");
    System.out.print("¿Quieres que tu bandera tenga escudo? Es más patriótico: ");
    String escudo = System.console().readLine().toLowerCase();
    double detalle = 0;
    switch (escudo) {
      case "si":
      case "sí":
        detalle = 250;
        break;
      default:
        detalle = 0;
        break;
      }
      double gastos = 325;
      double total = area + detalle + gastos;
      System.out.println("--------------------------------------------------------------------------------");
    System.out.println("Coste básico de bandera: " + (double)area / 100 + " €");
    System.out.println("Escudo:                  " + detalle / 100 + " €");    
    System.out.println("Gastos de envío:         " + gastos / 100 + " €");
    System.out.println("Total a pagar:           " + total / 100 + " €");
    }
  }
}
