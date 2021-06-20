package stock.events;

import co.com.sofka.domain.generic.DomainEvent;

public class StockDeTenisActualizado extends DomainEvent {

    public StockDeTenisActualizado(){
        super("tiendadecalzado.stock.stockdetenisactualizado");
    }
}
