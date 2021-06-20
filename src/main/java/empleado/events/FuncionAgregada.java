package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import empleado.values.Caracteristica;
import empleado.values.Descripcion;
import empleado.values.FuncionId;

public class FuncionAgregada extends DomainEvent {
    public FuncionAgregada(FuncionId entityId, Caracteristica caracteristica, Descripcion descripcion){
        super("tiendadecalzado.empleado.funcionagregada");
    }
}
