package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;

public class DocDeIdentidadDeTransportadorModificado extends DomainEvent {
    public DocDeIdentidadDeTransportadorModificado(){
        super("sofka.empleado.docdeidentidaddetransportadormodificado");
    }
}
