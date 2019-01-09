package ejercicio01;

/**
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class PruebaCaballo {
  
  public static void main(String[] args) {
    
    Caballo c01 = new Caballo("Sardinilla", "Macho", "Canela");
    
    System.out.println(c01);
    c01.galopa();
    c01.relincha();
  }
}
