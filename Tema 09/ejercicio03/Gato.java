package ejercicio03;

/**
 * Métodos:
 * Araña
 * EscupeBolasDePelo
 * MaullaPorqueEstaEnCelo
 * 
 * Override:
 * SienteEmociones
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Gato extends Mamifero {
  
  // Métodos
  
  void araña() {
    System.out.println("Scratch, [te he transmitido la rabia]");
  }
  void escupeBolasDePelo() {
    System.out.println("¡BUAAAARGH! He escupido una bola de pelo.");
  }
  void maullaPorqueEstaEnCelo() {
    System.out.println("MIAAAAAAAAAAAAAAAAAAAU, maullo porque estoy en celo.");
  }
  
  @Override
  void sienteEmociones() {
    System.out.println("Puedo sentir emociones como el asco o la envidia, pero"
            + " nunca sentiré afecto por los humanos.");
  } 
}
