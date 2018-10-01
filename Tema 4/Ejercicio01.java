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
    System.out.print("Dime qué día quieres saber <Lunes = 1, Martes = 2...>: ");
    int dia = Integer.parseInt(System.console().readLine());
    switch(dia) {
      case 1:
      System.out.println("Los lunes a primera hay Entornos de Desarrollo.");
      break;
      case 2:
      System.out.println("Los martes a primera hay Sistemas Informáticos.");
      break;
      case 3:
      System.out.println("Los miércoles a primera hay Programación.");
      break;
      case 4:
      System.out.println("Los jueves a primera hay Programación.");
      break;
      case 5:
      System.out.println("Los viernes a primera hay Sistemas Informáticos.");
      break;
      case 6:
      System.out.println("Los sábados a primera estás durmiendo.");
      break;
      case 7:
      System.out.println("Los domingos a primera estás durmiendo.");
      break;
      default:
      System.out.println("¡Introduce un día válido!");
    }
  }
}
