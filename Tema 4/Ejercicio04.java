
/**
 * 
 * Escribe un programa que calcule el salario semanal de un trabajador teniendo
 * en cuenta que las primeras 40 horas se pagan a 12 euros la hora. El resto
 * se pagan a 16 euros la hora.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula el salario que ganas.");
    System.out.print("¿Ten en cuenta que hanas 12 euros por hora las primeras "); 
    System.out.println("cuarenta horas y que desde ahí cobras 16 por hora.");
    System.out.print("¿Cuántas horas has trabajado esta semana? ");
    String linea = System.console().readLine();
    int horas = Integer.parseInt(linea);
    int salariobase = horas * 12;
    int salarioextra = (horas - 40) * 16 + 480;
    if (horas <= 40 && horas >= 0) {
      System.out.println("Esta semana cobras " + salariobase + " €.");
    }
        if (horas > 40 && horas <= 168) {
      System.out.println("Esta semana cobras " + salarioextra + " €.");
    }
    if (horas < 0) {
      System.out.println("¡No puedes trabajar horas negativas!");
    }
        if (horas > 168) {
      System.out.println("La semana no tiene tantas horas, mentiroso.");
    }
  }
}
    

