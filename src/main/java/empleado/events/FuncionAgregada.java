package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;

public class FuncionAgregada extends DomainEvent {
    public FuncionAgregada(){
        super("sofka.empleado.funcionagregada");
    }
}
