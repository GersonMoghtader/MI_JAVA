
package pe.ghmv.pagoapp.prueba;

import pe.ghmv.pagoapp.dto.PagoDto;
import pe.ghmv.pagoapp.service.PagoService;

public class Prueba01 {
    public static void main(String[] args) {
        //dato
        PagoDto dto = new PagoDto();
        dto.setHorasDia(6);
        dto.setDias(20);
        dto.setPagoHora(140);
        //proceso
        PagoService service = new PagoService();
        service.procesar(dto);
        //reporte
        System.out.println("Ingresos:"+ dto.getIngresos());
        System.out.println("Renta:"+dto.getRenta());
        System.out.println("Neto:"+dto.getNeto());
    }
}
