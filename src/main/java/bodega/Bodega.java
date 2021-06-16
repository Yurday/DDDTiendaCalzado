package bodega;

import bodega.values.BodegaId;
import bodega.values.NombreBodega;
import co.com.sofka.domain.generic.AggregateEvent;

public class Bodega extends AggregateEvent <BodegaId> {

    public Bodega(BodegaId entityId, NombreBodega nombreBodega){
        super(entityId);
    }

}
