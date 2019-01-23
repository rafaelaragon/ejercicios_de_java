package ejercicio01;

/**
 *
 * @author Rafael Aragón Rodríguez
 */
public class Gato {
  
  private String nombre;
  private String raza;

  public Gato(String nombre, String raza) {
    this.nombre = nombre;
    this.raza = raza;
  }

  public String getNombre() {
    return nombre;
  }

  public String getRaza() {
    return raza;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }
  
  
}
