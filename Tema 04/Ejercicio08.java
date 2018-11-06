/**
 * 
 * Realiza un programa que calcule la media de tres notas.
 * 
 * Además el programa deberá decir la nota del boletín.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio08 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula la nota media de tres notas.");
    System.out.print("Introduce la nota del primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    if (nota1 < 0.0 || nota1 > 10.0) {
      System.out.println("No puedes sacar esa nota. ¡Mentiroso!");
    }
    else {
      System.out.print("Introduce la nota del segundo examen: ");
      double nota2 = Double.parseDouble(System.console().readLine());
      if (nota2 < 0.0 || nota2 > 10.0) {
        System.out.println("No puedes sacar esa nota. ¡Mentiroso!");
      }
      else {
        System.out.print("Introduce la nota del tercer examen: ");
        double nota3 = Double.parseDouble(System.console().readLine());
        if (nota3 < 0.0 || nota3 > 10.0) {
          System.out.println("No puedes sacar esa nota. ¡Mentiroso!");
        }
        else {
          System.out.println("Has sacado: " + nota1 + "    " + nota2 + "    " + nota3);
          double media = (nota1 + nota2 + nota3)/3;
          System.out.printf("La nota media es " + media);
          if (media < 5) {
            System.out.println(" Insuficiente.");
          } else if (media < 6) {
              System.out.println(" Suficiente.");
            } else if (media < 7) {
                System.out.println(" Bien.");
              } else if (media < 9) {
                  System.out.println(" Notable.");
                } else 
                    System.out.println(" Sobresaliente.");
        }
      }
    }
  }
}
         
