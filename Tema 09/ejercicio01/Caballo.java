package ejercicio01;

/**
 * nombre
 * sexo
 * color
 * 
 * @author java
 */
public class Caballo {
  
  private String nombre;
  private String sexo;
  private String color;

  public Caballo(String nombre, String sexo, String color) {
    this.nombre = nombre;
    this.sexo = sexo;
    this.color = color;
  }

  public String getNombre() {
    return nombre;
  }

  public String getSexo() {
    return sexo;
  }

  public String getColor() {
    return color;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public void setColor(String color) {
    this.color = color;
  }

  // Métodos
  
  void galopa() {
    System.out.println("Trococotró");
  }
  
  void relincha() {
    System.out.println("(Relincho)");
  }
  
  @Override
  public String toString() {
    return "Caballo:"
            + "\n==============================\n"
            + " Nombre: " + nombre + "\n Sexo: " + sexo + "\n Color: " + color 
            + "\n==============================\n";
    
  }
  
 
  
  
}
