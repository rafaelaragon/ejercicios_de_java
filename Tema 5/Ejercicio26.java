package tema05;

/**
 * Realiza un programa que pida primero un número y a continuación un dígito.
 * El programa nos debe dar la posición (o posiciones) contando de izquierda a
 * derecha que ocupa ese dígito en el número introducido.
 * 
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class Ejercicio26 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa te dice la posición del dígito que elijas de un número que des.");
    System.out.print("Introduzca el número: ");
    int numero = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca el dígito a saber (de izquierda a derecha): ");
    int digito = Integer.parseInt(s.nextLine());
    System.out.println("El dígito " + digito + " está en la(s) siguiente(s) posición(es): ");
    
    int aux = numero;
    int girado = 0;
    int posicion = 1;
    int longitud = 0;
    
    if (aux == 0) {
      longitud = 1;
    }
    
    while (aux > 0) {
      girado = (girado * 10) + (aux % 10);
      aux /= 10;
      longitud++;
    }
    
    while (girado > 0) {
      if ((girado % 10) == digito) {
        System.out.print(posicion + " ");
      }
      girado /= 10;
      posicion++;
    }

    System.out.println();
  }
}
