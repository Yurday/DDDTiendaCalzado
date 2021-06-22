package stock.events;

import co.com.sofka.domain.generic.DomainEvent;
import stock.values.CantidadTenisDisp;

public class CantTenisDispStockTenisActualizada extends DomainEvent {

    private final CantidadTenisDisp cantidadTenisDisp;

    public CantTenisDispStockTenisActualizada(CantidadTenisDisp cantidadTenisDisp){
        super("tiendadecalzado.stock.canttenisdispstocktenisactualizada");
        this.cantidadTenisDisp = cantidadTenisDisp;
    }

    public CantidadTenisDisp getCantidadTenisDisp() {
        return cantidadTenisDisp;
    }
}