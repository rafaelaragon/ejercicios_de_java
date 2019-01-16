package ejercicio05;

/**
 * Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
 * se necesita saber el tamaño - mediana o familiar - el tipo - margarita,
 * cuatro quesos o funghi - y su estado - pedida o servida. La clase debe
 * almacenar información sobre el número total de pizzas que se han pedido y que
 * se han servido. Siempre que se crea una pizza nueva, su estado es “pedida”.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class PruebaPizza {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    Pizza p1 = new Pizza("margarita", "mediana");
    Pizza p2 = new Pizza("funghi", "familiar");
    p2.sirve();
    Pizza p3 = new Pizza("cuatro quesos", "mediana");
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    p2.sirve();
    System.out.println("Pedidas: " + Pizza.getTotalPedidas());
    System.out.println("Servidas: " + Pizza.getTotalServidas());
  }
}
