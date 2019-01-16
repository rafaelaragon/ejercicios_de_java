package ejercicio06;

/**
 * Atributos: segundos.
 *
 * Métodos: suma, resta.
 *
 * @author Rafael Aragón Rodríguez
 */
public class Tiempo {

  //Atributos
  private int segundos;

  public Tiempo(int horas, int minutos, int segundos) {
    this.segundos = (horas * 3600) + (minutos * 60) + segundos;
  }

  public Tiempo(int segundos) {
    this.segundos = segundos;
  }

  public int getSegundos() {
    return this.segundos;
  }

  @Override
  public String toString() {
    int segundos = this.segundos;
    int horas = segundos / 3600;
    segundos -= horas * 3600;
    int minutos = segundos / 60;
    segundos -= minutos * 60;

    return horas + "h " + minutos + "min " + segundos + "sec";
  }

  //Métodos
  public Tiempo suma(Tiempo t) {
    return new Tiempo(this.segundos + t.getSegundos());
  }

  public Tiempo resta(Tiempo t) {
    return new Tiempo(this.segundos - t.getSegundos());
  }
}
