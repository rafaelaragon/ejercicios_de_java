package ejercicio02;

/**
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de
 * esos números. El tamaño de la lista también será aleatorio y podrá oscilar
 * entre 10 y 20 elementos ambos inclusive.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.ArrayList;

public class Ejercicio02 {

  public static void main(String[] args) {
    ArrayList<Integer> n = new ArrayList<>();

    int suma = 0;
    int media = 0;
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;

    int tamano = ((int) (Math.random() * 11) + 10);
    
    for (int i = 0; i < tamano; i++) {
      int numero = ((int) (Math.random() * 101));
      n.add(numero);
      suma += numero;
      if (numero > maximo) {
        maximo = numero;
      }
      if (numero < minimo) {
        minimo = numero;
      }
    }
    
    media = suma /tamano;
    
    System.out.println("Suma: " + suma);
    System.out.println("Media: " + media);
    System.out.println("Maximo: " + maximo);
    System.out.println("Minimo: " + minimo);
  }
}
