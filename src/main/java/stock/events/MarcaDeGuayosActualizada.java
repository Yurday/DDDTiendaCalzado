package stock.events;

import co.com.sofka.domain.generic.DomainEvent;

public class MarcaDeGuayosActualizada extends DomainEvent {
    public MarcaDeGuayosActualizada (){
        super("sofka.stock.marcadeguayosactualizada");
    }
}
