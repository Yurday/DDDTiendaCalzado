package stock.events;

import co.com.sofka.domain.generic.DomainEvent;

public class TotalStockActualizado extends DomainEvent {
    public TotalStockActualizado(){
        super("sofka.stock.totalstockactualizado");
    }
}
