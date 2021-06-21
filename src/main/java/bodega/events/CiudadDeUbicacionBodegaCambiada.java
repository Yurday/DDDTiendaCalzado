package bodega.events;

import co.com.sofka.domain.generic.DomainEvent;

public class CiudadDeUbicacionBodegaCambiada extends DomainEvent {

    private final Ubicacion ubicacion;

    public CiudadDeUbicacionBodegaCambiada(Ubicacion ubicacion){
        super("tiendadecalzado.bodega.ubicaciondeunabodegacambiada");
        this.ubicacion = ubicacion;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}