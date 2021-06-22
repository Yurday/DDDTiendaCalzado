package stock.commands;

import co.com.sofka.domain.generic.Command;
import stock.values.CantidadTenisDisp;
import stock.values.StockId;

public class ActualizarCantTenisDispStockTenis implements Command {

    private final StockId stockId;
    private final CantidadTenisDisp cantidadTenisDisp;

    public ActualizarCantTenisDispStockTenis(StockId stockId, CantidadTenisDisp cantidadTenisDisp){
        this.stockId = stockId;
        this.cantidadTenisDisp = cantidadTenisDisp;
    }

    public StockId getStockId() {
        return stockId;
    }

    public CantidadTenisDisp getCantidadTenisDisp() {
        return cantidadTenisDisp;
    }
}