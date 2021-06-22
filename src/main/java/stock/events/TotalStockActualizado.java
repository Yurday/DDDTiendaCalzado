package stock.events;

import co.com.sofka.domain.generic.DomainEvent;
import stock.values.CantTotalStock;

public class TotalStockActualizado extends DomainEvent {

    private final CantTotalStock cantTotalStock;
    public TotalStockActualizado(CantTotalStock cantTotalStock){
        super("tiendadecalzado.stock.totalstockactualizado");
        this.cantTotalStock = cantTotalStock;
    }

    public CantTotalStock getCantTotalStock() {
        return cantTotalStock;
    }
}