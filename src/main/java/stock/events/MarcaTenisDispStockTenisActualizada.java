package stock.events;

import co.com.sofka.domain.generic.DomainEvent;
import stock.values.MarcaTenisDisp;

public class MarcaTenisDispStockTenisActualizada extends DomainEvent {

    private final MarcaTenisDisp marcaTenisDisp;

    public MarcaTenisDispStockTenisActualizada(MarcaTenisDisp marcaTenisDisp){
        super("tiendadecalzado.stock.marcatenisdispstocktenisactualizada");
        this.marcaTenisDisp = marcaTenisDisp;
    }

    public MarcaTenisDisp getMarcaTenisDisp() {
        return marcaTenisDisp;
    }
}