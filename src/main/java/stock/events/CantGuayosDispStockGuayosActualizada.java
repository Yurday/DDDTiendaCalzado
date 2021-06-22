package stock.events;

import co.com.sofka.domain.generic.DomainEvent;
import stock.values.CantidadGuayosDisp;

public class CantGuayosDispStockGuayosActualizada extends DomainEvent {

    private final CantidadGuayosDisp cantidadGuayosDisp;

    public CantGuayosDispStockGuayosActualizada(CantidadGuayosDisp cantidadGuayosDisp){
        super("tiendadecalzado.stock.cantguayosdispstockguayosactualizada");
        this.cantidadGuayosDisp = cantidadGuayosDisp;
    }

    public CantidadGuayosDisp getCantidadGuayosDisp() {
        return cantidadGuayosDisp;
    }
}