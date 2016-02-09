
package pe.ghmv.pagoapp.service;

import pe.ghmv.pagoapp.dto.PagoDto;

public class PagoService {
    public void procesar(PagoDto dto)
    {
        //variables
        double ingresos,renta,neto;
        //proceso
        ingresos = dto.getDias()*dto.getPagoHora()*dto.getHorasDia();
        if(ingresos>1500)
        {
            renta=ingresos*0.08;
        }
        else
        {
            renta = 0.0;
        }
        neto = ingresos - renta;
        //reporte
        dto.setIngresos(ingresos);
        dto.setRenta(renta);
        dto.setNeto(neto);
    }
}
