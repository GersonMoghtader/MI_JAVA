
package pe.ghmv.pedidoapp.prueba;

import pe.ghmv.pedidoapp.service.PedidoService;

/**
 *
 * @author Alumno
 */
public class Prueba01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //dato
        double importe = 7890.0;
        //proces
        
        PedidoService service = new PedidoService();
        double impuesto = service.calcularImpuesto(importe);
        double total = service.calcularTotal(importe);
        //reporte
        System.out.println("importe:" + importe);
        System.out.println("impuesto:" + impuesto);
        System.out.println("total:" + total);
    }
    
}
