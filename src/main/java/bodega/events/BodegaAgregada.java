package bodega.events;

import bodega.entities.InformacionBodega;
import bodega.entities.UbicacionBodega;
import bodega.values.BodegaId;
import bodega.values.NombreBodega;
import co.com.sofka.domain.generic.DomainEvent;

public class BodegaAgregada extends DomainEvent {

    private final BodegaId bodegaId;
    private final NombreBodega nombreBodega;
    private final InformacionBodega informacionBodega;
    private final UbicacionBodega ubicacionBodega;

    public BodegaAgregada (BodegaId bodegaId, NombreBodega nombreBodega, InformacionBodega informacionBodega, UbicacionBodega ubicacionBodega){
        super ("tiendadecalzado.bodega.bodegaagregada");
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
