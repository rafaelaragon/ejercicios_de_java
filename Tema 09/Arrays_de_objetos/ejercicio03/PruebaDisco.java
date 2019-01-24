package ejercicio03;

/**
 * Realiza el programa “Colección de discos” por tu cuenta, mirando lo menos
 * posible el ejemplo que se proporciona. Pruébalo primero para ver cómo
 * funciona y luego intenta implementarlo tú mismo.
 *
 * @author Rafael Aragón Rodríguez
 */
public class PruebaDisco {

  public static void main(String[] args) {

    Disco[] d = new Disco[4];

    d[0] = new Disco("Bubble Gum", "De Staat", "Alternative Rock", "11");
    d[1] = new Disco("This Is The Third Album Of A Band Called Adebisi Shank",
            "Adebisi Shank", "Instrumental Rock", "9");
    d[2] = new Disco("Aproximaciones", "Fernando Lamadrid", "Jazz-Funk", "10");
    d[3] = new Disco("Mesmerize", "System of a Down", "Hard Rock  ", "11");

    for (int i = 0; i < 4; i++) {
      System.out.println("Disco nº" + (i + 1) + "\n");
      System.out.println("Título: " + d[i].getTitulo());
      System.out.println("Artista: " + d[i].getArtista());
      System.out.println("Género: " + d[i].getGenero());
      System.out.println("Pistas: " + d[i].getPistas());
      System.out.println();
    }
  }
}
