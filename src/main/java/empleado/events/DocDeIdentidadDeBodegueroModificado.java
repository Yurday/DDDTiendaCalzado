package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;

public class DocDeIdentidadDeBodegueroModificado extends DomainEvent {
    public DocDeIdentidadDeBodegueroModificado(){
        super("sofka.empleado.docdeidentidaddebodegueromodificado");
    }
}
