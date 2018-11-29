package Ejercicios;

/**
 * Pruebas para saber si funcionan correctamente las funciones.
 *
 * @author Rafael Aragón Rodríguez
 *
 */
import java.util.Scanner;
import matematicas.Varias;
import matematicas.Geometria;

public class PruebasFunciones {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    // esCapicúa
    System.out.print("Es o no capicúa: ");
    int capicua = Integer.parseInt(s.nextLine());
    if (matematicas.Varias.esCapicua(capicua)) {
      System.out.println(capicua + " es capicúa.");
    } else {
      System.out.println(capicua + " no es capicúa.");
    }
    
    //esPrimo
    System.out.print("Es o no primo: ");
    int primo = Integer.parseInt(s.nextLine());
    if (matematicas.Varias.esPrimo(primo)) {
      System.out.println(primo + " es primo.");
    } else {
      System.out.println(primo + " no es primo.");
    }
    
    //siguientePrimo
    System.out.print("Siguiente primo: ");
    int siguientePrimo = Integer.parseInt(s.nextLine());
    System.out.println(matematicas.Varias.siguientePrimo(siguientePrimo));
    
    //potencia
    System.out.print("Potencia, base: ");
    int base = Integer.parseInt(s.nextLine());
    System.out.print("Potencia, exponente: ");
    int exponente = Integer.parseInt(s.nextLine());
    System.out.println(matematicas.Varias.potencia(base,exponente));
    
    //digitos
    System.out.print("Dígitos: ");
    int digitos = Integer.parseInt(s.nextLine());
    System.out.println(matematicas.Varias.digitos(digitos));
    
    //voltea
    System.out.print("Voltea: ");
    int aGirar = Integer.parseInt(s.nextLine());
    System.out.println(matematicas.Varias.voltea(aGirar));
    
    //digitoN
    System.out.print("DigitoN, número: ");
    int numeroN = Integer.parseInt(s.nextLine());
    System.out.print("DigitoN, posición: ");
    int posicionN = Integer.parseInt(s.nextLine());
    System.out.println(matematicas.Varias.digitoN(numeroN, posicionN));
    
    //posicionDeDigito
    System.out.print("posicionDeDigito, número: ");
    int numeroP = Integer.parseInt(s.nextLine());
     System.out.print("posicionDeDigito, dígito: ");
    int digitoP = Integer.parseInt(s.nextLine());
    System.out.println(matematicas.Varias.posicionDeDigito(numeroP, digitoP));
    
    //quitaPorDetras
    System.out.print("quitaPorDetras, número: ");
    int numeroDetras = Integer.parseInt(s.nextLine());
     System.out.print("quitaPorDetras, posiciones: ");
    int posicionDetras = Integer.parseInt(s.nextLine());
    System.out.println(matematicas.Varias.quitaPorDetras(numeroDetras, posicionDetras));
    
     //quitaPorDelante
    System.out.print("quitaPorDelante, número: ");
    int numeroDelante = Integer.parseInt(s.nextLine());
     System.out.print("quitaPorDelante, posiciones: ");
    int posicionDelante = Integer.parseInt(s.nextLine());
    System.out.println(matematicas.Varias.quitaPorDelante(numeroDelante, posicionDelante));
    
    //pegaPorDetras
    System.out.print("pegaPorDetras, número: ");
    int numeroDetras1 = Integer.parseInt(s.nextLine());
     System.out.print("pegaPorDetras, dígito: ");
    int digitoDetras1 = Integer.parseInt(s.nextLine());
    System.out.println(matematicas.Varias.pegaPorDetras(numeroDetras1, digitoDetras1));
    
    //pegaPorDelante
    System.out.print("pegaPorDelante, número: ");
    int numeroDelante1 = Integer.parseInt(s.nextLine());
     System.out.print("pegaPorDelante, dígito: ");
    int digitoDelante1 = Integer.parseInt(s.nextLine());
    System.out.println(matematicas.Varias.pegaPorDetras(digitoDelante1, numeroDelante1));
    
    //trozoDeNumero
    System.out.print("Trozo de número: ");
    int trozoNum = Integer.parseInt(s.nextLine());
    System.out.println(matematicas.Varias.trozoDeNumero(trozoNum));
    
    //juntaNumeros
    System.out.print("juntaNumeros, n1: ");
    int n1 = Integer.parseInt(s.nextLine());
    System.out.print("juntaNumeros, n2: ");
    int n2 = Integer.parseInt(s.nextLine());
    System.out.println(matematicas.Varias.juntaNumeros(n1, n2));
    
    
  }
}
