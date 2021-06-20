package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;

public class DocIdentidadCambiado extends DomainEvent {
    public DocIdentidadCambiado(){
        super("tiendadecalzado.empleado.docidentidadcambiado ");
    }
}
