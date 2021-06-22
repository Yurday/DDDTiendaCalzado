package empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import empleado.values.Caracteristica;
import empleado.values.FuncionId;

public class CaracteristicaDeUnaFuncionActualizada extends DomainEvent {

    private final Caracteristica caracteristica;

    public CaracteristicaDeUnaFuncionActualizada(Caracteristica caracteristica){
        super("tiendadecalzado.empleado.caracteristicadeunafuncionactualizada");
        this.caracteristica = caracteristica;
    }

    public Caracteristica getCaracteristica() {
        return caracteristica;
    }
}