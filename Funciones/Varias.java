package matematicas;

/**
 * Funciones matemáticas varias.
 *
 * @author Rafael Aragón Rodríguez
 */
public class Varias {

  /**
   * Comprueba si un número es capicúa o no
   *
   * @param x número que quieres comprobar si es capicúa
   * @return true si el número es capicúa; false en caso contrario
   */
  public static boolean esCapicua(long x) {
    if (x == voltea(x)) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Comprueba si un número entero positivo es primo o no
   *
   * @param x un número entero positivo
   * @return true si el número es primo; false en caso contrario
   */
  public static boolean esPrimo(long x) {
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
    return true;
  }

  /**
   * Devuelve el menor primo que es mayor al número que se pasa como parámetro
   *
   * @param x un número entero positivo mayor a 2
   * @return menor numero primo mayor al número dado
   */
  public static long siguientePrimo(long x) {
    do {
      x++;
    } while (!esPrimo(x));
    return x;
  }

  /**
   * Dada una base y un exponente devuelve la potencia
   *
   * @param x (la base)
   * @param y (el exponente)
   * @return la potencia resultante.
   */
  public static long potencia(long x, long y) {
    return (long)(Math.pow( (double)x,(double)y));
  }

  /**
   * Cuenta el número de dígitos de un número entero.
   *
   * @param x número entero que se quiere contar
   * @return el número de dígitos que tiene x
   */
  public static long digitos(long x) {
    long volteado = 0;
    long digitos = 0;
    while (x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x = x / 10;
      digitos++;
    }
    return digitos;
  }

  /**
   * Le da la vuelta a un número entero
   *
   * @param x número que se quiere voltear
   * @return número volteado
   */
  public static long voltea(long x) {
    long volteado = 0;
    while (x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x = x / 10;
    }
    return volteado;
  }

  /**
   * Devuelve el dígito que está en la posición n de un número entero. Se
   * empieza contando por el 0 y de izquierda a derecha
   *
   * @param x número entero que se va a revisar.
   * @param n posición en la que está el dígito
   * @return dígito de la posición seleccionada.
   */
  public static long digitoN(long x, int n) {
    long invertido = voltea(x);
    for (int i = 0; i < n; i++) {
      invertido /= 10;
    }
    return invertido % 10;
  }

  /**
   * Da la posición de la primera ocurrencia de un dígito dentro de un número
   * entero. Si no se encuentra, devuelve -1
   *
   * @param x número entero que se va a revisar
   * @param n dígito que se busca
   * @return posición en la que aparece n
   */
  public static long posicionDeDigito(long x, int n) {
    long volteado = 0;
    int pos = 0;
    while (x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x = x / 10;
      pos++;
    }
    for (int i = 0; i < pos; i++) {
      if (volteado % 10 == n) {
        return (i + 1);
      }
      volteado /= 10;
    }
    return -1;
  }

  /**
   * Le quita a un número n dígitos por detrás (por la derecha)
   *
   * @param x número a manipular
   * @param n número de dígitos que se van a quitar
   * @return número con los dígitos quitados
   */
  public static long quitaPorDetras(long x, int n) {
    for (int i = 0; i < n; i++) {
      x /= 10;
    }
    return x;
  }

  /**
   * Le quita a un número n dígitos por delante (por la izquierda)
   *
   * @param x número a manipular
   * @param n número de dígitos que se van a quitar
   * @return número con los dígitos quitados
   */
  public static long quitaPorDelante(long x, int n) {
    long invertido = voltea(x);
    for (int i = 0; i < n; i++) {
      invertido /= 10;
    }
    long normal = voltea(invertido);
    return normal;
  }

  /**
   * Añade un dígito a un número entero por detrás
   *
   * @param x número a manipular
   * @param n dígito que se va a añadir
   * @return número con el dígito añadido
   */
  public static long pegaPorDetras(long x, long n) {
    return juntaNumeros(x, n);
  }

  /**
   * Añade un dígito a un número entero por delante
   *
   * @param x número a manipular
   * @param n dígito que se va a añadir
   * @return número con el dígito añadido
   */
  public static long pegaPorDelante(long x, long n) {
    return juntaNumeros(n, x);
  }

  /**
   * Toma como parámetros las posiciones inicial y final dentro de un número y
   * devuelve el trozo correspondiente.
   *
   * @param x número a trocear
   * @return número trozeado
   */
  public static long trozoDeNumero(long x) {
    long corteDer = quitaPorDetras(x, 1);
    long corteIzq = quitaPorDelante(corteDer, 1);
    return corteIzq;
    
  }
  /**
   * Pega dos números para formar uno
   *
   * @param x primer número
   * @param y segundo número
   * @return unión de ambos números
   */
 public static long juntaNumeros(long x, long y) {
    return (long)(x * potencia(10, digitos(y))) + y;
  }

}
