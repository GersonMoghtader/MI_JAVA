package pe.egcc.app.model;

/**
 *
 * @author Gustavo Coronel
 */
public class Producto {

  private String nombre;
  private int stock;
  private double precio;
  private boolean activo;

  /**
   * Constructor por defecto.
   */
  public Producto() {
    this.nombre = "Curso Java";
    this.precio = 300.0;
    this.stock = 20;
    this.activo = true;
    System.out.println("Objeto creado.");
  }

  /**
   * Constructor con parametros.
   * 
   * @param nombre Nombre del producto.
   * @param stock Stock del producto.
   * @param precio Precio del producto.
   * @param activo Estado del producto. 
   *               Si no esta a la venta es false.
   */
  public Producto(String nombre, int stock, double precio, boolean activo) {
    this.nombre = nombre;
    this.stock = stock;
    this.precio = precio;
    this.activo = activo;
  }
  
  @Override
  protected void finalize() throws Throwable {
    super.finalize(); 
    System.err.println("Chau objeto.");
  }
  
  
    
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public boolean isActivo() {
    return activo;
  }

  public void setActivo(boolean activo) {
    this.activo = activo;
  }

}
