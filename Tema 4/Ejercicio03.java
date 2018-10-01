/**
 * 
 * Escribe un programa que pida un número del 1 al 7 y que te diga a
 * qué día de la semana corresponde.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.print("Este programa te dice  aqué día de la semana corresponden ");
    System.out.println("los números del 1 al 7.");
    System.out.print("Dime qué un número del 1 al 7: ");
    int dia = Integer.parseInt(System.console().readLine());
    switch(dia) {
      case 1:
      System.out.println("Es lunes,pero no te abrumes.");
      break;
      case 2:
      System.out.println("Es martes,al menos es mejor que antes.");
      break;
      case 3:
      System.out.println("Es miércoles, y los miércoles no sé rimar.");
      break;
      case 4:
      System.out.println("Es jueves, tengo unas ganas del viernes que te mueres.");
      break;
      case 5:
      System.out.println("Es viernes, si te pasas esta noche puede que el sábado hibernes.");
      break;
      case 6:
      System.out.println("Es sábado, después de lo de ayer estarás el día tumbado.");
      break;
      case 7:
      System.out.println("Es domingo, y con esto la semana extingo.");
      break;
      default:
      System.out.println("Ese número no vale. Te quedas sin rima.");
    }
  }
}

