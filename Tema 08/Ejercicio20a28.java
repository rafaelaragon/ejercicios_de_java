package Ejercicios;

/**
 * Pruebas para saber si funcionan correctamente los arrays de una dimensión
 *
 * @author Rafael Aragón Rodríguez
 *
 */
import java.util.Scanner;

public class Ejercicio20a28 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("generaArrayInt, n: ");
    int n1 = Integer.parseInt(s.nextLine());
    System.out.print("generaArrayInt, min: ");
    int min1 = Integer.parseInt(s.nextLine());
    System.out.print("generaArrayInt, max: ");
    int max1 = Integer.parseInt(s.nextLine());
    int[] array = matematicas.ArrayInt.generaArrayInt(n1, min1, max1);
    for (int i = 0; i < n1; i++) {
      System.out.print(array[i] + " ");
    }   
    System.out.println();
    
    System.out.println("Mínimo: " + matematicas.ArrayInt.minimoArrayInt(array));
    System.out.println("Máximo: " + matematicas.ArrayInt.maximoArrayInt(array));
    System.out.println("Media: " + matematicas.ArrayInt.mediaArrayInt(array));
    
     if (matematicas.ArrayInt.estaEnArrayInt(array, 24)) {
      System.out.println("El 24 está en el array.");
    } else {
      System.out.println("El 24 no está en el array.");
    }
     
    System.out.println("El 24 está en la posición " + 
    matematicas.ArrayInt.posicionEnArrayInt(array, 24));
    
    System.out.print("Array al revés: ");
    matematicas.ArrayInt.muestraArrayInt(matematicas.ArrayInt.volteaArrayInt(array));
    
    System.out.print("Array rotado 3 pasos a la derecha: ");
    matematicas.ArrayInt.muestraArrayInt(matematicas.ArrayInt.rotaDerechaArrayInt(array,3));
    
    System.out.print("Array rotado 4 pasos a la izquierda: ");
    matematicas.ArrayInt.muestraArrayInt(matematicas.ArrayInt.rotaIzquierdaArrayInt(array,4));
  }
}