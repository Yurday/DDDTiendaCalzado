package bodega;

import bodega.events.BodegaAgregada;
import bodega.values.BodegaId;
import bodega.values.Capacidad;
import bodega.values.NombreBodega;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Set;

public class Bodega extends AggregateEvent <BodegaId> {

    protected NombreBodega nombreBodega;
    protected Set<Bodega> bodega;
    protected Bodega1 bodega1;
    protected Bodega2 bodega2;

    public Bodega(BodegaId bodegaId, NombreBodega nombreBodega){
        super(bodegaId);
        appendChange(new BodegaAgregada(bodegaId, nombreBodega)).apply();
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

    public void modificarCantDeBodegas (CantBodegas cantBodegas){
        appendChange(new CantDeBodegasModificada(cantBodegas)).apply();
    }

    public void agregarBodega (Bodega bodega){
        appendChange(new BodegaAgregada(bodega)).apply();
    }

    public void agregarBodega (Bodega bodega){
        appendChange(new BodegaAgregada(bodega)).apply();
    }

    public void cambiarCapacidadDeUnaBodega (Capacidad capacidad){
        appendChange(new CantDeBodegasModificada(capacidad)).apply();
    }

    public NombreBodega nombreBodega() {
        return nombreBodega;
    }

    public Set<Bodega> bodega() {
        return bodega;
    }

    public Bodega1 bodega1() {
        return bodega1;
    }

    public Bodega2 bodega2() {
        return bodega2;
    }
}
