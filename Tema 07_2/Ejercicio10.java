package tema07_2;

/**
 * Realiza el juego de las tres en raya.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio10 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String[][] array = new String[3][3];
    int x = 0;
    int y = 0;
    boolean salir = false;

    System.out.println("¡Tres en Raya!");
    System.out.println();

    for (int i = 0; i < 3; i++) {
      System.out.println("  -------");
      System.out.print((i) + " |");
      for (int j = 0; j < 3; j++) {
        array[i][j] = " |";
        System.out.print(array[i][j]);
      }
      System.out.println();
    }
    System.out.println("  -------");
    System.out.println("   0 1 2\n");

    do {

      System.out.println("Turno de Círculo.");
      System.out.print("Indique la posición X: ");
      x = Integer.parseInt(s.nextLine());
      System.out.print("Indique la posición Y: ");
      y = Integer.parseInt(s.nextLine());
      if (array[y][x] == " |") {
        array[y][x] = "o|";

        for (int i = 0; i < 3; i++) {
          System.out.println("  -------");
          System.out.print((i) + " |");
          for (int j = 0; j < 3; j++) {
            System.out.print(array[i][j]);
          }
          System.out.println();
        }
        System.out.println("  -------");
        System.out.println("   0 1 2\n");
        //Victoria (condiciones: Tres (X) Tres (Y), Tres (X1 + X2 + X3), Tres (X3 + X2 + X1)
        if (
            (array[0][0] == "o|") && (array[0][1] == "o|") && (array[0][2] == "o|") || 
            (array[1][0] == "o|") && (array[1][1] == "o|") && (array[1][2] == "o|") ||  
            (array[2][0] == "o|") && (array[2][1] == "o|") && (array[2][2] == "o|") ||  
            (array[0][0] == "o|") && (array[1][0] == "o|") && (array[2][0] == "o|") ||  
            (array[0][1] == "o|") && (array[1][1] == "o|") && (array[2][1] == "o|") ||  
            (array[0][2] == "o|") && (array[1][2] == "o|") && (array[2][2] == "o|") ||  
            (array[0][0] == "o|") && (array[1][1] == "o|") && (array[2][2] == "o|") ||  
            (array[2][2] == "o|") && (array[1][1] == "o|") && (array[0][0] == "o|")  
           
            ) {
              System.out.println("Ha ganado círculo.");
              salir = true;
              break;
        }
                                  
    } else {
        System.out.println("Esa posición está ocupada. Pierdes tu turno.");
      }

    System.out.println("Turno de Cruz.");
    System.out.print("Indique la posición X: ");
    x = Integer.parseInt(s.nextLine());
    System.out.print("Indique la posición Y: ");
    y = Integer.parseInt(s.nextLine());
    if (array[y][x] == " |") {
      array[y][x] = "X|";

      for (int i = 0; i < 3; i++) {
        System.out.println("  -------");
        System.out.print((i) + " |");
        for (int j = 0; j < 3; j++) {
          System.out.print(array[i][j]);
        }
        System.out.println();
      }
      System.out.println("  -------");
      System.out.println("   0 1 2\n");
      //Victoria (condiciones: Tres (X) Tres (Y), Tres (X1 + X2 + X3), Tres (X3 + X2 + X1)
      if (
            (array[0][0] == "X|") && (array[0][1] == "X|") && (array[0][2] == "X|") || 
            (array[1][0] == "X|") && (array[1][1] == "X|") && (array[1][2] == "X|") ||  
            (array[2][0] == "X|") && (array[2][1] == "x|") && (array[2][2] == "X|") ||  
            (array[0][0] == "X|") && (array[1][0] == "X|") && (array[2][0] == "X|") ||  
            (array[0][1] == "X|") && (array[1][1] == "X|") && (array[2][1] == "X|") ||  
            (array[0][2] == "X|") && (array[1][2] == "X|") && (array[2][2] == "X|") ||  
            (array[0][0] == "X|") && (array[1][1] == "X|") && (array[2][2] == "X|") ||  
            (array[2][2] == "X|") && (array[1][1] == "X|") && (array[0][0] == "X|")  
           
            ) {
              System.out.println("Ha ganado Cruz.");
              salir = true;
              break;
        }
      
    } else {
      System.out.println("Esa posición está ocupada. Pierdes tu turno.");
    }
    } while (!salir);
  }
}
