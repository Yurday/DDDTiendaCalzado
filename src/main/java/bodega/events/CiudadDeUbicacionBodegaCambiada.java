package bodega.events;

import bodega.values.Ciudad;
import co.com.sofka.domain.generic.DomainEvent;

public class CiudadDeUbicacionBodegaCambiada extends DomainEvent {

    private final Ciudad ciudad;

    public CiudadDeUbicacionBodegaCambiada(Ciudad ciudad){
        super("tiendadecalzado.bodega.ciudaddeubicacionbodegacambiada");
        this.ciudad = ciudad;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }
}