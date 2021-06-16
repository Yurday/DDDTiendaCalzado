package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;

public class EmpleadoCreado extends DomainEvent {
    public EmpleadoCreado(){
        super("sofka.empleado.empleadocreado");
    }
}
