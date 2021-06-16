package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;

public class NombreCambiado extends DomainEvent {
    public NombreCambiado(){
        super("sofka.empleado.nombrecambiado");
    }
}
