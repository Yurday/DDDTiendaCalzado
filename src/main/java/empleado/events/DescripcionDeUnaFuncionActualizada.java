package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;

public class DescripcionDeUnaFuncionActualizada extends DomainEvent {
    public DescripcionDeUnaFuncionActualizada(){
        super("sofka.empleado.descripciondeunafuncionactualizada");
    }
}
