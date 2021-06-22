package bodega.commands;

import bodega.values.BodegaId;
import bodega.values.Dimensiones;
import co.com.sofka.domain.generic.Command;

public class CambiarDimensionesDeInformacionBodega implements Command {

    private final BodegaId bodegaId;
    private final Dimensiones dimensiones;

    public CambiarDimensionesDeInformacionBodega(BodegaId bodegaId, Dimensiones dimensiones){
        this.bodegaId = bodegaId;
        this.dimensiones = dimensiones;
    }

    public BodegaId getBodegaId() {
        return bodegaId;
    }

    public Dimensiones getDimensiones() {
        return dimensiones;
    }
}