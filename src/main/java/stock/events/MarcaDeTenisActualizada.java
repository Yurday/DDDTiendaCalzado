package stock.events;

import co.com.sofka.domain.generic.DomainEvent;

public class MarcaDeTenisActualizada extends DomainEvent {
    public MarcaDeTenisActualizada(){
        super("tiendadecalzado.stock.marcadetenisactualizada");
    }
}
