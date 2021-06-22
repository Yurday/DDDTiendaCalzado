package bodega.events;

import bodega.values.Dimensiones;
import co.com.sofka.domain.generic.DomainEvent;

public class DimensionesDeInformacionBodegaCambiada extends DomainEvent {

    private final Dimensiones dimensiones;

    public DimensionesDeInformacionBodegaCambiada(Dimensiones dimensiones){
        super ("tiendadecalzado.bodega.dimensionesdeinformacionbodegacambiada");
        this.dimensiones = dimensiones;
    }

    public Dimensiones getDimensiones() {
        return dimensiones;
    }
}