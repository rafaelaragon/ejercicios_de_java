package Ejercicios;

/**
 * Pruebas para saber si funcionan correctamente los arrays de dos dimensiones
 *
 * @author Rafael Aragón Rodríguez
 *
 */
import java.util.Scanner;

public class Ejercicio29a34 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[][] a = matematicas.ArrayBi.generaArrayBiInt(5, 8, 0, 100);
    
    matematicas.ArrayBi.muestraArrayBiInt(a);
    System.out.println();         
    System.out.print("Fila 2: ");
    matematicas.ArrayInt.muestraArrayInt(matematicas.ArrayBi.filaDeArrayBiInt(a, 2));
    System.out.println(); 
    System.out.print("Columna 6: ");
    matematicas.ArrayInt.muestraArrayInt(matematicas.ArrayBi.columnaDeArrayBiInt(a, 6));
    System.out.println(); 
    System.out.print("Coordenadas del 24 (fila, columna): ");
    matematicas.ArrayInt.muestraArrayInt(matematicas.ArrayBi.coordenadasEnArrayBiInt(a, 24));
    
    int[][] b = {{11, 10, 9}, {4, 5, 7}, {2, 6, 1}};
    matematicas.ArrayBi.muestraArrayBiInt(b);
    System.out.println(); 
    System.out.println("Busca los puntos de silla: ");
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
        if (matematicas.ArrayBi.esPuntoDeSilla(b, i, j)) {
          System.out.println("fila " + i + ", columna " + j + " -> "  + b[i][j]);
        }
      }
    }
    matematicas.ArrayBi.muestraArrayBiInt(a);
    System.out.println(); 
    System.out.print("Fila: ");
    int fila = Integer.parseInt(s.nextLine());
    System.out.print("Columna: ");
    int columna = Integer.parseInt(s.nextLine());
    System.out.print("Dirección (nose/nesos): ");
    String direccion = s.nextLine();
    System.out.println(); 
    System.out.print("Diagonal: ");
    matematicas.ArrayInt.muestraArrayInt(matematicas.ArrayBi.diagonal(a, fila, columna, direccion));
  }

}