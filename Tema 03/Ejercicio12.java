/**
 * 
 * Crea un programa que calcule la nota que tienes que sacar en 
 * el segundo examen de Programación para obtener la media deseada.
 * 
 * La nota del primer examen cuenta un 40% y la del segundo un 60%.
 * 
 * @author Rafael Aragón Rodríguez
 */
public class Ejercicio12 {
  public static void main(String[] args) {
    System.out.println("Vamos a ver qué nota necesitas para que te de la media."); 
    System.out.print("Dime qué media quieres tener 'Con dos decimales' : ");
    String linea; 
    linea = System.console().readLine();
    double media = Double.parseDouble(linea);
    System.out.print("Dime qué nota sacaste en el primer examen 'Con dos decimales' : ");
    linea = System.console().readLine();
    double nota1 = Double.parseDouble(linea); 
    double nota2 = (media - (0.4 * nota1)) / 0.6;
    /**
     * 
     * He aplicado lo siguiente: Siendo la primera nota "a", la media "b" y
     * la segunda nota "x": ((0.4*a)+(0.6*x))=b; ==> (0.6*x)=b-(0.4*a); ==>
     * ==> x=(b-(0.4*a))/0.6;
     * 
     */
    System.out.printf("Para sacar un %.2f de media tienes que sacar un %.2f en el segundo.\n", media, nota2);
  }
}




