package bodega.commands;

import bodega.values.BodegaId;
import bodega.values.Ciudad;
import co.com.sofka.domain.generic.Command;

public class CambiarCiudadDeUbicacionBodega implements Command {

    private final BodegaId bodegaId;
    private final Ciudad ciudad;

public CambiarCiudadDeUbicacionBodega(BodegaId bodegaId, Ciudad ciudad){
    this.bodegaId = bodegaId;
    this.ciudad = ciudad;
}

    public BodegaId getBodegaId() {
        return bodegaId;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }
}