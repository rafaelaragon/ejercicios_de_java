package matematicas;

/**
 * Funciones matemáticas para arrays, tanto de una como de varias dimensiones
 *
 * @author Rafael Aragón Rodríguez
 */
public class ArrayInt {
  
  /**
   * Muestra por pantalla todos los elementos de un array 
   * separados por un espacio.
   * 
   * @param x array unidimiensional de números enteros
   */
  public static void muestraArrayInt(int x[]) {
    for (int n : x) {
      System.out.print(n + " ");
    }
    System.out.println();
  }

  /**
   * Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y
   * máximo) se indica como parámetro.
   *
   * @param n tamaño del array
   * @param min número generable más pequeño
   * @param max número generable más grande
   * @return array de una dimensión aleatorio
   */
  public static int[] generaArrayInt(int n, int min, int max) {
    int[] x = new int[n];

    for (int i = 0; i < n; i++) {
      x[i] = (int) (Math.random() * (max - min + 1) + min);
    }

    return x;
  }

  /**
   * Devuelve el mínimo del array que se pasa como parámetro.
   *
   * @param x array unidimiensional de números enteros
   * @return número más pequeño del array
   */
  public static int minimoArrayInt(int[] x) {
    int minimo = Integer.MAX_VALUE;
    for (int n : x) {
      if (n < minimo) {
        minimo = n;
      }
    }
    return minimo;
  }

  /**
   * Devuelve el máximo del array que se pasa como parámetro.
   *
   * @param x array unidimiensional
   * @return número más grande del array
   */
  public static int maximoArrayInt(int[] x) {
    int maximo = Integer.MIN_VALUE;
    for (int n : x) {
      if (n > maximo) {
        maximo = n;
      }
    }
    return maximo;
  }

  /**
   * Devuelve la media de los números del array introducido.
   *
   * @param x array unidimiensional
   * @return media de los números de x
   */
  public static double mediaArrayInt(int[] x) {
    int suma = 0;
    int a = 0;
    for (int n : x) {
      suma += n;
      a++;
    }
    return (double) suma / a;
  }

  /**
   * Dice si un número está o no dentro de un array.
   *
   * @param x array unidimensional
   * @param n número a revisar si está o no dentro del array
   * @return true si n está en el array
   * @return false si n no está en el array
   */
  public static boolean estaEnArrayInt(int[] x, int n) {
    for (int i : x) {
      if (i == n) {
        return true;
      }
    }
    return false;
  }

  /**
   * Busca un número en un array y devuelve la posición (el índice) en la que se
   * encuentra.
   *
   * @param x array unidimiensional
   * @param n número que se buscará en el array
   * @return posición del número si se encuentra o -1 si no se encuentra
   */
  public static int posicionEnArrayInt(int[] x, int n) {
    for(int i = 0; i < x.length; i++) {
      if (x[i] == n) {
        return i+1;
      }
    }
    return -1;
  }

  /**
   * Le da la vuelta a un array.
   *
   * @param x array unidimiensional
   * @return array volteado
   */
  public static int[] volteaArrayInt(int[] x) {
    int[] a = new int[x.length];

    for (int i = 0; i < x.length; i++) {
      a[x.length - i - 1] = x[i];
    }
    return a;
  }

  /**
   * Rota n posiciones a la derecha los números de un array.
   *
   * @param x array unidimiensional
   * @param n número de rotaciones que se van a hacer
   * @return array rotado a la derecha
   */
  public static int[] rotaDerechaArrayInt(int[] x, int n) {
    int[] x2 = x.clone();
    int i, aux;
    while (n-- > 0) {
      aux = x2[x2.length - 1];
      for(i = x2.length - 1; i > 0; i--) {
        x2[i] = x2[i - 1];
      }
      x2[0] = aux;
    }
    return x2;
  }

  /**
   * Rota n posiciones a la izquierda los números de un array.
   *
   * @param x array unidimiensional
   * @param n número de movimientos (rotaciones hacia la izquierda) a realizar
   * @return array rotado a la izquierda
   */
  public static int[] rotaIzquierdaArrayInt(int[] x, int n) {
    int[] x2 = x.clone();
    int i, aux;
    while (n-- > 0) {
      aux = x2[0];
      for(i = 0; i < x2.length - 1; i++) {
        x2[i] = x2[i + 1];
      }
      x2[x2.length - 1] = aux;
    }
    return x2;
  }
}
