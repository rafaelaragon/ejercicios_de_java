package ejercicio03;

/**
 * Atributos: titulo, artista, genero, pistas
 *
 * @author Rafael Aragón Rodríguez
 */
public class Disco {

  private String titulo;
  private String artista;
  private String genero;
  private String pistas;

  //Getters
  public String getTitulo() {
    return titulo;
  }

  public String getArtista() {
    return artista;
  }

  public String getGenero() {
    return genero;
  }

  public String getPistas() {
    return pistas;
  }

  //Setters
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setArtista(String artista) {
    this.artista = artista;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public void setPistas(String pistas) {
    this.pistas = pistas;
  }

  //Constructores
  public Disco(String titulo, String artista, String genero, String pistas) {
    this.titulo = titulo;
    this.artista = artista;
    this.genero = genero;
    this.pistas = pistas;
  }

}
