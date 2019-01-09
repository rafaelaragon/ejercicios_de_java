package ejercicio03;

/**
 * Métodos:
 * PuedeTransmitirLaGripeAviar
 * Vuela
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ave extends Animal {
  
  // Métodos
  void puedeTransmitirLaGripeAviar() {
    System.out.println("¡Oh no! ¡Puedo transmitir la gripe aviar!");
  }
  void vuela() {
    System.out.println("Wooosh");
  }
  void tienePlumas() {
    System.out.println("Soy capaz de crear apéndices integumentarios, que se "
            + "forman a partir de la epidermis y la dermis usando mecanismos "
            + "que involucran inducción reciproca entre dichos tejidos.");
  }
}
