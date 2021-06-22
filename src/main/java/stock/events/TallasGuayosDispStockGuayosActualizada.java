package stock.events;

import co.com.sofka.domain.generic.DomainEvent;
import stock.values.TallasGuayosDisp;

public class TallasGuayosDispStockGuayosActualizada extends DomainEvent {

    private final TallasGuayosDisp tallasGuayosDisp;

    public TallasGuayosDispStockGuayosActualizada(TallasGuayosDisp tallasGuayosDisp){
        super("tiendadecalzado.stock.tallasguayosdispstockguayosactualizada");
        this.tallasGuayosDisp = tallasGuayosDisp;
    }

    public TallasGuayosDisp getTallasGuayosDisp() {
        return tallasGuayosDisp;
    }
}