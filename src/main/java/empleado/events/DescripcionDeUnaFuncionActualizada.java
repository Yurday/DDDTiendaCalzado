package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import empleado.values.Descripcion;
import empleado.values.FuncionId;

public class DescripcionDeUnaFuncionActualizada extends DomainEvent {
    public DescripcionDeUnaFuncionActualizada(FuncionId entityId, Descripcion descripcion){
        super("tiendadecalzado.empleado.descripciondeunafuncionactualizada");
    }
}
