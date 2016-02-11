package pe.egcc.app.prueba;

import pe.egcc.app.service.MateService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba03 {
  
  public static void main(String[] args) {
    
    MateService service = new MateService();
    System.out.println("Prom. 12 y 13: " + service.promedio(12,13));
    System.out.println("Prom. 12.0 y 13: " + service.promedio(12.0,13));
    System.out.println("Prom. 12 y 13.0: " + service.promedio(12,13.0));
    System.out.println("Prom. 12.0 y 13.0: " + service.promedio(12.0,13.0));
            
  }
}
