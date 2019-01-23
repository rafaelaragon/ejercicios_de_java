package ejercicio01;

/**
 * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
 * muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
 * todo el ArrayList sin usar ningún índice.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.ArrayList;

public class Ejercicio01 {

  public static void main(String[] args) {
    ArrayList<String> nombre = new ArrayList<>();
    
    nombre.add("Rafael");
    nombre.add("Juan Luis");
    nombre.add("José");
    nombre.add("Laura");
    nombre.add("Ernesto");
    nombre.add("Iván");
    for (String n : nombre) {
      System.out.println(n);
    }
  }
}
