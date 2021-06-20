package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import empleado.values.Nombre;

public class EmpleadoCreado extends DomainEvent {
    private final Nombre nombre;

    public EmpleadoCreado(Nombre nombre){
        super("tiendadecalzado.empleado.empleadocreado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
