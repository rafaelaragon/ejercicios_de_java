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
    this.kilometrosRecorridos = 0;
  }

  public static int getKilometrosTotales() {
    return Vehiculo.kilometrosTotales;
  }

  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }
  
   public void recorreKilometros(int k) {
    this.kilometrosRecorridos += k;
    Vehiculo.kilometrosTotales += k;
  }
}
