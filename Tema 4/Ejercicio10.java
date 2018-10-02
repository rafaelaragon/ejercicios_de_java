/**
 * 
 * Realiza un programa que te diga tu horóscopo.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.println("Bienvenido al horóscopo de hoy.");
    System.out.println("Porfavor introduzca su fecha de nacimiento: ");
    System.out.print("Día: ");
    int dia = Integer.parseInt(System.console().readLine());
    System.out.print("Mes|número|: ");
    int mes = Integer.parseInt(System.console().readLine());
    switch (mes) {
      case 1:
        if (dia <20) {
          System.out.println("Eres Capricornio. Las cartas dicen que no te va bien con tu mujer.");
        } else
          System.out.println("Eres Acuario. Por lo que más quieras, aléjate del agua.");
          break;
      case 2:
        if (dia <19) {
          System.out.println("Eres Acuario. Por lo que más quieras, aléjate del agua.");
        } else
          System.out.println("Eres Piscis. A ti te van mazo los pescadetes de colorines.");
          break;
      case 3:
        if (dia <21) {
          System.out.println("Eres Piscis. A ti te van mazo los pescadetes de colorines. ");
        } else
          System.out.println("Eres Aries. Eres como Capricornio, pero te los han puesto más veces.");
          break;
      case 4:
        if (dia <20) {
          System.out.println("Eres Aries. Eres como Capricornio, pero te los han puesto más veces.");
        } else
          System.out.println("Eres Tauro. Tu pareja se está liando con las de Capricornio y Aries.");
          break;
      case 5:
        if (dia <21) {
          System.out.println("Eres Tauro. Tu pareja se está liando con las de Capricornio y Aries.");
        } else
          System.out.println("Eres Géminis. Pase lo que pase, NUNCA escuches a las voces de tu cabeza. En serio.");
          break;
      case 6:
        if (dia <21) {
          System.out.println("Eres Géminis. Pase lo que pase, NUNCA escuches a las voces de tu cabeza. En serio.");
        } else
          System.out.println("Eres Cáncer. Deberías revisarte ese bulto tan feo que te ha salido.");
      case 7:
        if (dia <23) {
          System.out.println("Eres Cáncer. Deberías revisarte ese bulto tan feo que te ha salido.");
        } else
          System.out.println("Eres Leo. Según los espíritus ya va tocando una depilación láser.");
          break;
      case 8:
        if (dia <23) {
          System.out.println("Eres Leo. Según los espíritus ya va tocando una depilación láser.");
        } else
          System.out.println("Eres Virgo. Los astros me cuentan que no ligas porque te pasa como a Leo.");
          break;
      case 9:
        if (dia <23) {
          System.out.println("Eres Virgo. Los astros me cuentan que no ligas porque te pasa como a Leo.");
        } else
          System.out.println("Eres Libra. Ten cuidado con los morosos. Acechan hasta en el vecindario.");
          break;
      case 10:
        if (dia <23) {
          System.out.println("Eres Libra. Ten cuidado con los morosos. Acechan hasta en el vecindario.");
        } else
          System.out.println("Eres Escorpio. El Universo me cuenta que eres de Netflix y chilling,¿a que sí?");
          break;
      case 11:
        if (dia <22) {
          System.out.println("Eres Escorpio. El Universo me cuenta que eres de Netflix y chilling,¿a que sí?");
        } else
          System.out.println("Eres Sagitario. Eres un aventurero como yo, pero un día te dispararán una flecha en la rodilla.");
          break;
      case 12:
        if (dia <21) {
          System.out.println("Eres Sagitario. Eres un aventurero como yo, pero un día te dispararán una flecha en la rodilla.");
        } else
          System.out.println("Eres Capricornio. Las cartas dicen que no te va bien con tu mujer.");
          break;
    }
  }
}


