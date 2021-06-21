package bodega.events;

import co.com.sofka.domain.generic.DomainEvent;

public class DireccionDeUbicacionBodegaCambiada extends DomainEvent {

    private final Ubicacion ubicacion;

    public DireccionDeUbicacionBodegaCambiada(Ubicacion ubicacion){
        super("tiendadecalzado.bodega.ubicaciondeunabodegacambiada");
        this.ubicacion = ubicacion;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}