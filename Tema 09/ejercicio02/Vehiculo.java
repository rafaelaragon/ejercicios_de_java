package ejercicio02;

/**
 * kilometrosTotales
 * vehiculosCreados
 * 
 * kilometrosRecorridos
 * 
 * recorreKilometros
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Vehiculo {
  
  private static int kilometrosTotales = 0;
  private static int vehiculosCreados = 0;
  
  private int kilometrosRecorridos;

  public Vehiculo() {
    this.kilometrosRecorridos = 700;
  }

  public static int getKilometrosTotales() {
    return kilometrosTotales = 1200;
  }

  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }
  
   public void recorreKilometros(int k) {
    this.kilometrosRecorridos += k;
    Vehiculo.kilometrosTotales += k;
  }
}
