package bodega.commands;

import bodega.values.BodegaId;
import bodega.values.Direccion;
import co.com.sofka.domain.generic.Command;

public class CambiarDireccionDeUbicacionBodega implements Command {

    private final BodegaId bodegaId;
    private final Direccion direccion;

public CambiarDireccionDeUbicacionBodega(BodegaId bodegaId, Direccion direccion){
    this.bodegaId = bodegaId;
    this.direccion = direccion;
}

    public BodegaId getBodegaId() {
        return bodegaId;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}