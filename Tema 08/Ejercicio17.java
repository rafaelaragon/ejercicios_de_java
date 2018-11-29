package Ejercicios;

/**
 * Escribe un programa que pase de binario a decimal.
 *
 * @author Rafael Aragón Rodríguez
 *
 */
import java.util.Scanner;

public class Ejercicio17 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca el número binario: ");
    long binario = Long.parseLong(s.nextLine());

    long bin2 = binario;
    long decimal = 0;
    long digitos = matematicas.Varias.digitos(binario);
    long potencia = 0;

    for (long i = 0; i < digitos; i++) {
      if (bin2 % 10 == 1) {
        potencia = matematicas.Varias.potencia(2, i);
        decimal += potencia;
      }
      bin2 /= 10;
    }
    System.out.println(binario + " convertido a decimal vale " + decimal);
  }
}
