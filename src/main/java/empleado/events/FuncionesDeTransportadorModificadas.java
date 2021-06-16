package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;

public class FuncionesDeTransportadorModificadas extends DomainEvent {
    public FuncionesDeTransportadorModificadas(){
        super("sofka.empleado.funcionesdetransportadormodificadas");
    }
}
