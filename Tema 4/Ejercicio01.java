/**
 * 
 * Escribe un programa que pida un día de la semana y que te diga 
 * qué asignatura toca a primera ese día.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.print("Este programa te dice qué asignatura ");
    System.out.println("toca a primera según el día que indiques.");
    System.out.print("Dime qué día quieres saber: ");
    String dia = System.console().readLine();
    switch(dia) {
      case "lunes":
      case "Lunes":
        System.out.println("Los lunes a primera hay Entornos de Desarrollo.");
        break;
      case "martes":
      case "Martes":
        System.out.println("Los martes a primera hay Sistemas Informáticos.");
        break;
      case "miercoles":
      case "miércoles":
      case "Miercoles":
      case "Miércoles":
        System.out.println("Los miércoles a primera hay Programación.");
        break;
      case "jueves":
      case "Jueves":
        System.out.println("Los jueves a primera hay Programación.");
        break;
      case "viernes":
      case "Viernes":
        System.out.println("Los viernes a primera hay Sistemas Informáticos.");
        break;
      case "sabado":
      case "sábado":
      case "Sabado":
      case "Sábado":
        System.out.println("Los sábados a primera estás durmiendo.");
        break;
      case "domingo":
      case "Domingo":
        System.out.println("Los domingos a primera estás durmiendo.");
        break;
      default:
        System.out.println("¡Introduce un día válido!");
    }
  }
}
