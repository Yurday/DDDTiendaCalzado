package bodega.events;

import co.com.sofka.domain.generic.DomainEvent;

public class CapacidadDeUnaBodegaCambiada extends DomainEvent {
    public CapacidadDeUnaBodegaCambiada (){
        super ("sofka.bodega.capacidaddeunabodegacambiada");
    }
}
