package bodega.commands;

import bodega.values.BodegaId;
import bodega.values.NombreBodega;
import co.com.sofka.domain.generic.Command;

public class CambiarNombreBodega implements Command {

    private final BodegaId bodegaId;
    private final NombreBodega nombreBodega;

    public CambiarNombreBodega(BodegaId bodegaId, NombreBodega nombreBodega){
        this.bodegaId = bodegaId;
        this.nombreBodega = nombreBodega;
    }

    public BodegaId getBodegaId() {
        return bodegaId;
    }

    public NombreBodega getNombreBodega() {
        return nombreBodega;
    }
}