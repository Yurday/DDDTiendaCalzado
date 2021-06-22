package stock.commands;

import co.com.sofka.domain.generic.Command;
import stock.values.CantTotalStock;
import stock.values.StockId;

public class ActualizarTotalStock implements Command {

    private final StockId stockId;
    private final CantTotalStock cantTotalStock;

    public ActualizarTotalStock(StockId stockId, CantTotalStock cantTotalStock){
        this.stockId = stockId;
        this.cantTotalStock = cantTotalStock;
    }

    public StockId getStockId() {
        return stockId;
    }

    public CantTotalStock getCantTotalStock() {
        return cantTotalStock;
    }
}