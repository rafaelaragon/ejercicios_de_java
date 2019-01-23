package ejercicio02;

/**
 * Atributos: nombre, color, raza
 *
 * @author Rafael Aragón Rodríguez
 */
public class Gato {

  private String nombre;
  private String color;
  private String raza;
  
  //Getters
  
  public String getNombre() {
    return nombre;
  }

  public String getColor() {
    return color;
  }

  public String getRaza() {
    return raza;
  }
  //Setters
  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  //Constructores
  
  public Gato() {
  }
  
  public Gato(String nombre, String color, String raza) {
    this.nombre = nombre;
    this.color = color;
    this.raza = raza;
  }

  
  
}
