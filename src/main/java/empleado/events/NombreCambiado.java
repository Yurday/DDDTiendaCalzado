package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import empleado.values.Nombre;

public class NombreCambiado extends DomainEvent {

    private final Nombre nombre;

    public NombreCambiado(Nombre nombre){
        super("tiendadecalzado.empleado.nombrecambiado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
