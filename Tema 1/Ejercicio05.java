/**
*Muestra el horario de clase. Añade colores y bordes si es posible.
*
*@author Rafael Aragón Rodríguez
*/
public class Ejercicio05 {
  public static void main(String[] args) {
    String rojo="\033[31m";
    String verde="\033[32m";
    String naranja="\033[33m";
    String azul="\033[34m";
    String morado="\033[35m";
    String blanco="\033[37m";
    System.out.println("Lunes Martes Miércoles Jueves Viernes");
    System.out.println(morado + " EED" + rojo +"   SINF" + azul + "    PRO" + azul +"      PRO" + rojo + "    SINF");
    System.out.println(blanco + " LM" + rojo +"    SINF" + azul + "    PRO" + azul + "      PRO" + rojo +"    SINF");
    System.out.println(blanco +" LM" + rojo +"    SINF" + azul + "    PRO" + morado + "      EED" + rojo +"    SINF");
    System.out.println(verde + " BBDD" + azul + "  PRO" + verde + "     BBDD" + morado + "     EED" + naranja +"    FOL");
    System.out.println(verde +" BBDD" + azul + "  PRO" + verde + "     BBDD" + blanco +"     LM" + naranja +"     FOL");
    System.out.println(verde + " BBDD" + azul + "  PRO" + verde + "     BBDD" + blanco +"     LM" + naranja +"     FOL");
  }
}
