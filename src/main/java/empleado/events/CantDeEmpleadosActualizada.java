package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;

public class CantDeEmpleadosActualizada extends DomainEvent {
    public CantDeEmpleadosActualizada(){
        super("sofka.empleado.cantdeempleadosactualizada");
    }
}
