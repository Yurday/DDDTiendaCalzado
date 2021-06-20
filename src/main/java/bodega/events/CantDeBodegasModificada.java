package bodega.events;

import co.com.sofka.domain.generic.DomainEvent;

public class CantDeBodegasModificada extends DomainEvent {
    public CantDeBodegasModificada(){
        super("tiendadecalzado.bodega.cantdebodegasmodificada");
    }
}