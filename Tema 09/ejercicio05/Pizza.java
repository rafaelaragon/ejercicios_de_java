package ejercicio05;

/**
 * Atributos: tamaño (tamano), tipo, estado.
 * 
 * Métodos: sirve.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Pizza {

  //Atributos
  private static int totalPedidas = 0;
  private static int totalServidas = 0;
  
  private String tamano;
  private String tipo;
  private String estado;
  
  public Pizza(String tipo, String tamano) {
    this.tipo = tipo;
    this.tamano = tamano;
    this.estado = "pedida.";
    Pizza.totalPedidas++;
  }
  
  @Override
  public String toString() {
    return "Pizza " + tipo + " " + tamano + ", " + estado;
  }
  
  public static int getTotalPedidas() {
    return Pizza.totalPedidas;
  }
  
  public static int getTotalServidas() {
    return Pizza.totalServidas;
  }

  //Métodos
  public void sirve() {
    if (estado.equals("pedida.")) {
      estado = "servida.";
      Pizza.totalServidas++;
    } else {
      System.out.println("La pizza está servida.");
    }
  }
}