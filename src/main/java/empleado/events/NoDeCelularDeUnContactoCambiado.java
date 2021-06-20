package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;

public class NoDeCelularDeUnContactoCambiado extends DomainEvent {
    public NoDeCelularDeUnContactoCambiado(){
        super("tiendadecalzado.empleado.nodecelulardeuncontactocambiado");
    }
}
