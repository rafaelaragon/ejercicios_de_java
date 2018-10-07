/**
 * 
 * Crea un programa que calcule la media de dos notas. Si la media supera el 5,
 * eres apto. Si no se ha de hacer recuperación. Si esta se aprueba, se hace media con un 5.
 * Si no estás suspenso.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio21 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula tu media de Programación.");
    System.out.print("Dime la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.print("Dime la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    double notamedia = ((nota1 + nota2)/2);
    if ((nota1 < 0) || (nota1 > 10)) {
      System.out.print("Introduce datos que tengan sentido.");
    } else if ((nota2 < 0) || (nota2 > 10)) {
        System.out.print("Introduce datos que tengan sentido.");
    } else if (notamedia >= 5) {
        System.out.printf("Tu nota media es %.2f \n", notamedia);
    } else if (notamedia < 5) {
        System.out.printf("¿Aprobaste la recuperación?(escribe apto/ no apto: ");
      }
    String comprobacion = System.console().readLine().toLowerCase();
    switch (comprobacion) {
      case "apto":
        System.out.println("Tu nota media es 5.00");
        break;
      case "noapto":
      case "no apto":
        System.out.printf("Tu nota media es de %.2f \n", notamedia);
        break;
        }
  }
}
