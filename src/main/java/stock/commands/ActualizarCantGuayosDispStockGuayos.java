package stock.commands;

import co.com.sofka.domain.generic.Command;
import stock.values.CantidadGuayosDisp;
import stock.values.StockId;

public class ActualizarCantGuayosDispStockGuayos implements Command {

    private final StockId stockId;
    private final CantidadGuayosDisp cantidadGuayosDisp;

    public ActualizarCantGuayosDispStockGuayos(StockId stockId, CantidadGuayosDisp cantidadGuayosDisp){
        this.stockId = stockId;
        this.cantidadGuayosDisp = cantidadGuayosDisp;
    }

    public StockId getStockId() {
        return stockId;
    }

    public CantidadGuayosDisp getCantidadGuayosDisp() {
        return cantidadGuayosDisp;
    }
}