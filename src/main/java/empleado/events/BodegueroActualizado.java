package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;

public class BodegueroActualizado extends DomainEvent {
    public BodegueroActualizado(){
    super("sofka.empleado.bodegueroactualizado");
    }
}
