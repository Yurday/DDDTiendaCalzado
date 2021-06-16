package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;

public class EmailDeUnContactoCambiado extends DomainEvent {
    public EmailDeUnContactoCambiado(){
        super("sofka.empleado.emaildeuncontactocambiado");
    }
}
