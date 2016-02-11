package pe.egcc.model;

/**
 *
 * @author Gustavo Coronel
 */
public class Clase1 {
  
  protected final String CIUDAD = "LIMA";

  public Clase1() {
    System.out.println("Hola Javeros de SistemasUNI.");
    System.out.println("No se olviden de promocionar el siguiente curso.");
  }
  
  public Clase1(String nombre) {
    System.out.println("Hola amigo(a) " + nombre);
    System.out.println("Nos vemos en Java Cliente-Servidor" );
  }
  
  public int sumar(int n1, int n2){
    int value;
    value = n1 + n2;
    return value;
  }
  
  public int restar(int n1, int n2) {
    return (n1 - n2);
  }
  
}
