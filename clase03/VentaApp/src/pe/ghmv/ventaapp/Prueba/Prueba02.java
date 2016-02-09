package pe.ghmv.ventaapp.Prueba;

import pe.ghmv.ventaapp.dto.ItemDto;
import pe.ghmv.ventaapp.service.CompAbstract;
import pe.ghmv.ventaapp.service.ComprobanteFactory;


public class Prueba02 {
    public static void main(String[] args) {
        //dato
        double total = 567.34;
        String tipo = ComprobanteFactory.COMP_FACTURA;
        //proceso
        CompAbstract comp = ComprobanteFactory.obtenerComp(tipo);
        ItemDto[] repo = comp.procesar(total);
        //reporte
        for(ItemDto dto: repo)
            
        {
            System.out.println(dto.getConcepto() + "|" + dto.getValor());
        }
    }
    
}
