package bodega.commands;

import bodega.values.BodegaId;
import bodega.values.Capacidad;
import bodega.values.NombreBodega;
import co.com.sofka.domain.generic.Command;

public class AgregarBodega implements Command {

    private final BodegaId bodegaId;
    private final Ubicacion ubicacion;
    private final Capacidad capacidad;
    private final NombreBodega nombreBodega;

    public AgregarBodega(BodegaId bodegaId, Ubicacion ubicacion, Capacidad capacidad, NombreBodega nombreBodega){
        this.bodegaId = bodegaId;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.nombreBodega = nombreBodega;
    }

    public BodegaId getBodegaId() {
        return bodegaId;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }

    public NombreBodega getNombreBodega() {
        return nombreBodega;
    }
}