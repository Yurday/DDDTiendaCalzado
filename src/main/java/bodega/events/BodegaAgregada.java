package bodega.events;

import co.com.sofka.domain.generic.DomainEvent;

public class BodegaAgregada extends DomainEvent {
    public BodegaAgregada (){
        super ("tiendadecalzado.bodega.bodegaagregada");
    }
}
