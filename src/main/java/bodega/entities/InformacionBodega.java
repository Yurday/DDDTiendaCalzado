package bodega.entities;

import bodega.values.*;
import co.com.sofka.domain.generic.Entity;

public class InformacionBodega extends Entity <InformacionBodegaId> {

    private Capacidad capacidad;
    private Dimensiones dimensiones;

    public InformacionBodega(InformacionBodegaId informacionBodegaId, Capacidad capacidad, Dimensiones dimensiones){
        super(informacionBodegaId);
        this.capacidad = capacidad;
        this.dimensiones = dimensiones;
    }

    public void cambiarCapacidad(Capacidad capacidad){
        this.capacidad = capacidad;
    }

    public void cambiarDimensiones(Dimensiones dimensiones){
        this.dimensiones = dimensiones;
    }

    public Capacidad capacidad() {
        return capacidad;
    }

    public Dimensiones dimensiones() {
        return dimensiones;
    }
}