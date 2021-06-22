package stock.commands;

import co.com.sofka.domain.generic.Command;
import stock.values.StockId;
import stock.values.TallasGuayosDisp;

public class ActualizarTallasGuayosDispStockGuayos implements Command {

    private final StockId stockId;
    private final TallasGuayosDisp tallasGuayosDisp;

    public ActualizarTallasGuayosDispStockGuayos(StockId stockId, TallasGuayosDisp tallasGuayosDisp){
        this.stockId = stockId;
        this.tallasGuayosDisp = tallasGuayosDisp;
    }

    public StockId getStockId() {
        return stockId;
    }

    public TallasGuayosDisp getTallasGuayosDisp() {
        return tallasGuayosDisp;
    }
}