package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import empleado.values.Email;

public class EmailDeUnContactoCambiado extends DomainEvent {

    private final Email email;

    public EmailDeUnContactoCambiado(Email email){
        super("tiendadecalzado.empleado.emaildeuncontactocambiado");
        this.email = email;
    }

    public Email getEmail() {
        return email;
    }
}
