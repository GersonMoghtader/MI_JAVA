
package pe.ghmv.ventaapp.service;

import pe.ghmv.ventaapp.dto.ItemDto;

public abstract class CompAbstract {
    protected final double IGV=0.18;
    protected final double SERVICIO=0.10;
    
    public abstract ItemDto[] procesar(double total);
}
