package bodega.events;

import bodega.values.NombreBodega;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeBodegaCambiado extends DomainEvent {

    private final NombreBodega nombreBodega;

    public NombreDeBodegaCambiado(NombreBodega nombreBodega){
        super ("tiendadecalzado.bodega.nombredebodegacambiado");
        this.nombreBodega = nombreBodega;
    }

    public NombreBodega getNombreBodega() {
        return nombreBodega;
    }
}