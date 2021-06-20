package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import empleado.values.Caracteristica;
import empleado.values.FuncionId;

public class CaracteristicaDeUnaFuncionActualizada extends DomainEvent {
    public CaracteristicaDeUnaFuncionActualizada(FuncionId entityId, Caracteristica caracteristica){
        super("tiendadecalzado.empleado.caracteristicadeunafuncionactualizada");
    }
}
