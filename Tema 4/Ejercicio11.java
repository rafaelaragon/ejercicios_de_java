/**
 * 
 * Realiza un programa que te pida la hora y los minutos, y con ello te diga
 * cuántos segundos faltan para la medianoche.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.print("Este programa muestra cuántos segundos quedan para medianoche ");
    System.out.println("en función de la hora que introduzca el usuario.");
    System.out.println("Porfavor, dime qué hora es.");
    System.out.print("Hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.print("Minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    int horaMinutos = hora * 60;
    int horaSegundos = horaMinutos * 60;
    int minutosSegundos = minutos * 60;
    int horaDada = horaSegundos + minutosSegundos;
    int horaFinal = 86400 - horaDada;
    if ((hora == 0) && (minutos == 0)) {
      System.out.println("¡Ya es medianoche!");
    } else {
        System.out.println("Quedan " + horaFinal + " segundos para la medianoche.");
    }
  }
}
