package bodega.events;

import co.com.sofka.domain.generic.DomainEvent;

public class UbicacionDeUnaBodegaCambiada extends DomainEvent {
    public UbicacionDeUnaBodegaCambiada(){
        super("tiendadecalzado.bodega.ubicaciondeunabodegacambiada");
    }
}
