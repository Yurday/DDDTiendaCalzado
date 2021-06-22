package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import empleado.values.Descripcion;
import empleado.values.FuncionId;

public class DescripcionDeUnaFuncionActualizada extends DomainEvent {

    private final Descripcion descripcion;

    public DescripcionDeUnaFuncionActualizada(Descripcion descripcion){
        super("tiendadecalzado.empleado.descripciondeunafuncionactualizada");
        this.descripcion = descripcion;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
