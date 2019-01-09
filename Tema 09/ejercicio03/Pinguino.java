package ejercicio03;

/**
 * Métodos:
 * IntentaVolarSinExito
 * SeResbalaMientrasCamina
 * ViveEnElPoloSur
 * 
 * Override:
 * Vuela
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Pinguino extends Ave {
  
  // Métodos
  
  void seResbalaMientrasCamina() {
    System.out.println("Plaf.");
  }
  void viveEnElPoloSur() {
    System.out.println("¡Qué bien se vive en el Polo Sur, qué pena me dan "
            + "los osos polares!");
  }
  
  @Override
  void vuela() {
    System.out.println("Ñeeeeeeh.");
  }
}
