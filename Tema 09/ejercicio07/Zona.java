package ejercicio07;

/**
 * Atributos: entradasPorVender
 *
 * Métodos:
 *
 * @author Rafael Aragón Rodríguez
 */
public class Zona {

  //Atributos
  private int entradasPorVender;

  public Zona(int n) {
    entradasPorVender = n;
  }

  public int getEntradasPorVender() {
    return entradasPorVender;
  }

  public void setEntradasPorVender(int entradasPorVender) {
    this.entradasPorVender = entradasPorVender;
  }

  //Métodos
  public void vender(int n) {
    if (this.entradasPorVender == 0) {
      System.out.println("Lo siento, no me quedan entradas.");
    } else if (this.entradasPorVender < n) {
      System.out.println("Me quedan " + this.entradasPorVender + " entradas.");
    }
    if (this.entradasPorVender >= n) {
      entradasPorVender -= n;
      System.out.println("Aquí tiene sus " + n + " entradas, gracias.");
    }
  }
}
