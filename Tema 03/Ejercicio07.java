/**
 * 
 * Crea un programa que calcule el total de una factura a partir de su 
 * base imponible.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    System.out.print("Este programa calcula el precio total de un producto ");
    System.out.println("a partir de su base");
    System.out.println("imponible.");
    System.out.print("Dime el valor del producto 'en euros': ");
    String linea; 
    linea = System.console().readLine();
    double basImp = Double.parseDouble(linea);
    double iva = basImp * 0.21; 
    double suma = basImp + iva;
    System.out.printf("El precio del producto con IVA es de %.2f euros.\n", suma);  
  }
}

