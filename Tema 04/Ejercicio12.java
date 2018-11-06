/**
 * 
 * Realiza un cuestionario de 10 preguntas. Cada pregunta valdrá un punto.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio12 {
  public static void main(String[] args) {
    System.out.println("Estás en un examen. Guarda silencio y prepárate.");
    System.out.println("Pregunta 1: ¿Cuáles son las siglas de Entornos de Desarrollo?");
    int puntos = 0;
    String resp1 = System.console().readLine().toLowerCase();
    switch(resp1) {
      case "eed":
        System.out.println("Correcto.");
        puntos++;
        break;
      default:
        System.out.println("Incorrecto.");
        break;
    }
    System.out.println("Pregunta 2: ¿Cuántas horas a la semana tenemos Programación?");
    int resp2 = Integer.parseInt(System.console().readLine());
    switch(resp2) {
      case 8:
        System.out.println("Correcto.");
        puntos++;
        break;
      default:
        System.out.println("Incorrecto.");
        break;
    }
    System.out.println("Pregunta 3: ¿Cómo se llama el chico que da clases en inglés los jueves?");
    String resp3 = System.console().readLine().toLowerCase();
    switch(resp3) {
      case "kaan":
        System.out.println("Correcto.");
        puntos++;
        break;
      default:
        System.out.println("Incorrecto.");
        break;
    }
    System.out.println("Pregunta 4: ¿Objetivamente hablando, sirve base de datos para algo?");
    String resp4 = System.console().readLine().toLowerCase();
    switch(resp4) {
      case "si":
      case "sí":
        System.out.println("Correcto.");
        puntos++;
        break;
      default:
        System.out.println("Incorrecto.");
        break;
    }
    System.out.println("Pregunta 5: ¿En qué asignatura no debemos tener el móvil en la mesa?");
    String resp5 = System.console().readLine().toLowerCase();
    switch(resp5) {
      case "base de datos":
      case "bases de datos":
      case "bbdd":
      case "bd":
        System.out.println("Correcto.");
        puntos++;
        break;
      default:
        System.out.println("Incorrecto.");
        break;
    }
    System.out.println("Pregunta 6: Si te caes de la moto yendo al trabajo ebrio, ¿se considera accidente laboral?");
    String resp6 = System.console().readLine().toLowerCase();
    switch(resp6) {
      case "si":
      case "sí":
        System.out.println("Correcto.");
        puntos++;
        break;
      default:
        System.out.println("Incorrecto.");
        break;
    }
    System.out.println("Pregunta 7: ¿Quién es indudablemente el mejor alumno de este ciclo? |Empieza por Raf.|");
    String resp7 = System.console().readLine().toLowerCase();
    switch(resp7) {
      case "rafa":
      case "rafael":
        System.out.println("Correcto.");
        puntos++;
        break;
      default:
        System.out.println("Incorrecto.");
        break;
    }
    System.out.println("Pregunta 8: ¿Cuántos extintores hay en clase?");
    int resp8 = Integer.parseInt(System.console().readLine());
    switch(resp8) {
      case 1:
        System.out.println("Correcto.");
        puntos++;
        break;
      default:
        System.out.println("Incorrecto.");
        break;
    }
    System.out.println("Pregunta 9: ¿Cuántas asignaturas puedes suspender para poder hacer dual?");
    int resp9 = Integer.parseInt(System.console().readLine());
    switch(resp9) {
      case 0:
        System.out.println("Correcto.");
        puntos++;
        break;
      default:
        System.out.println("Incorrecto.");
        break;
    }
    System.out.println("Pregunta 10: ¿Es este cuestionario absolutamente perfecto?");
    String resp10 = System.console().readLine().toLowerCase();
    switch(resp10) {
      case "si":
      case "sí":
        System.out.println("Correcto.");
        puntos++;
        break;
      default:
        System.out.println("Incorrecto.");
        break;
    }
    System.out.println("Has sacado un " + puntos + ".");
  }
}
    
