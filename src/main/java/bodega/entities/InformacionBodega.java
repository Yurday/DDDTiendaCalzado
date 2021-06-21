package bodega.entities;

import bodega.values.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class InformacionBodega extends Entity <UbicacionBodegaId> {

    private final Direccion direccion;
    private final Ciudad ciudad;

    public InformacionBodega(UbicacionBodegaId ubicacionBodegaId, Direccion direccion, Ciudad ciudad){
        super(ubicacionBodegaId);
        this.direccion = direccion;
        this.ciudad = ciudad;
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