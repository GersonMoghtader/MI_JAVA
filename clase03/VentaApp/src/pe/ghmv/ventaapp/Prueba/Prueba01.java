package pe.ghmv.ventaapp.Prueba;

import pe.ghmv.ventaapp.dto.ItemDto;
import pe.ghmv.ventaapp.service.CompAbstract;
import pe.ghmv.ventaapp.service.FacturaService;

public class Prueba01 {
    public static void main(String[] args) {
        //dato
        double total = 567.34;
        //proceso
        CompAbstract comp = new FacturaService();
        ItemDto[] repo = comp.procesar(total);
        //reporte
        for(ItemDto dto: repo)
            
        {
            System.out.println(dto.getConcepto() + "|" + dto.getValor());
        }
    }
    
}
