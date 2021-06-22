package stock.events;

import co.com.sofka.domain.generic.DomainEvent;
import stock.values.MarcaGuayosDisp;

public class MarcaGuayosDispStockGuayosActualizada extends DomainEvent {

    private final MarcaGuayosDisp marcaGuayosDisp;

    public MarcaGuayosDispStockGuayosActualizada(MarcaGuayosDisp marcaGuayosDisp){
        super("tiendadecalzado.stock.marcaguayosdispstockguayosactualizada");
        this.marcaGuayosDisp = marcaGuayosDisp;
    }

    public MarcaGuayosDisp getMarcaGuayosDisp() {
        return marcaGuayosDisp;
    }
}