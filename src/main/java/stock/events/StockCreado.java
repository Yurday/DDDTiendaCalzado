package stock.events;

import co.com.sofka.domain.generic.DomainEvent;
import stock.entities.StockGuayos;
import stock.entities.StockTenis;
import stock.values.CantTotalStock;
import stock.values.StockId;

public class StockCreado extends DomainEvent {

    private final StockId stockId;
    private final CantTotalStock cantTotalStock;
    private final StockGuayos stockGuayos;
    private final StockTenis stockTenis;

    public StockCreado(StockId stockId, CantTotalStock cantTotalStock, StockGuayos stockGuayos, StockTenis stockTenis){
        super("tiendadecalzado.stock.stockcreado");
        this.stockId = stockId;
        this.cantTotalStock = cantTotalStock;
        this.stockGuayos = stockGuayos;
        this.stockTenis = stockTenis;
    }

    public StockId getStockId() {
        return stockId;
    }

    public CantTotalStock getCantTotalStock() {
        return cantTotalStock;
    }

    public StockGuayos getStockGuayos() {
        return stockGuayos;
    }

    public StockTenis getStockTenis() {
        return stockTenis;
    }
}