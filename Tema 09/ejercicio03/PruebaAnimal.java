package ejercicio03;

/**
 * Crea las clases: Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y
 * Lagarto. Crea, al menos, tres métodos específicos de cada clase y redefine
 * el/los método/s cuando sea necesario. Prueba las clases creadas en un
 * programa en el que se instancien objetos y se les apliquen métodos.
 *
 * @author Rafael Aragón Rodríguez
 */
import java.util.Scanner;

public class PruebaAnimal {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    Animal a01 = new Animal();
    a01.respira();
    a01.bebe();
    a01.duerme();
    
    System.out.println();
    
    Mamifero m01 = new Mamifero();
    m01.puedeTransmitirLaRabia();
    m01.sienteEmociones();
    m01.tienePezones();
    
    System.out.println();
    
    Ave av01 = new Ave();
    av01.puedeTransmitirLaGripeAviar();
    av01.tienePlumas();
    av01.vuela();
    
    System.out.println();
    
    Canario c01 = new Canario();
    c01.avisaALosMinerosCuandoHayUnaFugaDeGas();
    c01.canta();
    c01.comeSemillas();
    c01.respira();
    
    System.out.println();
    
    Gato g01 = new Gato();
    g01.araña();
    g01.escupeBolasDePelo();
    g01.maullaPorqueEstaEnCelo();
    g01.sienteEmociones();
    
    System.out.println();
    
    Lagarto l01 = new Lagarto();
    l01.poseeConductasInstintivas();
    l01.puedeTransmitirLaSalmonelosis();
    l01.tomaElSol();
    
    System.out.println();
    
    Perro p01 = new Perro();
    p01.correCuandoTienePesadillas();
    p01.ladraAlCartero();
    p01.recuperaLaPelotaQuePierdeSuAmo();
    
    System.out.println();
    
    Pinguino pi01 = new Pinguino();
    pi01.seResbalaMientrasCamina();
    pi01.viveEnElPoloSur();
    pi01.vuela();
  }
}
