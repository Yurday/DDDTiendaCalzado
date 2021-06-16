package stock.events;

import co.com.sofka.domain.generic.DomainEvent;

public class StockDeGuayosActualizado extends DomainEvent {
    public StockDeGuayosActualizado(){
        super("sofka.stock.stockdeguayosactualizado");
    }
}
