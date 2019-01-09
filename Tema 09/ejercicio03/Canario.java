package ejercicio03;

/**
 * Métodos:
 * Canta
 * AvisaALosMinerosCuandoHayUnaFugaDeGas
 * ComeSemillas
 * 
 * Override:
 * Respira
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Canario extends Ave {
  
  // Métodos
  void canta() {
    System.out.println( "♪Is this the real life?♪\n" +
                        "♪Is this just fantasy?♪\n" +
                        "♪Caught in a landslide♪\n" +
                        "♪No escape from reality♪");
  }
  void avisaALosMinerosCuandoHayUnaFugaDeGas() {
    System.out.println("Me he muerto porque soy sensible a los gases tóxicos.");
  }
  void comeSemillas() {
    System.out.println("Crunch Crunch.");
  }
  
  @Override
  void respira() {
    System.out.println("-");
  }
}
