package stock.commands;

import co.com.sofka.domain.generic.Command;
import stock.values.MarcaGuayosDisp;
import stock.values.StockId;

public class ActualizarMarcaGuayosDispStockGuayos implements Command {

    private final StockId stockId;
    private final MarcaGuayosDisp marcaGuayosDisp;

    public ActualizarMarcaGuayosDispStockGuayos(StockId stockId, MarcaGuayosDisp marcaGuayosDisp){
        this.stockId = stockId;
        this.marcaGuayosDisp = marcaGuayosDisp;
    }

    public StockId getStockId() {
        return stockId;
    }

    public MarcaGuayosDisp getMarcaGuayosDisp() {
        return marcaGuayosDisp;
    }
}