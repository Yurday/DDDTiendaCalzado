package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import empleado.values.Nombre;

public class NombreCambiado extends DomainEvent {
    public NombreCambiado(Nombre nombre){
        super("tiendadecalzado.empleado.nombrecambiado");
    }
}
