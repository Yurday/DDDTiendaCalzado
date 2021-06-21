package bodega.entities;

import bodega.values.Capacidad;
import bodega.values.NombreBodega;
import bodega.values.UbicacionBodegaId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class UbicacionBodega extends Entity <UbicacionBodegaId> {

    private final Ubicacion ubicacion;
    private final Capacidad capacidad;
    private final NombreBodega nombreBodega;

    public UbicacionBodega(UbicacionBodegaId ubicacionBodegaId, Ubicacion ubicacion, Capacidad capacidad, NombreBodega nombreBodega){
        super(ubicacionBodegaId);
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.nombreBodega = nombreBodega;
    }

    public cambiarUbicacionDeUnaBodega(UbicacionBodegaId ubicacionBodegaId, Ubicacion ubicacion){
        super(ubicacionBodegaId);
        this.ubicacion = Objects.requireNonNull(ubicacion);
    }

    public cambiarCapacidadDeUnaBodega(UbicacionBodegaId ubicacionBodegaId, Capacidad capacidad){
        super(ubicacionBodegaId);
        this.capacidad = Objects.requireNonNull(capacidad);
    }

    public Ubicacion ubicacion() {
        return ubicacion;
    }

    public Capacidad capacidad() {
        return capacidad;
    }

    public NombreBodega nombreBodega() {
        return nombreBodega;
    }
}