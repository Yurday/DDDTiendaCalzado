package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;

public class FuncionesDeBodegueroModificadas extends DomainEvent {
    public FuncionesDeBodegueroModificadas(){
        super("sofka.empleado.funcionesdebodegueromodificadas");
    }
}
