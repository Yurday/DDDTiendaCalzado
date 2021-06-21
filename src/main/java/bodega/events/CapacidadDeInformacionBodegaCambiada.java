package bodega.events;

import bodega.values.Capacidad;
import co.com.sofka.domain.generic.DomainEvent;

public class CapacidadDeInformacionBodegaCambiada extends DomainEvent {

    private final Capacidad capacidad;

    public CapacidadDeInformacionBodegaCambiada(Capacidad capacidad){
        super ("tiendadecalzado.bodega.capacidaddeunabodegacambiada");
        this.capacidad = capacidad;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }
}