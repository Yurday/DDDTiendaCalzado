package bodega.events;

import bodega.values.Capacidad;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeBodegaCambiado extends DomainEvent {

    private final Capacidad capacidad;

    public NombreDeBodegaCambiado(Capacidad capacidad){
        super ("tiendadecalzado.bodega.capacidaddeunabodegacambiada");
        this.capacidad = capacidad;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }
}