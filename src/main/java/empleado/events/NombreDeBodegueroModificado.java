package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeBodegueroModificado extends DomainEvent {
    public NombreDeBodegueroModificado(){
        super("sofka.empleado.nombredebodegueromodificado");
    }
}
