/**
 * 
 * Este programa te ayuda a saber si tu pareja te está siendo infiel.
 * Contestarás 10 preguntas y en función de las que aciertes consigues una puntuación.
 * Según la puntuación aparecerá un mensaje u otro.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio16 {
  public static void main(String[] args) {
    int puntos = 0;
    System.out.println("Si estás aquí es porque crees que tu pareja te está siendo infiel.");
    System.out.println("A continuación contestarás 10 preguntas para saber si es verdad.");
    System.out.println("Contesta sí o no a las preguntas.");
    System.out.println("");
    System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    String resp1 = System.console().readLine().toLowerCase();
    switch (resp1) {
      case "si":
      case "sí":
      puntos = puntos + 3;
      break;
    }  
    System.out.println("");
    System.out.println("2. Ha aumentado sus gastos de vestuario.");
    String resp2 = System.console().readLine().toLowerCase();
    switch (resp2) {
      case "si":
      case "sí":
      puntos = puntos + 3;
      break;
    } 
    System.out.println("");
    System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti.");
    String resp3 = System.console().readLine().toLowerCase();
    switch (resp3) {
      case "si":
      case "sí":
      puntos = puntos + 3;
      break;
    }
    System.out.println("");
    System.out.println("4. Ahora se afeita y se asea más a menudo (si es hombre)  o se arregla el pelo y  se asea con más frecuencia (si es mujer)");
    String resp4 = System.console().readLine().toLowerCase();
    switch (resp4) {
      case "si":
      case "sí":
      puntos = puntos + 3;
      break;
    } 
    System.out.println("");
    System.out.println("5. No te deja que mires la agenda de su teléfono móvil.");
    String resp5 = System.console().readLine().toLowerCase();
    switch (resp5) {
      case "si":
      case "sí":
      puntos = puntos + 3;
      break;
    }
    System.out.println("");
    System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");
    String resp6 = System.console().readLine().toLowerCase();
    switch (resp6) {
      case "si":
      case "sí":
      puntos = puntos + 3;
      break;
    }
    System.out.println("");
    System.out.println("7. Últimamente se preocupa más por estar en su línea y estar más bronceado/a.");
    String resp7 = System.console().readLine().toLowerCase();
    switch (resp7) {
      case "si":
      case "sí":
      puntos = puntos + 3;
      break;
    }
    System.out.println("");
    System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho trabajo.");
    String resp8 = System.console().readLine().toLowerCase();
    switch (resp8) {
      case "si":
      case "sí":
      puntos = puntos + 3;
      break;
    }
    System.out.println("");
    System.out.println("9. Has notado que últimamente se perfuma más.");
    String resp9 = System.console().readLine().toLowerCase();
    switch (resp9) {
      case "si":
      case "sí":
      puntos = puntos + 3;
      break;
    }
    System.out.println("");
    System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
    String resp10 = System.console().readLine().toLowerCase();
    switch (resp10) {
      case "si":
      case "sí":
      puntos = puntos + 3;
      break;
    }
    System.out.println("");
    System.out.println("Analizando resultados:");
    if (puntos <= 10) {
      System.out.println("¡Enhorabuena! Tu pareja parece ser realmente fiel.");
    } else if (puntos <= 22) {
        System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque       seguramente será algo sin importancia. No bajes la guardia.");
      } else if (puntos <= 30) {
          System.out.println("Tu pareja parece tener todos loos ingredientes para estar viviendo un romance   con otra persona. Te aconsejamos que indagues un poco más y averigües qué es lo que está pasondo por su cabeza.");
        }
  }
}
