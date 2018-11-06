/**
 * 
 * Realiza un programa que calcule el precio de un producto en función de su 
 * imponible, su I.V.A y el código promocional.
 * 
 * Los tipos de I.V.A son del 21%, 10% y 4%.
 * 
 * Los códigos son nopro, mitad meno5 y 5porc. 
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio23 {
  public static void main(String[] args) {
    System.out.println("------------------------------------------------------------------");
    System.out.println("Bienvenido al sistema de pago de Carrethree.");
    System.out.print("Introduzca la base imponible: ");
    double basImp = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca el tipo de IVA(general, reducido o superreducido): ");
    String IVA = System.console().readLine().toLowerCase();
    System.out.print("Introduzca el código promocional(nopro, mitad, meno5 o 5porc): ");
    String cod = System.console().readLine().toLowerCase();
    System.out.println("------------------------------------------------------------------");
    
    double IVA21 = basImp * 0.21;
    double IVA10 = basImp * 0.1;
    double IVA4 = basImp * 0.04;
    
    double mitad = basImp / 2;
    double meno5 = 5;
    double cincoporciento = basImp * 0.05;
    
    double general = 0;
    System.out.println("Base imponible:     " + basImp);
    switch (IVA) {
      case "general":
        System.out.println("IVA(21%):           " + IVA21);
        general = IVA21;
        break;
      case "reducido":
        System.out.println("IVA(10%):           " + IVA10);
        general = IVA10;
        break;
      case "superreducido":
        System.out.println("IVA(4%):            " + IVA4);
        general = IVA4;
        break;
      default:
        System.out.println("Responda adecuadamente porfavor.");
        break;
        
    }
    double total2 = 0;
    switch (cod) {
      case "nopro":
        System.out.println("Cod. promo.(nopro):  / " );
        total2 = 0;
        break;
      case "mitad":
        System.out.println("Cod. promo.(mitad):-" + mitad);
        total2 = -mitad;
        break;
      case "meno5":
        System.out.println("Cod. promo.(meno5):-" + meno5);
        total2 = - meno5;
        break;
      case "5porc":
        System.out.println("Cod. promo.(5%):   -" + cincoporciento);
        total2 = - cincoporciento;
        break;
      default:
        System.out.println("Responda adecuadamente porfavor.");
        break;
      }
      double total = basImp + general + total2;
      System.out.println("TOTAL:              " + total);
      System.out.println("Gracias por su compra.");
  }
}
