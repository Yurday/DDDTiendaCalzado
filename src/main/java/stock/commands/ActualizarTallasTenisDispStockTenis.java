package stock.commands;

import co.com.sofka.domain.generic.Command;
import stock.values.StockId;
import stock.values.TallasTenisDisp;

public class ActualizarTallasTenisDispStockTenis implements Command {

    private final StockId stockId;
    private final TallasTenisDisp tallasTenisDisp;

    public ActualizarTallasTenisDispStockTenis(StockId stockId, TallasTenisDisp tallasTenisDisp){
        this.stockId = stockId;
        this.tallasTenisDisp = tallasTenisDisp;
    }

    public StockId getStockId() {
        return stockId;
    }

    public TallasTenisDisp getTallasTenisDisp() {
        return tallasTenisDisp;
    }
}