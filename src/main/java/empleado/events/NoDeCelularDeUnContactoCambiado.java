package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import empleado.values.NoCelular;

public class NoDeCelularDeUnContactoCambiado extends DomainEvent {

    private final NoCelular noCelular;

    public NoDeCelularDeUnContactoCambiado(NoCelular noCelular){
        super("tiendadecalzado.empleado.nodecelulardeuncontactocambiado");
        this.noCelular = noCelular;
    }

    public NoCelular getNoCelular() {
        return noCelular;
    }
}
