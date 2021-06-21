package bodega.commands;

import bodega.values.BodegaId;
import co.com.sofka.domain.generic.Command;

public class CambiarDireccionDeUbicacionBodega implements Command {

    private final BodegaId bodegaId;
    private final Ubicacion ubicacion;

public CambiarDireccionDeUbicacionBodega(BodegaId bodegaId, Ubicacion ubicacion){
    this.bodegaId = bodegaId;
    this.ubicacion = ubicacion;
}

    public BodegaId getBodegaId() {
        return bodegaId;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}