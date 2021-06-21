package bodega.events;

import bodega.values.Direccion;
import co.com.sofka.domain.generic.DomainEvent;

public class DireccionDeUbicacionBodegaCambiada extends DomainEvent {

    private final Direccion direccion;

    public DireccionDeUbicacionBodegaCambiada(Direccion direccion){
        super("tiendadecalzado.bodega.direcciondeubicacionbodegacambiada");
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}