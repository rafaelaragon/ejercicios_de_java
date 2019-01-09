package ejercicio04;

/**
 * Atributos: Numerador Denominador
 *
 * Métodos: Invierte Simplifica Multiplica División
 *
 * @author Rafael Aragón Rodríguez
 */
public class Fraccion {

  //Atributos
  private static int numerador;
  private static int denominador;

  public static int getNumerador() {
    return numerador;
  }

  public static int getDenominador() {
    return denominador;
  }

  public static void setNumerador(int numerador) {
    Fraccion.numerador = numerador;
  }

  public static void setDenominador(int denominador) {
    Fraccion.denominador = denominador;
  }

  //Métodos
  public void invierte() {
    int aux = numerador;
    numerador = denominador;
    denominador = aux;
  }

  public void simplifica() {
    for (int i = 2; i < (numerador + denominador); i++) {
      if ((numerador % i == 0) && (denominador % i == 0)) {
        numerador /= i;
        denominador /= i;
      }
    }
  }

  public void multiplica(int n) {
    numerador *= n;
  }

  public void divide(int n) {
    numerador /= n;
  }
}
