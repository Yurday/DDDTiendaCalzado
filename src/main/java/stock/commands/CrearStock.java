package stock.commands;

import co.com.sofka.domain.generic.Command;
import stock.entities.StockGuayos;
import stock.entities.StockTenis;
import stock.values.CantTotalStock;
import stock.values.StockId;

public class CrearStock implements Command {

    private final StockId stockId;
    private final CantTotalStock cantTotalStock;
    private final StockTenis stockTenis;
    private final StockGuayos stockGuayos;

    public CrearStock(StockId stockId, CantTotalStock cantTotalStock, StockTenis stockTenis, StockGuayos stockGuayos){
        this.stockId = stockId;
        this.cantTotalStock = cantTotalStock;
        this.stockTenis = stockTenis;
        this.stockGuayos = stockGuayos;
    }

    public StockId getStockId() {
        return stockId;
    }

    public CantTotalStock getCantTotalStock() {
        return cantTotalStock;
    }

    public StockTenis getStockTenis() {
        return stockTenis;
    }

    public StockGuayos getStockGuayos() {
        return stockGuayos;
    }
}
