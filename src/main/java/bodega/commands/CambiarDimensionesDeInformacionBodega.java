package bodega.commands;

import bodega.values.BodegaId;
import bodega.values.Capacidad;
import co.com.sofka.domain.generic.Command;

public class CambiarDimensionesDeInformacionBodega implements Command {

    private final BodegaId bodegaId;
    private final Capacidad capacidad;

    public CambiarDimensionesDeInformacionBodega(BodegaId bodegaId, Capacidad capacidad){
        this.bodegaId = bodegaId;
        this.capacidad = capacidad;
    }

    public BodegaId getBodegaId() {
        return bodegaId;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }
}