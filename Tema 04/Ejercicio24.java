/**
 * 
 * Realiza un programa que genere la nómina de un empleado.
 * Debe preguntar el cargo: Prog. junior, prog. senior o jefe de proyecto.
 * También tiene que poner los días de viaje y si está casado o es soltero.
 * El sueldo varía de 950, 1200 y 1600 euros. Cada día de viaje suma 30 euros.
 * Al sueldo hay que restar IRPF, que es del 25% soltero y del 20% casado.
 * 
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio24 {
  public static void main(String[] args) {
    System.out.println("Es hora de cobrar. Indique los datos de la nómina del empleado.");
    System.out.println("");
    System.out.println("1 - Programador Junior.");
    System.out.println("2 - Programador Senior.");
    System.out.println("3 - Jefe de Proyecto.");
    System.out.println("");
    System.out.print("Indique el puesto del empleado (1 - 3): ");
    int puesto = Integer.parseInt(System.console().readLine());
    int sueldo1 = 0;
    switch (puesto) {
      case 1:
        sueldo1 = 950;
        break;
      case 2:
        sueldo1 = 1200;
        break;
      case 3:
        sueldo1 = 1600;
        break;
      default:
        System.out.println("Introduzca datos válidos.");
        break;
    }
    System.out.println(" ");
    System.out.print("¿Cuántos días ha estado de viaje empresarial? ");
    int dias = Integer.parseInt(System.console().readLine());
    int dietas = dias * 30;
    System.out.println(" ");
    System.out.print("¿Introduzca su estado civil (Soltero / Casado): ");
    String estado = System.console().readLine().toLowerCase();
    double IRPF = 0;
    switch (estado) {
      case "soltero":
        IRPF = 0.25;
        break;
      case "casado":
        IRPF = 0.20;
        break;
      default:
        System.out.println("Introduzca datos válidos.");
        break;
    }
    System.out.println("_______________________");
    System.out.println("Sueldo base:       " + sueldo1);
    System.out.println("Dietas (" + dias + " viajes): " + dietas);
    int sueldobruto = sueldo1 + dietas;
    System.out.println("Sueldo bruto:      " + sueldobruto);
    double retencion = IRPF * sueldobruto;
    System.out.println("IRPF:              " + (int)retencion);
    double sueldoneto = sueldobruto - retencion;
    System.out.println("Sueldo neto:       " + (int)sueldoneto);
    System.out.println("_______________________");
  }
}
