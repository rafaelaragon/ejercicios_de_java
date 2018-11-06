/**
 * 
 * Crea un programa que calcule medias de números. El usuario decide cuándoo parar.
 * 
 * @author Rafael Aragón Rodríguez
 */
 public class Ejercicio10 {
  public static void main(String[] args) {
    double numero = 0;;
    double numeros = 0;
    double media = 0;
    int i = 0;
    System.out.println("Este programa calcula la media de varios números dados por el usuario.");
    System.out.println(" ");
    while (numero >= 0) {
      System.out.println("Introduce un número (que sea negativo para finalizar ): ");
      numero = Double.parseDouble(System.console().readLine());
      if (numero < 0) {
        break;
      }
      else {
      numeros = numeros + numero;
      i++;
      }
    }
      media = numeros / i;
      System.out.printf("La media de los números es: %.2f \n", media);
    
  }
}
