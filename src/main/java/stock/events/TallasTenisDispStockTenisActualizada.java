package stock.events;

import co.com.sofka.domain.generic.DomainEvent;
import stock.values.TallasTenisDisp;

public class TallasTenisDispStockTenisActualizada extends DomainEvent {

    private final TallasTenisDisp tallasTenisDisp;

    public TallasTenisDispStockTenisActualizada(TallasTenisDisp tallasTenisDisp){
        super("tiendadecalzado.stock.tallastenisdispstocktenisactualizada");
        this.tallasTenisDisp = tallasTenisDisp;
    }

    public TallasTenisDisp getTallasTenisDisp() {
        return tallasTenisDisp;
    }
}