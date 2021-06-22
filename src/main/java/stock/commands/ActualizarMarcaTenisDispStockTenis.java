package stock.commands;

import co.com.sofka.domain.generic.Command;
import stock.values.MarcaTenisDisp;
import stock.values.StockId;

public class ActualizarMarcaTenisDispStockTenis implements Command {

    private final StockId stockId;
    private final MarcaTenisDisp marcaTenisDisp;

    public ActualizarMarcaTenisDispStockTenis(StockId stockId, MarcaTenisDisp marcaTenisDisp){
        this.stockId = stockId;
        this.marcaTenisDisp = marcaTenisDisp;
    }

    public StockId getStockId() {
        return stockId;
    }

    public MarcaTenisDisp getMarcaTenisDisp() {
        return marcaTenisDisp;
    }
}
