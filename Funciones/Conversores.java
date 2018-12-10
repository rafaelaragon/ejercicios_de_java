package matematicas;

/**
 * Funciones matemáticas sobre geometría.
 *
 * @author Rafael Aragón Rodríguez
 */
public class Conversores {

  /**
   * Conversor de binario a decimal
   *
   * @param x número binario que quieres convertir a decimal
   * @return número convertido a decimal
   */
  public static long binDec(long x) {
    long decimal = 0;
    long digitos = matematicas.Varias.digitos(x);
    for (int i = 0; i < digitos; i++) {
      long posicion = matematicas.Varias.digitoN(x, i);
      if (posicion == 1) {
        long potencia = matematicas.Varias.potencia(2, digitos - i - 1);
        decimal += potencia;
      }
    }
    return decimal;
  }

  /**
   * Conversor de decimal a binario
   *
   * @param x número decimal que quieres convertir a binario
   * @return número convertido a binario
   */
  public static String decBin(long x) {
    String binario = Long.toString(x,2);
    return binario;
  }
  
  /**
   * Conversor de decimal a cualquier base
   * 
   * @param x número en base 10
   * @param b base a la que x se quiere convertir
   * @return número convertido a la base seleccionada
   */
  public static String conversorBase10 (long x, int b) {
    return Long.toString(x,b);
  }
  
  /**
   * Conversor entre bases 2, 8, 10 y 16
   * 
   * @param x número a convertir
   * @param b1 base en la que está escrito
   * @param b2 base a la que x se quiere convertir
   * @return número convertido a la base seleccionada
   */
  public static String conversorPrincipal (String x, int b1, int b2) {
    String convertido = "";
    int base10 = 0;
    switch (b1) {
      case 10:
        base10 = Integer.parseInt(x);
        break;   
      default:
        base10 = Integer.parseInt(x,b1);
        break;
    }
    convertido = matematicas.Conversores.conversorBase10(base10, b2);
    return convertido;
  }
}
