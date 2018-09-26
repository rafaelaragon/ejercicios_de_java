/**
 * 
 * Crea un programa que calcule el salario semanal de un empleado que cobra 
 * 12 la hora.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio08 {
  public static void main(String[] args) {
    System.out.print("Este programa calcula tu salario semanal en función de"); 
    System.out.println(" las horas trabajadas.");
    System.out.print("Dime cuántas horas trabajas a la semana: ");
    String linea; 
    linea = System.console().readLine();
    int horas = Integer.parseInt(linea);
    System.out.println("Trabajas " + horas + " horas semanales.");
    int salario = horas * 12;
    System.out.println("Cada semana ganas " + salario + " euros.");
  }
}
