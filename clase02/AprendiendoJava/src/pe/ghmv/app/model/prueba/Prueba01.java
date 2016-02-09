
package pe.ghmv.app.model.prueba;

import pe.ghmv.app.model.Producto;

/**
 *
 * @author Alumno
 */
public class Prueba01 {
    public static void main(String[] args) {
        Producto prod1 = new Producto();
        mostrar(prod1);
        prod1.setNombre("Laptop");
        prod1.setPrecio(5000.0);
        System.out.println("--------------");
        mostrar(prod1);
    }

    private static void mostrar(Producto prod) {
        System.out.println("nombre: "+ prod.getNombre());
        System.out.println("precio: "+ prod.getPrecio());
        System.out.println("Stock: "+ prod.getStock());
        System.out.println("Activo:"+ prod.isActivo());
    }
    
}
