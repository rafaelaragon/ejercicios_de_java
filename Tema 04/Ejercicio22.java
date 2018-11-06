/**
 * 
 * Realiza un programa que diga cuántos minutos faltan para el fin de semana.
 * El fin de semana empieza el viernes a las 15:00.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio22 {
  public static void main(String[] args) {
    System.out.println("Este es el mejor programa del mundo.");
    System.out.println("Te puedo decir cuántos minutos quedan para el fin de semana.");
    System.out.print("Dime qué día es: ");
    String dia = System.console().readLine().toLowerCase();
    System.out.print("Dime qué hora es (horas): ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.print("Dime qué hora es(minutos): ");
    int minutos = Integer.parseInt(System.console().readLine());
    int horaReal = hora * 60;
    int tiempo = horaReal + minutos;
    
    switch (dia) {
      case "lunes":
        int espera = 6660 -tiempo;
        System.out.println("Faltan " + espera + " minutos para el fin de semana.");
        break;
      case "martes":
        espera = 5220 - tiempo;
        System.out.println("Faltan " + espera + " minutos para el fin de semana.");
        break;
      case "miercoles":
      case "miércoles":
        espera = 3780 - tiempo;
        System.out.println("Faltan " + espera + " minutos para el fin de semana.");
        break;
      case "jueves":
        espera = 2340 - tiempo;
        System.out.println("Faltan " + espera + " minutos para el fin de semana.");
        break;
      case "viernes":
        espera = 900 - tiempo;
        System.out.println("Faltan " + espera + " minuto(s) para el fin de semana.");
        break;
    }
  }
}
