package bodega;

import bodega.entities.InformacionBodega;
import bodega.entities.UbicacionBodega;
import bodega.events.*;
import bodega.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import java.util.List;

public class Bodega extends AggregateEvent <BodegaId> {

    protected NombreBodega nombreBodega;
    protected InformacionBodega informacionBodega;
    protected UbicacionBodega ubicacionBodega;

    public Bodega(BodegaId bodegaId, NombreBodega nombreBodega, InformacionBodega informacionBodega, UbicacionBodega ubicacionBodega){
        super(bodegaId);
        appendChange(new BodegaAgregada(bodegaId, nombreBodega, informacionBodega, ubicacionBodega)).apply();
    }

    private Bodega(BodegaId bodegaId){
        super(bodegaId);
        subscribe(new BodegaChange(this));
    }

    //Factoría que permite crear el agregado
    public static Bodega from (BodegaId bodegaId, List<DomainEvent> events){
        var bodega = new Bodega(bodegaId);
        events.forEach(bodega::applyEvent);
        return bodega;
    }

    //Commands

    public void cambiarCapacidadDeInformacionBodega (Capacidad capacidad){
        appendChange(new CapacidadDeInformacionBodegaCambiada(capacidad)).apply();
    }

    public void cambiarCiudadDeUbicacionBodega (Ciudad ciudad){
        appendChange(new CiudadDeUbicacionBodegaCambiada(ciudad)).apply();
    }

    public void cambiarDimensionesDeInformacionBodega (Dimensiones dimensiones){
        appendChange(new DimensionesDeInformacionBodegaCambiada(dimensiones)).apply();
    }

    public void cambiarDireccionDeUbicacionBodega (Direccion direccion){
        appendChange(new DireccionDeUbicacionBodegaCambiada(direccion)).apply();

    }

    public void cambiarNombreBodega(NombreBodega nombreBodega){
        appendChange(new NombreDeBodegaCambiado(nombreBodega)).apply();

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