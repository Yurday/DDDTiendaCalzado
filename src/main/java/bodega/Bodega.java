package bodega;

import bodega.values.BodegaId;
import bodega.values.NombreBodega;
import co.com.sofka.domain.generic.AggregateEvent;
import empleado.values.Funciones;

import java.util.Set;

public class Bodega extends AggregateEvent <BodegaId> {

    protected NombreBodega nombreBodega;
    protected Set<Bodega> bodega;
    public Bodega(BodegaId entityId, NombreBodega nombreBodega){
        super(entityId);
    }

}
