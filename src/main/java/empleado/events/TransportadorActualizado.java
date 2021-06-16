package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;

public class TransportadorActualizado extends DomainEvent {
    public TransportadorActualizado(){
        super("sofka.empleado.transportadoractualizado");
    }
}
