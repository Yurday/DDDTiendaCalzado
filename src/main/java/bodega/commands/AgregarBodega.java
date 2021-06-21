package bodega.commands;

import bodega.entities.InformacionBodega;
import bodega.entities.UbicacionBodega;
import bodega.values.*;
import co.com.sofka.domain.generic.Command;

public class AgregarBodega implements Command {

    private final BodegaId bodegaId;
    private final NombreBodega nombreBodega;
    private final InformacionBodega informacionBodega;
    private final UbicacionBodega ubicacionBodega;

    public AgregarBodega(BodegaId bodegaId, NombreBodega nombreBodega, InformacionBodega informacionBodega, UbicacionBodega ubicacionBodega){
        this.bodegaId = bodegaId;
        this.nombreBodega = nombreBodega;
        this.informacionBodega = informacionBodega;
        this.ubicacionBodega = ubicacionBodega;
    }

    public BodegaId getBodegaId() {
        return bodegaId;
    }

    public NombreBodega getNombreBodega() {
        return nombreBodega;
    }

    public InformacionBodega getInformacionBodega() {
        return informacionBodega;
    }

    public UbicacionBodega getUbicacionBodega() {
        return ubicacionBodega;
    }
}