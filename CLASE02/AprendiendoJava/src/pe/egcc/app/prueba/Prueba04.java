package pe.egcc.app.prueba;

import pe.egcc.app.model.Producto;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba04 {

  public static void main(String[] args) {
    
    Producto prod1 = new Producto();
    mostrar(prod1);
    
    Producto prod2 = new Producto("Televidor", 100, 3567.34, true);
    System.out.println("----------");
    mostrar(prod2);
    
  }

  private static void mostrar(Producto prod) {
    System.out.println("Nombre: " + prod.getNombre());
    System.out.println("Precio: " + prod.getPrecio());
    System.out.println("Stock: " + prod.getStock());
    System.out.println("Activo: " + prod.isActivo());
  }
}
