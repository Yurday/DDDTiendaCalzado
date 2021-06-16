package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeTransportadorModificado extends DomainEvent {
    public NombreDeTransportadorModificado(){
        super("sofka.empleado.nombredetransportadormodificado");
    }
}
