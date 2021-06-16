package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;

public class CaracteristicaDeUnaFuncionActualizada extends DomainEvent {
    public CaracteristicaDeUnaFuncionActualizada(){
        super("sofka.empleado.caracteristicadeunafuncionactualizada");
    }
}
